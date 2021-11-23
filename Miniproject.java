package bhuvaneshraam;

import java.util.*;

public class Miniproject {
    String usn,na,b,de,c,cl,co,cla,d,tna;
    int uid,n,nb,i,tn;
    public void booking(){
        Scanner s=new Scanner(System.in);
        System.out.println("\nEnter your username: ");
        usn=s.nextLine();
        System.out.println("\nEnter your user id:");
        uid=s.nextInt();
        System.out.println("\nWelcome "+usn+"!!");
        System.out.println("\nNo. of tickets to be booked: ");
        n=s.nextInt();
        System.out.println("\nEnter the date of journey(yyyymmdd): ");
        d=s.nextLine();d=s.nextLine();
        System.out.println("\nBoarding Station: ");
        b=s.nextLine();
        if(b.equals("Chennai") || b.equals("Vijayawada") || b.equals("Gwalior") || b.equals("Chitoor") || b.equals("Warangal")){
                tna="Shatabdi Express";
                tn=6920145;
        }
        else if(b.equals("Ahmedabad") || b.equals("Surat") || b.equals("Mumbai") || b.equals("Pune") || b.equals("Anantapur")){
                tna="Rajdhani Express";
                tn=4863813;
        }
        else if(b.equals("Hyderabad") || b.equals("Guntoor") || b.equals("Kakinada") || b.equals("Vishakapattinam") || b.equals("Bhubaneshwar")){
                tna="Duronto Express";
                tn=1584029;
        }
        else if(b.equals("Cochin") || b.equals("Kurnool") || b.equals("Nagpur") || b.equals("Jhansi") || b.equals("Bhopal")){
                tna="Tejas";
                tn=3852741;
        }
        System.out.println("\nDestination: ");
        de=s.nextLine();
        System.out.println("\nWhich coach do you prefer Ac or Non-Ac? ");
        c=s.nextLine();
        if(c.equals("Ac")){
          System.out.println("\nWhich class do you prefer?(1st/2nd/3rd) ");
          cl=s.nextLine();
          if(cl.equals("1st")){
              System.out.println("You have booked "+n+" tickets in 1st class(Ac).\n");
          }
          else if(cl.equals("2nd")){
              System.out.println("You have booked "+n+" tickets in 2nd class(Ac).\n");
          }
          else if(cl.equals("3rd")){
              System.out.println("You have booked "+n+" tickets in 3rd class(Ac).\n");
          }
      
    }
        else{
          System.out.println("\nWhich class do you prefer?");
          cl=s.nextLine();
          if(cl.equals("1st")){
              System.out.println("You have booked "+n+" tickets in 1st class(Non-Ac).");
          }
          else if(cl.equals("2nd")){
              System.out.println("You have booked "+n+" tickets in 2nd class(Non-Ac).");
          }
          else if(cl.equals("3rd")){
              System.out.println("You have booked "+n+" tickets in 3rd class(Non-Ac).");
          } 
        }
        System.out.println("\nEnter 'Confirm' to print the ticket: ");
        co=s.nextLine();
        if(co.equals("Confirm")){
            System.out.println("-------------------------------------------------------------------");
            System.out.println("                           Ticket ");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Name: "+usn);
            System.out.println("ID: "+uid);
            System.out.println("Train Name: "+tna);
            System.out.println("Train No: "+tn);
            System.out.println("Date of Journey: "+d);
            System.out.println("No of Tickets, Coach & Class: "+n+" tickets in "+cl+" class "+c);
            System.out.println("Seat Number: "+d+"1 - "+d+n);
            System.out.println("Boarding station: "+b+"\nDestination: "+de);
            System.out.println("Thank you....have a great journey !!");
            System.out.println("-------------------------------------------------------------------");
        }
        
    }
        
   
    public void availability(){
        Scanner s =new Scanner(System.in);
        System.out.println("Enter your username: ");
        usn=s.nextLine();
        System.out.println("Enter your user id: ");
        uid=s.nextInt();
        System.out.println("Enter the no of seats you want to book: ");     
        n=s.nextInt();
        System.out.println("Enter your boarding station: ");
        b=s.nextLine();b=s.nextLine();
        System.out.println("Enter your destination: ");
        de=s.nextLine();
        System.out.println("Which coach do you prefer??Ac or Non-Ac");
        c=s.nextLine();
        if(c.equals("Ac"))
        {
         System.out.println("Which class do you prefer?? (1st/2nd/3rd)");
         cla=s.nextLine();
         if(n<=50)
         {
            System.out.println(n+" tickets in "+cla+" class Ac coach is available.");
         }
         else
         {
             System.out.println(n+" tickets in"+cla+" class Ac coach is not available right now.\n Sorry for the inconvenience !");
         }
        }
        else
        {
         if(n<=50)
         {
            System.out.println(n+" tickets in "+cla+" class Non-Ac coach is available.");
         }
         else
         {
             System.out.println(n+" tickets in"+cla+" class Non-Ac coach is not available right now.\n Sorry for the inconvenience !");
         }    
        }
        
    }
    
    public void cancel(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your username:");
        usn=s.nextLine();
        System.out.println("Enter your user id: ");
        uid=s.nextInt();
        System.out.println("Enter the no of tickets you booked:");
        nb=s.nextInt();
        System.out.println("Enter the train name: ");
        tna=s.nextLine();
        System.out.println("Your tickets have been cancelled !!");
    }  
    
    public void chart(){
        System.out.println("                                                                     Train Chart");
        System.out.println("Train name            Train Number        Places                                                                    Distance           Arrives         Stop time ");
        System.out.println("Shatabdi Express      6920145             Chennai - Delhi (Chithoor, Vijawada, Warangal, Gwalior)                   2155 kms           7.00 am         15 mins");
        System.out.println("RajDhani Express      4863813             Ahmedabad - Bangalore (Surat, Mumbai, Pune, Anantapur)                    1493 kms           10.00 am        15 mins");
        System.out.println("Duronto Express       1584029             Hyderabad - Calcutta (Guntoor, Kakinada, Vishakapatnam, Bhubaneshwar)     1176 kms           1.00 pm         15 mins");
        System.out.println("Tejas Express         3852741             Cochin - Kanpur (Kurnool, Nagpur, Jhansi, Bhopal)                         2383 kms           4.00 pm         15 mins");
    }
    
}
