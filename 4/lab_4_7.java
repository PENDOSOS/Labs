class ExampleClass<T> 
{
    private T value;

    public ExampleClass(T value) 
    {
        this.value = value;
    }

    public T getValue() 
    {
        return value;
    }

    public void setValue(T value) 
    {
        this.value = value;
    }
}

public class lab_4_7 
{
    public static void main(String[] args) 
    {

        ExampleClass<Integer> obj1 = new ExampleClass<>(10);
        ExampleClass<Integer> obj2 = new ExampleClass<>(20);

        System.out.println("Before swap:");
        System.out.println("obj1: " + obj1.getValue());
        System.out.println("obj2: " + obj2.getValue());

        swapObjects(obj1, obj2);

        System.out.println("After swap");
        System.out.println("obj1: " + obj1.getValue());
        System.out.println("obj2: " + obj2.getValue());
    }

    public static <T> void swapObjects(ExampleClass<T> a, ExampleClass<T> b) 
    {
        T temp = a.getValue();
        a.setValue(b.getValue());
        b.setValue(temp);
    }
}