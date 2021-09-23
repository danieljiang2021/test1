package daniel

class myobject {
  def prd= "string"
  def mean(xs: Seq[Double]): Option[Double]=
    if (xs.isEmpty) None
    else Some(xs.sum/xs.length)

}


/*

sealed trait Option[+A]
case class Some[+A](get:A) extends Option[A]
case object None extends Option[Nothing]
*/
