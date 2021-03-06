package controllers.admin.system

import com.kyleu.projectile.controllers.AuthController
import com.kyleu.projectile.models.Application
import com.kyleu.projectile.models.auth.AuthActions

import scala.concurrent.ExecutionContext.Implicits.global
import com.kyleu.projectile.util.metrics.Instrumented
import io.micrometer.prometheus.PrometheusMeterRegistry

import scala.concurrent.Future

@javax.inject.Singleton
class MetricsController @javax.inject.Inject() (override val app: Application, authActions: AuthActions) extends AuthController("metrics") {
  def showMetrics = withSession("admin.metrics", admin = true) { implicit request => implicit td =>
    val scraped = Instrumented.reg match {
      case x: PrometheusMeterRegistry => x.scrape()
      case _ => "Not Implemented"
    }
    Future.successful(render {
      case Accepts.Html() => Ok(views.html.admin.metrics(request.identity, authActions, scraped))
      case Accepts.Json() => Ok(scraped).as(JSON)
    })
  }
}
