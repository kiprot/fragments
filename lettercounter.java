//counting vowels and consonants goven a string as input

class lettercounter {

    public static void counter(String string) {
        int vowels = 0;
        int consonants = 0;
        String s = string.toLowerCase();
        char[] charArray = s.toCharArray();
        for(int a=0; a<charArray.length; a++) {
            char x = s.charAt(a);
            if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'y'){
                vowels++;
            }
            else{
                if(x != ' ')
                    consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + " Consonants: " + consonants );
    }

    //test case
    public static void main(String [] args) {
        String st = "there is a quiet Mouse";
        counter(st);
        
    }
}