import java.util.Arrays;

public class Decryption {
    public static char[] decryption(char[] array){

        for (int i = 0; i < array.length-2; i++) {
            for (int j = 0; j < Constants.getArray().length; j++) {
                char temp = Character.toLowerCase(Constants.getArray()[j]);
                if(array[i] == Constants.getArray()[j] && (j - Constants.getKEY()) < 0){
                    array[i] = Constants.getArray()[j+Constants.getArray().length - Constants.getKEY()];
                    break;
                }
                if(array[i] == temp && (j - Constants.getKEY()) < 0){
                    array[i] = Constants.getArray()[j+Constants.getArray().length - Constants.getKEY()];
                    break;
                }

                if(array[i] == Constants.getArray()[j] ){
                    array[i] = Constants.getArray()[j-Constants.getKEY()];
                    break;
                }

                if(array[i] == temp){
                    char temp2 = Character.toLowerCase(Constants.getArray()[j-Constants.getKEY()]);
                    array[i] = temp2;
                    break;
                }

            }

        }
        FileCreation.fileWrite(array);
        System.out.print(array);
        return array;
    }
}
