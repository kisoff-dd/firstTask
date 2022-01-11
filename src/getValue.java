import java.util.Scanner;

public class getValue {
    public static void main(String[] args) {
        int sumCh = 0;
        int sumNeCh = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 15 целых чисел");
        int[] number = new int[15];
        for (int i=0 ; i< number.length; i++ ) {
            number[i] = scanner.nextInt();
        }
        System.out.println("Вы ввели");
        for (int i=0 ; i< number.length; i++ ) {
        System.out.print(number[i] + ", " );
        }

        for (int i=0 ; i< number.length; i++ ) {
            if (number[i]% 2 == 0){
                sumCh = sumCh + 1 ;
        } else {
            sumNeCh = sumNeCh + 1;
        }
        }
        System.out.println("Из них четных " + sumCh + ". нечетных " + sumNeCh );
    }
    }
