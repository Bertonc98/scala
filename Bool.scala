abstract class Bool{
	def and(b: => Bool): Bool;
	def or(b: => Bool): Bool;
	}
	
case object True extends Bool{
		def and(b: => Bool) = b;
		def or(b: => Bool) = True;
	}

case object False extends Bool{
		def and(b: => Bool) = False;
		def or(b: => Bool) = b;
	}

def infinite: () => Nothing = () => infinite();
