import java.util.*;
import java.util.ArrayList;

public class JavaList {
    public static void main(String[] args)
    {
        int index=0 , value=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n = scan.nextInt();
        System.out.println("Enter Array Elements");
        List<Integer> list = new ArrayList<>(n);
        for (int i=0;i<n;i++)
            list.add(i, scan.nextInt());
        System.out.println("Enter q");
        int q = scan.nextInt();
        while (q>0)
        {
            System.out.println("Enter query");
            String query = scan.next();
            if(query.equals("Insert"))
            {
                System.out.println("Enter index & no");
                index = scan.nextInt();
                value = scan.nextInt();
                list.add(index,value);
            }
            else
            {
                System.out.println("Enter index to delete");
                index = scan.nextInt();
                list.remove(index);
            }
            q--;
        }
        for (int i=0;i<list.size();i++)
            System.out.print(list.get(i)+" ");

    }
}
