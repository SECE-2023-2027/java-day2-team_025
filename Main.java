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


public class Main {
    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Node head = createList(new int[] {1, 2, 3, 4, 5});

        System.out.println("Original node:");
        printList(head);

        head = removeNthFromEnd(head, 2);

        System.out.println("After removing 2nd element from end:");
        printList(head);
    }

    static Node createList(int[] values) {
        Node head = new Node(values[0]);
        Node current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new Node(values[i]);
            current = current.next;
        }

        return head;
    }

    static Node removeNthFromEnd(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node first = dummy;
        Node second = dummy;

        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;
        return dummy.next;
    }

    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}


public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 6, 7, 6, 2};
        int value = 6;

        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.println("The length of the new array is: " + removeValue(numbers, value));
    }

    static int removeValue(int[] numbers, int value) {
        int index = 0;

        for (int number : numbers) {
            if (number != value) {
                numbers[index] = number;
                index++;
            }
        }

        return index;
    }
}


public class Main {
    public static void main(String[] args) {
        String str1 = "wxyz";
        String str2 = "zyxw";

        System.out.println("String-1 : " + str1);
        System.out.println("String-2 : " + str2);
        System.out.println("Check if two given strings are anagrams or not?: " + areAnagrams(str1, str2));
    }

    static boolean areAnagrams(String str1, String str2) {
        char[] first = str1.toCharArray();
        char[] second = str2.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }
}


public class Main {
    public static void main(String[] args) {
        String[] dictionary1 = {"cat", "flag", "green", "country", "w3resource"};
        String[] dictionary2 = {"cat", "dog", "red", "is", "am"};

        System.out.println(longestWords(dictionary1));
        System.out.println(longestWords(dictionary2));
    }

    static List<String> longestWords(String[] dictionary) {
        List<String> result = new ArrayList<>();
        int maxLength = 0;

        for (String word : dictionary) {
            if (word.length() > maxLength) {
                result.clear();
                result.add(word);
                maxLength = word.length();
            } else if (word.length() == maxLength) {
                result.add(word);
            }
        }

        return result;
    }
}


public class Main {
    public static void main(String[] args) {
        int[] numbers = {20, 30, 40};

        System.out.println("Original Array: " + Arrays.toString(numbers));

        int first = numbers[0];
        numbers[0] = numbers[1];
        numbers[1] = numbers[2];
        numbers[2] = first;

        System.out.println("Rotated Array: " + Arrays.toString(numbers));
    }
}


public class Main {
    public static void main(String[] args) {
        int[] numbers = {50, -20, 0, 30, 40, 60, 10};

        System.out.println(numbers[0] == numbers[numbers.length - 1]);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input number of students:");
        int numberOfStudents = input.nextInt();

        String highestName = "";
        String highestId = "";
        int highestScore = -1;

        String lowestName = "";
        String lowestId = "";
        int lowestScore = 101;

        System.out.println("Input Student Name, ID, Score:");
        for (int i = 0; i < numberOfStudents; i++) {
            String name = input.next();
            String id = input.next();
            int score = input.nextInt();

            if (score > highestScore) {
                highestScore = score;
                highestName = name;
                highestId = id;
            }

            if (score < lowestScore) {
                lowestScore = score;
                lowestName = name;
                lowestId = id;
            }
        }

        System.out.println("name, ID of the highest score and the lowest score:");
        System.out.println(highestName + " " + highestId);
        System.out.println(lowestName + " " + lowestId);
        input.close();
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Input number of rows/columns (0 to exit)");
            int size = input.nextInt();

            if (size == 0) {
                break;
            }

            int[][] table = new int[size + 1][size + 1];

            for (int row = 0; row < size; row++) {
                for (int col = 0; col < size; col++) {
                    table[row][col] = input.nextInt();
                    table[row][size] += table[row][col];
                    table[size][col] += table[row][col];
                    table[size][size] += table[row][col];
                }
            }

            System.out.println("Result:");
            for (int row = 0; row <= size; row++) {
                for (int col = 0; col <= size; col++) {
                    System.out.print(table[row][col] + " ");
                }
                System.out.println();
            }
        }

        input.close();
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the string:");
        String text = input.nextLine();

        String result = text.replace("python", "#TEMP#");
        result = result.replace("java", "python");
        result = result.replace("#TEMP#", "java");

        System.out.println("New string:");
        System.out.println(result);
        input.close();
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] days = {"Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday"};
        int[] monthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Input the month(1-12)");
        int month = input.nextInt();

        System.out.println("Input date (1-31)");
        int date = input.nextInt();

        int dayOfYear = date;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += monthDays[i];
        }

        System.out.println("Name of the date:");
        System.out.println(days[dayOfYear % 7]);
        input.close();
    }
}