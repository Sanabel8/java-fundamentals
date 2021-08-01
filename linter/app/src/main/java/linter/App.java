/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class App {

    public String getGreeting() {
        return "Hello World!";
    }


    public static void main(String[] args) throws IOException {
        System.out.println(new App().getGreeting());
Path path = Paths.get("./app/src/main/resources/gates.js");

        new App().lenterJS(path.toString());
    }
    public static int lenterJS(String path) throws FileNotFoundException {
        BufferedReader reader= new BufferedReader(new FileReader(path));
        Scanner scanner= new Scanner(reader);
        int error =0;
        int errorLine =0;
        String curly= "";

        while (scanner.hasNext()){
            curly =scanner.nextLine();
            if(!curly.endsWith(";") && !curly.isEmpty() &&
                    !curly.startsWith("}") &&
                    !curly.endsWith("{") &&
                    !curly.contains("if") &&
                    !curly.contains("else") )
            {
               error++;
               System.out.println("Line 3: Missing semicolon.");
            }else {
                errorLine++;
            }


        }
      return error;
        }

    }
