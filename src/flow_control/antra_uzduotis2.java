package flow_control;

import java.util.Scanner;

public class antra_uzduotis {
    private static void main(String[] args){

        Scanner numberScanner = new Scanner(System.in);

        System.out.println("iveskite pirma skaiciu:");
        int number = numberScanner.nextInt();
        System.out.println("Iveskite antra skaiciu:");
        int number2 = numberScanner.nextInt();

        if (number>30 && number2 >30){
            System.out.println("abu skaiciai didesni uz 30");
        }else if (number<30 && number2<30){
            System.out.println("abu skaiciai mazesni uz 30 ");
        }else if (number==30 || number2==30){
            System.out.println("abu skaiciai lygus 30");
        }
    }
}
