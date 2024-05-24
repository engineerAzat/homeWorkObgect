public class Main {
    public static void main(String[] args) {

        Book warAndPeace = new Book();
        warAndPeace.name = "Война и Мир";
        warAndPeace.author = "Толстой Л.Н.";
        warAndPeace.yearOfPublication = 1965;
        System.out.println("warAndPeace.name = " + warAndPeace.name);
        System.out.println("warAndPeace.author = " + warAndPeace.author);
        System.out.println("warAndPeace.yearOfPublication = " + warAndPeace.yearOfPublication);

        Book theAdventuresOfTomSawyer = new Book();
        theAdventuresOfTomSawyer.name = "Приключения Тома Сойера";
        theAdventuresOfTomSawyer.author = "Марк Твейн";
        theAdventuresOfTomSawyer.yearOfPublication = 1876;
        System.out.println("theAdventuresOfTomSawyer.name = " + theAdventuresOfTomSawyer.name);
        System.out.println("theAdventuresOfTomSawyer.author = " + theAdventuresOfTomSawyer.author);
        System.out.println("theAdventuresOfTomSawyer.yearOfPublication = " + theAdventuresOfTomSawyer.yearOfPublication);

        Book leComteDeMonteCristo = new Book();
        leComteDeMonteCristo.name = "Граф Монте-Кристо";
        leComteDeMonteCristo.author = "Дюма Александр";
        leComteDeMonteCristo.yearOfPublication = 1844;
        System.out.println("leComteDeMonteCristo.name = " + leComteDeMonteCristo.name);
        System.out.println("leComteDeMonteCristo.author = " + leComteDeMonteCristo.author);
        System.out.println("leComteDeMonteCristo.yearOfPublication = " + leComteDeMonteCristo.yearOfPublication);

    }
}