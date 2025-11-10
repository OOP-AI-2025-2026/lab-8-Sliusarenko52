package ua.opnu;

public class BookData implements Comparable<BookData> {
    private String title;
    private String author;
    private int reviews;
    private double total;

    public BookData(String title, String author, int reviews, double total) {
        this.title = title;
        this.author = author;
        this.reviews = reviews;
        this.total = total;
    }

    private double rating() {
        return reviews == 0 ? 0 : total / reviews;
    }

    @Override
    public int compareTo(BookData other) {
        double diff = other.rating() - this.rating();
        if (diff > 0) return 1;
        if (diff < 0) return -1;
        return this.title.compareTo(other.title);
    }

    @Override
    public String toString() {
        return String.format("%s (%.2f)", title, rating());
    }
}
