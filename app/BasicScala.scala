package com.particeep.test

/**
  * This is basic language questions so don't use external library or build in function
  */
object BasicScala {


  /**
    * Encode parameter in url format
    *
    * Example:
    *
    * input  : Map("sort_by" -> "name", "order_by" -> "asc", "user_id" -> "12")
    * output : "?sort_by=name&order_by=asc&user_id=12"
    *
    * input  : Map()
    * output : ""
    */
  def encodeParamsInUrl(params: Map[String, String]): String =
    params
      .map(tuple => s"${tuple._1}=${tuple._2}")
      .mkString("?","&","")


  /**
    * Test if a String is an email
    */
  def isEmail(maybeEmail: String): Boolean =
    """(?=[^\s]+)(?=(\w+)@([\w\.]+))""".r.findFirstIn(maybeEmail).isDefined

  /**
    * Compute i ^ n
    *
    * Example:
    *
    * input : (i = 2, n = 3) we compute 2^3 = 2x2x2
    * output : 8
    *
    * input : (i = 99, n = 38997)
    * output : 1723793299
    */
  def power(i: Int, n: Int): Int = {
    n match {
      case 0 => 1
      case 1 => i
      case _ =>
        if (n % 2 == 0)
          power(i * i, n / 2)
        else i * power(i * i, (n - 1) / 2)
    }
  }

}
