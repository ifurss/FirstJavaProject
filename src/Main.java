import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Приветствую вас в приложении, пожалуйста введите необходимую операцию\n 1-кодировка, 2-декодировка, 3 - брутал форс");
        //int operation = scanner.nextInt();
        FileCreation.fileRead();

    }
}

