import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class routes {
    public ArrayList<String> readRoutesFile() throws IOException {
        File routeFile = new File("C:/Users/Lenovo/Desktop/ICP Project/routes (1).csv");

        ArrayList<String> routesList = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new FileReader(routeFile));
        String st;
        while ((st = br.readLine()) != null)

            // Print the strin

            routesList.add(st);
        br.close();
        return routesList;
    }

    public ArrayList<String> airlineList() throws IOException {
        ArrayList<String> airlines = new ArrayList<String>();
        for (String airline : readRoutesFile()) {
            String[] air = airline.split(",");
            airlines.add(air[0]);

        }
        return airlines;

    }

    public ArrayList<String> airlineIDList() throws IOException {
        ArrayList<String> airlinesId = new ArrayList<String>();
        for (String airline : readRoutesFile()) {
            String[] air = airline.split(",");
            airlinesId.add(air[1]);

        }
        return airlinesId;

    }

    public ArrayList<String> destinationIDList() throws IOException {
        ArrayList<String> destinationationId = new ArrayList<String>();
        for (String airline : readRoutesFile()) {
            String[] air = airline.split(",");
            destinationationId.add(air[5]);

        }
        return destinationationId;

    }

    public ArrayList<String> destinationList() throws IOException {
        ArrayList<String> destinationsAirports = new ArrayList<String>();
        for (String airline : readRoutesFile()) {
            String[] air = airline.split(",");
            destinationsAirports.add(air[4]);

        }
        return destinationsAirports;

    }

    public ArrayList<String> sourceIdList() throws IOException {
        ArrayList<String> sourceId = new ArrayList<String>();
        for (String airline : readRoutesFile()) {
            String[] air = airline.split(",");
            sourceId.add(air[3]);

        }
        return sourceId;

    }

    public ArrayList<String> sourceAirList() throws IOException {
        ArrayList<String> sourceAirports = new ArrayList<String>();
        for (String airline : readRoutesFile()) {
            String[] air = airline.split(",");
            sourceAirports.add(air[2]);

        }
        return sourceAirports;

    }

    public ArrayList<String> stopesList() throws IOException {
        ArrayList<String> stops = new ArrayList<String>();
        for (String airline : readRoutesFile()) {
            String[] air = airline.split(",");
            stops.add(air[7]);

        }
        return stops;

    }

    /*
     * 
     * for (int i = 1; i < m; i++) {
     * if (countriesList.toArray()[i].equals("Ghana")) {
     * System.out.println(i);
     * 
     * }
     * 
     * for (String r : readRoutesFile()) {
     * String[] route = r.split(",", 14);
     * 
     * }
     * 
     * }
     */
}
