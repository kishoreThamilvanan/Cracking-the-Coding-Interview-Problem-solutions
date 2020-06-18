import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

/* Question 1.2:

    Giventwo String, write a method to check if one is a permutation of the other.
 */
public class check_permutation {

    public static void main(String[] args){

        String A = "kishore";
        String B = "melonas";

        solutionII(A, B);
    }

    public static boolean lenCheck(String a, String b){

        if(a.length() != b.length()) {
            System.out.println("Unequal lengths of Strings");
            return true;
        }

        return false;

    }

    public static void solution(String a, String b){

        if(lenCheck(a, b))
            return;

        for(int i =0; i<a.length(); i++){

             if(b.contains(""+a.charAt(i))) {

                 if (i > 0 && i < a.length()) {
                     b = b.substring(0, i-1) + b.substring(i+1, b.length());
                     a = a.substring(0, i-1) + a.substring(i+1, a.length());
                 }
             }
        }

        if(a.length() > 0 || b.length() > 0){
            System.out.println("These Strings are not permutations of each other.");
        }
    }

    public static void solutionII(String a, String b){

        ArrayList<Character> la = new ArrayList<>();
        ArrayList<Character> lb = new ArrayList<>();

        if(lenCheck(a, b))
            return;

        for(int i=0; i<a.length(); i++){    // o(n) x (O(1) + O(1) + O(1))

            if(a.charAt(i) == b.charAt(i))
                continue;

            la.add(a.charAt(i));
            lb.add(b.charAt(i));
        }

        la.sort(Character::compareTo);      // o(nlogn)
        lb.sort(Character::compareTo);      // o(nlogn)

        if(la.equals(lb)){                  // o(n)
            System.out.println("One String is a permutation of the other.");
            return;
        }

        System.out.println("Not permutations of one another.");
    }
}
