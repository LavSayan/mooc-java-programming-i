public class Book {
    private String numOfPage;
    private String publicationYr;
    private String title;

    public Book(String numOfPage, String publicationYr, String title) {
        this.numOfPage = numOfPage;
        this.publicationYr = publicationYr;
        this.title = title;
    }

    public String getNumOfPage() {
        return numOfPage;
    }

    public String getPublicationYr() {
        return publicationYr;
    }

    public String getTitle() {
        return title;
    }

    public String printEvething() {
        return title + ", " + numOfPage + " pages, " + publicationYr;
    }

}
