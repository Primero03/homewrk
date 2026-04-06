package hw;

import java.util.Scanner;

public class hh1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int earnings = 0;
        int spendings = 0;


        while(true)
        {
            System.out.println();
            System.out.println("Выберите операцию и введите ее номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогообложения");
            System.out.println("Введите 'end' для завршения программы");
            System.out.print("Ввод: ");
            String operation = scan.nextLine();

            if("end".equals(operation)){
                System.out.println("Программа завершена.");
                break;
            }


            switch (Integer.parseInt(operation))
            {
                case 1:
                    System.out.print("Введите сумму дохода:");
                    String moneyStr = scan.nextLine();
                    int money = Integer.parseInt(moneyStr);
                    earnings += money;
                    break;
                case 2:
                    System.out.print("Введите сумму расхода:");
                    String outlayStr = scan.nextLine();
                    int outlay = Integer.parseInt(outlayStr);
                    spendings += outlay;


                    break;
                case 3:
                    int sixprecent = taxEarnings(earnings);
                    int fifteenprecent = taxEarningsMinusSpendings(earnings,spendings);
                    int difference = fifteenprecent - sixprecent;
                    

                    System.out.println("Мы советуем вам УСН доходы");
                    System.out.println("ВВаш налог составит: " + sixPrecent + " рублей");
                    System.out.println("Налог на другой системе:: "+ fifteenPrecent +" рублей");
                    System.out.println("Экономия: " + difference + " рублей");

                    break;
                default:
                    System.out.println("Такой оперции нет");
            }


        }
    }

    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if(tax >= 0){
            return tax;
        } else{
            return 0;
        }
    }

    public static int taxEarnings(int earnings){
        int tax = 0;
        int percent = 6;

        if(earnings != 0){
            tax = (earnings * percent) / 100;
            return tax;
        }
        else{
            System.out.println("Доходы не были внесены! Добавьте пожалуйства доходы");
            return 0;
        }

    }
}
