package Collections;

import java.util.ArrayList;

public class collection_with_generics {
    public void createCourseList() {
        ArrayList<String> courseList = new ArrayList<>();
        courseList.add("JAVA");
        courseList.add("Programming C & C++");
        courseList.add("Spring");
        courseList.add("Spring Boot");

        for(String var: courseList)
        {
            System.out.println("Printing Course List: "+var);
        }
    }
    public void createDistanceList(){
        int i;
        ArrayList<Integer> distanceList = new ArrayList<>();
        distanceList.add(23);
        distanceList.add(180);
        distanceList.add(456);

        for (i=0;i<distanceList.size();i++){
            System.out.println("Printing Distance List : "+distanceList.get(i));
        }
    }
    public ArrayList<Double> createSalaryList(){

        ArrayList <Double> salaryList = new ArrayList<>();
        salaryList.add(34550.50);
        salaryList.add(18745.65);
        salaryList.add(28504.90);
        return salaryList;
    }

    public static void main(String[] args) {
        collection_with_generics obj = new collection_with_generics();
        obj.createCourseList();
        System.out.println("\n--------------------------");
        obj.createDistanceList();
        System.out.println("\n--------------------------");
        for (Double result: obj.createSalaryList())
        System.out.println("Printing Salary List: " + result);

    }
}
