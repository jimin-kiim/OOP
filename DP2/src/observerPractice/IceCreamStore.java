package observerPractice;

import java.util.Observable;
import java.util.Observer;

public class IceCreamStore implements Observer {
	
	private boolean sellingState;
	
	// default constructor
	public IceCreamStore(Observable observable) {
		this.sellingState = false;
		observable.addObserver(this);
	}
	
	public void update(Observable observable, Object arg) {
		if (observable instanceof WhetherDataSubject) {
			WhetherDataSubject weatherData = (WhetherDataSubject)observable;
			if (weatherData.getTemperature() >= 20.0f)// when temperature exceeds 20.0
				sellingState = true; // selling umbrella
			else // when temperature < 20.0
				sellingState = false;
			
			isSelling();
		}
	}

	public void isSelling() {
		System.out.println("IceCream Selling !: " + sellingState);
	}
}
