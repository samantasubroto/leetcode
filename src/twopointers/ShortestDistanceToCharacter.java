package twopointers;

public class ShortestDistanceToCharacter {
    public static int[] shortestToChar(String s, char c) {
        int[] solution = new int[s.length()];
        int lastUpdatedIndex = 0;
        int lastMatchingIndex = Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == c) {
                while(lastUpdatedIndex != i) {
                    if(Math.abs(i - lastUpdatedIndex) < Math.abs(i - lastMatchingIndex)) {
                        solution[lastUpdatedIndex] = Math.abs(i - lastUpdatedIndex);
                    }else {
                        solution[lastUpdatedIndex] = Math.abs(i - lastMatchingIndex);
                    }
                    lastUpdatedIndex++;
                }
                solution[lastUpdatedIndex] = 0;
                lastUpdatedIndex++;
                lastMatchingIndex = i;
            }
        }
        return solution;
    }

    public static void main(String[] args) {
        int[] arr = shortestToChar("loveleetcode", 'e');
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
