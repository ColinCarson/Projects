object IteratorTest extends App{
//  for(i <- Array(1,2,3)) println(i)


    val nums = List(1,2,3,4,5).filter(_ < 4).map(_ * 2)
    for(j <- nums) println(j)
}