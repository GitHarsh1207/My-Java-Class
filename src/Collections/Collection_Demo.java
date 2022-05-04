package Collections;

import java.util.ArrayList;

public class Collection_Demo {
    // Demo program for Collection.
    public static void main(String[] args) {
        int i;
        ArrayList course = new ArrayList();                         // new collection list declare as course

        course.add("JAVA");                     //index (0)         // index number start from 0 to till end.
        course.add("Python");                   //index (1)         // .add is used to add data in the list.
        course.add("Programming C & C++");      //index (2)
        course.add("Cloud Computing");          //index (3)
        course.add("CCNA");                     //index (4)
        course.add(33000);                      //index (5)
        course.add(23.67);                      //index (6)

        // 1st way calling part by without any looping statement.

        System.out.println("Printing Course 1 : "+course.get(0));   // .get is used to access data for printing or other operations
        System.out.println("Printing Course 2 : "+course.get(1));
        System.out.println("Printing Course 3 : "+course.get(2));
        System.out.println("Printing Course 4 : "+course.get(3));
        System.out.println("Printing Course 5 : "+course.get(4));
        System.out.println("Printing Course 6 : "+course.get(5));
        System.out.println("Printing Course 7 : "+course.get(6));

        // 2nd way calling part by using for looping statement.
        System.out.println("\n---------------Using looping statements-----------------\n");
        for(i=0;i<course.size();i++)                                //.size is used to get size of an array/collection list
        {
            System.out.println("Printing Course "+(i) +" : "+course.get(i));
        }
        // Advanced for loop :  for (Datatype var_name : array/Collection){
        //        }
        // 3rd way calling part by using advanced for looping statement.
        System.out.println("\n---------------Using advanced for loop-----------------\n");

        for(Object list: course) {
           System.out.println("Printing Course : "+list);
       }

        System.out.println("\n---------------After removing some data from the list-----------------\n");

        course.remove(2);
        course.remove(3);
        for(i=0;i<course.size();i++)
        {
            System.out.println("Printing Course "+(i) +" : "+course.get(i));
        }
    }

}
