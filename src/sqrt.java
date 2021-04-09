import java.util.Scanner;

public class sqrt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] nums; // 2-х мерный массив для хранения допустимых значений в строковом формате
        nums = new String [][]{{"1","2","3","4","5","6","7","8","9","10"},{"I","II","III","IV","V","VI","VII","VIII","IX","X"}};
        var i = 0; //Счетчик столбов
        var j = 0; //Счетчик строк (тип цифр)
        var z = 0; //Введенное число
        var t = 0; //Тип цифр 0 - арабские 1- римские
        System.out.print("Input: ");
        String text = in.nextLine();
        String[] nuss = text.split(" ",3);
        //System.out.println(nuss.length);
        //System.out.println(nuss[0]);
        //System.out.println(nuss[1]);
        //System.out.println(nuss[2]);
            for (j = 0; j < 2; j++) {
                for (i = 0; i < 10; i++) {
                    if (nums[j][i].equals(nuss[0])){
                         z = i + 1; //Определение введенного числа
                         t = j;   //Определение типа введенного числа 0 - арабские 1 - римские
                         System.out.print("Your number: " + z);}
                }
            }
            if (z == 0) System.out.println("Wrong input. Try again!");

        in.close();
    }
}
