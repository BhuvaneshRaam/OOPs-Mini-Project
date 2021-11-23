package bhuvaneshraam;
import java.util.*;

public class Mini {
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       Miniproject obj2=new Miniproject();
       int ch;
       do
       {
       System.out.println("\n1.Booking\n2.Availability checking\n3.Cancel\n4.Train Chart\n5.Exit");  
       System.out.println("\nEnter your choice: ");
       ch=obj.nextInt();
       switch(ch)
       {
	 case 1: obj2.booking();
	         break;
	 case 2: obj2.availability();
	         break;
	 case 3: obj2.cancel();
	         break;
	 case 4: obj2.chart();
                 break;
         case 5: break;
       }
    }
    while(ch!=5); 
  }
}