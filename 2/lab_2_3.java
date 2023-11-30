public class lab_2_3 
{
    public static void main(String[] args) 
    {
        //Логические операторы:
        // ЛОЖЬ или ЛОЖЬ = ЛОЖЬ
        System.out.println("false || false: " + (false || false));
        // ЛОЖЬ и ЛОЖЬ = ЛОЖЬ
        System.out.println("false && false: " + (false && false));
        // не ЛОЖЬ = ИСТИНА
        System.out.println("!false: " + (!false));
        // ИСТИНА или ЛОЖЬ = ИСТИНА
        System.out.println("true || false: " + (true || false));
        // ИСТИНА и ЛОЖЬ = ЛОЖЬ
        System.out.println("true && false: " + (true && false));
        // не ИСТИНА = ЛОЖЬ
        System.out.println("!true: " + (!true));
        // ЛОЖЬ или ИСТИНА = ИСТИНА
        System.out.println("false || true: " + (false || true));
        // ЛОЖЬ и ИСТИНА = ЛОЖЬ
        System.out.println("false && true: " + (false && true));
        // ИСТИНА или ИСТИНА = ИСТИНА
        System.out.println("true || true: " + (true || true));
        // ИСТИНА и ИСТИНА = ИСТИНА
        System.out.println("true && true: " + (true && true));

        //Тенарный оператор:
        System.out.println(true ? "true" : "false");
        System.out.println(false ? "true" : "false");

        //Битовые операторы:
        int binaryIntFirst = 0b0010, binaryIntSecond =  0b0011;
        //Побитовое "И"
        System.out.println("0010 & 0011: " + Integer.toBinaryString(binaryIntFirst & binaryIntSecond));
        //Побитовое "ИЛИ"
        System.out.println("0010 | 0011: " + Integer.toBinaryString(binaryIntFirst | binaryIntSecond));
        //Побитовое исключающее “ИЛИ”
        System.out.println("0010 ^ 0011: " + Integer.toBinaryString(binaryIntFirst ^ binaryIntSecond));
        //Побитовое "НЕ"
        System.out.println("~(00000000000000000000000000001010): " + Integer.toBinaryString(~binaryIntFirst));

        //Операторы битового сдвига:
        //Сдвиг влево на 2 бита
        System.out.println("110011 << 2: " + Integer.toBinaryString(0b110011 << 2));
        //Сдвиг вправо на 2 бита (для чисел >= 0 слева заполняется нулями)
        System.out.println("110011 >> 2: " + Integer.toBinaryString(0b110011 >> 2));
        //Сдвиг вправо на 2 бита (для чисел < 0 слева заполняется единицами)
        System.out.println("-110011 >> 2: " +
                           Integer.toBinaryString(-0b110011 >> 2));
        //Сдвиг вправо на 2 бита (слева всегда заполняется нулями)
        System.out.println("10011 >>> 2: " +
                           Integer.toBinaryString(0b10011 >>> 2));
        System.out.println("110011 >>> 2: " + Integer.toBinaryString(0b110011 >>> 2));
    }
}