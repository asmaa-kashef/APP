
import java.util.HashMap;
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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          String File_Name="C:\\Users\\asmaa\\OneDrive\\Desktop\\iti\\java\\Day4\\dataset\\Cities.csv";
        String Countries="C:\\Users\\asmaa\\OneDrive\\Desktop\\iti\\java\\Day4\\dataset\\Countries.csv";
        SortedCitesStream sc= new SortedCitesStream();
        List<CitiesPojo> MatchedCityes=sc.Filter(File_Name, "EGY");
         System.out.println(MatchedCityes);
          List<CitiesPojo> SortCiti  =sc.SortCities(MatchedCityes);
          System.out.println(SortCiti);
          OptionalInt highSortCit=sc.highSortCities(SortCiti);
          System.out.println(highSortCit);
          List<Double> listOfCoPopulation=sc.listOfCountriesPopulation(Countries);
           System.out.println(listOfCoPopulation);
        // TODO code application logic here
        
        
        // TODO code application logic here
    }
    
}
