import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] marks = {1,2,3,4,5};
        System.out.println(Arrays.toString(marks));

        // another way to initialize array
        // int[] marks = new int[5];
        // marks[0] = 25;
        // marks[1] = 25;
        // marks[2] = 25;
        // marks[3] = 25;
        // marks[4] = 25;
        for(int i=0; i<5; i++)
            System.out.print(marks[i] + " ");
        System.out.println("");
    }
}


