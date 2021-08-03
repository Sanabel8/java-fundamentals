/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new App().getGreeting());

        String path = "./app/src/main/resources/gates.js";
        linter(path);
        System.out.println(linter(path));
    }
    public static ArrayList<String> linter(String filePath) {
        ArrayList<String> errorPlace = new ArrayList<String>();
        Path path = Paths.get(filePath);

        try {
            List<String> fileLines = Files.readAllLines(path);
            int lineNumber = 1;
            for(String line : fileLines) {
                if (!line.endsWith(";") &&
                        line.endsWith("}") &&
                        !line.endsWith("{") &&
                        !line.contains("else") &&
                        !line.contains("if") &&
                        !line.equals("")){
                    String printLine = "Line " + lineNumber + " : Missing semicolon.";
                    errorPlace.add(printLine);
                }
                lineNumber++;
            }
        } catch (IOException exception){
            System.out.println("An error occurred while reading from file");
        }
        return errorPlace;
    }
}