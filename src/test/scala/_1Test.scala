import _1.{compose, id}
import org.scalatest.FunSpec

class _1Test extends FunSpec {

  val times2: Int => Int = a => a * 2

  describe("compose") {
    describe("should respect identity") {
      it("from the left") {
        assert(compose[Int, Int, Int](id, times2)(42) == 84)
      }

      it("from the right") {
        assert(compose[Int, Int, Int](times2, id)(42) == 84)
      }
    }
  }

}
