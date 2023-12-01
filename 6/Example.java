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