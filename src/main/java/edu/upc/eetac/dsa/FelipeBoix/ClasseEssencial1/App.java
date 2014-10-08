package edu.upc.eetac.dsa.FelipeBoix.ClasseEssencial1;
import java.io.*;
import java.io.FileReader;
public class App 
{
    public static void main( String[] args )
    {
        String path = "C:/Users/Felipe/Documents/UNI/2014-2015 Q1/DSA/numeros.txt";
        // Lectura de un fichero en java
        File archivo = null;
        FileReader fr = null;// abrimos un fichero de texto para leer.
        BufferedReader br = null;
        
        try {
        	// Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda.
        	archivo = new File(path);
        	fr = new FileReader (archivo);
        	br = new BufferedReader (fr);
        	
        	//Lectura dl fichero.
        	String linea;
        	while ((linea = br.readLine()) != null)
        		System.out.println(linea);
        }
        catch (Exception e) {
			e.printStackTrace();
        	
        }
        
    }
}
