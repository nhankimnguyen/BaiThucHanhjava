import java.util.TreeSet;
import java.util.Scanner;

public class App69 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> treeSetInteger =new TreeSet<>();
        try (Scanner sc = new Scanner(System.in)) {
            
            treeSetInteger.add(0);
            treeSetInteger.add(3);
            treeSetInteger.add(1);
            treeSetInteger.add(4);
            treeSetInteger.add(2);
            treeSetInteger.add(6);

            
            System.out.println("Các phần tử trong TreeSetInteger : ");
            System.out.println(treeSetInteger);
            System.out.println("Nhập phần tử từ bàn phím : ");
            number = sc.nextInt();
        }
        
        if(!treeSetInteger.contains(number))
        {
            treeSetInteger.add(number);
            System.out.println("Thêm thành công !!! ");
            System.out.println("Các phần tử trong TreeSetInteger sau khi thêm : ");
            System.out.println(treeSetInteger);
        }
        else
        {
            System.out.println("Phần tử " + number + " đã tồn tại");
        }
    }
}
