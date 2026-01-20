package practice;
import java.io.File;

public class FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file= new File("K:\\java\\data.txt");
		if(file.exists()) {
			System.out.println("File is Present.");
		}else {
			System.out.println("File not found. ");
		}

	}

}
