package Statements;

public class And_Operator_test {
    public static void main(String[] args) {
        System.out.println("Let's Try AND Operator Examples" );

        int Age=18;
        String City="Tundla";

        if (Age>=18 && City=="Agra")
        {
            System.out.println("Both the criteria Is Matched");
        }
        else{
            System.out.println("One of the Criteria is not Matched");
        }

        if (Age>=18 && City=="Tundla")
        {
            System.out.println("Both the criteria Is Matched");
        }
        else{
            System.out.println("One of the Criteria is not Matched");
        }
    }
}
