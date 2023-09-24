package observerPractice;

import java.util.Observable;
import java.util.Observer;

public class UmbrellaStore implements Observer {
	
	private boolean sellingState;
	
	// default constructor
	public UmbrellaStore(Observable observable) {
		this.sellingState = false;
		observable.addObserver(this);
	}
	
	public void update(Observable observable, Object arg) {
		if (observable instanceof WhetherDataSubject) {
			WhetherDataSubject weatherData = (WhetherDataSubject)observable;
			if (weatherData.getRainfall() >= 5.0f)// when rainfall exceeds 5.0mm
				sellingState = true; // selling umbrella
			else // when rainfall < 5.0
				sellingState = false;
			
			isSelling();
		}
	}

	public void isSelling() {
		System.out.println("Umbrellas Selling !: " + sellingState);
	}
}
