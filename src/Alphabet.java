public enum Alphabet {
    ALPHABET("ABCDEFGHIJKLMNOPQRSTUVWXYZ.,”:-!? "),
    KEY(3);
    private int key;
    private String alphabet;
    Alphabet(int key) {
        this.key = key;
    }



    Alphabet(String alphabet) {
        this.alphabet=alphabet;
    }

    public int getKey() {
        return key;
    }
    public char[] getAlphabet() {
        char[]arrayAlphabet = alphabet.toCharArray();
        return arrayAlphabet;
    }
}
