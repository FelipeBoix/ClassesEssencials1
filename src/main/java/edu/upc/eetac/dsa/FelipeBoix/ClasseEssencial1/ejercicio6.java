package edu.upc.eetac.dsa.FelipeBoix.ClasseEssencial1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class ejercicio6 {
	
	public static void main( String[] args ) throws IOException{
		
		String path1 = "C:/Users/Felipe/Documents/UNI/2014-2015 Q1/DSA/registro.txt";
		String path2 = "C:/Users/Felipe/Documents/UNI/2014-2015 Q1/DSA/registro2.txt";
		int count1 = numBytes(path1);
		int count2= numBytes(path2);
		
		System.out.println("bytes del 1 archivo "+count1+" bytes del 2 archivo "+count2+ " bytes");
		
		if ( count1> count2){
			System.out.println("El mayor es: "+count1+" bytes");
		}
		else
			System.out.println(count2);
	}
	
	public static int numBytes(String path) throws IOException {
		FileInputStream input = null;
		PrintWriter output = null;
		int j = 0;
	
		try{
			input = new FileInputStream(path);
			
			while((input.read())!= -1){
				j++;
			}
			System.out.println("bytes del archivo: "+ j);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			if( input != null){
				input.close();
			}
			if ( output != null){
				output.close();
			}
		}
		 return j;
	}
}
