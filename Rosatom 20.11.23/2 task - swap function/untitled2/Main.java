public class Main {
    static int a = 12;
    static int b = 42;
    public static void main(String[] args) {
        System.out.println("a = " + a + " b = " + b);
        swap();
        System.out.println("a = " + a + " b = " + b);
        swapV2();
        System.out.println("a = " + a + " b = " + b);

    }
    /*
        Замена значений переменных без памяти(задействия 3 переменной)
        через суммирование-вычитание
     */
    public static void swap() {
        a = a + b;
        b = a - b;
        a = a - b;
    }
    /*
        Замена значений переменных без памяти(задействия 3 переменной)
        через побитовые операции(xor)
     */
    public static void swapV2() {
        a ^= b;
        b ^= a;
        a ^= b;
    }
}


