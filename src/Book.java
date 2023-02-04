public class Book {
    private String name;
    private int yearPublication;
    private Author author;


    public Book(String name, int yearPublication, Author author) {
        this.name = name;
        this.yearPublication = yearPublication;
        this.author = author;
    }

    public String getName() {
        return name;
    }
    public int getYearPublication() {
        return yearPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public String toString() {
        return "Наименование книги: " + name + ", " + "Год издания: " + yearPublication + ", " + "Имя автора: " + author.getFirstName() + ", " + "Фамилия автора: " + author.getLastName();
    }
   public boolean equals(Object other) {
        if(this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return name.equals(book.name)&&author.getFirstName().equals(book.author.getFirstName())&&author.getLastName().equals(book.author.getLastName());
   }
    public int hashCode() {
        return java.util.Objects.hash(name, author.getFirstName(), author.getLastName());
    }
}