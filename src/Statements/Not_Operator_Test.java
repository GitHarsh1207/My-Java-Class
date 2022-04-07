package Statements;

public class Not_Operator_Test {
    public static void main(String[] args) {

        System.out.println("This Program is to test NOT Operator");
        int prize = 20000;
        String company = "Samsung";
        String Type = "Multimedia";

        if (company=="samsung" && Type=="Simple")
        {
            System.out.println("the customer select android TV");
        }
        else {
            System.out.println("the customer select ordinary TV");

        }

        if(!(prize==20000)){
            System.out.println("This product prize is 20000");
        }
        else{
            System.out.println("This Product prize is Higher");
        }

    }
}
