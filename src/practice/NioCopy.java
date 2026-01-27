package practice;

import java.nio.file.*;

public class NioCopy {
    public static void main(String[] args) throws Exception {
        Files.copy(
            Paths.get("source.txt"),
            Paths.get("dest.txt"),
            StandardCopyOption.REPLACE_EXISTING
        );
    }
}
