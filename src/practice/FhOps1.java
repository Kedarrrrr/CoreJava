package practice;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FhOps1 {
    public static void main(String[] args) throws IOException {
        File file = new File("data.txt");

        file.createNewFile();

        FileWriter fw = new FileWriter(file);
        fw.write("Hello Java");
        fw.close();

        //boolean deleted = file.delete();
        //System.out.println("Deleted: " + deleted);
    }
}

}
