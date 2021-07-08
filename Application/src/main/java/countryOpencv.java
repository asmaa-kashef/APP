/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author asmaa
 */
public class countryOpencv {
     public LinkedList<Country> readCountryFromCSV(String filename) {
        LinkedList<Country> countries = new LinkedList<>();
        try {
            FileReader r = new FileReader(filename);
            BufferedReader br = new BufferedReader(r);
            String line;
            do {
                line = br.readLine();
                if (line != null) {
                    String[] parts = line.split(",");
                    Country obj = createCountry(parts);
                    countries.add(obj);
                }
            } while (line != null);
            br.close();
            r.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return countries;
    }

    public Country createCountry(String[] metadata) {
        String code = metadata[0];
        String name = metadata[1];
        String continent = metadata[2];
        double surfaceArea = Double.parseDouble(metadata[4]);
        double population = Double.parseDouble(metadata[3]);
        double gnp = Double.parseDouble(metadata[5]);
        int capital = Integer.parseInt(metadata[6]);
        return new Country(code, name, continent, surfaceArea, population, gnp, capital);
    }

}