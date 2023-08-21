import java.util.Arrays;

public class Encryption {


    public static char[] encryption(char[] array){

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < Constants.getArray().length; j++) {

                if(array[i] == Constants.getArray()[j] && (j + Constants.getKEY()) >= Constants.getArray().length){
                    array[i] = Constants.getArray()[j-Constants.getArray().length + Constants.getKEY()];
                }

                if(array[i] == Constants.getArray()[j] ){
                    array[i] = Constants.getArray()[j+Constants.getKEY()];
                    break;
                }
                char temp = Character.toLowerCase(Constants.getArray()[j]);
               if(array[i] == temp){
                   char temp2 = Character.toLowerCase(Constants.getArray()[j+Constants.getKEY()]);
                   array[i] = temp2;
                   break;
               }

            }
        }
       return array;
    }

}
