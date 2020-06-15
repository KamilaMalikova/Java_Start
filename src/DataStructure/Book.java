package DataStructure;

public class Book //implements Comparable<Book>
{
    String title;
    public Book(String t) {
        title = t;
    }

    @Override
    public String toString() {
        return title;
    }

    /*@Override
    public int compareTo(Book o) {
        return title.compareTo(o.title);
    }*/
}
