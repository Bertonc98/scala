class Rational(n : Int, d : Int) extends AnyRef{
	val num = n;
	val den = d;
	
	def this(n : Int)={
		this(n, 1);
		}
		
	def +(arg: Rational):Rational ={
		new Rational( arg.num*den + arg.den*num, arg.den*den);
		}
	
	def +(arg: Int) : Rational={
		new Rational( arg*den+num, den);
		}
	
	override def toString = {
		"" + num + "/" + den;
		}
}
