/* Generated File */
package models.audit

import com.kyleu.projectile.models.result.data.{DataField, DataFieldModel, DataSummary}
import com.kyleu.projectile.util.DateUtils
import com.kyleu.projectile.util.JsonSerializers._
import io.circe.Json
import java.time.LocalDateTime
import java.util.UUID

object AuditRow {
  implicit val jsonEncoder: Encoder[AuditRow] = deriveEncoder
  implicit val jsonDecoder: Decoder[AuditRow] = deriveDecoder

  def empty(id: UUID = UUID.randomUUID, act: String = "", app: String = "", client: String = "", server: String = "", userId: UUID = UUID.randomUUID, tags: Json = Json.obj(), msg: String = "", started: LocalDateTime = DateUtils.now, completed: LocalDateTime = DateUtils.now) = {
    AuditRow(id, act, app, client, server, userId, tags, msg, started, completed)
  }
}

final case class AuditRow(
    id: UUID,
    act: String,
    app: String,
    client: String,
    server: String,
    userId: UUID,
    tags: Json,
    msg: String,
    started: LocalDateTime,
    completed: LocalDateTime
) extends DataFieldModel {
  override def toDataFields = Seq(
    DataField("id", Some(id.toString)),
    DataField("act", Some(act)),
    DataField("app", Some(app)),
    DataField("client", Some(client)),
    DataField("server", Some(server)),
    DataField("userId", Some(userId.toString)),
    DataField("tags", Some(tags.toString)),
    DataField("msg", Some(msg)),
    DataField("started", Some(started.toString)),
    DataField("completed", Some(completed.toString))
  )

  def toSummary = DataSummary(model = "auditRow", pk = id.toString, title = s"act: $act, app: $app, client: $client, server: $server, userId: $userId")
}
