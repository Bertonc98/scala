object Squared{
	def squared_numbers(list : List[Any]) : List[Any] = {
		var ret : List[Any] = List();
		for(X<-list){
			X match{
				case x : Int => ret = (x*x) :: ret;
				case x : Double => ret = (x*x) :: ret;
				case x : Char => ()
				case l : List[Any] => ret = squared_numbers(l) :: ret;
				case _ => ();
			}
		}
		ret.reverse;
	}
}
