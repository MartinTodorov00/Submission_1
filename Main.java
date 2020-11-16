import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 1;
        Integer num2 = 2;

        List <Integer> nums = new ArrayList<>();

        nums.add(num1);
        nums.add(num2);


        for (Integer num : nums) {
            System.out.println(num);
        }
    }
}
