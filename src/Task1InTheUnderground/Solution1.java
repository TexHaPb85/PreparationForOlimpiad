package Task1InTheUnderground;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * В подземелье M тоннелей и N перекрестков, каждый тоннель соединяет какие-то два перекрестка.
 * Мышиный король решил поставить по светофору в каждом тоннеле перед каждым перекрестком.
 * Напишите программу, которая посчитает, сколько светофоров должно быть установлено на каждом из перекрестков.
 * Перекрестки пронумерованы числами от 1 до N.
 *
 *
 * Во входном файле INPUT.TXT записано два числа N и M (0 < N ≤ 100, 0 ≤ M ≤ N*(N-1)/2).
 * В следующих M строках записаны по два числа i и j (1 ≤ i,j ≤ N), которые означают, что перекрестки i и j соединены тоннелем.
 * Можно считать, что любые два перекрестка соединены не более, чем одним тоннелем. Нет тоннелей от перекрестка i до него самого.
 *
 * В выходной файл OUTPUT.TXT вывести N чисел: k-ое число означает количество светофоров на k-ом перекрестке.
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = scan.nextInt();
        System.out.println("Enter M:");
        int m = scan.nextInt();
        List input = new ArrayList<>();
        for(int i=0;i<m;i++){
            System.out.println("Enter first connected crossroad");
            int c1= scan.nextInt();
            input.add(c1);
            System.out.println("Enter second connected crossroad");
            int c2= scan.nextInt();
            input.add(c2);
        }
        Integer [] iInput = (Integer[]) input.toArray(new Integer[input.size()]);

        int arr []=new int[n];

        for (int i=0;i<iInput.length;i++){
            arr[iInput[i]-1]++;
        }
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
            sb.append(arr[i]+"  ");
        }

        System.out.println(sb.toString());
    }
}
