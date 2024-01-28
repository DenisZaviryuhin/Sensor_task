package app;

import java.util.Scanner;

public class ObserverPattern {

    public static void main(String[] args) {
        handleResult();
    }

    public static void handleResult() {

        Substance substance = new Substance();
        new WeightObserver(substance);
        new ColorObserver(substance);

        int temp = getValue();
        int cnt = temp + 1;
        if (temp <= 0) {
            System.out.println("Sensor measurement result:");
            substance.setWeight(1);
            substance.setColor("White");
        } else {
            System.out.println("Sensor measurement result:");
            substance.setWeight(temp + cnt);
            substance.setColor("Black");

        }


    }

    static int getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature value : ");
        return scanner.nextInt();
    }

}
