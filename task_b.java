public class task_b {
    public static void main(String[] args) {
        
        int age1 = 24;
        String name1 = "Alice";

        int age2 = 30;
        String name2 = "Bob";

        final String TITLE = "\033[1;34m";
        final String COLOR = "\033[35m";
        final String RESET = "\033[0m";

        System.out.println("\n+-----------------+-----+");
        System.out.printf("|%1$sNAME%2$-17s| %1$5sAGE%2$s |",TITLE , RESET); 
        System.out.println("\n+-----------------+-----+");
        System.out.printf("|%-17s|  %3$s%d%4$s |\n" ,name1, age1, COLOR, RESET);
        System.out.printf("|%-17s|  %3$s%d%4$s |\n" ,name2, age2, COLOR, RESET);
        System.out.println("+-----------------+-----+");
    }
}
