package en.codegym.task.pro.task15.task1504;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Mixed-up bytes
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path1 = scanner.nextLine();
        String path2 = scanner.nextLine();
        try (InputStream input = Files.newInputStream(Path.of(path1));
             OutputStream output = Files.newOutputStream(Path.of(path2))){
            while (input.available()>0){
                Integer temp = input.read();
                if (input.available()>0){
                output.write(input.read());}
                output.write(temp);


            }
        }
        catch (IOException thisone){

        }
    }
}

