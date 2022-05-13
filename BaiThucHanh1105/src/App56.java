import java.util.HashSet;
import java.util.Scanner;

public class App56 {
   public static void main(String[] args) {
       int number;
       HashSet<Integer> abc = new HashSet<>();
       try (Scanner sc = new Scanner(System.in)) {
        
           abc.add(0);
           abc.add(3);
           abc.add(1);
           abc.add(4);
           abc.add(2);
           abc.add(8);

           
           System.out.println("Các phần tử trong abc : ");
           System.out.println(abc);
           System.out.println("Nhập phần tử cần thêm : ");
           number = sc.nextInt();
    }

       
       if(!abc.contains(number))
       {
           abc.add(number);
           System.out.println("Thêm thành công !!! ");
           System.out.println("Các phần tử trong abc sau khi thêm : ");
           System.out.println(abc);
       }
       else
       {
           System.out.println("Phần tử " + number + " đã tồn tại !!! ");
       }
   } 
}
