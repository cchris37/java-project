package de.breitenstein.project;

import javax.xml.namespace.QName;
import java.net.StandardSocketOptions;
import java.sql.SQLOutput;

public class Program {
    /*static void s(String s){
    System.out.println(s);
}*/
    public static void main(String[] args) {
        /*System.out.println("Hello World");

		int age = 27;	//Initialisierung

		int age2; 		//Deklaration
		//age2 = 29;		//Zuweisung
        boolean = true/false
        char = 0 bis +16.535
        byte = -128 bis + 127
        int = -32.768 bis +32.767
        long
        float = Kommazahlen
        double = Kommazahlen


		System.out.println(age);
		age2 = 30;
		age = 28;
		System.out.println(age);
		System.out.println(age2);*/

       /*int test = 128;
        boolean test = true;
        double test = 2.3;*/

       /*String test = "aaa ";
       System.out.println("Namen: " + test + " saba " + "jaa looooköläl" );*/
        /*------Arithmetische Operatoren-----------
       /int number1 = 3 * 5;
       int number2 = 5;
       int result = number1 + number2;
       System.out.println(number1 + "" + number2);*/
       /*------Der Modulo Operator-----------------
        //int number1 = 7 % 3;
        //int number2 = 33 * 5;
        //Program.s(String.valueOf(number1));
        //Program.s(String.valueOf(number1)+String.valueOf(number2));*/
      /*------------if-else--------------------------------------
       int age = 18;
       //age = age + 1;
    if (age == 17) {
        System.out.println("Dann darfst du das pc game ab 18 jahren kaufen");
    }
    else {
        System.out.println("du bist zu jung");

    }
*/
      /*--------------Switch-Case Abfrage----------------
      int month = 3;
        switch(month) {
            case 1: System.out.println("Januar");break;
            case 2: System.out.println("Februar");break;
            case 3: System.out.println("March");break;
            default: System.out.println("Es ist keiner der angegeben Monate");
        }
        String month2 = "September";
        switch(month2) {
            case "januar": System.out.println("Januar");break;
            case "Februar": System.out.println("Februar");break;
            case "March": System.out.println("March");break;
            default: System.out.println("Es ist keiner der angegeben Monate");
        }*/

      /*---------------While-Schleife-------------------------
        int number = 1;
        //Kopfgesteurte Schleife
        while(number <= 5){
            System.out.println(number);
            // number += 2; //number + number + 2
            number ++; // NUR um Wert um 1 zu eröhen
        }*/
        /*Do-While-Schleife [Fußgesteuerte Schleife)
        int number = 1;
        do{                     //<- wird zuerst ausgeführt
            System.out.println(number);
            number ++;
        }
        while(number <= 5);   // dann while
        }
         */
        /*For-Schleife
        for(int i = 6; i < +10; i++){
            System.out.println(i * 2);
        }*/
        /*Verchachtelte Schleife
        for(int i = 1; i < 4; i++){

            for(int j = 1; j < 4; j++){
                System.out.print("x ");

            }
            System.out.println();
            }*/
        //------------Array----------------
        /* String[] names = new String [4]; // Die Größe eines Array wurd durch die Intialisierung ( Zahl) festgelegt

        names[0] = "lol";
        names[1] = "rofl";
        names[2] = "omg";
        names[3] = "neu";
       //System.out.println(names[1]);

        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }*//*
        String[] names = {"lol", "rofl", "omg", "neu"};
        for(int i = 0; i < names.length; i++){
            System.out.println(names [i]);
        }
        for(String name : names){----//Foreach-Schleife nur für Leser. ES ändert nicht die Datenstruktur.
            System.out.println(name);
        }*/
        //----------Mehrdimensionale Arrays------------------
        /*String[][] firstAndLastName = new String[8][2];
        firstAndLastName[0][0] = "Christian";
        firstAndLastName[0][1] = "Breitenstein";

        firstAndLastName[1][0] = "Alexander";
        firstAndLastName[1][1] = "Breitenstein";

        firstAndLastName[2][0] = "Marlies";
        firstAndLastName[2][1] = "Breitenstein";

        firstAndLastName[3][0] = "Ingemar";
        firstAndLastName[3][1] = "Breitenstein";

        firstAndLastName[4][0] = "Elisabeth";
        firstAndLastName[4][1] = "Breitenstein";

        firstAndLastName[5][0] = "QiQi";
        firstAndLastName[5][1] = "Breitenstein";

        //Äußere For-Schleife Zeilenindex => i
        //Innere For-Schleife Spaltenindex => j
        for(int i = 0; i < firstAndLastName.length; i++){
            for(int j = 0; j < firstAndLastName[i].length; j++) {
                System.out.print(firstAndLastName[i][j] + " ");
            }
            System.out.println();
        }*/

        /*- ----Methoden-----------------
        System.out.println("vor dem methodenaufruf");
        //System.out.println(doSomething(20, 20));
        int resultFromMethodDoSomething = doSomething(30,50);
        System.out.println(resultFromMethodDoSomething);
        System.out.println("nach dem methodenaufruf");
    }

    public static int doSomething(int number1, int number2) {
       // int x = number1;
        //int y = number2;
        //int result = number1 + number2;
        return number1 + number2:
        //System.out.println(result);*/
        //-----------Konstruktor------------------//
        Car car1 = new Car("Blau","BENZ",210); //Instanzierung eines Objekts
        Car car2 = new Car ();
        System.out.println(car1.getColor());
        car1.drive(30);
        car1.drive(40,"Spoon");

        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sleep();
        dog.setName("Bella");
        cat.setName("Whisper");
        System.out.println(dog.getName());
        System.out.println(cat.getName());
        //-------------------------------------//

        /* car1.drive();
        car1.setColor("rot");
        System.out.println(car1.getColor());*/
    }
}

