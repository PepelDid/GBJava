
import java.util.Random;
import java.util.Scanner;

public class HW8_Words {
    public static void main(String[] args) {
        String words[] = {"apple", "orange",
                "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon",
                "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};

        String superWord = makeWord(words);
        compareWords(superWord);
    }

    public static String makeWord(String[] x) {
        Random random = new Random();
        int p = random.nextInt(x.length);
        String z = x[p];
        return z;
    }

    /*Этот метод ходит только на костылях. Из-за того,что у меня не работало условие
    в цикле  for (int i = 0; i < a.length() || i < b.length(); i++) ,
    пришлось вводить параметр с длинной загаданного слова и постоянно контролировать,
    совпадает ли длина вводимого слова с длинной загаданного. По моей идее, он должен был
    проводить сравнение символов строк до того момента,пока не кончится то слово,что короче.
    Но не работало, и джава,конечно, говорила, что массивы не совпадают по длине*/

    public static void compareWords(String a) {
        int x = a.length();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Мы загадали вкусняшку, в её названии " + x + " букв. Отгадайте,что это." +
                "Напишите маленькими буквами по-английски овощ или фрукт ");
        String b = myScanner.nextLine();
        StringBuilder answer = new StringBuilder();
        if (a.equals(b)) {
            System.out.println("Есть у нас такое слово!" + b);
        } else {
            while (!a.equals(b)) {
                while (b.length()!=x){
                    System.out.println("Слишком короткое или слишком длинное слово");
                    b = myScanner.nextLine();
                }
                for (int i = 0; i < x; i++) {
                    if (a.charAt(i) == b.charAt(i)) {
                        answer.append(a.charAt(i));
                    } else {
                        answer.append("*");
                    }
                }
                System.out.println(answer + "*********. Попробуйте ещё раз");
                answer.delete(0, answer.length());
                b = myScanner.nextLine();
            }
            System.out.println("Есть у нас такое слово!" + b);
        }

    }
}