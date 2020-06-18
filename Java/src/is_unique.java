public class is_unique {

    public static void main(String[] args) {

        String s = "tohelwiyu";
        unique_characters(s);
        unique_charactersII(s);
        recursive_unique_characters(s);


    }

    public static void unique_characters(String s){

        for(int i =0; i< s.length(); i ++){
            for(int j =i+1; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j))
                    System.out.println("Redundant characters detected. Thereby, not unique.");
                break;
            }
        }

        System.out.println("All the characters are unique");
    }

    public static void unique_charactersII(String s){
        int n = s.length();

        for(int i = 1; i< n-1; i++){
            if((s.substring(0, i-1) + s.substring(i+1, n)).contains("" + s.charAt(i)))
                System.out.println("II : Redundant characters detected. Thereby, not unique.");
            break;
        }

        System.out.println("All the characters are unique");
    }

    public static void recursive_unique_characters(String s){

        if(s.length()==1) {
            System.out.println("The string is unique");
            System.exit(0);
        }

        char c = s.charAt(0);

        if(s.contains(""+c)) {
            System.out.println("Redundant characters detected.");
            System.exit(0);
        }

        recursive_unique_characters(s.substring(1));

    }
}
