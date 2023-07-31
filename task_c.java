public class task_c {
    public static void main(String[] args) {
        
        String city1 = "Los Angeles";
        String city2 = "New";
        String city3 = "York";
        String state1 = "California";

        int num1 = 3966936;
        int num2 = 8336817;

        final String TITLE = "\033[1;37m";
        final String COLOR1 = "\033[35m";
        final String COLOR2 = "\033[32m";
        final String RESET = "\033[0m";

        System.out.println("\n+-----------------+-------------+------------+");
        System.out.printf("| %1$sCITY%2$-16s| %1$sSTATE%2$-11s| %1$sPOPULATION%2$s |",TITLE , RESET); 
        System.out.println("\n+-----------------+-------------+------------+");
        System.out.printf("| %-16s| %-12s|  %4$s%3$,d%5$s |\n", city1, state1, num1,COLOR1, RESET);
        System.out.printf("| %4$s%1$s%6$s %2$-12s| %4$s%1$s%6$s %2$-8s|  %3$s%5$,d%6$s |\n", city2, city3, COLOR1, COLOR2 , num2, RESET);
        System.out.println("+-----------------+-------------+------------+");
    }
}
