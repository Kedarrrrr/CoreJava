package practice;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Fh03 {
	
	public static void BuffRead(String filename) {
		try {
			BufferedReader br= new BufferedReader(new FileReader(filename));
			String line;
			while((line=br.readLine())!=null) {
				if(!line.isBlank()) {
					System.out.println(line);
				}
			}
			
		}catch(Exception e) {
			System.out.println("Error: "+ e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the File Name: ");
		String Line= sc.nextLine();
		
		BuffRead(Line);

	}

}
