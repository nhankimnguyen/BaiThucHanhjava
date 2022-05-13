import java.util.HashSet;
import java.util.Scanner;

public class App54 {
    public static void main(String[] args) throws Exception {
        String name;
        HashSet<String> hashSetstring = new HashSet<>();
        try (Scanner sc = new Scanner(System.in)) {
            
            hashSetstring.add("Wilson");
            hashSetstring.add("Nike");
            hashSetstring.add("Volvo");
            hashSetstring.add("Kia");
            hashSetstring.add("Lenovo");
            hashSetstring.add("Lenovo");

            
            System.out.println("Các phần tử trong HashSetString: ");
            System.out.println(hashSetstring);
            System.out.println("Nhập phần tử cần xóa:");
            name = sc.nextLine();
        }

        
        if(hashSetstring.contains(name))
        {
            hashSetstring.remove(name);
            System.out.println("Xóa thành công !!!");
            System.out.println("Các phần tử còn lại trong HashSetString : ");
            System.out.println(hashSetstring);
        }
        else
        {
            System.out.println("Xóa không thành công !");
        }
    }
}
