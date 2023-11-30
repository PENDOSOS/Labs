import java.util.ArrayList;

public class lab_3_6_stack
{
    private ArrayList<Integer> stackArray;

    public lab_3_6_stack() 
    {
        stackArray = new ArrayList<>();
    }

    public void push(int value) 
    {
        stackArray.add(value);
        System.out.println("Добавлен элемент: " + value);
    }

    public int pop() 
    {
        if (!isEmpty()) 
        {
            int poppedValue = stackArray.remove(stackArray.size() - 1);
            System.out.println("Извлечен элемент: " + poppedValue);
            return poppedValue;
        } 
        else 
        {
            System.out.println("Стек пуст. Невозможно извлечь элемент.");
            return -1; // Возвращаем -1, чтобы указать, что стек пуст
        }
    }

    public int peek() 
    {
        if (!isEmpty()) 
        {
            return stackArray.get(stackArray.size() - 1);
        } 
        else 
        {
            System.out.println("Стек пуст. Нет верхнего элемента.");
            return -1;
        }
    }

    public boolean isEmpty() 
    {
        return stackArray.isEmpty();
    }

    public static void main(String[] args) 
    {
        lab_3_6_stack stack = new lab_3_6_stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Верхний элемент стека: " + stack.peek());

        while (!stack.isEmpty()) {
            stack.pop();
        }
    }
}