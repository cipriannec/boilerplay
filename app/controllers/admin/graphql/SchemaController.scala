package controllers.admin.graphql

import controllers.BaseController
import graphql.Schema
import models.Application
import models.ProjectileContext.webContext
import sangria.renderer.SchemaRenderer

import scala.concurrent.Future

@javax.inject.Singleton
class SchemaController @javax.inject.Inject() (override val app: Application) extends BaseController("schema") {
  lazy val idl = SchemaRenderer.renderSchema(Schema.schema)

  def renderSchema() = withSession("graphql.schema", admin = true) { implicit request => implicit td =>
    Future.successful(Ok(idl))
  }

  def voyager(root: String) = withSession("schema.render", admin = true) { implicit request => implicit td =>
    Future.successful(Ok(views.html.admin.graphql.voyager(request.identity, root = root)))
  }
}
