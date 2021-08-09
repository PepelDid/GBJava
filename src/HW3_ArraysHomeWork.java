import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW3_ArraysHomeWork {
        public static void main(String args[]) {
            //лучше универсализировать код,создавать переменные в мэйне,отдавать их потом методам
            int[] arrayN = new int[100];

            printArray1();
            printArrayN(arrayN);
            printArrayMultyplay6();
            printArraySquare();

            Scanner create = new Scanner(System.in);
            System.out.println("Задача 5. Создадим массив. Сколько в нем будет элементов?");
            int len = create.nextInt();
            System.out.println("Какое значение элемента будет инициальным?");
            int initialValue = create.nextInt();
            System.out.println(Arrays.toString(createArray(len, initialValue)));

            System.out.println("Задача 6. Задайте длину массива, мы его создадим и вычислим минимальный и максимальный элементы");
            int x = create.nextInt();
            arrayMaxMin(x);
        }

        public static void printArray1() {
            int[] arr1 = new int[10];
            int i = 0;
            for (i = 0; i < 10; i++) {
                Random random = new Random();
                int x = random.nextInt(2);
                arr1[i] = x;
            }
            // Система мне не дала использовать arr1.push(x).Должен быть индекс элемента указан для внесения в массив.
            System.out.println("Задача 1.Получили массив из 0 и 1");
            System.out.println(Arrays.toString(arr1));
            for (i = 0; i < 10; i++) {
                if (arr1[i] == 0) {
                    arr1[i] = 1;
                } else {
                    arr1[i] = 0;
                }
            }
            System.out.println("Инвертировали его элементы");
            System.out.println(Arrays.toString(arr1));
        }

        ;

        public static void printArrayN(int [] arrN) {
            int i = 0;
            int a = 1;
            while (i < arrN.length) {
                arrN[i] = a;
                i++;
                a++;
            }
            System.out.println("Задача 2.Получили массив из 100 элементов");
            System.out.println(Arrays.toString(arrN));
        }

        ;

        public static void printArrayMultyplay6() {
            int[] arrMultyplay = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            System.out.println("Задача 3. У нас есть массив");
            System.out.println(Arrays.toString(arrMultyplay));
            for(int i = 0; i < arrMultyplay.length; i++) {
                arrMultyplay[i] = (arrMultyplay[i] <= 6) ? (arrMultyplay[i] *= 2) : arrMultyplay[i];
            }
            /* Применен тернарный оператор, ибо условия позволяют. Он заменил данный цикл:
            for (int i = 0; i < 12; i++) {
                if (arrMultyplay[i] <= 6) {
                    arrMultyplay[i] *= 2;
                } else {
                    continue;
                }
            }*/
            System.out.println("Умножили те его элементы,что меньше или равны 6, на 2");
            System.out.println(Arrays.toString(arrMultyplay));
        }

        ;

        public static void printArraySquare() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Задача 4. Насколько большой квадратный массив будем делать? Ввведите количество строк");
            int side = scanner.nextInt();
            int[][] arrSq = new int[side][side];
            int row = 0;
            int col = 0;
            for (row = 0, col = 0; row < side; row++, col++) {
                arrSq[row][col] = 1;
            }
            ;
            for (row = 0, col = (side - 1); col >= 0; row++, col--) {
                arrSq[row][col] = 1;
            }
            ;
            for (row = 0; row < side; row++) {
                for (col = 0; col < side; col++) {
                    System.out.print(arrSq[row][col] + " ");
                }
                System.out.println();
            }
            // всё это можно заменить изящными arrSq[i][i] = 1;
            // arrSq[i][arrSq[i].lenght - 1 - i] = 1;
            // будет так вычислять диагональные индексы и ставить туда 1.
        }
        ;

        public static int[] createArray(int l, int v) {
            int [] newArr = new int[l];
            for (int i = 0; i < newArr.length; i++){
                newArr[i] = v;
            }
            return newArr;
        }
        ;
        public static void arrayMaxMin (int l){
            int[] arr6 = new int[l];
            int i = 0;
            for (i = 0; i < l; i++){
                Random random = new Random();
                int x = random.nextInt();
                arr6[i] = x;
            };
            System.out.println("В этом массиве: " + Arrays.toString(arr6));

            int x, z;
            x = z = arr6[0];
            //присвоить им значение первого элемента массива и сравнивать с ним
            for (i = 0; i < l; i++) {
                if (arr6[i] > x) {
                    x = arr6[i];
                } else if (arr6[i] < z){
                    z = arr6[i];
                } else {
                    continue;
                }
            }
            System.out.println("максимальный элемент: " + x + ", а минимальный элемент: " + z);

        }

    }

