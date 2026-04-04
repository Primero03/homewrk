import java.util.Scanner;

public class Main {

    void main() {
        // Сканер для ввода с клавиатуры
        Scanner sc = new Scanner(System.in);

        System.out.println("Здравствуйте");
        System.out.println("Введите цену товара (rub): ");
        int price = sc.nextInt();
        System.out.println("Введите вес товара (kg): ");
        int weight = sc.nextInt();


        int result = calculateCustoms(price, weight);
        System.out.println("Размер пошлины составит: " + result +"Р");



    }

    static public int calculateCustoms(int price, int weight){
        int fee;
        fee = (price / 100) + weight * 100;
        return fee;
    }
}

