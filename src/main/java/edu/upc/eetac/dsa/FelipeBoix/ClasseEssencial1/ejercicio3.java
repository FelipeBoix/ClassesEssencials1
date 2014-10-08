package edu.upc.eetac.dsa.FelipeBoix.ClasseEssencial1;


	import java.io.FileReader;
	import java.io.File;
	import java.io.BufferedReader;
	public class ejercicio3
	{
	    public static void main( String[] args )
	    {
	        String path = "C:/Users/Felipe/Documents/UNI/2014-2015 Q1/DSA/numeros.txt";
	        int i;
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
	        	while ((linea = br.readLine()) != null){
	        	i= Integer.parseInt(linea);

	        	try{
	        		numero(i);
	        		System.out.println(linea);
	        	   }
	        	catch (Exception BigNumberException) {
					System.out.println("el numero es mas grande que 1000");
				}
	        	}
	        }
	        catch (Exception e) {
				e.printStackTrace();
	        	}
	        finally { // Con el finally cerramos el fichero
	        		  // nos aseguramos que se cierra en el caso que vaya bien
	        		  // o en el caso que salte el exception.
	        	try{
	        		if(null != fr){
	        			fr.close();
	        		}
	        	}catch (Exception e2){
	        		e2.printStackTrace();
	        	}
	        }
	        }
	        
	    
	    static Exception BigNumberException;
	    public static void numero(int i) throws Exception{
	    	if (i >= 1000)
	    		throw  BigNumberException;// el flujo de la ejecución se detiene inmediatamente despues de la sentencia throw.
	    }
	}



