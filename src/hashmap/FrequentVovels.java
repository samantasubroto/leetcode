package hashmap;

//faster approch then hashmap

public class FrequentVovels {
    public static int maxFreqSum(String s) {
        int maxV = Integer.MIN_VALUE;
        int maxC = Integer.MIN_VALUE;
        int[] arrv = new int[26];
        int[] arr = new int[26];
        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                arrv[ch-97]++;
            } else {
                arr[ch-97]++;
            }
        }
        for(int i=0;i<arrv.length;i++) {
            maxV = Math.max(maxV, arrv[i]);
            maxC = Math.max(maxC, arr[i]);
        }

        return maxC + maxV;
    }

    public static void main(String[] args) {
        maxFreqSum("successes");
    }
}
