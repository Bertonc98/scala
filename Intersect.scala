object Intersect{
	def intersect[T]( l1 : List[T], l2 : List[T]) : List[T] = {
		for { Y <- l1 if l2.contains(Y)} yield Y
		} 
	}
