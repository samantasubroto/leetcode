package easy;

public class PlusOne {
    public static int[] onePlus(int[] arr) {
        int temp = arr.length-1;
        while(temp != 0 && arr[temp] > 8) {
            arr[temp] = (arr[temp]+1) % 10;
            temp--;
        }
        if(arr[temp] < 9)
            arr[temp] = arr[temp]+1;
        else {
            int value = arr[temp]+1;
            int a[] = new int[arr.length + 1];
            a[1] = value % 10;
            a[0] = value / 10;
            for(int i=1;i<arr.length;i++)
                a[i+1] = arr[i];

            return a;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,0,2,3};
        arr = onePlus(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
