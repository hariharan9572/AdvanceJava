import java.io.IOException;
import java.util.Scanner;

public class UserInputUsingBufferedreaderAndScanner {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter a number");
        // int num = System.in.read();

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        Scanner sc = new Scanner(System.in);

        // int num = Integer.parseInt(bf.readLine());
        int num = sc.nextInt();
        System.out.println(num);

        // bf.close();
    }
}
