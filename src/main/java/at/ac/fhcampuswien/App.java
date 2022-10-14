package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    Scanner sc1 = new Scanner(System.in);

    //todo Task 1
    public void largestNumber(){
      double num;
      int counter = 1;
      double max = 0;

      do{
          System.out.print("Number " + counter + ": "); //Zeilen
          num = sc1.nextFloat();

          if (counter == 1 && num <= 0){
              System.out.println("No number entered.");
              break; //Ende
          }

          if (num > max){ // vergliehen, was die größte Zahl ist
              max = num;
          }

          if (num <= 0){

              System.out.printf("The largest number is "+"%.2f", max); // %.2f two decimals, deswegen auch printf
              System.out.println();
          }
          counter++;

      }while (num > 0);

    }

    //todo Task 2
    public void stairs() {
        int k = 1;
        System.out.print("n: ");
        int n = sc1.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number!");
        } else{
            for (int i = 1; i <= n; i++) { //zeilen
                for (int j = 0; j < i; j++) {// für
                    System.out.print(k++ + " ");
                }
                System.out.println();
            }
        }

    }

    //todo Task 3
    public void printPyramid(){
        int height = 6;
        // Zeilen
        for (int i = 1; i <= height; i++){ // Zeilen

            for (int j = height-i; j > 0; j--){ //Abstand
                System.out.print(" ");
            }
            for (int k = 1; k<=(i*2) - 1; k++){ // Sterne
                System.out.print("*");
            }
            System.out.println();
        }
    }


    //todo Task 4
    public void printRhombus(){
        int rows = 0;
        System.out.print("h: ");
        int a = sc1.nextInt();
        int a2 = a / 2;
        int space = a2;
        int a3 = a2 + 1;
        System.out.print("c: ");
        char c = sc1.next().charAt(0);
        int letter1 = c;               //H
        int start;
        int letter2 = c - a2;         //D
        int count = 1;

        if (a % 2 == 1) { // für ungerade
            for (int i = 0; i < a; i++) {

                if (i < a3) {
                    start = letter1 - i;         //Anfbuchst. bestimmen für obere Hälfte -> H
                } else {
                    start = letter2 + count;    //Anfangsb. für untere Hälfte -> E
                    count++;
                }

                for (int j = 1; j <= space; j++) {
                    System.out.print(" ");
                }
                if (i < a2) {
                    space = space - 1;
                } else {
                    space = space + 1;
                }


                for (int j = 0; j <= rows; j++) {
                    int otherrow = (rows / 2);
                    System.out.print((char) (start));

                    if (j < otherrow) {
                        start++;                //StartLetter vor H
                    } else {
                        start--;                 //StartLetter nach H
                    }

                }
                System.out.println();
                if (i < a2) {
                    rows = rows + 2;    //von oben nach unten +2 Letter
                } else {
                    rows = rows - 2;    //von Mitte nach unten -2 Letter
                }

            }
        } else {
            System.out.println("Invalid number!");
        }
    }

    //todo Task 5
    public void marks(){
        int sum = 0;
        int count = 0;
        int ing = 1;
        boolean Input = true;

        while (Input){
            System.out.print("Mark " + ing + ": ");
            int number =sc1.nextInt();

            if(number > 0 && number <= 5){
                sum = sum + number;
                ing++;

                if (number == 5){
                    count++;
                }
            }else if (number < 0 || number > 5){
                System.out.println("Invalid mark!");
            }
            
            if (number==0){
                float z;
                if(ing == 1){
                    z = (float) sum /(ing);
                }else {
                    z = (float) sum /(ing - 1);
                }
                System.out.printf("Average: "+"%.2f", z);
                System.out.println();
                System.out.println("Negative marks: " + count);
                Input = false;
            }

        }

    }

    //todo Task 6
    public void happyNumbers(){
        System.out.print("n: ");
        int num = sc1.nextInt();
        int sum;
        int Zahl1;
        int Zahl2;
        int Zahl3;


        while (num > 0) {

            if (num != 1 && num != 4) {
                Zahl3 = num % 10;
                Zahl2 = (num / 10) % 10;
                Zahl1 = (num / 100) % 10;

                sum = (int) (Math.pow(Zahl1, 2) + Math.pow(Zahl2, 2) + Math.pow(Zahl3, 2));
                num = sum;

            } else if (num == 1) {
                System.out.println("Happy number!");
                break;

            } else if (num == 4) {
                System.out.println("Sad number!");
                break;
            }
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}