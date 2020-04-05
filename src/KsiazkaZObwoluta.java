public class KsiazkaZObwoluta extends Dekorator
{
    private String oldDescription;
    public KsiazkaZObwoluta(Publikacja pub) throws NieMoznaZalozycObwoluty
    {
        super(pub);
        oldDescription = pub.description();
        if (!(pub instanceof KsiazkaZOkladkaZwykla) && !(pub instanceof KsiazkaZOkladkaTwarda))
            throw new NieMoznaZalozycObwoluty();
    }

    @Override
    public String description() {
        return oldDescription + " z obwoluta |";
    }

    @Override
    public String toString() {
        return description();
    }
}