object Proper{
	def is_proper(i: Int) : Boolean = {
		if(i>0){
			var div = divisors(i);
			println(div)
			div.sum==i
		}
		else
			false
	}
	
	def divisors(i: Int) : List[Int] = {
		var ret : List[Int] = List(1);
		for ( x <- 2 to (i/2)+1){
			if((i%x)==0){
				printf("%d\n", x);
				ret ::=x;
			}
		}
		ret	
	}
}
