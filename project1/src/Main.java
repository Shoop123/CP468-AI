public class Main {

	public static void main(String[] args) {
//		Test the state creation
//		Missionaries at index 0, cannibals at 1, and boat location at 2
		
		int[] start = {2, 2, 0};
		int[] end = {3, 7, 1};
				
		try {
			
			State.createState(start, end);
			System.out.println("We good");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}