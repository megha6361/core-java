class Char {

    void Char() {
        char letter = 'A';
        System.out.println("Char " + letter);
    }

  
    void Char(char ch) {
        System.out.println("Char " + ch);
    }

 
    public static void main(String[] args) {
        Char obj = new Char();

        obj.displayChar();

      
        obj.displayChar('Z');
    }
}