//using string builder

class ReverseString {

    public String reverse(String s) {

        StringBuilder stringBuilder = new StringBuilder();
        for(int x=s.length()-1; x>=0; x--) {
            stringBuilder.append(s.charAt(x));
        }
        return stringBuilder.toString();

    }

}