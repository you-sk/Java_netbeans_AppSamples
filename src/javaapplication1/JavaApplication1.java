package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author you-s
 */
public class JavaApplication1 {
	public static void main(String[] args) throws Exception {
            try (Scanner scanner = new Scanner(System.in)) {
                while (scanner.hasNextLine()) {
                    String s = scanner.nextLine();
                    Integer len = s.length();
                    if (len == 0 || len % 8 != 0) {
                        break;
                    }else{
                        for (int i = 0; i < len/8; i++) {
                            System.out.print((char)Integer.parseInt(s.substring(i*8, i*8+8), 2));
                        }
                    }
                }
            }
	}
}
