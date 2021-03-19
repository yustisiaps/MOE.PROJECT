public class ReverseString {
    public static void main(String [] args){
        ReverseText(new char[]{'y', 'u', 's', 't', 'i' });
    }

    private static void ReverseText(char[] chars) {
        if (chars.length > 0){
            System.out.print(chars[chars.length -1]);
            char[] text = new char[chars.length - 1];
            for (int i = 0; i < text.length; i++){
                text[i] = chars[i];
            }
            ReverseText(text);
        }
    }
}
