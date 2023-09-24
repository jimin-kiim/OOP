package observerPractice;

public class WhetherSimulator {
	
	
	public static void main(String[] args) {
		WhetherDataSubject wdSubject;
		
		//subject object
		wdSubject = new WhetherDataSubject();
		
		//observer objects
		UmbrellaStore umbrellaStore = new UmbrellaStore(wdSubject);
		ClothingStore clothingStore = new ClothingStore(wdSubject);
		
		wdSubject.currentState();
		wdSubject.notifyDataSetChanged();
		
		// whether changed : temperature = 10.0'c, rainfall = 10.0mm
		System.out.println();
		wdSubject.setMeasurements(10.0f, 10.0f);
		wdSubject.currentState();
		wdSubject.notifyDataSetChanged();
		
		// whether changed : temperature = 16.0'c, rainfall = 1.0mm
		System.out.println();
		wdSubject.setMeasurements(16.0f, 1.0f);
		wdSubject.currentState();
		wdSubject.notifyDataSetChanged();
	}
}
