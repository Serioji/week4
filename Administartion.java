
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Administartion {
    public static int[] array = {};

    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = s.nextInt();
        int [] myArray = new int[length];
        System.out.println("Enter the elements of the array:");

        for(int i=0; i<length; i++ ) {
            myArray[i] = s.nextInt();
            if(i<0 || i>100) {
                System.out.println("Невалидно число");

            }

        }
        System.out.println("1. Сортиране на въведените числа във възходящ ред");
        System.out.println("2. Сортиране на въведените числа в низходящ ред");
        System.out.println("3. Търсене на позиция на конкретно число");
        System.out.println("4. Разбъркване на числата");
        System.out.println("5. Изчисляване на сбора на всички числа");
        System.out.println("6. Намиране на най-голямото число");
        System.out.println("7. Намиране на най-малкото число");
        System.out.println("8. Намиране средно-аритметично на числата");
        System.out.println("9. Проверка за симетричност на масива от числа");
        System.out.println("10. Обръщане на масива от числа");
        System.out.println("11. Визуализирай въведените числа");
        System.out.println("12. Изход");
        Menu(myArray);
        int[] sortedup = sortUP(myArray);
        int[] SortDown = sortDown(myArray);





        for (int element : myArray) {
            System.out.print(element + " ");

        }
    }




    public static int[] sortUP(int[] myArray) {
        int length = myArray.length;
        int element;

        for (int i = 1; i < length; i++) {

            for (int j = length - 1; j >= i; j--) {

                if (myArray[j-1] > myArray[j]) {
                    element = myArray[j-1];
                    myArray[j-1] = myArray[j];
                    myArray[j] = element;
                }
            }
        }

        return myArray;
    }




        public static void maxNumber(int[] myArray){
        int max= myArray[0];

        for (int i=0; i< myArray.length;i++){

            if (max< myArray[i]){
                max= myArray[i];

            }
        }
        System.out.println("The biggest number is "+max);
    }

    public static int[] sortDown(int[] myArray) {
        int length = myArray.length;
        int element;

        for (int i = 1; i < length; i++) {

            for (int j = length - 1; j >= i; j--) {

                if (myArray[j-1] < myArray[j]) {
                    element = myArray[j-1];
                    myArray[j-1] = myArray[j];
                    myArray[j] = element;
                }
            }
        }

        return myArray;
    }
    public static void Symetry(int[] myArray,int N,int i){
        boolean sym = true;
        for(i = 0; i<N;i++){
            if(myArray[i]!= myArray[N-1-i]){
                sym=false;
            }
            if(sym==true){
                System.out.println("Масива е симетричен");
            }
            else{
                System.out.println("Масива не симетричен");
            }
        }

    }
    public static int findIndex(int[] myArray,int t)
    {


        if (myArray == null) {
            return -1;
        }


        int len = myArray.length;
        int i = 0;


        while (i < len) {


            if (myArray[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }
    public static void reverse(int[] myArray,int n){
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i<n;i++) {
            b[j-1] = myArray[i];
            j =j - 1;
            for(int k = 0; k<n; k++){
                System.out.println(b[k]);
            }
        }

        }
    public static int Exit(int[] myArray){
        for(int i=0;i<myArray.length;i++){


        }
        return -1;

    }

        public static int sumUp(int[] myArray){
        int sum =0;
        for(int i=0; i<myArray.length; i++){
            sum+=myArray[i];
        }
        return sum;
    }
    public static int minNumber(int[] myArray){
        int minValue = myArray[0];
        for(int i=0;i<myArray.length;i++){
            if(myArray[i] < minValue){
                minValue = myArray[i];
            }
        }
        return minValue;
    }

        public static double average(int[] myArray){
        int total =0;
        double average =0;
        for(int i=0; i<myArray.length; i++){
            total = total + myArray[i];
             average =total / myArray.length;
        }
        return average;
    }

    public static void shuffleArray(int[] array)
    {

        Random rnd = ThreadLocalRandom.current();
        for (int i = array.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);

            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }


    }








    public static void Menu(int[] array) {


        System.out.println("Изберете Опция");
        Scanner menu = new Scanner(System.in);
        int number = menu.nextInt();



        if(number == 1) {
            System.out.println("1. Сортиране на въведените числа във възходящ ред");
            sortUP(array);


        }
        else if(number == 2){
            System.out.println("2. Сортиране на въведените числа в низходящ ред");
            sortDown(array);

        }
        else if(number == 3) {
            System.out.println("3. Търсене на позиция на конкретно число);");
            System.out.println("Позцията на числото е " + findIndex(array, 5));
        }
        else if(number == 4){
            System.out.println("4. Разбъркване на числата");
            shuffleArray(array);


        }
        else if (number == 5){
            System.out.println("5.Изчисляване на сбора на всички числа");
            System.out.println("Сумата на числата е :"+sumUp(array));


        }
        else if (number == 6) {
            System.out.println("6. Намиране на най-голямото число");
            maxNumber(array);
        }
        else if (number == 7) {
            System.out.println("7. Намиране на най-малкото число");
            System.out.println("Най-малкото число е :" + minNumber(array));
        }
        else if (number == 8) {
            System.out.println("Намиране средно-аритметично на числата");
            System.out.println("Средното аритметично е :"+average(array));

        }
        else if (number == 9){
            System.out.println("9. Проверка за симетричност на масива от числа");
            Symetry(array,0,0);

        }
        else if (number == 10){
            System.out.println("10. Обръщане на масива от числа");
            reverse(array,array.length);
        }
        else if (number == 11){
            System.out.println("11. Визуализирай въведените числа");


        }
        else if (number == 12){
            System.out.printf("Exit"+Exit(array));

        }
    }
}