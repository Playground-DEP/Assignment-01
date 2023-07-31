public class task_b {
    public static void main(String[] args) {
        
        final String COLOR_RED = "\u001B[31m";
        final String COLOR_BLUE = "\u001B[34m";
        final String COLOR_YELLOW = "\u001B[33m";
        final String BOLD = "\u001B[1m";
        final String RESET = "\u001B[0m";


        String col1 = "%s|%s%-17s%s|%s";
        String col2 = "%-5s|\n";
        
        String line1col1 = "%s|%s%s%s%-17s%s%s|";
        String line1col2 = "%s%s%-5s%s|%s\n";

        String line2col2 = "%s%5s%s|%s\n";

        
        String line = "%s%s%s \n";
        String name1 = "Alice";
        String name2 = "Bob";
        int age1 = 24;
        int age2 = 30;

        System.out.printf(line, COLOR_YELLOW, "+-----------------+-----+", RESET);
        System.out.printf(line1col1, COLOR_YELLOW,RESET, BOLD,COLOR_BLUE, "NAME", COLOR_YELLOW, RESET);
        System.out.printf(line1col2, BOLD,COLOR_BLUE, "AGE", COLOR_YELLOW,RESET);
        System.out.printf(line, COLOR_YELLOW, "+-----------------+-----+", RESET);
        System.out.printf(col1, COLOR_YELLOW, RESET, name1, COLOR_YELLOW, RESET);
        System.out.printf(line2col2, COLOR_RED, age1, COLOR_YELLOW, RESET );
        System.out.printf(col1, COLOR_YELLOW, RESET, name2, COLOR_YELLOW, RESET);
        System.out.printf(line2col2, COLOR_RED, age2, COLOR_YELLOW, RESET );
        System.out.printf(line, COLOR_YELLOW, "+-----------------+-----+", RESET);
    }
}
