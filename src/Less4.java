import ru.bspb.anketa.*;

public class Less4 {

    public static void main(String[] args) {

        Anketa[] ankets = new Anketa[]{
                new AnketaFL("FL", "Jone", "m", 42),
                new AnketaFL("FL","Dan","m",30),
                new AnketaFL("FL","Peter","m",18),
                new AnketaFL("FL","Jone", "m", 42),
                new AnketaFL("FL","Mike", "m", 18),
                new AnketaFL("FL","Kate", "f", 25),
                new AnketaFL("FL","Den", "m", 36),
                new AnketaFL("FL","Eve", "f", 33),
                new AnketaFL("FL","Stive", "m", 28),
                new AnketaFL("FL","Mila", "f", 66),
                new AnketaFL("FL","Barbara", "f", 44),
                new AnketaFL("FL","Den", "m", 52),
                new AnketaFL("FL","Peter", "m", 23)
        };
        System.out.println("Выбранные клиенты:");
        Anketa.anketasort(ankets);
        Anketa.anketafilterduble(ankets);
    }


}
