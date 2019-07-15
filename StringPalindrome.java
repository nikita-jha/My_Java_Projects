public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println(lastLetter("1234321"));
    }

    public static String lastLetter(String word) {
        String compilation = "";
        int length = word.length();
        String finalLetter = word.substring(length-1);
        compilation = compilation + finalLetter;

        for(int i = 1; i < length; i++) {
            finalLetter = word.substring(length-i-1,length-i);
            compilation = compilation + finalLetter;


            if(compilation.length() > length)
                break;

        }

        if(compilation.equals(word)) {
            return "true";
        }
        return "false";

    }


}
