import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class Library {

    public static HashSet<Books>hss = new HashSet<>();
    Scanner kb = new Scanner(System.in);

    public void addBook(Books b) {
       if(hss.contains(b))
         {
             System.out.println("Book is already present");
         }
         else
         {
              hss.add(b);
              //System.out.println("Sucessfull added book");
         }
    }

    public void getBookCount() {
        System.out.println("You have "+hss.size()+" books in your library");
    }

    public void getAllBooks() {
        Iterator<Books> it = hss.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
  }
}
