/*
class Upper{
	def upper(strings: String*) : Seq[String] = {
		strings.map((s:String)=>s.toUpperCase());
		}
}

val up = new Upper;
	
Console.println(up.upper("ciao", "ahHh"));
*/

object Upper{
	def main(args:Array[String]) = {
		args.map(_.toUpperCase()).foreach(printf("%s ", _));
		println("");
		}
	}
