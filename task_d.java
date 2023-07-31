public class task_d {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;


        float myFloat1 = 0.99f;
        float myFloat2 = 1.49f;

        final String TITLE = "\033[1;37m";
        final String COLOR1 = "\033[34m";
        final String COLOR2 = "\033[35m";
        final String COLOR3 = "\033[32m";
        final String RESET = "\033[0m";

        String fruit1 = "Apples";
        String fruit2 = "Oranges";

        System.out.println("\n+----------+----------+-------+");
        System.out.printf("| %1$sITEM%2$-9s| %1$sQUANTITY %2$s| %1$sPRICE%2$s |",TITLE , RESET); 
        System.out.println("\n+----------+----------+-------+");
        System.out.printf("| %-9s| %3$s%5$8d%6$s |%7$s%8$2s%6$s%4$s%2$4.2f%6$s |\n", fruit1, myFloat1, COLOR1, COLOR2 , num1, RESET, COLOR3, "$");
        System.out.printf("| %-9s| %3$s%5$8d%6$s |%7$s%8$2s%6$s%4$s%2$4.2f%6$s |\n", fruit2, myFloat2, COLOR1, COLOR2 , num2, RESET, COLOR3,"$");
        System.out.println("+----------+----------+-------+");
    }
}
