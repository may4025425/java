package com.may;


import java.io.*;
import java.util.Scanner;

public class PiggyBank {

    int total;//預設值為0
    File file = new File("money.txt");
    int ones, fives, tens;

    public PiggyBank() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String s = bufferedReader.readLine();//要先把要儲存的資料都讀進去，再寫出來
            total = Integer.parseInt(s);//要輸出的是total!要將s轉為int!
            ones = Integer.parseInt(bufferedReader.readLine());
            fives = Integer.parseInt(bufferedReader.readLine());
            tens = Integer.parseInt(bufferedReader.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();//這裏是執行上有問題，看下方說明自己家的
        }

    }

    public void setTotal(int total) {//set&get好像是種內定方法，他會根據你最上方所設的屬性變數去搭配使用
        //括號內的int total是區域變數，可以透過this來指定用屬性變數
        this.total = total;
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(String.valueOf(this.total) +'\n');
            fileWriter.write(ones +"\n");//要是字串！！不然會是框框
            fileWriter.write(fives +"\n");
            fileWriter.write(tens+"");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void add(int n) {
        switch (n) {
            case 1:
                ones++;
                setTotal(total + n);
                break;
            case 5:
                fives++;
                setTotal(total + n);
                break;
            case 10:
                tens++;
                setTotal(total + n);
                break;
            default:
                break;
        }

    }

    public void showCoins() {
        System.out.println("一元：" + ones + "個，" + "五元：" + fives + "個，" + "十元：" + tens + "個");
    }
}
    /*
    int total = 0;
    int ones = 0, fives = 0, tens;
     File dataFile =new File("piggy.txt");
    public PiggyBank(){
        try {
            FileReader fileReader = new FileReader(dataFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String s = bufferedReader.readLine();
            total = Integer.parseInt(s);
            ones = Integer.parseInt(bufferedReader.readLine());
            fives = Integer.parseInt(bufferedReader.readLine());
            tens = Integer.parseInt(bufferedReader.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (NumberFormatException e ){
            e.printStackTrace();
        }
    }
    public  void setTotal(int total){
        this.total = total;
        try {
            FileWriter fileWriter = new FileWriter(dataFile);
            fileWriter.write(this.total +"\n");
            fileWriter.write(ones+"\n");
            fileWriter.write(fives+"\n");
            fileWriter.write(tens+"");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void add(int n) {
        switch (n){
            case 1:
                ones =ones + 1;
                setTotal(total + n);
                break;
            case 5:
                fives += 1;
                setTotal(total + n);
                break;
            case 10 :
                tens += 1;
                setTotal(total + n);
                break;
            default:
                break;
        }
    }

    public void showCoins() {
        System.out.println("1:" + ones +" , 5:" + fives +" , 10:" + tens );
    }

}*/
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


