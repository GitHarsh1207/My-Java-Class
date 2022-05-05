package Collections.Hash_set;

import java.util.HashSet;

public class Hash_set_demo {                                // create class with Hash_Set_Demo

    public void createHashSet() {                           // create method for CreateHashSet for testing

        //Syntax                                            //HashSet <data_type> var_Name = new HashSet <>();
        HashSet<String> mobileList = new HashSet<>();       //Create new object with Generic DateType and HashSet method
        mobileList.add("Redmi Note 10");
        mobileList.add("Samsung Galaxy s10");
        mobileList.add("Redmi Note 10");
        mobileList.add("Apple Iphone 13");
        mobileList.add("One Plus 10 Pro");
        System.out.println("Printing the Hashset size: " + mobileList.size());
        for (String var : mobileList) {
            System.out.println("Printing Mobile Name:  " + var);
        }
    }

    public void createIntegerSet() {
        HashSet<Integer> integerSet = new HashSet<>();
        integerSet.add(10);
        integerSet.add(20);
        integerSet.add(30);
        integerSet.add(20);
        integerSet.add(30);

        integerSet.add(10);
        integerSet.add(20);
        integerSet.add(30);
        integerSet.add(20);
        integerSet.add(30);

        System.out.println("Printing size of Integer Set: " + integerSet.size());

        for (Integer var : integerSet) {
            System.out.println("Elements of Integer Set : " + var);
        }
    }

    public HashSet <Double> createDoubleSet() {
        HashSet<Double> doubleSet = new HashSet<>();
        doubleSet.add(23.45);
        doubleSet.add(83.21);
        doubleSet.add(23.45);
        doubleSet.add(77.05);
        doubleSet.add(23.45);
        System.out.println("Printing size of Double Set: " + doubleSet.size());             //printing size of the set using .size


        return doubleSet;                                       //doubleSet to main method
    }

    public static void main (String[]args){
        Hash_set_demo obj = new Hash_set_demo();                //creating new object for calling CreateHashSet method
        System.out.println("\n-----------Mobile HashSet------------");
        obj.createHashSet();                                        //  calling CreateHashSet Method
        System.out.println("\n-----------Integer HashSet------------");
        obj.createIntegerSet();
        System.out.println("\n-----------Double HashSet------------");
        HashSet<Double> output = obj.createDoubleSet();
        for (double var : output) {                                     //
            System.out.println("Elements of Integer Set : " + var);
        }
    }
}