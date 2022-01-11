import java.util.Scanner;

public class getValue {
    public static void main(String[] args) {
        int sumCh = 0;
        int sumNeCh = 0;
        int firstNumber;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 12 целых чисел");
        int[] number = new int[12];
        for (int i=0 ; i< number.length; i++ ) {
            number[i] = scanner.nextInt();
        }
        System.out.println("Вы ввели");
        for (int i=0 ; i< number.length; i++ ) {
        System.out.print(number[i] + ", " );
        }

        firstNumber = number[0];

           for (int i=1 ; i< number.length; i++ ) {
            if (firstNumber < number[i]){
                count = count + 1 ;
        }
        }
        System.out.println("Из них чисел, большее чем первое " + count);
    }
    }
