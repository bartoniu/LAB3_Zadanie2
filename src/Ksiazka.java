public class Ksiazka implements Publikacja
{
    String author;
    String title;
    int pages;
    String description;

    public Ksiazka(String author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
        description = "| " + author + " | " + title + " | " + pages + " |";
    }

    @Override
    public String author()
    {
        return author;
    }

    @Override
    public String title()
    {
        return title;
    }

    @Override
    public int pages()
    {
        return pages;
    }

    @Override
    public String description()
    {
        return "| " + author + " | " + title + " | " + pages + " |";
    }

    @Override
    public String toString() {
        return (description);
    }
}