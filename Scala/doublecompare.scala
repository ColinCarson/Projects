object MathUtils{
    def ~=(x:Double,y:Double,precision:Double)={
        if((x-y).abs < precision) true else false
    }
}

object DoubleCompare extends App{
    val a = 0.3
    val b = 0.1 + 0.2

    println(MathUtils.~=(a,b,0.0001))
    println(MathUtils.~=(a,b,0.0000000000000000000000001))
}