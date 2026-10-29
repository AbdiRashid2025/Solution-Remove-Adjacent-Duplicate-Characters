import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Solution solution = new Solution();

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        String answer = solution.removeDuplicates(s);

        System.out.println("Original String: " + s);
        System.out.println("Final String: " + answer);

        input.close();
    }
}

