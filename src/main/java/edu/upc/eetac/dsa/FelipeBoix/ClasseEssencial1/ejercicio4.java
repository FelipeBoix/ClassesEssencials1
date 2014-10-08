package edu.upc.eetac.dsa.FelipeBoix.ClasseEssencial1;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class ejercicio4 {
	
	public static void main( String[] args ) throws IOException{
		Path path = Paths.get("C:/Users/Felipe/Documents/UNI/2014-2015 Q1/DSA/documentoPrueba.txt"); 
		//String path = "C:/Users/Felipe/Documents/UNI/2014-2015 Q1/DSA/documentoPrueba.txt";
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		Scanner scan = null;
		//FileReader fr ;
		
		try{
			inputStream = new BufferedReader( new FileReader("C:/Users/Felipe/Documents/UNI/2014-2015 Q1/DSA/documentoPrueba.txt"));
			outputStream = new PrintWriter( new FileWriter("C:/Users/Felipe/Documents/UNI/2014-2015 Q1/DSA/registro.txt"));
			outputStream.println( "El archivo : "+ path.getFileName());
			scan = new Scanner (inputStream);
			
			
			//double aDouble = Double.parseDouble(inputStream);
		//String c ="";
			int j;
			int contador = 0;
			j= inputStream.read();
			while (j != -1){
				contador ++;
				j= inputStream.read();
			
			}
			//while ( scan.hasNext()){ //nos dice si hay más elementos y el método .next() nos permite movernos al siguiente elemento.
			//	c = c + scan.next();
				
			//}
			
				
				//outputStream.println(c.length());
			    outputStream.println("tiene: " +contador+ " carácteres\n");
				data(outputStream);
				
			}
	
		 finally { // Con el finally cerramos el fichero
		  // nos aseguramos que se cierra en el caso que vaya bien
		  // o en el caso que salte el exception.
			 
			 if ( inputStream != null){
				 inputStream.close();
			 }
			 if ( outputStream != null){
				 outputStream.close();			
		     }
			 if ( scan != null){
				 scan.close();
			 }
		 }
		}
			 public static void data(PrintWriter outputStream) {
			       
				 Calendar data = new GregorianCalendar();
				 //Añadimos año mes dia hora minuto segundo con la comanda GET
				 int año = data.get(Calendar.YEAR);
				 int mes = data.get(Calendar.MONTH);
				 int dia = data.get(Calendar.DAY_OF_MONTH);
				 int hora = data.get(Calendar.HOUR);
				 int minuto = data.get(Calendar.MINUTE);
				 int segundo = data.get(Calendar.SECOND);
				 outputStream.printf("%d/%d/%d %d:%d:%d", año, mes, dia, hora, minuto,segundo);
				 
			    }
			 

}

	
