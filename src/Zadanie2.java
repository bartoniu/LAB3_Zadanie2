public class Zadanie2
{
    public static void main(String[] args)
    {
        Publikacja k1 = new Ksiazka("Adam Mickiewicz", "Pan Tadeusz", 340);
        Publikacja k2 = new Ksiazka("Adam Mickiewicz", "Dziady", 130);

        System.out.println(k1);
        System.out.println(k2);

        try {
            Publikacja kk1 = new KsiazkaZOkladkaZwykla(k1);
            System.out.println(kk1);

            Publikacja kk2 = new KsiazkaZOkladkaTwarda(k2);
            System.out.println(kk2);

            Publikacja kkk2 = new KsiazkaZObwoluta(kk2);
            System.out.println(kkk2);

            Publikacja dziadyZAutografemWieszcza =
                    new KsiazkaZAutografem(kk2, "Drogiej Hani - Adam Mickiewicz");
            System.out.println(dziadyZAutografemWieszcza);

            Publikacja dziadyZDwomaAutografami = new KsiazkaZAutografem(dziadyZAutografemWieszcza, "Haniu, to nieprawda, Dziady napisałem ja, Julek Słowacki!");
            System.out.println(dziadyZDwomaAutografami);

            //Publikacja fakeBook = new KsiazkaZObwoluta(k1);
            //System.out.println(fakeBook);

            //Publikacja odrzut = new KsiazkaZObwoluta(kkk2);
            //System.out.println(odrzut);
        }
        catch (KsiazkaMaJuzOkladke e1)
        {
            KsiazkaMaJuzOkladke.showExceptionDescription();
        }
        catch (NieMoznaZalozycObwoluty  e2)
        {
            NieMoznaZalozycObwoluty.showExceptionDescription();
        }
        catch (KsiazkaMaJuzAutograf e3)
        {
            KsiazkaMaJuzAutograf.showExceptionDescription();
        }
    }
}

