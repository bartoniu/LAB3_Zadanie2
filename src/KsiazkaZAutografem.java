public class KsiazkaZAutografem extends Dekorator
{
    private String oldDescription;
    private String auto;
    public KsiazkaZAutografem(Publikacja pub, String aut) throws KsiazkaMaJuzAutograf {
        super(pub);
        oldDescription = pub.description();
        auto = aut;
        if (pub instanceof KsiazkaZAutografem)
            throw new KsiazkaMaJuzAutograf();
    }

    @Override
    public String description() {
        return oldDescription + " " + auto + " |";
    }

    @Override
    public String toString() {
        return description();
    }
}