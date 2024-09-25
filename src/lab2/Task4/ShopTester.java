package lab2.Task4;

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
                shop.addComputer(lineArgs[1]);
            } else if (lineArgs[0].equals("REMOVE")){
                shop.removeComputer(lineArgs[1]);
            }
            else if (lineArgs[0].equals("FIND")){
                shop.findComputer(lineArgs[1]);
            }
            else if (lineArgs[0].equals("SHOW")){
                shop.showComputers();
            }
            else {
                System.out.println("Invalid command");
            }
        }
    }
}
