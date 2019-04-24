package src.com.company;

public class AccessModifiers {
    public static void main(final String[] args) {
        // Calling all methods
        AccessModifiers.saySomthingNice();
        AccessModifiers.secretWord();
        final DefaultExample obj = new DefaultExample();
        obj.display();
    }
    static void saySomthingNice(){
        final String steve = "hello mike";
        System.out.println(steve);
    }
    static void secretWord(){
        final String arcade = "hello Game";
        final String a = arcade.substring(4,8);
        final String b = arcade.substring(7);
        final String c = b + arcade + a;
        System.out.println(c);
    }
}
