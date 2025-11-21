package _21_OOP._3_Encapsulation;

public class LibraryBook {

    public String title;
    private String author;
    private final int totalCopies;
    private int availableCopies;

    public LibraryBook(String title, String author, int availableCopies, int totalCopies) {
        if (title.isEmpty()) {
            System.out.println("Please initialize title");
        } else {
            this.title = title;
        }

        if (author.isEmpty()) {
            System.out.println("Please initialize author");
        } else {
            this.author = author;
        }

        this.availableCopies = availableCopies;
        this.totalCopies = totalCopies;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public String takeBook(int howMany) {
        if (availableCopies > howMany) {
            availableCopies -= howMany;
            return "Taken" + howMany + " books";
        } else {
            return "Take a book da";
        }

    }

    public String giveBack(int givenBack) {
        if (givenBack > 1 && (givenBack <= (totalCopies - availableCopies))) {
            availableCopies += givenBack;
            return "Return " + givenBack;
        } else {
            return "Not correct";
        }

    }

    @Override
    public String toString() {
        return "LibraryBook{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", availableCopies=" + availableCopies +
                ", totalCopies=" + totalCopies +
                '}';
    }
}






























