
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.LinkedList;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asmaa
 */
import java.util.OptionalInt;
import java.util.stream.IntStream;
public class SortedCitesStream {
    
      CitiesOpenCV open=new CitiesOpenCV();
      countryOpencv copen=new countryOpencv();
      
       public  List<CitiesPojo> Filter(String fileName ,String country){
             List<CitiesPojo> cities= open.opencsv(fileName);
             List<CitiesPojo> matchedcities= new ArrayList();
             matchedcities = cities.stream().filter(b -> b.getCountry().trim().equals(country) ).collect(Collectors.toList());
               return matchedcities;
        }
      

          public List<CitiesPojo> SortCities( List<CitiesPojo>Cities){
   
           Cities.sort(Comparator.comparingDouble(CitiesPojo::getPopulationInCity));
           return Cities; 
   
   }
       
         public OptionalInt highSortCities( List<CitiesPojo>Cities){
   
            OptionalInt  highSor=Cities.stream().mapToInt( b -> b.getPopulationInCity()).max();
           return highSor; 
   
   }
         public List<Double> listOfCountriesPopulation(String fileName){
            List<Country> Countries=copen.readCountryFromCSV(fileName);
            List<Double> CountriesPopulation  =Countries.stream().filter(Country::getPopulation).collect(Collectors.toList());
        return  CountriesPopulation ;
}
}
