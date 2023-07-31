public class Demo5 {
    public static void main(String[] args) {
        int code1 = 978;
        int code2 = 3;
        int code3 = 16;
        int code4 = 1484100;

        final String COLOR1 = "\u001B[32m" ;
        final String COLOR2 = "\u001B[33m" ;
        final String COLOR3 = "\u001B[34m" ;
        final String COLOR4 = "\u001B[35m" ;
        final String RESET = "\u001B[0m" ;

        System.out.printf("%s%d%9$s-%s%d%9$s-%s%d%9$s-%s%d",COLOR1,code1,COLOR2, code2, COLOR3, code3, COLOR4,code4,RESET);
    }
}
