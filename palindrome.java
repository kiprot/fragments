
/*
If the integer is a -ve, it cannot be a palindrome
Reverse the last half of the integer and compare it to the first half
To know if I have reached half the number, I should check if reversed half is more than original
Then check for the boolean and return it
Complexity: time [O(log n)] ; space [O(1)]
*/



public class palindrome {


    public static boolean findPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0) ) {
            return false;
        } else {
            int reversedHalfNum = 0;
            while(x > reversedHalfNum) {
                reversedHalfNum = (reversedHalfNum * 10) + (x % 10);
                x /= 10;
            }
            return (x == reversedHalfNum) || (x == reversedHalfNum/10);
        }
        
    }

    public static void main(String[] args) {
        int trial = -12341;
        boolean x = findPalindrome(trial);
        System.out.println(x);
    }

}