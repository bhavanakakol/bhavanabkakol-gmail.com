package helloproject;

public class ifelseladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int month=Integer.parseInt(args[0]); //if else ladder

 if(month==12 ||(month>=1 && month<=2))
		 {
System.out.println("winter season");//dec,jan,feb
		 }
 else if (month>=3 && month<6)
 {
System.out.println("spring season");//mar,april,may
 }
 else if (month>=6 && month<=8)
 {
System.out.println("Rainy season");//june,july,aug,
 }
 else if (month>9 && month<=11)
 {
System.out.println("autmn season");//sep,oct,nove
 }
 else
	 System.out.println("invalid season");
	}

}
