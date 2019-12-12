class T1{
	println("T1");
	def sample() : Unit = println("T1 sample");
	}
trait T2{
	println("T2");
	}
trait T3{
	println("T3");
	}

class Trait extends T1 with T2 with T3{
	override def sample():Unit = super.sample();
	}

var x = new Trait;
println(x.sample());
