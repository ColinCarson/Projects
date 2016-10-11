
object StringThing extends App{

    implicit class StringTest(val s: String)
    {
        def increment = s.map(c => (c+1).toChar)
        def decrement = s.map(c => (c-1).toChar)
        def hideAll: String = s.replaceAll(".","*")
        def plusOne = s.toInt + 1
        def asBoolean = s match {
            case "0" | "zero" | " " => false
            case _ => true
        }
    }

    def toInt(s: String):Option[Int] = {
        try{
            Some(s.toInt)
        } catch {
           case e: NumberFormatException => None
        }
    }



    println("HAL".increment)
    println("ABC".decrement)
    println("Testing....Testing".hideAll)
    println("4".plusOne)
    println("0".asBoolean)

    println("banana".toInt)
}

