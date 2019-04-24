import models.Persona

object Main {
  def main(args : Array[String]) : Unit = {
    val malen = new Persona("18609558-8", "Malen", "Antillanca",
      "Ingeniería Estadística", "Universidad de Santiago de Chile", 25)

    println(malen.presentation())
    if (malen.is_adult == true)
      println(malen.getFirstName() +" es mayor de edad.")
    else
      println(malen.getFirstName() +" es menor de edad.")


    val persona_anonima = new Persona(yearsOld = 18)
    println(persona_anonima.is_adult)
  }
}


