import java.util.Scanner;

public class lab_2_2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext())
            System.out.println("Entry symbols: " + scanner.next());

        scanner.close();
    }
}