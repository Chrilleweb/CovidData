import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileHandler {
    public void loadData() throws IOException {
        Scanner reader = new Scanner(new File("data/11_noegletal_pr_region_pr_aldersgruppe.csv"), StandardCharsets.ISO_8859_1);

        while (reader.hasNext()){
            String line = reader.nextLine();

            CovidData covidData = new CovidData();
            String[] parts = line.split(";");

            extracted(parts);

            System.out.println(covidData);
        }

    }

    private static void extracted(String[] parts) {
        CovidData covidData = new CovidData();
        covidData.setRegion(parts[0]);
        covidData.setAldersGruppe(parts[1]);
        covidData.setTilfælde(Integer.parseInt(parts[2]));
        covidData.setIndlagtePåIntensiv(Integer.parseInt(parts[3]));
        covidData.setIndlagte(Integer.parseInt(parts[4]));
    }

    public static void main(String[] args) throws IOException {
        FileHandler fileHandler = new FileHandler();
        fileHandler.loadData();
    }
}
