public abstract class Dekorator implements Publikacja
{
    private Publikacja pub;

    Dekorator(Publikacja pub)
    {
        this.pub = pub;
    }

    @Override
    public String title() {
        return pub.title();
    }

    @Override
    public int pages() {
        return pub.pages();
    }

    @Override
    public String author() {
        return pub.author();
    }

    @Override
    public String description() {
        return pub.description();
    }
}