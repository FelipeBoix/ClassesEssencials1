package edu.upc.eetac.dsa.FelipeBoix.ClasseEssencial1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ejercicio7 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dato data = new Dato(0, "felipe", 'f');
		Dato data1 = new Dato(1, "david", 'd');
		Dato data2 = new Dato(2, "juan", 'j');
		Dato data3 = new Dato();
		Dato data4 = new Dato();
		Dato data5 = new Dato();

		String path = "C:/Users/Felipe/Documents/UNI/2014-2015 Q1/DSA/ejercicio7.txt";
		ObjectOutputStream out = null;
		ObjectInputStream in = null;
		try {

			out = new ObjectOutputStream(new FileOutputStream(path));
			out.writeObject(data);
			out.writeObject(data1);
			out.writeObject(data2);
			in = new ObjectInputStream(new FileInputStream(path));
			data3 = (Dato) in.readObject();
			data4 = (Dato) in.readObject();
			data5 = (Dato) in.readObject();
			
		} finally {

			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}

	}
}