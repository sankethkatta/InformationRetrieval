// Intersection Algoirithm for 2 Lists
// The two lists must be in sorted order
import scala.collection.mutable._

object Intersect {

    def intersect(p1: ArrayBuffer[Int], p2: ArrayBuffer[Int]) : ArrayBuffer[Int] = {
        var answer = ArrayBuffer[Int]()
        var i = 0
        var j = 0

         while ( (i < p1.size) && (j < p2.size) )  {
            if (p1(i) == p2(j)) {
                answer.append(p1(i))
                i += 1
                j += 1
            } else if (p1(i) < p2(j)) {
                i += 1
            } else {
                j += 1
            }
        }
        return answer
    }


    def main(args: Array[String]) {

        val l1 = ArrayBuffer(1, 3, 4 ,5, 6 ,7).sortWith( _ < _ )
        val l2 = ArrayBuffer(1, 23, 43, 5, 2, 7).sortWith( _ < _ )

        println(intersect(l1, l2))

    }
}