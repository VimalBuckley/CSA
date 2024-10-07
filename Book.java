public class Book {
    private String name;
    private int pages;
    private boolean paperback;

    public Book() {
        name = "Default Book";
        pages = 100;
        paperback = false;
    }

    public Book(String name, int pages, boolean paperback) {
        this.name = name;
        this.pages = pages;
        this.paperback = paperback;
    }

    @Override
    public String toString() {
        String nameString = "This book's name is " + name + ".\n";
        String pagesString = "This book has " + pages + " pages.\n";
        String paperbackString = "This book is paperback.\n";
        if (!paperback) {
            paperbackString = "This book is hardback.\n";
        }
        return nameString + pagesString + paperbackString;
    }
}
