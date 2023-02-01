package helloproject;

public class switchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int week=Integer.parseInt(args[0]);
		 var day=""; //var is data-type having equal to integer value
		 switch(week) { 
		 case 1:
			 day="sunday";
			 break;
		 case 2:
			 day="monday";
			 break;
		 case 3:
			 day="tuesday";        //case have a break statement
			 break;
		 case 4:
			 day="wednesday";
			 break;
		 case 5:
			 day="thursday";
			 break;
		 case 6: 
			 day="friday";
			 break;
		 case 7:
			 day="saturdy";
			 break;
			 default:               //it works as else statement
				 System.out.println("invalid weekday");	 
		 }
		 System.out.println("day:"+day); 
	}

}
