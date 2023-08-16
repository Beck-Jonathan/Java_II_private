package en.codegym.task.pro.task14.task1411;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

/* 
Unpacking exceptions
*/

public class Solution {

    public static final String FAILED_TO_READ = "Unable to read file.";
    public static final String FAILED_TO_WRITE = "Unable to write to file.";

    public static FileManager fileManager = new FileManager();

    public static void main(String[] args) {
        try {
            fileManager.copyFile("book.txt", "book_final_copy.txt");
            fileManager.copyFile("book_final_copy.txt", "book_last_copy.txt");
        } catch (RuntimeException exp) {
            Throwable cause = exp.getCause();
            if (cause instanceof FileNotFoundException) {
                Exception exp2 = (Exception) cause;
                System.out.println(FAILED_TO_READ);
            } else if (cause instanceof FileSystemException) {
                Exception exp2 = (Exception) cause;
                System.out.println(FAILED_TO_WRITE);

            }
            //write your code here
        }
    }
}
