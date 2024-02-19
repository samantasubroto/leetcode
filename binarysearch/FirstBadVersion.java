package binarysearch;

//278
public class FirstBadVersion {
    static boolean isBadVersion(int version) {
        return version >= 1702766719;
    }
    public static int firstBadVersion(int n) {
       if(n==1 && isBadVersion(n))
          return n;
        int start = 0;
        int end = n;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(isBadVersion(mid)){
                end = mid;
                break;
            }
            start = mid+1;
        }
        for(int i=start;i<=end;i++)
            if(isBadVersion(i))
                return i;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(2126753390));;
    }
}
