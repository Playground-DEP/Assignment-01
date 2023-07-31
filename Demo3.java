public class Demo3 {
    public static void main(String[] args) {
        int areaCode = 123;
        int part1 = 456;
        int part2 = 7890;

        final String COLOR = "\033[32m" ;
        final String RESET = "\033[0m";

        System.out.printf("(%s%d%s) %d-%d.", COLOR, areaCode, RESET, part1, part2);

    }
}
