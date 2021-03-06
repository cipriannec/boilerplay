/* Generated File */
package services.task

import com.kyleu.projectile.models.result.data.DataField
import com.kyleu.projectile.models.result.filter.Filter
import com.kyleu.projectile.models.result.orderBy.OrderBy
import com.kyleu.projectile.services.{Credentials, ModelServiceHelper}
import com.kyleu.projectile.services.database.ApplicationDatabase
import com.kyleu.projectile.util.CsvUtils
import com.kyleu.projectile.util.tracing.{TraceData, TracingService}
import java.time.LocalDateTime
import java.util.UUID
import models.queries.task.ScheduledTaskRunRowQueries
import models.task.ScheduledTaskRunRow
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits._

@javax.inject.Singleton
class ScheduledTaskRunRowService @javax.inject.Inject() (override val tracing: TracingService) extends ModelServiceHelper[ScheduledTaskRunRow]("scheduledTaskRunRow") {
  def getByPrimaryKey(creds: Credentials, id: UUID)(implicit trace: TraceData) = {
    traceF("get.by.primary.key")(td => ApplicationDatabase.queryF(ScheduledTaskRunRowQueries.getByPrimaryKey(id))(td))
  }
  def getByPrimaryKeyRequired(creds: Credentials, id: UUID)(implicit trace: TraceData) = getByPrimaryKey(creds, id).map { opt =>
    opt.getOrElse(throw new IllegalStateException(s"Cannot load scheduledTaskRunRow with id [$id]"))
  }
  def getByPrimaryKeySeq(creds: Credentials, idSeq: Seq[UUID])(implicit trace: TraceData) = if (idSeq.isEmpty) {
    Future.successful(Nil)
  } else {
    traceF("get.by.primary.key.seq")(td => ApplicationDatabase.queryF(ScheduledTaskRunRowQueries.getByPrimaryKeySeq(idSeq))(td))
  }

  override def countAll(creds: Credentials, filters: Seq[Filter] = Nil)(implicit trace: TraceData) = {
    traceF("get.all.count")(td => ApplicationDatabase.queryF(ScheduledTaskRunRowQueries.countAll(filters))(td))
  }
  override def getAll(creds: Credentials, filters: Seq[Filter] = Nil, orderBys: Seq[OrderBy] = Nil, limit: Option[Int] = None, offset: Option[Int] = None)(implicit trace: TraceData) = {
    traceF("get.all")(td => ApplicationDatabase.queryF(ScheduledTaskRunRowQueries.getAll(filters, orderBys, limit, offset))(td))
  }

  // Search
  override def searchCount(creds: Credentials, q: Option[String], filters: Seq[Filter] = Nil)(implicit trace: TraceData) = {
    traceF("search.count")(td => ApplicationDatabase.queryF(ScheduledTaskRunRowQueries.searchCount(q, filters))(td))
  }
  override def search(
    creds: Credentials, q: Option[String], filters: Seq[Filter] = Nil, orderBys: Seq[OrderBy] = Nil, limit: Option[Int] = None, offset: Option[Int] = None
  )(implicit trace: TraceData) = {
    traceF("search")(td => ApplicationDatabase.queryF(ScheduledTaskRunRowQueries.search(q, filters, orderBys, limit, offset))(td))
  }

  def searchExact(
    creds: Credentials, q: String, orderBys: Seq[OrderBy] = Nil, limit: Option[Int] = None, offset: Option[Int] = None
  )(implicit trace: TraceData) = {
    traceF("search.exact")(td => ApplicationDatabase.queryF(ScheduledTaskRunRowQueries.searchExact(q, orderBys, limit, offset))(td))
  }

  def countByArguments(creds: Credentials, arguments: List[String])(implicit trace: TraceData) = traceF("count.by.arguments") { td =>
    ApplicationDatabase.queryF(ScheduledTaskRunRowQueries.CountByArguments(arguments))(td)
  }
  def getByArguments(creds: Credentials, arguments: List[String], orderBys: Seq[OrderBy] = Nil, limit: Option[Int] = None, offset: Option[Int] = None)(implicit trace: TraceData) = traceF("get.by.arguments") { td =>
    ApplicationDatabase.queryF(ScheduledTaskRunRowQueries.GetByArguments(arguments, orderBys, limit, offset))(td)
  }
  def getByArgumentsSeq(creds: Credentials, argumentsSeq: Seq[List[String]])(implicit trace: TraceData) = if (argumentsSeq.isEmpty) {
    Future.successful(Nil)
  } else {
    traceF("get.by.arguments.seq") { td =>
      ApplicationDatabase.queryF(ScheduledTaskRunRowQueries.GetByArgumentsSeq(argumentsSeq))(td)
    }
  }

  def countById(creds: Credentials, id: UUID)(implicit trace: TraceData) = traceF("count.by.id") { td =>
    ApplicationDatabase.queryF(ScheduledTaskRunRowQueries.CountById(id))(td)
  }
  def getById(creds: Credentials, id: UUID, orderBys: Seq[OrderBy] = Nil, limit: Option[Int] = None, offset: Option[Int] = None)(implicit trace: TraceData) = traceF("get.by.id") { td =>
    ApplicationDatabase.queryF(ScheduledTaskRunRowQueries.GetById(id, orderBys, limit, offset))(td)
  }
  def getByIdSeq(creds: Credentials, idSeq: Seq[UUID])(implicit trace: TraceData) = if (idSeq.isEmpty) {
    Future.successful(Nil)
  } else {
    traceF("get.by.id.seq") { td =>
      ApplicationDatabase.queryF(ScheduledTaskRunRowQueries.GetByIdSeq(idSeq))(td)
    }
  }

