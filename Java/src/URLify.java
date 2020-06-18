/*

    1.3 URLify: Write a method to replace all spaces in a string with '%20: You may assume that the string
    has sufficient space at the end to hold the additional characters, and that you are given the "true"
    length of the string. (Note: If implementing in Java, please use a character array so that you can
    perform this operation in place.)

 */

public class URLify {

    public static void main(String[] args) {

        String s =  "Hey how are you doing?        ";
        solution(s.stripTrailing());
        solutionII(s, s.stripTrailing().length());

    }

    public static void solution(String s){

        s = s.replaceAll(" ", "%20");
        System.out.println("Solition 1: " + s);
    }

    public static void solutionII(String s, int tlen){

        char[] a = new char[s.length()];
        for(int i = 0; i<tlen; i++){
            a[i] = s.charAt(i);
        }

        for (int i =0; i<s.length();i++) {
            if(a[i] == ' '){

                for(int j=s.length()-3; j>i; j--){
                    a[j+2] = a[j];
                }

                a[i] = '%';
                a[i+1] = '2';
                a[i+2] = '0';
            }
        }

        System.out.print("Solution II: ");
        System.out.println(a);

    }

}
