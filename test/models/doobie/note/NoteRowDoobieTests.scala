/* Custom File */
package models.doobie.note

import com.kyleu.projectile.services.database.doobie.DoobieQueryService.Imports._
import com.kyleu.projectile.services.database.doobie.DoobieTestHelper.yolo._
import models.note.NoteRow
import org.scalatest._

class NoteRowDoobieTests extends FlatSpec with Matchers {
  "Doobie queries for [NoteRow]" should "typecheck" in {
    /* Commented for CI
    NoteRowDoobie.countFragment.query[Long].check.unsafeRunSync
    NoteRowDoobie.selectFragment.query[NoteRow].check.unsafeRunSync
    (NoteRowDoobie.selectFragment ++ whereAnd(NoteRowDoobie.searchFragment("..."))).query[NoteRow].check.unsafeRunSync
    */
  }
}
