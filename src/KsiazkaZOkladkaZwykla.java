public class KsiazkaZOkladkaZwykla extends Dekorator
{
    public KsiazkaZOkladkaZwykla(Publikacja pub) throws KsiazkaMaJuzOkladke
    {
        super(pub);
        if (pub instanceof KsiazkaZOkladkaZwykla || pub instanceof KsiazkaZOkladkaTwarda)
            throw new KsiazkaMaJuzOkladke();
    }

    @Override
    public String description() {
        return "| " + author() + " | " + title() + " | " + pages() + " | " + "okladka zwykla |";
    }

    @Override
    public String toString() {
        return description();
    }
}