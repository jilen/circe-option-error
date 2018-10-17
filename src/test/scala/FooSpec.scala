import io.circe.generic.auto._
import io.circe._

import org.scalatest._

case class Foo(
  bar: Option[Seq[Long]] = None
)

class FooSpec extends FlatSpec with Matchers {
  "circe" should "encode opt" in {
    val e = implicitly[Encoder[Option[Foo]]]
    val r = Foo(bar = None)
    e.apply(Some(r)).noSpaces should equal("""{"bar":null}""")
  }
}
