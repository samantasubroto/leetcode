package binarysearch;

//287
public class FindDuplicate {

    public static int usingIndexMapping(int[] arr) {
        int val = arr[0];
        while(true) {
            if(val == arr[val])
                return val;
            else {
                int newvalue = arr[val];
                arr[val] = val;
                val = newvalue;
            }
        }
    }

    public static int usingCycleDecectionAldo(int[] arr) {
        int slow = 0;
        int fast = 0;
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow != fast);
        int ptr1 = 0;
        int ptr2 = slow;
        do{
            ptr1 = arr[ptr1];
            ptr2 = arr[ptr2];
        }while(ptr2 != ptr1);

        return ptr1;
    }


    public static void main(String[] args) {

    }
}
