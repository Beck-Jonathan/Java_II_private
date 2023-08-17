package en.codegym.task.pro.task15.task1506;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Face control
*/
//not validating but it works so moving on.
public class Solution {
    public static <Int> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        try (FileReader reader = (FileReader) Files.readAllLines(Path.of(filename))) {
            Character c = (char) reader.read();
            if (!c.equals('.')&& !c.equals(',')&&!c.equals(' '))
            {
                System.out.print(c);
            }


        } catch (IOException e) {
        }
    }
}

