import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AirPorts {
    /**
     * It reads the airports.csv file and returns an ArrayList of Strings
     * 
     * @return The method returns an ArrayList of Strings.
     */
    public ArrayList<String> readAirportsFile() throws IOException {
        File airportsFile = new File("C:/Users/Lenovo/Desktop/ICP Project/airports.csv");

        ArrayList<String> airportsList = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new FileReader(airportsFile));

        String st;
        while ((st = br.readLine()) != null)
            airportsList.add(st);
        br.close();
        return airportsList;
    }

    public ArrayList<String> CountryList() throws IOException {
        ArrayList<String> countriesList = new ArrayList<String>();
        for (String country : readAirportsFile()) {
            String[] count = country.split(",", 8);

            countriesList.add(count[3]);

        }
        return countriesList;
    }

    public ArrayList<String> AirportNameList() throws IOException {
        ArrayList<String> airportName = new ArrayList<String>();
        for (String airport : readAirportsFile()) {
            String[] pot = airport.split(",");
            airportName.add(pot[1]);

        }
        return airportName;
    }

    public ArrayList<String> cityname() throws IOException {
        ArrayList<String> cityNamesList = new ArrayList<String>();
        for (String cityname : readAirportsFile()) {
            String[] City = cityname.split(",");
            cityNamesList.add(City[2]);

        }
        return cityNamesList;

    }

    public ArrayList<String> aitaList() throws IOException {
        ArrayList<String> AITA = new ArrayList<String>();
        for (String i : readAirportsFile()) {
            String[] mewi = i.split(",", 8);
            // System.out.println(mewi[3]);
            AITA.add(mewi[4]);

        }
        return AITA;
    }

    public ArrayList<String> airportIdList() throws IOException {

        ArrayList<String> airPortId = new ArrayList<String>();

        for (String i : readAirportsFile()) {
            String[] id = i.split(",", 8);
            // System.out.println(mewi[3]);
            airPortId.add(id[0]);

        }
        return airPortId;

        /*
         * System.out.println(cityName.toArray()[245]);
         * System.out.println(airportName.toArray()[245]);
         * System.out.println(airPortId.toArray()[245]);
         * System.out.println(countriesList.toArray()[245]);
         * System.out.println(countriesList.toArray()[245]);
         */

    }

    public void trial() throws IOException {
        int m = cityname().size();
        System.out.println(cityname().toArray()[21]);
        System.out.println(cityname().toArray()[158]);
        System.out.println(airportIdList().toArray()[21]);
        System.out.println(airportIdList().toArray()[158]);

        for (int i = 1; i < m; i++) {
            if (cityname().toArray()[i].equals("Accra")) {
                // System.out.println(i);
            }
        }
    }

}
