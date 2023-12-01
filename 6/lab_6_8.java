import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Scanner;

public class lab_6_8
{
    public static void main(String[] args) 
    {
        printClassInfo (ShowcaseClass.class);
        printClassInfo (Scanner.class);
        printClassInfo(Math.class);
    }

    public static void printClassInfo(Class<?> printClass) 
    {
        System.out.println("Class: " + printClass.accessFlags() + " " + printClass.getCanonicalName());
        System.out.println("Superclass: " + printClass.getSuperclass());
        System.out.print("Interfaces:");
        if (printClass.getInterfaces().length == 0)
            System.out.println(" null");
        else
        {
            System.out.print("\n");
            for (Class<?> printInterface : printClass.getInterfaces())
                System.out.println("\t" + printInterface.getCanonicalName());
        }

        System.out.print("Field:");
        if (printClass.getDeclaredFields().length == 0)
            System.out.println(" null");
        else 
        {
            System.out.print("\n");
            for (Field printField : printClass.getDeclaredFields())
                System.out.println("\t" + printField.accessFlags() + " " +
                        printField.getType() + " " +
                        printField.getName());
        }

        System.out.println("Constructors:");
            for (Constructor<?> printConstructors : printClass.getDeclaredConstructors())
                System.out.println("\t" + printConstructors.toString());

        System.out.print("Methods:");
        if (printClass.getDeclaredMethods().length == 0)
            System.out.println(" null");
        else 
        {
            System.out.print("\n");
            for (Method printMethods : printClass.getDeclaredMethods())
                System.out.println("\t" + printMethods.toString());
        }

        System.out.print("Nested classes (interfaces):");
        if (printClass.getDeclaredClasses().length == 0)
            System.out.println(" null");
        else 
        {
            System.out.print("\n");
            for (Class<?> printNestClass : printClass.getDeclaredClasses())
                System.out.println("\t" + printNestClass.toString());
        }

        System.out.print("Enum constants:");
        if (printClass.getEnumConstants() == null)
            System.out.println(" null");
        else 
        {
            System.out.print("\n");
            for (Object printEnumConstant : printClass.getEnumConstants())
                System.out.println("\t" + printEnumConstant.toString());
        }

        System.out.print("Annotations:");
        if (printClass.getDeclaredAnnotations().length == 0)
            System.out.println(" null");
        else 
        {
            System.out.print("\n");
            for (Annotation printAnnotation : printClass.getDeclaredAnnotations())
                System.out.println("\t" + printAnnotation.toString());
        }
    }

    static class ShowcaseClass extends Exception {}
}