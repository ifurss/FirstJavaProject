public class Encryption {


    public static char[] encryption(char[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < Alphabet.ALPHABET.getAlphabet().length; j++) {
                if(array[j]>=Alphabet.ALPHABET.getAlphabet().length - Alphabet.ALPHABET.getKey()){

                }
               else if(array[i] == array[j]){
                   array[i] = array[j+Alphabet.ALPHABET.getKey()];
               }
            }
        }

    }

}
