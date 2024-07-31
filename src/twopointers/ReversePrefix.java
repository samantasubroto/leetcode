package twopointers;

public class ReversePrefix {

    public String swap(int y, String word) {
        StringBuilder sb = new StringBuilder(word);
        for (int i = 0, j = y; i < j; i++, j--) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
        }

        return sb.toString();
    }

    public String reversePrefix(String word, char ch) {
      for(int i=0;i<word.length();i++) {
          if(word.charAt(i) == ch){
              return swap(i,word);
          }
      }
      return word;
    }

    public static void main(String[] args) {
      ReversePrefix rp = new ReversePrefix();
        System.out.println(rp.reversePrefix("abcdefd", 'd'));
    }
}
