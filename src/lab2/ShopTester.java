package lab2;

import lab2.Shop;
import java.util.Scanner;

public class ShopTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lineRow;
        String[] lineArgs;
        Shop shop = new Shop();
        while(sc.hasNext()){
            lineRow = sc.nextLine();
            lineArgs = lineRow.split(" ");
            if (lineArgs[0].equals("ADD")){
                System.out.println(1);
                shop.addComputer(lineArgs[1]);
            } else if (lineArgs[0].equals("REMOVE")){
                System.out.println(2);
                shop.removeComputer(lineArgs[1]);
            }
            else if (lineArgs[0].equals("FIND")){
                System.out.println(3);
                shop.findComputer(lineArgs[1]);
            }
            else if (lineArgs[0].equals("SHOW")){
                System.out.println(4);
                shop.showComputers();
            }
            else {
                System.out.println("Invalid command");
            }
        }
    }
}
