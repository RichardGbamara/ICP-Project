import java.io.IOException;

// This is importing the java libraries that are needed for the program to run.

// Creating a class called Project.
class Project {
    // This is the main method that is used to run the program.
    public static void main(String[] args) throws IOException {
        System.out.println("Hello Richard You are welcome to this week class discussion ");
        AirPorts obj = new AirPorts();
        Airlines ob = new Airlines();
        obj.trial();
        // System.out.println(ob.readAirLineFile());

        // System.out.println(obj.readAirportsFile().size());

    }

}