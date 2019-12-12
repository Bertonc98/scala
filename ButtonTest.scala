class Button(val label:String){
	def click()={
		println("Clicked");
	}
}

trait Subject{
	type Observer = { def  update(subjext: Any): Unit }
	var observers : List[Observer] = List();
	def addObserver (nuovo : Observer) = this.observers::= nuovo;
	def notifyObserver() = observers foreach (_.update(this));
	}

class ButtonCountObserver{
	var count=0;
	def update(soggetto: Any) = count+=1;
	}

class ObservableButton(name: String) extends Button(name) with Subject{
	override def click() = {
		super.click();
		notifyObserver;
		}
	}

object ButtonTest{
	def main(args: Array[String]) ={
		println("Start");
		val observableButton = new ObservableButton("button");
		val observer = new ButtonCountObserver;
		observableButton.addObserver(observer);
		for(i<-1 to 3) observableButton.click();
		println("Button clicked " + observer.count + " times");
		}
	}
