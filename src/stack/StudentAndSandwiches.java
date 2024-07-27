package stack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class StudentAndSandwiches {
    public static int countStudents(int[] x, int[] y) {
        Queue<Integer> student = new LinkedList<>();
        Queue<Integer> sandwiches = new LinkedList<>();
        Arrays.stream(y).forEach(sw -> sandwiches.add(sw));
        Arrays.stream(x).forEach(stu -> student.add(stu));
        int maxIteration = student.size() * 4;
        int counter = 0;
        while(student.size() != 0 && counter < maxIteration ) {
            if(student.peek() == sandwiches.peek()) {
                student.remove();
                sandwiches.remove();
            } else {
                student.add(student.remove());
            }
            counter++;
        }
        return student.size();
    }

    public static void main(String[] args) {
        countStudents(new int[]{1,1,1,0,0,1}, new int[]{1,0,0,0,1,1});
    }
}
