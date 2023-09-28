package introduction.types;

public class Primitive {
    public static void main(String[] args) {
        learnInteger();
        learnFloat();
        learnBoolean();
        learnChar();
        learnByte();
    }
    public static void learnByte(){
        // interval of size the byte = -128 at 127 positive
        // smaller type data primitive
        byte data = 125;
        System.out.println(data);
    }

    public static void learnInteger() {

    }

    public static void learnFloat() {

    }

    public static void learnBoolean(){

    }

    public static void learnDouble(){

    }

    public static void learnChar(){
        char character = 'a';
        char nome []= {'w','i','l','l','i','a','m'}; 
        System.out.println("#################");
        for(char va: nome){
            System.out.printf("%s",va);
        }
        System.out.println("#################");
    }
}