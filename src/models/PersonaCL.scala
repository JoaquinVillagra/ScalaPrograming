package models

abstract class Person{
  val identifier: String
  val name: String
  val address: String
  def presentation():Unit
}

trait Natural{
  val sex: String
  val age: Int
}

trait Foreign{
  val is_foreign: Boolean = true
  val have_resident: Boolean
}

trait Company{
  val type_of_company: String
  val economic_activity: String
  val origin_country: String
}


class NaturalPerson