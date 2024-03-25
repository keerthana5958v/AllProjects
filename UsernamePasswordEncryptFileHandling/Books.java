public class Books {
    String title;
    String author;
    public String toString() {
        return " " + title + ", by " + author;
    }
}

class BooksTest{
    public static void main(String[] args) {
        Books[] mybooks = new Books[3];
//        System.out.println(Arrays.toString(mybooks));
        mybooks[0] = new Books();
        mybooks[1] = new Books();
        mybooks[2] = new Books();
//        System.out.println(Arrays.toString(mybooks));
        mybooks[0].title = "the grapes of java";
        mybooks[1].title = "the java gatsby";
        mybooks[2].title = "the java cookbook";

        mybooks[0].author = "bob";
        mybooks[1].author = "sue";
        mybooks[2].author = "ivan";

        System.out.println(mybooks[0]);
        System.out.println(mybooks[1]);
        System.out.println(mybooks[2]);
    }

}


