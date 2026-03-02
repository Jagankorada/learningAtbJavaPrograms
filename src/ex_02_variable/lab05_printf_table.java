package ex_02_variable;

public class lab05_printf_table {

    public static void main(String[] args) {

         int table = 9;
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%d x %d = %d\n", table, i, table * i);
        }
    }
}
