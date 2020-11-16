package java8;

public class LambdaApp {
	public static void main(String[] args) {
		
		//Cab cab=new Uberx();
		//cab.bookCab();
		
		
		// anonymous class
//		Cab cab= new Cab() {
//
//			@Override
//			public void bookCab() {
//				// TODO Auto-generated method stub
//				
//				
//				System.out.println("uberx booked ! arriving soon");
//			}
//		};
		
		//cab.bookCab();
		
		//java8 lambda
		
		
		Cab cab=(source,destination)->{
		System.out.println("uberx booked"+ source + destination +" arriving soon");
		return 52.1;
		};
		double bookCab = cab.bookCab("bbsr","bang");
		System.out.println(bookCab);
	}

}



interface Cab{
	//void bookCab();
	//void bookCab(String source, String destination);
	double bookCab(String source, String destination);
	
}

/* NORMAL IMPLEMENTATION */
//class Uberx implements Cab{
//
//	@Override
//	public void bookCab() {
//		System.out.println("uberx booked ! arriving soon");
//		
//	}	
//}
