import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;
import java.util.Scanner;

public class SearchFile {
    public static void main(String[] args) {
        System.out.println("Enter the file name: ");
        final String input = new Scanner(System.in).nextLine();
        Path filePath = Paths.get("/home/Manu");
        
        try {
            // Anonymous class for a SimpleFileVisitor
            SimpleFileVisitor<Path> pathVisitor = new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attr) {
                    if (file.getFileName().toString().contains(input)) {
                        System.out.println("File you have searched: " + file);
                    }
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path file, IOException e) {
                    System.err.println("Error: " + e + " - " + file);
                    return FileVisitResult.CONTINUE;
                }
            };
            
            // EnumSet to handle symbolic links
            EnumSet<FileVisitOption> options = EnumSet.of(FileVisitOption.FOLLOW_LINKS);
            Files.walkFileTree(filePath, options, 5, pathVisitor);
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}