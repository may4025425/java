package com.may;

import java.util.Scanner;

public class PiggyBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請投入1元,5元或10元硬幣（輸入1,5,10）");
        int coin = Integer.parseInt(scanner.nextLine());
        int total = 0;
        if (coin == 1 | coin == 5 | coin == 10) {
            System.out.println("目前的總和： " + coin + "元");
            System.out.println("是否繼續投幣？（yes or no)");
            String yesorno = scanner.nextLine();
            while (yesorno.equalsIgnoreCase("y") ){
                if (yesorno.equalsIgnoreCase("y")) {
                    System.out.println("請投入1元,5元或10元硬幣（輸入1,5,10）");
                    if (coin == 1) {
                        total = total + 1;
                        System.out.println("目前的總和：" + total + "元");
                    }
                    if (coin == 5) {
                        total = total + 5;
                        System.out.println("目前的總和：" + total + "元");
                    }
                    if (coin == 10) {
                        total = total + 10;
                        System.out.println("目前的總和：" + total + "元");
                    }
                } else {
                    System.out.println("目前的總和：" + coin + "元");
                }
                System.out.println("是否繼續投幣？（yes or no)");
                yesorno = scanner.nextLine();
            }
        } else {
            System.out.println("無法處理");
        }
        System.out.println("目前的總和：" + total + "元");
//



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