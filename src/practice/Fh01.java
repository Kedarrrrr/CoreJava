package practice;
import java.io.File;
import java.io.FileWriter;

public class Fh01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file= new File("newtext.txt");
			file.createNewFile();
			
			FileWriter fw= new FileWriter("newtext.txt", true);
			fw.write("Hello India!");
			fw.close();
		}catch(Exception e) {
			System.out.println("Error: "+ e);
		}

	}

}
