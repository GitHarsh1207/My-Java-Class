package Class_and_Objects;

public class Harsh_activity {
    String myName;
    int age;
    String myQualification;

    public Harsh_activity(String myName, int age, String myQualification) {
        this.myName = myName;
        this.age = age;
        this.myQualification = myQualification;
    }

    public static void main(String[] args) {
        Harsh_activity Harsh = new Harsh_activity("Harsh Vardhan",26,"Graduate (Computer Science)");
        System.out.println("\n------------Basic Information About Harsh");
        System.out.println("My Self = "+Harsh.myName);
        System.out.println("I'm "+Harsh.age +" Years old and");
        System.out.println("My Qualification is = "+Harsh.myQualification);
        System.out.println("\n+ Methods calling from Methods_Student class for testing+\n");
        Methods_Student act = new Methods_Student(); // Methods calling from Methods_Student class for testing.
        act.workoutMethod();
        act.studyMethod();
        act.eatMethod();
        act.sleepMethod();
    }

}
