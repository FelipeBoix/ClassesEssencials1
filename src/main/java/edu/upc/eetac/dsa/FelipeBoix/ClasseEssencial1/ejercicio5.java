package edu.upc.eetac.dsa.FelipeBoix.ClasseEssencial1;


import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class ejercicio5 {
	
	public static void main( String[] args ) throws IOException{
		Path path = Paths.get("C:/Users/Felipe/Documents/UNI/2014-2015 Q1/DSA/images.jpg"); 
		//String path = "C:/Users/Felipe/Documents/UNI/2014-2015 Q1/DSA/documentoPrueba.txt";
		FileInputStream input = null;
		PrintWriter output = null;
		//Scanner scan = null;
		
		try{
			input = new FileInputStream("C:/Users/Felipe/Documents/UNI/2014-2015 Q1/DSA/images.jpg");
			output = new PrintWriter( new FileWriter("C:/Users/Felipe/Documents/UNI/2014-2015 Q1/DSA/registro2.txt"));
			output.println(path.getFileName());
			//scan = new Scanner (input);
			int c;
			int contador = 0;
			while((input.read()) != -1){// guardo el valor en c hasta que el read sea diferente al tamaño de la imagen.
				
				contador ++;
				
			}
			output.println("numero de bytes:"+contador);
			data(output);
			System.out.printf("bytes: %d", contador);
			}
	
		 finally { // Con el finally cerramos el fichero
		  // nos aseguramos que se cierra en el caso que vaya bien
		  // o en el caso que salte el exception.
			 
			 if ( input!= null){
				 input.close();
			 }
			 if ( output != null){
				 output.close();			
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
