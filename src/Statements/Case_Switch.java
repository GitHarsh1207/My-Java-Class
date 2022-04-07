package Statements;

public class Case_Switch {
    public static void main (String [] args){

        //This is the First Program - Switch Case 07.04.2022

                 char choice=2;
                 int month = 6, day = 6;

         System.out.println("Let's print Statement according to the choice");
         if(choice==1)
         {
             System.out.println("Name of the Month");

             switch (month) {
                 case 1:
                     System.out.println("January");
                     break;
                 case 2:
                     System.out.println("February");
                     break;
                 case 3:
                     System.out.println("March");
                     break;
                 case 4:
                     System.out.println("April");
                     break;
                 case 5:
                     System.out.println("May");
                     break;
                 case 6:
                     System.out.println("June");
                     break;
                 default:
                     System.out.println("Invalid Selection Please Try Again");
             }
         }
                if(choice!=1) {
                    System.out.println("Name of the day");
                    switch (day) {
                        case 1:
                            System.out.println("Monday");
                            break;
                        case 2:
                            System.out.println("Tuesday");
                            break;
                        case 3:
                            System.out.println("Wednesday");
                            break;
                        case 4:
                            System.out.println("Thursday");
                            break;
                        case 5:
                            System.out.println("Friday");
                            break;
                        case 6:
                            System.out.println("Saturday");
                            break;
                        case 7:
                            System.out.println("Sunday");
                            break;
                        default:
                            System.out.println("Invalid Selection Please Try Again");
                    }
                }
     }
}