  def countByStarted(creds: Credentials, started: LocalDateTime)(implicit trace: TraceData) = traceF("count.by.started") { td =>
    ApplicationDatabase.queryF(ScheduledTaskRunRowQueries.CountByStarted(started))(td)
  }
  def getByStarted(creds: Credentials, started: LocalDateTime, orderBys: Seq[OrderBy] = Nil, limit: Option[Int] = None, offset: Option[Int] = None)(implicit trace: TraceData) = traceF("get.by.started") { td =>
    ApplicationDatabase.queryF(ScheduledTaskRunRowQueries.GetByStarted(started, orderBys, limit, offset))(td)
  }
  def getByStartedSeq(creds: Credentials, startedSeq: Seq[LocalDateTime])(implicit trace: TraceData) = if (startedSeq.isEmpty) {
    Future.successful(Nil)
  } else {
    traceF("get.by.started.seq") { td =>
      ApplicationDatabase.queryF(ScheduledTaskRunRowQueries.GetByStartedSeq(startedSeq))(td)
    }
  }

  def countByStatus(creds: Credentials, status: String)(implicit trace: TraceData) = traceF("count.by.status") { td =>
    ApplicationDatabase.queryF(ScheduledTaskRunRowQueries.CountByStatus(status))(td)
  }
  def getByStatus(creds: Credentials, status: String, orderBys: Seq[OrderBy] = Nil, limit: Option[Int] = None, offset: Option[Int] = None)(implicit trace: TraceData) = traceF("get.by.status") { td =>
    ApplicationDatabase.queryF(ScheduledTaskRunRowQueries.GetByStatus(status, orderBys, limit, offset))(td)
  }
  def getByStatusSeq(creds: Credentials, statusSeq: Seq[String])(implicit trace: TraceData) = if (statusSeq.isEmpty) {
    Future.successful(Nil)
  } else {
    traceF("get.by.status.seq") { td =>
      ApplicationDatabase.queryF(ScheduledTaskRunRowQueries.GetByStatusSeq(statusSeq))(td)
    }
  }

  def countByTask(creds: Credentials, task: String)(implicit trace: TraceData) = traceF("count.by.task") { td =>
    ApplicationDatabase.queryF(ScheduledTaskRunRowQueries.CountByTask(task))(td)
  }
  def getByTask(creds: Credentials, task: String, orderBys: Seq[OrderBy] = Nil, limit: Option[Int] = None, offset: Option[Int] = None)(implicit trace: TraceData) = traceF("get.by.task") { td =>
    ApplicationDatabase.queryF(ScheduledTaskRunRowQueries.GetByTask(task, orderBys, limit, offset))(td)
  }
  def getByTaskSeq(creds: Credentials, taskSeq: Seq[String])(implicit trace: TraceData) = if (taskSeq.isEmpty) {
    Future.successful(Nil)
  } else {
    traceF("get.by.task.seq") { td =>
      ApplicationDatabase.queryF(ScheduledTaskRunRowQueries.GetByTaskSeq(taskSeq))(td)
    }
  }

  // Mutations
  def insert(creds: Credentials, model: ScheduledTaskRunRow)(implicit trace: TraceData) = traceF("insert") { td =>
    ApplicationDatabase.executeF(ScheduledTaskRunRowQueries.insert(model))(td).flatMap {
      case 1 => getByPrimaryKey(creds, model.id)(td)
      case _ => throw new IllegalStateException("Unable to find newly-inserted Scheduled Task Run.")
    }
  }
  def insertBatch(creds: Credentials, models: Seq[ScheduledTaskRunRow])(implicit trace: TraceData) = {
    traceF("insertBatch")(td => ApplicationDatabase.executeF(ScheduledTaskRunRowQueries.insertBatch(models))(td))
  }
  def create(creds: Credentials, fields: Seq[DataField])(implicit trace: TraceData) = traceF("create") { td =>
    ApplicationDatabase.executeF(ScheduledTaskRunRowQueries.create(fields))(td).flatMap { _ =>
      getByPrimaryKey(creds, UUID.fromString(fieldVal(fields, "id")))
    }
  }

  def remove(creds: Credentials, id: UUID)(implicit trace: TraceData) = {
    traceF("remove")(td => getByPrimaryKey(creds, id)(td).flatMap {
      case Some(current) =>
        ApplicationDatabase.executeF(ScheduledTaskRunRowQueries.removeByPrimaryKey(id))(td).map(_ => current)
      case None => throw new IllegalStateException(s"Cannot find ScheduledTaskRunRow matching [$id]")
    })
  }

  def update(creds: Credentials, id: UUID, fields: Seq[DataField])(implicit trace: TraceData) = {
    traceF("update")(td => getByPrimaryKey(creds, id)(td).flatMap {
      case Some(current) if fields.isEmpty => Future.successful(current -> s"No changes required for Scheduled Task Run [$id]")
      case Some(_) => ApplicationDatabase.executeF(ScheduledTaskRunRowQueries.update(id, fields))(td).flatMap { _ =>
        getByPrimaryKey(creds, id)(td).map {
          case Some(newModel) =>
            newModel -> s"Updated [${fields.size}] fields of Scheduled Task Run [$id]"
          case None => throw new IllegalStateException(s"Cannot find ScheduledTaskRunRow matching [$id]")
        }
      }
      case None => throw new IllegalStateException(s"Cannot find ScheduledTaskRunRow matching [$id]")
    })
  }

  def csvFor(totalCount: Int, rows: Seq[ScheduledTaskRunRow])(implicit trace: TraceData) = {
    traceB("export.csv")(td => CsvUtils.csvFor(Some(key), totalCount, rows, ScheduledTaskRunRowQueries.fields)(td))
  }
}
