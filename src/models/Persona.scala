package models

class Persona(identifier: String = "", firstName: String = "", lastName:String = "", Career:String = "", University:String = "", yearsOld:Int) {

  // Define atributes for class
  private var personal_id: String = identifier
  private var first_name: String = firstName
  private var last_name: String = lastName
  private var career: String = Career
  private var university: String = University
  private var age: Int = yearsOld
  val is_adult:Boolean = age >= 18

  def getPersonalId(): String ={
    return this.personal_id
  }

  def getFirstName(): String ={
    return this.first_name
  }

  def getLastName(): String ={
    return this.last_name
  }

  def getCareer(): String ={
    return this.career
  }

  def getUniversity(): String ={
    return this.university
  }

  def setFirstName(first_name: String) {
    this.first_name = first_name
  }

  def setLastName(last_name: String) {
    this.last_name = last_name
  }

  def setCareer(career: String) {
    this.career = career
  }

  def setAge(age: Int) {
    this.age = age
  }

  def presentation(): String ={
    return "Hola! Mi nombre es " + this.first_name + ". Estudié " + this.career + " en la " + this.university
  }

}

