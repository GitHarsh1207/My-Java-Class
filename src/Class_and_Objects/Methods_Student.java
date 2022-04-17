package Class_and_Objects;

public class Methods_Student {

    String studentName;
    int age;

    //workout, study, eat, sleep


    public void workoutMethod () {                                          //Method 1 declare
        System.out.println("Student going to do some physical workout");
    }
    public void studyMethod () {                                            //Method 2 declare
        System.out.println("After-all morning activity he is going to study");
    }
    public void eatMethod () {                                              //Method 3 declare
        System.out.println("In the afternoon he is going for Lunch");
    }
    public void sleepMethod () {                                            //Method 4 declare
        System.out.println("And after a long day now he is going to sleep");
    }

    public static void main(String[] args) {
        Methods_Student obj = new Methods_Student();                    // New Object created for Student class
        obj.workoutMethod();                                            //Method 1 calling
        obj.studyMethod();                                              //Method 2 calling
        obj.eatMethod();                                                //Method 3 calling
        obj.sleepMethod();                                              //Method 4 calling
    }
}
