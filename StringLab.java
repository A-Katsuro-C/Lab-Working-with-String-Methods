public class StringLab{
    public static void main(String[] args){
        String lab = "Welcome to the Java String Lab!   ";
        String compare = "java string lab!";

        System.out.println(lab);
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
    }
}