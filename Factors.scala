class Factors{
	def factors(start : Int) : List[Int] = {
		var n = start;
		var i = 2;
		var l : List[Int] = List();
		while(n>1){
			if((n%i)!=0){
				i-= -1;
			}
			else{
				l = i :: l;
				n = n/i;
			}
		}
		l
	}
}
