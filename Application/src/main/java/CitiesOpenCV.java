
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asmaa
 */
public class CitiesOpenCV {
    
      public LinkedList<CitiesPojo> opencsv(String fileName) {
        LinkedList<CitiesPojo> city= new LinkedList<>();
       try( BufferedReader br= new BufferedReader(new FileReader(fileName)))
       {
        String line=br.readLine();
//        if(line!=null){
//            line=br.readLine();
//        }
        while (line != null){
            String[] attributes=line.split(",");
            CitiesPojo pyr=createCity(attributes);
            city.add(pyr);
            line=br.readLine();
        }}
        catch(IOException ioe){
         ioe.printStackTrace();
         }
     
        return city;
    }


    public  CitiesPojo createCity(String[] a){
        String cityName=a[1];
        int populationInCity=Integer.parseInt(a[2]);
        String country=a[3];
        return new CitiesPojo(cityName,populationInCity,country);
    }
    
}
