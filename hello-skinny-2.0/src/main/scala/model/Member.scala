package model

import skinny.orm._, feature._
import scalikejdbc._
import org.joda.time._

case class Member(
  id: Long,
  name: String,
  activated: Boolean,
  luckyNumber: Option[Long] = None,
  birthday: Option[LocalDate] = None,
  createdAt: DateTime,
  updatedAt: DateTime
)

object Member extends SkinnyCRUDMapper[Member] with TimestampsFeature[Member] {
  override lazy val tableName = "members"
  override lazy val defaultAlias = createAlias("m")

  /*
   * If you're familiar with ScalikeJDBC/Skinny ORM, using #autoConstruct makes your mapper simpler.
   * (e.g.)
   * override def extract(rs: WrappedResultSet, rn: ResultName[Member]) = autoConstruct(rs, rn)
   *
   * Be aware of excluding associations like this:
   * (e.g.)
   * case class Member(id: Long, companyId: Long, company: Option[Company] = None)
   * object Member extends SkinnyCRUDMapper[Member] {
   *   override def extract(rs: WrappedResultSet, rn: ResultName[Member]) =
   *     autoConstruct(rs, rn, "company") // "company" will be skipped
   * }
   */
  override def extract(rs: WrappedResultSet, rn: ResultName[Member]): Member = new Member(
    id = rs.get(rn.id),
    name = rs.get(rn.name),
    activated = rs.get(rn.activated),
    luckyNumber = rs.get(rn.luckyNumber),
    birthday = rs.get(rn.birthday),
    createdAt = rs.get(rn.createdAt),
    updatedAt = rs.get(rn.updatedAt)
  )
}
