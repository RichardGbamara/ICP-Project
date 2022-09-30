import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Airlines {
    // This is a method that is used to read the file and print the content of the
    // file.
    public ArrayList<String> readAirLineFile() throws IOException {
        File airLineFile = new File("C:/Users/Lenovo/Desktop/ICP Project/airlines (1).csv");

        ArrayList<String> airlineList = new ArrayList<String>();
        BufferedReader buffferreader = new BufferedReader(new FileReader(airLineFile));
        String st;

        while ((st = buffferreader.readLine()) != null)

            // Print the strin
            airlineList.add(st);
        buffferreader.close();
        return airlineList;
    }
}
