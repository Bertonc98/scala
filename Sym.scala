object Sym{
	def symmetric_difference[T](l1 : List[T], l2 : List[T]) : List[T] = {
		var ret : List[T] = for { Y <- l1 if !l2.contains(Y)} yield Y;
		ret = ret ::: for { X <- l2 if !l1.contains(X)} yield X;
		ret
		}
	}
