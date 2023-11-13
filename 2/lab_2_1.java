import java.util.Scanner;

public class lab_2_1
{
    public static Scanner in = new Scanner(System.in);
     public static void main(String args[])
     {
        System.out.print("Commands:\n"); 
        System.out.print("1)add second string to first\n"); 
        System.out.print("2)extract symbol or substring from string\n");
        System.out.print("3)compare strings\n");
        System.out.print("4)find substring\n");
        System.out.print("5)replace substring\n");
        System.out.print("6)trim spaces from begin and end\n");
        System.out.print("7)change register\n");
        System.out.print("8)split string by special delimeter\n");
        System.out.print("9)return substring\n");
        System.out.print("0)end the program\n");
        int command = 1;
        while (command != 0)
        {
            System.out.print("Enter the number of operation you want to perform:\n"); 
            command = in.nextInt();
            in.nextLine();
            switch (command)
            {
                case (1):
                    addStrings();
                    break;
                case (2):
                    extractString();
                    break;
                case (3):
                    compareStrings();
                    break;
                case (4):
                    findSubstring();
                    break;
                case (5):
                    replaceSubstring();
                    break;
                case (6):
                    trimString();
                    break;
                case (7):
                    changeRegister();
                    break;
                case (8):
                    splitString();
                    break;
                case (9):
                    returnSubstring();
                    break;
            }
        }
        in.close();
     }

     public static void returnSubstring()
     {
        System.out.println("Method str.substring(index 1, index 2) - returns a substring starting from a specific index1 until the end or up to a specific index2 (if index 2 not stated then index 2 = end of string)");
        String string_1;
        System.out.print("Enter string: ");
        string_1 = in.nextLine();
        System.out.println("Enter index1");
        int index1 = in.nextInt();
        System.out.println("Enter index2");
        int index2 = in.nextInt();
        in.nextLine();
        System.out.println("Result of str.substring(index 1): " + string_1.substring(index1));
        System.out.println("Result of str.substring(index 2): " + string_1.substring(index1, index2));
     }

     public static void addStrings()
     {
        System.out.println("You can add strings just by '+'");
        String string_1;
        System.out.print("Enter first string: ");
        string_1 = in.nextLine();
        String string_2;
        System.out.print("Enter second string: ");
        string_2 = in.nextLine();
        String string_3 = string_1 + string_2;
        System.out.println("Result of first sting + second string: " + string_3);
        System.out.println("You also can add strings by str1.concat(str2)");
        System.out.println("Result of str1.concat(str2): " + string_1.concat(string_2));
     }

     public static void extractString()
     {
        String string_1;
        int number;
        System.out.print("Enter first string: ");
        string_1 = in.nextLine();
        System.out.print("Do you want to:\n 1)extract one symbol\n 2)extract substring\n");
        int command = in.nextInt();
        in.nextLine();
        switch (command)
        {
            case (1):
                System.out.println("If you want to extract one symbol from string - use str.charAt(index of symbol)");
                System.out.println("Enter the index of symbol you want to extract: ");
                number = in.nextInt();
                in.nextLine();
                System.out.println("Result of str.charAt(index of symbol): " + string_1.charAt(number));
                break;
            case (2):
                System.out.println("If you want to extract substring from string - use str.getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)");
                System.out.println("srcBegin - beginning inex of substring, srcEnd - end index of substring, dst - array with substring, int dstBegin - index in the dst array from which to add characters extracted from the string)");
                System.out.print("Enter the index from which substring begins: \n");
                number = in.nextInt();
                in.nextLine();
                System.out.print("Enter the number on which substring ends: \n");
                int length = in.nextInt();
                in.nextLine();
                char[] dst=new char[length - number];
                string_1.getChars(number, length, dst, 0);
                System.out.println("Result of str.getChars(number, length, dst, 0);");
                break;
        }
     }

     public static void compareStrings()
     {
        System.out.println("Methods str1.equals(str2) and str1.equalsIgnoreCase(str2) compare str1 and str2. Second method will compare ignoring case of strings.");
        String string_1;
        System.out.print("Enter first string: ");
        string_1 = in.nextLine();
        String string_2;
        System.out.print("Enter second string: ");
        string_2 = in.nextLine();
        System.out.print("Ignore case?\n 1)yes\n 2)no\n");
        int command = in.nextInt();
        in.nextLine();
        boolean result = false;
        switch (command)
        {
            case (1):
                result = string_1.equalsIgnoreCase(string_2);
                break;
            case (2):
                result = string_1.equals(string_2);
                break;
        }
        if (result)
        {
            System.out.println("string 1 is equal to string 2");
        }
        else
        {
            System.out.println("string 1 is not equal to string 2");
        }
     }

     public static void findSubstring()
     {
        String string_1;
        System.out.print("Enter string: ");
        string_1 = in.nextLine();
        String string_2;
        System.out.print("Enter substring: ");
        string_2 = in.nextLine();
        System.out.println("Method indexOf() - returns index of first entrance of substring (if index = -1 - substring is not found): " + string_1.indexOf(string_2));
        System.out.println("Method LastIndexOf() - returns index of last entrance of substring (if index = -1 - substring is not found): " + string_1.lastIndexOf(string_2));
        System.out.println("Method startsWith() - returns information if string starts with substring: " + string_1.startsWith(string_2));
        System.out.println("Method endsWith() - returns information if string ends with substring: " + string_1.endsWith(string_2));
     }

     public static void replaceSubstring()
     {
        System.out.println("Method str.replace(substr1, substr2) - allows you to replace substring1 with substring2 in a string");
        String string_1;
        System.out.print("Enter string: ");
        string_1 = in.nextLine();
        String string_2;
        System.out.print("Enter substring which you want to replace: ");
        string_2 = in.nextLine();
        String string_3;
        System.out.print("Enter substring that replaces past substring: ");
        string_3 = in.nextLine();
        System.out.println("Result of str.replace(substr1, substr2): " + string_1.replace(string_2, string_3));
     }

     public static void trimString()
     {
        System.out.println("Method str.trim() - allows you to remove leading and trailing spaces");
        String string_1;
        System.out.print("Enter string: ");
        string_1 = in.nextLine();
        System.out.println("Result of str.trim(): " + string_1.trim());
     }

     public static void changeRegister()
     {
        System.out.println("Method str.toLowerCase() - convert all character strings to lower case");
        String string_1;
        System.out.print("Enter string: ");
        string_1 = in.nextLine();
        System.out.println("Result of str.toLowerCase(): " + string_1.toLowerCase());
        System.out.println("Method str.toUpperCase() - convert all character strings to upper case");
        System.out.print("Enter string: ");
        string_1 = in.nextLine();
        System.out.println("Result of str.toLowerCase(): " + string_1.toUpperCase());
     }

     public static void splitString()
     {
        System.out.println("Method str.split(delimeter) - allows you to split a string into substrings using a specific delimiter");
        String string_1;
        System.out.print("Enter string: ");
        string_1 = in.nextLine();
        String delimeter;
        System.out.print("Enter delimeter: ");
        delimeter = in.nextLine();
        String[] words = string_1.split(delimeter);
        System.out.println("Result of str.toLowerCase():");
        for(String word : words)
        {
            System.out.println(word);
        }
     }
 }