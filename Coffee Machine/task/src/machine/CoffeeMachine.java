package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waterV = 400;
        int milkV = 540;
        int beansV = 120;
        int disposableCups = 9;
        int money = 550;
        boolean exit = false;


        //statusCoffeeMachine(waterV, milkV, beansV, disposableCups, money);
        while (!exit) {
            System.out.println();
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next().toLowerCase();

            switch (action) {
                case "buy":
                    /*
                    while (!buyMenu) {

                     */
                    boolean buyMenu = false;
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String actionInput = scanner.next();

                    switch (actionInput) {
                        case "1":
                            //For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
                            if (waterV > 250 && beansV > 16 && disposableCups > 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                waterV = waterV - 250;
                                beansV = beansV - 16;
                                money = money + 4;
                                --disposableCups;
                            } else if (waterV < 250) {
                                System.out.println("Sorry, not enough water!");
                            } else if (beansV < 16) {
                                System.out.println("Sorry, not enough beans!");
                            } else {
                                System.out.println("Sorry, not enough disposable Cups");
                            }


                            break;
                        case "2":
                            //For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
                            if (waterV > 250 && milkV > 75 && beansV > 16 && disposableCups > 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                waterV = waterV - 350;
                                milkV = milkV - 75;
                                beansV = beansV - 20;
                                money = money + 7;
                                --disposableCups;
                            } else if (waterV < 350) {
                                System.out.println("Sorry, not enough water!");
                            } else if (milkV < 75) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (beansV < 20) {
                                System.out.println("Sorry, not enough beans!");
                            } else {
                                System.out.println("Sorry, not enough disposable Cups");
                            }


                            break;
                        case "3":
                            //And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee beans. It costs $6.
                            if (waterV > 200 && milkV > 100 && beansV > 12 && disposableCups > 1) {
                                System.out.println("I have enough resources, making you a coffee!");
                                waterV = waterV - 200;
                                milkV = milkV - 100;
                                beansV = beansV - 12;
                                money = money + 6;
                                --disposableCups;
                            } else if (waterV < 200) {
                                System.out.println("Sorry, not enough water!");
                            } else if (milkV < 100) {
                                System.out.println("Sorry, not enough milk!");
                            } else if (beansV < 12) {
                                System.out.println("Sorry, not enough beans!");
                            } else {
                                System.out.println("Sorry, not enough disposable Cups");
                            }
                            break;
                        case "back":
                            buyMenu = true;
                            break;

                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water to you want to add:");
                    waterV = waterV + scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    milkV = milkV + scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    beansV = beansV + scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    disposableCups = disposableCups + scanner.nextInt();
                    break;
                case "take":
                    System.out.printf("I gave you $ %d", money);
                    System.out.println();
                    money = 0;
                    break;
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println();
                    System.out.printf("%d of water", waterV);
                    System.out.println();
                    System.out.printf("%d of milk", milkV);
                    System.out.println();
                    System.out.printf("%d of coffee beans", beansV);
                    System.out.println();
                    System.out.printf("%d of disposable cups", disposableCups);
                    System.out.println();
                    System.out.printf("$ %d of money", money);
                    System.out.println();
                    break;
                case "exit":
                    exit = true;
                    break;
            }
        }
    }


    /*
 package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waterV = 400;
        int milkV = 540;
        int beansV = 120;
        int disposableCups = 9;
        int money = 550;
        boolean exit = false;


        //statusCoffeeMachine(waterV, milkV, beansV, disposableCups, money);
        while (!exit) {
            System.out.println();
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next().toLowerCase();

            switch (action) {
                case "buy":

                    while (!buyMenu) {


        boolean buyMenu = false;
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
    String actionInput = scanner.next();

                    switch (actionInput) {
        case "1":
            //For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
            if (waterV > 250 && beansV > 16 && disposableCups > 1) {
                System.out.println("I have enough resources, making you a coffee!");
                waterV = waterV - 250;
                beansV = beansV - 16;
                money = money + 4;
                --disposableCups;
            } else if (waterV < 250) {
                System.out.println("Sorry, not enough water!");
            } else if (beansV < 16) {
                System.out.println("Sorry, not enough beans!");
            } else {
                System.out.println("Sorry, not enough disposable Cups");
            }


            break;
        case "2":
            //For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
            if (waterV > 250 && milkV > 75 && beansV > 16 && disposableCups > 1) {
                System.out.println("I have enough resources, making you a coffee!");
                waterV = waterV - 350;
                milkV = milkV - 75;
                beansV = beansV - 20;
                money = money + 7;
                --disposableCups;
            } else if (waterV < 350) {
                System.out.println("Sorry, not enough water!");
            } else if (milkV < 75) {
                System.out.println("Sorry, not enough milk!");
            } else if (beansV < 20) {
                System.out.println("Sorry, not enough beans!");
            } else {
                System.out.println("Sorry, not enough disposable Cups");
            }


            break;
        case "3":
            //And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee beans. It costs $6.
            if (waterV > 200 && milkV > 100 && beansV > 12 && disposableCups > 1) {
                System.out.println("I have enough resources, making you a coffee!");
                waterV = waterV - 200;
                milkV = milkV - 100;
                beansV = beansV - 12;
                money = money + 6;
                --disposableCups;
            } else if (waterV < 200) {
                System.out.println("Sorry, not enough water!");
            } else if (milkV < 100) {
                System.out.println("Sorry, not enough milk!");
            } else if (beansV < 12) {
                System.out.println("Sorry, not enough beans!");
            } else {
                System.out.println("Sorry, not enough disposable Cups");
            }
            break;
        case "back":
            buyMenu = true;
            break;

    }
                    break;
                case "fill":
                        System.out.println("Write how many ml of water to you want to add:");
    waterV = waterV + scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
    milkV = milkV + scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
    beansV = beansV + scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
    disposableCups = disposableCups + scanner.nextInt();
                    break;
                case "take":
                        System.out.printf("I gave you $ %d", money);
                    System.out.println();
    money = 0;
                    break;
                case "remaining":
                        System.out.println("The coffee machine has:");
                    System.out.println();
                    System.out.printf("%d of water", waterV);
                    System.out.println();
                    System.out.printf("%d of milk", milkV);
                    System.out.println();
                    System.out.printf("%d of coffee beans", beansV);
                    System.out.println();
                    System.out.printf("%d of disposable cups", disposableCups);
                    System.out.println();
                    System.out.printf("$ %d of money", money);
                    System.out.println();
                    break;
                case "exit":
    exit = true;
                    break;
}
        }
                }


       */
}

