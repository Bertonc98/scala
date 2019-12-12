class Anagram{
	def is_an_anagram( str: String, l:List[String] ) : Boolean = {
		val sorted = str.toSeq.sorted.unwrap;
		{var base = false; for (X<-l) base= base || (sorted==X.toSeq.sorted.unwrap); base}
		}
	}
