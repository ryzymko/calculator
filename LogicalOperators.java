public class LogicalOperators {
    public static void main(String[] args) {
        int x = -5;
        int y = 10;

        System.out.println("Czy X jest mniejsze od 0 i (jednocześnie) Y jest więlsze od 0");
//        System.out.println(x<0);
//        System.out.println(y>0);
//        System.out.println(x<0 || y>0);
        System.out.println(x<0 & y>0);
    }
}
