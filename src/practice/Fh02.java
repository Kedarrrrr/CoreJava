package practice;
import java.io.File;
import java.util.Scanner;

public class Fh02 {
	
	public static void Readop(String filename) {
		String file= filename;
		File f= new File(file);
		try {
			if(!f.exists()) {
				System.out.println("NO FILE FOUND");
			}else {
				System.out.println("File Found");
				System.out.println("Length of file: "+f.length());
			}
		}catch(Exception e) {
			System.out.println("ERROR: "+ e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("File name: ");
		String filename= sc.nextLine();
		
		Readop(filename);

	}

}
