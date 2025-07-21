public class CharExample {

 
    void displayCharWithoutArgument() {
        char letter = 'A';
        System.out.println("Character (without argument): " + letter);
    }
    void displayCharWithArgument(char ch) {
        System.out.println("Character (with argument): " + ch);
    }

    public static void main(String[] args) {
        CharExample obj = new CharExample();

        obj.displayCharWithoutArgument();

        obj.displayCharWithArgument('Z');
    }
}