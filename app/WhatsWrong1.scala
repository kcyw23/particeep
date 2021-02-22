package com.particeep.test

object WhatsWrong1 {

  trait Interface {
    val city: String
    val support: String = s"Ici c'est $city !"
  }

  case object Supporter extends Interface {

    override lazy val city = "Paris"
  }

  Supporter.city //What does this print ?
  //Paris
  Supporter.support //What does this print and why ? How to fix it ?
  //Ici c'est null
  //The trait is initialized before the object.
  //Use lazy val in the object
}
