package in.interview;

public class Revit {
	
	public static  int objectCount=0;

	public Revit() {
		objectCount++;
	}
	
	public int getObjectCount() {
		return objectCount;
		
	}
	public static void main(String[] args) {
		Revit t= new Revit();
		Revit t2= new Revit();
		Revit t3= new Revit();
		
		System.out.println(t.getObjectCount());
	}
	
	

}
