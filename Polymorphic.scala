class Polymorphic{
	def pprint[A](lista : List[A]) : Unit = {
		lista.foreach(printf("%s ",_));
		}
	
	def id[A](x:A) : A ={
		x
		}
}

var x = List(1,2,3,4);
var y = List("a", "b", "c", "d");

val p = new Polymorphic;
p.pprint(x);
println("");
p.pprint(y);
println("");
p.pprint(1);
println("");
p.id("ciao");
