package DataStructure;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class TestTree {

    public static void main (String[] args) {
        new TestTree().go();
    }
    public void go() {
        Book b1 = new Book("How Cats Work");
        Book b2 = new Book("Remix your Body");
        Book b3 = new Book("Finding Emo");
        BookCompare bookCompare = new BookCompare();
        TreeSet<Book> tree = new TreeSet<Book>(bookCompare);
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
        ArrayList<Object> obj = new ArrayList<Object>();
        obj.add(b1);
        obj.add(1);
        System.out.println(obj);
    }

    class BookCompare implements Comparator<Book>{
        @Override
        public int compare(Book o1, Book o2) {
            return o1.title.compareTo(o2.title);
        }
    }
}
