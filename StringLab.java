import java.util.Scanner;

public class StringLab{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String lab = "Welcome to the Java String Lab!   ";
        String compare = "java string lab!";
        int vowelCount = 0;
        int test = 0;
        String palin = "racecar";
        String reversePalin;
        String javaContain;

        System.out.println("Task 1: \n" + lab);
        System.out.println(lab.length());
        System.out.println(lab.charAt(7));
        System.out.println(lab.substring(15, 19));
        System.out.println(lab.toUpperCase());
        System.out.println(lab.indexOf("Java"));
        System.out.println(lab.contains("Lab"));
        System.out.println(lab.replace("Java", "Java Programming"));
        String[] words = lab.split(" ");
        for (String word : words){
            System.out.print(word);
        }
        System.out.println();
        System.out.println(lab.trim());
        System.out.println(lab.equals(compare));
        System.out.println(lab.equalsIgnoreCase(compare));

        System.out.println("\nTask 2: ");
        
        for(int i = 0 ; i < lab.length(); i++){
            char str = Character.toLowerCase(lab.charAt(i));
            if (str == 'a' || str == 'e' || str == 'i' || str == 'o' || str == 'u'){
                vowelCount++;
            }
        }
        System.out.println("Vowels: " + vowelCount);


        reversePalin = new StringBuilder(palin).reverse().toString();
        while (test == 0){
            if (palin.equals(reversePalin)){
                System.out.println(palin + " is a Palindrome");
                test++;
            } else {
                System.out.println(palin + " is not a Palindrome");
                test++;
            }
        }

        do {
            System.out.println("Enter a string: (conatining java)");
            javaContain = input.nextLine();


        } while (!javaContain.contains("java"));

        System.out.println("Thank you!");
        
        System.out.println("\nTask 3: ");
        StringBuilder task3 = new StringBuilder("StringBuilder Lab");
        task3.append(" - Learning Java");
        System.out.println(task3);
        task3.insert(17, " is fun");
        System.out.println(task3);
        task3.delete(26, 35);
        System.out.println(task3);
        task3.reverse();
        System.out.println(task3);

        System.out.println("\nTask 4: ");
        StringBuffer task4 = new StringBuffer("StringBuffer Lab");
        task4.append(" - Learning Java");
        System.out.println(task4);
        task4.insert(17, " is fun");
        System.out.println(task4);
        task4.delete(26, 35);
        System.out.println(task4);
        task4.reverse();
        System.out.println(task4);




    }
}