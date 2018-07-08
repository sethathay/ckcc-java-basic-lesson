package InClassExercise;

public class AreaCal {
	
	public static void main(String[] args) {
		Area objArea = new Area();
		double areaSize = objArea.CalArea(5.0);
		System.out.println(areaSize);
		
		double areaRectangle = objArea.CalArea(5.0, 10.0);
		System.out.println(areaRectangle);
		
	}

}
