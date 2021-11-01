package java2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Shape> list = new ArrayList<>(); //sempre a lista mais generica pois queremos o polimorfismo


        System.out.println("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Shape #" + i + " data: ");
            System.out.println(" Rectangle or circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.println(" Color (Black/Blue/Red)");
            Color color = Color.valueOf(sc.next());

            if (ch == 'r') {
                System.out.println("Width: ");
                double width = sc.nextDouble();
                System.out.println("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height)); //tem que colocar o que tem no retangulo
            }
            else {
                System.out.println(" radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));



            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : list) {
            System.out.println(String.format("%.2f", shape.area()));//CHAMOU A CLASSE ABSTRATA PARA NÃO FICAR ESCREVENDO MUITO CODIGO

        }
        sc.close();

    }
}
