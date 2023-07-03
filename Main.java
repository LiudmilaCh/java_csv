/******************************************************************************

 Liudmila Chizhikova (c)
 Example of reading the .csv database into the array using the simple Java 
 classical libraries - java.io.Scanner (here I use whole packages of io & util)

*******************************************************************************/
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
  File scanf = new File("datatry.csv");
        Scanner sc;
        ArrayList<String> listed = new ArrayList<>();

            try { sc = new Scanner(scanf);  

            sc.useDelimiter(";");           //our .csv file has ; delimeter between words and integer data
    while (sc.hasNext())                    //use sc scanner for reading each .csv element  
    {  
        
     listed.add(sc.next());                 //here we're writing the .csv data right into the array
        
        }   
    sc.close();                             //closes the scanner  
}
catch (FileNotFoundException e) {
            e.printStackTrace();
    }
    
   //here we show the results of .csv reading
    String first = listed.get(0);           //with .get method we can pick the value of the array as needed
    String name = listed.get(4);            //java.lang.reflect.Array.get() method gives us the element at declared position
    String age1 = listed.get(6);
    int age = Integer.valueOf(age1);
    System.out.println("This is the first value of the.csv file: " + first);
    System.out.println("The "+ name +" age is "+age);
}}