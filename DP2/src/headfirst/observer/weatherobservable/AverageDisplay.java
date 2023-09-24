package headfirst.observer.weatherobservable;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class AverageDisplay implements Observer, DisplayElement {
	private ArrayList<Float> temperatures = new ArrayList<Float>(10);
	private int index = 0;
	private float sumOfTemperature = 0;
	private float averageTemperature;

	public AverageDisplay(Observable observable) {
		observable.addObserver(this);
	}

	public void update(Observable observable, Object arg) {
		if (observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)observable;
			
			if (index >= 10) {
				index = index % 10;
			}
			temperatures.set(index, weatherData.getTemperature());
			index++;
			
			for (int i = 0; i < 10; i++) {
				sumOfTemperature += temperatures.get(i);
			}
			
			averageTemperature = sumOfTemperature / 10 ;
			display();
		}
	}

	public void display() {
		System.out.print("Average Temperature: " + averageTemperature);
	}
}