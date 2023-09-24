package observerPractice;

import java.util.Observable;
import java.util.Observer;

public class WhetherDataSubject extends Observable {
	private float temperature = 25.0f;
	private float rainfall = 0.0f;
	
//	private UmbrellaStore umbSeller;
//	private ClothingStore clothingStore;
	
	public WhetherDataSubject () {}
	
	// default constructor
//	public WhetherDataSubject(UmbrellaStore us, ClothingStore cs) {
//		this.umbSeller = us;
//		this.clothingStore = cs;
//	}
	
	public void setMeasurements(float temperature, float rainfall) {
		this.temperature = temperature;
		this.rainfall = rainfall;
		notifyDataSetChanged();
	}
	
	public void setTemperature(float temperature) {
		this.temperature = temperature;
		notifyDataSetChanged();
	}
	
	public void setRainfall(float rainfall) {
		this.rainfall = rainfall;
		notifyDataSetChanged();
	}
	
	public void notifyDataSetChanged(){
		setChanged();
		notifyObservers();
//		umbSeller.whetherChanged(rainfall); 
//		clothingStore.whetherChanged(temperature);
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getRainfall() {
		return rainfall;
	}
	
	
	public void currentState() {
		System.out.printf("===== Current state ===== \n Temperature : %.1f'c \n Rainfall : %.1fmm \n=========================\n",
				temperature, rainfall);
	}
}
