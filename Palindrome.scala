class Palindrome{
	def is_palindrome(str: String) : Boolean = {
		var filtered = str.filter(pred);
		filtered==filtered.reverse;
		}
	private def pred(c: Char): Boolean = {
		c.toLower>='a' && c.toLower<='z'
		}
	
	def main(arg: Array[String]) : Unit = {
		arg.map(is_palindrome(_))
		}
	} 

