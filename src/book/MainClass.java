
package book;

public class MainClass {

    public static void main(String[] args) {
        // TODO code application logic here
        Book b1=new Book("abc","hafizur rahman","123-1","novel",20);
        b1.showInfo();
        b1.addBookCopy(50);
        b1.showInfo();
    }
    
}
