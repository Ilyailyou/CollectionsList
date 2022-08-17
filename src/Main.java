import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> shoppingCart = new ArrayList<>();

        while (true) {
            System.out.println("Выберите операцию: \n 1. Операция добавить; \n 2. Операция показать; \n 3. Операция удалить; \n 4. Операция найти.");
            int operation = scanner.nextInt();
            scanner.nextLine();

            switch (operation) {
                case 1:
                    System.out.println("Какую покупку хотите добавить?");
                    String text = scanner.nextLine();
                    shoppingCart.add(text);
                    System.out.println("Итого в списке покупок: " + shoppingCart.size());
                    break;
                case 2:
                    System.out.println("Список покупок: ");
                    shoppingList(shoppingCart);
                    break;
                case 3:
                    System.out.println("Список покупок:");
                    shoppingList(shoppingCart);
                    System.out.println("Какую хотите удалить? Введите номер или название.");
                    String shopping = scanner.nextLine();
                    try {
                        int shoppingInt = Integer.parseInt(shopping);
                        String name = shoppingCart.get(shoppingInt);
                        shoppingCart.remove(shoppingInt);
                        System.out.println("Покупка " + name + " была удалена, список покупок:");
                        shoppingList(shoppingCart);
                    } catch (NumberFormatException e) {
                        shoppingCart.remove(shopping);
                        System.out.println("Покупка " + shopping + " была удалена, список покупок:");
                        shoppingList(shoppingCart);
                    }
                    break;

                case 4:
                    System.out.println("Введите текст для поиска:");
                    String query = scanner.nextLine();
                    String queryLower = query.toLowerCase();
                    for (String item : shoppingCart) {
                        String itemLower = item.toLowerCase();
                        if (itemLower.contains(queryLower)) {
                            System.out.println((shoppingCart.indexOf(item) + 1) + ". " + item);
                        }

                        
                    }
                    //Iterator<String> it = shoppingCart.iterator();
                    //while (it.hasNext()) {
                        //String item = it.next();
                        //String itemLower = item.toLowerCase();
                        //if (itemLower.contains(queryLower)) {
                            //System.out.println((shoppingCart.indexOf(item) + 1) + ". " + item);
                        //}
                    //}
                    break;
                default:
                    System.out.println("Неккоректный ввод, введите число от 1 до 3 :)");
            }
        }




        // NumberFormatException
        /*String input = scanner.nextLine();
        String input2 = scanner.nextLine();
        System.out.println(input + " " + input2);*/

    }
    public static void shoppingList(List shoppingCart) {
        for (int i = 0; i < shoppingCart.size(); i++) {
            String shopping = (String) shoppingCart.get(i);
            System.out.println((i + 1) + ". " + shopping);
        }

            //System.out.println((shoppingCart.indexOf(shopping) + 1) + ". " + shopping);



        /*Iterator<String> it = shoppingCart.iterator();
        while (it.hasNext()) {
            String shopping = it.next();
            System.out.println((shoppingCart.indexOf(shopping) + 1) + ". " + shopping);
        } */
    }
}
