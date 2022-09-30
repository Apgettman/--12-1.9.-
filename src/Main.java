public class Main {
    // ДЗ-12 1.9. Объекты и классы
    public static void main(String[] args) {
        Book aBook = new Book ("War and Peace",100,"Book Publishing Ltd.",1720);
        Author author = new Author("L.Tolstoy");
        Book(aBook);
        aBook.setPublisherName(aBook.getAuthorName() + " " + author.getAuthor());
        aBook.setPublishingYear(aBook.getPublishingYear() + aBook.getPageAmount());
        System.out.println("Автор: " + author.getAuthor());
        System.out.println("Book: " + aBook.getPublisherName());

    }
    public static void Book (Book book) {
        System.out.println("Книга:" + " " + book.getAuthorName());
        System.out.println("Количество страниц:" + " " + book.getPageAmount());
        System.out.println("Издательство:" + " " + book.getPublisherName());
    }
}