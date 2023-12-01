import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Example 
{
    private String string;
    private int value;

    public Example(String string, int value) 
    {
        this.string = string;
        this.value = value;
    }

    public String getName() 
    {
        return string;
    }

    public void setName(String string) 
    {
        this.string = string;
    }

    public int getAge() 
    {
        return value;
    }

    public void setAge(int value) 
    {
        this.value = value;
    }

    public void info() 
    {
        System.out.println("This is example with string " + string + " and int " + value + " .");
    }
}

public class lab_6_9
{
    public static void main(String[] args)
    {
        try
        {
            String className = "Example";
            String methodName = "info";

            Class <?> clazz = Class.forName(className);

            Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
            Object instance = constructor.newInstance("test", 1337);

            Method method = clazz.getMethod(methodName);

            method.invoke(instance);

        }
        catch (ClassNotFoundException e)
        {
            System.err.println("Class not found: " + e.getMessage());

        }
        catch (NoSuchMethodException e)
        {
            System.err.println("Method not found: " + e.getMessage());

        }
        catch (Exception e)
        {
            System.err.println("An error has occured: " + e.getMessage());

        }
    }
}