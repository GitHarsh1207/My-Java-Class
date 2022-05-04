package array_operations;

public class Demo_arrays {
    //Program for a Demo of Array in Java.
    public static void main(String[] args) {
        int i;
        int [] series = {1,22,333,4444,55555,666666,7777777};
        String [] fruits = {"Apple", "Banana", "Carrot", "Orange", "Papaya"};

        System.out.println("Let's Print the series");
        for(i=0;i<series.length;i++)            // This is a simple example of print Array
        //adding .length is required to go read whole array length
        {
            System.out.println(series[i]);
        }
        System.out.println("Let's Print the Name of Fruits");
//Advanced for loop Syntax: for(Data_type var_name : array_name){ }
        for(String var:fruits){
            System.out.println(var);
        }
    }
}
