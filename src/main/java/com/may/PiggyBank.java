package com.may;

import java.util.Scanner;

public class PiggyBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yesorno;
        int total = 0;
        do{
            System.out.println("請投入1元,5元或10元硬幣（輸入1,5,10）");
            int money = Integer.parseInt(scanner.nextLine());
            total = total + money;
            System.out.println("目前的總和：" + total + "元");
            System.out.println("是否繼續投幣？（yes or no)");
            yesorno = scanner.nextLine();

        }while (yesorno.equalsIgnoreCase("y"));

   /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("請投入1元,5元或10元硬幣（輸入1,5,10）");
        int money = Integer.parseInt(scanner.nextLine());
        int total = 0;
        int coin;

        if (money == 1 | money == 5 | money == 10) {
            System.out.println("目前的總和： " + money + "元");
            while (money >= 1) {
                System.out.println("是否繼續投幣？（yes or no)");
                String yesorno = scanner.nextLine();
                if (yesorno.equalsIgnoreCase("y")) {
                    System.out.println("請投入1元,5元或10元硬幣（輸入1,5,10）");
                     coin = Integer.parseInt(scanner.nextLine());
                    if (coin == 1) {
                        total = total + coin + money;
                        money = 0;
                        System.out.println("目前的總和：" + total + "元");
                    } else if (coin == 5) {
                        total = total + coin + money;
                        money = 0;
                        System.out.println("目前的總和：" + total + "元");
                    } else if (coin == 10) {
                        total = total + coin + money;
                        money = 0;
                        System.out.println("目前的總和：" + total + "元");
                    }
                } else {
                    System.out.println("目前的總和：" + total + "元");
                    money = 11;
                }
            }
        } else {
            System.out.println("無法處理!");
        }
*/




/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("請投入1元,5元或10元硬幣（輸入1,5,10）");
        int coin = Integer.parseInt(scanner.nextLine());
        int total = 0;
        if (coin == 1 | coin == 5 | coin == 10) {
            while (coin > 0) {
                switch (coin) {
                    case 1:
                        total = total + coin;
                        System.out.println("目前的總和：" + total + "元");
                        System.out.println("是否繼續投幣？（y or n)");
                        String yesorno = scanner.nextLine();
                        if (yesorno.equalsIgnoreCase("y")) {
                            System.out.println("請投入1元,5元或10元硬幣（輸入1,5,10）");
                            coin = Integer.parseInt(scanner.nextLine());
                        } else {
                            coin = 0;
                        }
                        break;
                    case 5:
                        total = total + coin;
                        System.out.println("目前的總和：" + total + "元");
                        System.out.println("是否繼續投幣？（y or n)");
                        yesorno = scanner.nextLine();
                        if (yesorno.equalsIgnoreCase("y")) {
                            System.out.println("請投入1元,5元或10元硬幣（輸入1,5,10）");
                            coin = Integer.parseInt(scanner.nextLine());
                        } else {
                            coin = 0;
                        }
                        break;
                    case 10:
                        total = total + coin;
                        System.out.println("目前的總和：" + total + "元");
                        System.out.println("是否繼續投幣？（y or n)");
                        yesorno = scanner.nextLine();
                        if (yesorno.equalsIgnoreCase("y")) {
                            System.out.println("請投入1元,5元或10元硬幣（輸入1,5,10）");
                            coin = Integer.parseInt(scanner.nextLine());
                        } else {
                            coin = 0;
                        }
                        break;
                    default:
                        System.out.println("無法處理！");
                        System.out.println("目前的總和：" + total + "元");
                        coin = 0;
                        break;
                }
            }
        } else {
            System.out.println("無法處理！");
        }
*/

    }
}
