package it_assets_prize_list;

public class Computer {

    //New Desktop Prize and Configuration
    String Manufacture ="HP";
    String Type = "Desktop";
    int monitorSize =21;
    int RAM = 8;
    double Processor = 3.2;
    int Prize =60000;
    public static void main(String[] args) {
        Computer PC1 = new Computer();
        // Object for New PC1

        System.out.println("Computer Manufacturer = "+ PC1.Manufacture);
        System.out.println("Computer Type = " +PC1.Type);
        System.out.println("Computer Processor Speed = " +PC1.Processor+ "Ghz");
        System.out.println("Computer RAM Size = " +PC1.RAM+ " GB");
        System.out.println("Monitor Size = " +PC1.monitorSize+ " inches");
        System.out.println("Whole Setup Prize = " +PC1.Prize+ " Rs.");

    }


}
