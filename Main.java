import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input seconds: ");
        int totalSeconds = input.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("%d:%02d:%02d%n", hours, minutes, seconds);
        input.close();
    }
}


public class Main {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        int sum = 0;

        while (count < 100) {
            int p=1;
             for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    p=0;
                    break;
                }
            }
            if (p == 1) {
                sum += number;
                count++;
            }
            number++;
        }

        System.out.println("Sum of the first 100 prime numbers: " + sum);
    }
}

public class Main {
    public static void main(String[] args) {
        String str1 = "Python";
        String str2 = "Tutorial";

        String result = str1.substring(1) + str2.substring(1);

        System.out.println(result);
    }
}


public class Main {
    public static void main(String[] args) {
        String text = "wresource";

        System.out.println("Original String: " + text);
        System.out.println("First unique character of the above: " + firstUniqueIndex(text));
    }

    static int firstUniqueIndex(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.indexOf(text.charAt(i)) == text.lastIndexOf(text.charAt(i))) {
                return i;
            }
        }
        return -1;
    }
}