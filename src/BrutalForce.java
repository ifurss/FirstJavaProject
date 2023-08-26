import java.util.Arrays;
import java.util.Scanner;

public class BrutalForce {

    public static char[] brutalForceMethod(char[] array) {
        Scanner scanner = new Scanner(System.in);
        String keyWord = "stop";
        int key = 1;
        System.out.println("Для начала работы программы Брут форсб пожалуйста введите \"Start\"");
        String keyWord2 = scanner.nextLine();


        while (!keyWord2.equalsIgnoreCase(keyWord)) {

            for (int i = 0; i < array.length - 2; i++) {
                for (int j = 0; j < Constants.getArray().length; j++) {
                    if(array[i] == Constants.getArray()[j] && j == Constants.getArray().length-1){
                        array[i] = Constants.getArray()[0];
                    }
                    if (array[i] == Constants.getArray()[j] || array[i] == Character.toLowerCase(Constants.getArray()[j])) {
                        array[i] = Constants.getArray()[j + key];
                        break;
                    }
                }


            }
            System.out.println("Подходит ли слово? Если да введите \"stop\"" );
            System.out.println(array);
            keyWord2 = scanner.nextLine();

        }
        FileCreation.fileWrite(array);
        System.out.println(array);
        return array;
    }


}
