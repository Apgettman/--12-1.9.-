public class Book {
    private final String authorName;
    private final int pageAmount;
    private String publisherName;
    private int publishingYear;

    public Book(String authorName, int pageAmount, String publisherName, int publishingYear) {
        this.authorName = authorName;
        this.pageAmount = pageAmount;
        this.publisherName = publisherName;
        this.publishingYear = publishingYear;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getPageAmount() {
        return pageAmount;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        if (publishingYear < 1950 || publishingYear > 2050) {
            System.out.println("Год публикации: " + publishingYear);
            return;
        }
        this.publishingYear = publishingYear;
    }
}


