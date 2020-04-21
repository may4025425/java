package com.may;


import java.io.*;
import java.util.Scanner;

public class PiggyBank {
     int total = 0;
     File dataFile =new File("piggy.txt");
    public PiggyBank(){
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(dataFile);
            total = fileReader.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void add(int n) {
        total = total + n;
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(dataFile);
            fileWriter.write(total);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void showCoins() {

    }
}
     /*   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int total = 0;
        int ones = 0, fives = 0, tens = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"));
            try {
                total = Integer.parseInt(bufferedReader.readLine());
                bufferedReader.close();
            } catch (NumberFormatException e) {
                total = 0;
            } catch (IOException e) {
                e.printStackTrace();
                total = 0;
            }
            System.out.println("Total: " + total);
            System.out.println("Please put your coin?");
            while (n != -1) {
                n = scanner.nextInt();
                switch (n) {
                    case 1:
                        ones++;
                        break;
                    case 5:
                        fives++;
                        break;
                    case 10:
                        tens++;
                        break;
                    default:
                }
                total = total + n;
                System.out.println("Total: " + total);
                FileWriter fileWriter = new FileWriter("data.txt", false);
                fileWriter.write(String.valueOf(total));
                fileWriter.flush();
                fileWriter.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}*/
    /*
        Scanner scanner = new Scanner(System.in);
        String yesorno;
        int total = 0;
        int i1 = 0,i5 = 0,i10 = 0;
        do{
            System.out.println("請投入1元,5元或10元硬幣（輸入1,5,10）");
            int money = Integer.parseInt(scanner.nextLine());
            if (money == 1 | money == 5 | money == 10) {
                if(money==1){
                     i1 = i1 + 1;
                    System.out.println("投入的1元硬幣數量:"+i1);
                } else if (money==5){
                     i5 = i5 + 1;
                    System.out.println("投入的5元硬幣數量:"+i5);
                }else {
                     i10 = i10 + 1;
                    System.out.println("投入的10元硬幣數量:"+i10);
                }
                total = total + money;
                System.out.println("目前的總和：" + total + "元");
                System.out.println("是否繼續投幣？（y or n)");
                yesorno = scanner.nextLine();
            }else{
                System.out.println("無法處理!");
                yesorno = "n";
            }

        }while (yesorno.equalsIgnoreCase("y"));
*/
   /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("請投入1元,5元或10元硬幣（輸入1,5,10）");
        int money = Integer.parseInt(scanner.nextLine());
        int total = 0;
        int coin;

        if (money == 1 | money == 5 | money == 10) {
            System.out.println("目前的總和： " + money + "元");
            while (money >= 1) {
                System.out.println("是否繼續投幣？（y or n)");
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

