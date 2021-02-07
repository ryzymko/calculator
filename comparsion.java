import java.util.Random;

public class comparsion {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(101);
        int y = rand.nextInt(101);

        System.out.println("Program wylosował: x = "+x+", y = "+y);

        System.out.print("Czy X jest większe od Y? ");
        System.out.println(x>y);
        System.out.print("Czy X pomnożone przez 2 jest większe od Y? ");
        System.out.println(x*2>y);
        System.out.print("Czy Y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2? ");
        System.out.println(y<(x+3) && y>(x-2));
        System.out.print("Czy iloczyn liczb x i y jest parzysty ? ");
        System.out.println (x*y % 2 == 0);

    }
}
