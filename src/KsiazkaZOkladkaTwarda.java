public class KsiazkaZOkladkaTwarda extends Dekorator
{
    public KsiazkaZOkladkaTwarda(Publikacja pub) throws KsiazkaMaJuzOkladke
    {
        super(pub);
        if (pub instanceof KsiazkaZOkladkaZwykla || pub instanceof KsiazkaZOkladkaTwarda)
            throw new KsiazkaMaJuzOkladke();
    }

    @Override
    public String description() {
        return "| " + author() + " | " + title() + " | " + pages() + " | " + "okladka twarda |";
    }

    @Override
    public String toString() {
        return (description());
    }
}