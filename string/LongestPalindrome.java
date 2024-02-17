package string;

public class LongestPalindrome {
    public static boolean isPalindrome(String str) {
        char[] array = str.toCharArray();
        for(int i=0,j=array.length-1;i!=j && i<j;i++,j--) {
            if(array[i] != array[j])
                return false;
        }
        return true;
    }

    public static String longest(String str) {
        String max_length = "";
        if(str.length() == 1)
            return str;
        for(int i=0;i<str.length()-1;i++) {
            for(int j=i+1;j<=str.length();j++) {
                if(str.charAt(i) == str.charAt(j-1)){
                    if(isPalindrome(str.substring(i,j)) && str.substring(i,j).length() > max_length.length()){
                        max_length = str.substring(i,j);
                    }
                }
            }
        }
        return max_length;
    }

    public static void main(String[] args) {
        System.out.println(longest("jcwwnkwiajicysmdueefqjnrokunucidhgkswbgjkkrujkxkxeanrpjvpliomxztalhmvcldnqmkslkprhgtwlnsnygbzdvtdbsdzsdjggzgmhogknpfhtgjmclrkgfqdbiagwrqqcnagosnqrnpapxfrtrhzlyhszdtgkqggmewqmwugrbufiwfvtjhczqgcwpcyjioeacggiwyinpkyxrpxhglrtojgjmmswxnvirfsrbhmpqgjyyagjqfwkqkjkumywvgfutmiwihwnnhbfxcijaoiyxbdnrckexqfhsmmxflaneccyaoqoxfbaylcvvpfafsikebzcdufvhluldguwsmrtjaljpcjestranfrvgvytozxpcvnwquhnsxlmzkehwopgxvifajmrlwqiqylgxibnypxwpkggxevyfoxywfsfpjbzfxxysgxgwxrzkwdqlkrpajlltzqfqshdokibakkhydizsgwbygqulljqmtxkwepitsukwjlrrmsjptwabtlqytprkkuxtqdmptctkfabxsohrfrqvrbjfbppfkpthosveoppiywkkuoasefviegormlqkqlbhnhblkmglxcbszblfipsyumcrjrkrnzplkveznbtdbtlcptgswhiqsjugqrvujkzuwvoxbjremyxqqzxkgerhgtidsefyemtmstsznvgohexdgetqbhrxaomzsamapxhjibfvtbquhowyrwyxthpwvmfyyqsyibemnfbwkddtyoijzwfxhossylygxmnznpegtgvlrsreepkrcdgbujkghrgtsxwlvxrgrqxnvgqkppbkrxjupjfjcsfzepdemaulfetn"));
    }
}
