public class PrintBetweenCharacters {
    public static void main(String[] args) {
        char char1 = 'P';
        char char2 = 'n';
        char[] chars = {'(', ')', '*', '+', ',', '-', '.', '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':',
                '<', '=', '>', '?', '@', 'A', 'B', 'C', 'D', 'F', 'G', 'H', 'I', 'J', 'K', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z', '[', '\\', ']', '^', '_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] chars1 = printCharacters(chars, char1, char2);
        for (int i = 0; i < chars1.length; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println();
    }
    public static int findCharIndex(char[] chars, char ch){
        for (int i = 0; i < chars.length; i++) {
            if (ch == chars[i]){
                return i;
            }
        }
        return -1;
    }
    public static char[] printCharacters(char[] array, char start, char finish){
        char[] tmp = new char[array.length];
        int number1 = findCharIndex(array, start);
        int number2 = findCharIndex(array, finish);
        for (int i = number1; i < number2; i++) {
            tmp[i] = array[i];
        }

        return tmp;
    }
}
