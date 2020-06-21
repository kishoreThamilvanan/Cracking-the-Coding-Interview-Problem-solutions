/*
    One Away: There are three types of edits that can be performed on strings: insert a character,
    remove a character, or replace a character. Given two strings, write a function to check if they are
    one edit (or zero edits) away.
    EXAMPLE
    pale , pi e - > tru e
    pales , pal e - > tru e
    pale , bal e - > tru e
    pale , bak e - > fals
 */

public class one_away {

    public static void main(String[] args){
        String a = "app";
        String b = "cat";

        System.out.println("String A: " + a + "\n" + "String B: " + b);
        solution(a, b);
    }

    public static void solution(String a, String b){

        if(Math.abs(a.length() - b.length()) > 1){
            System.out.println("The Strings are not one edit away.");
            return ;
        }

        String s = (a.length() < b.length())? a: b;

        for(int i=0; i<s.length(); i++){

            if(b.contains(""+s.charAt(i))){
                a.replace(s.charAt(i), ' ');
                b.replace(s.charAt(i), ' ');

            }
        }



    }

    public static void solutionII(String a, String b){
        

    }

}
