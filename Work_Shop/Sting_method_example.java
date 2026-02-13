public class Sting_method_example {
    public static void main(String[] args) {
        String s="Java Programming ";
        // length 
        System.err.println(s.length());

        // touppercase 
        System.out.println(s.toUpperCase());    // JAVA PROGRAMMING

        // tolowercase 
        System.out.println(s.toLowerCase());    // java programming


        //charAt
        System.out.println(s.charAt(5));  //p

        //subststring
        System.out.println(s.substring(5));    //Programming
        System.out.println(s.substring(0,4));  //java

        // contains
        System.out.println(s.concat("Java"));  //true

        //equals
        System.out.println(s.equals("Java Programming ")); //true
    }
}
