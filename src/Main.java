public class Main {


    public static void main(String[] args) {

        Book warAndPeace = new Book("Война и Мир", "Толстой Л.Н.", 1695);
        System.out.println("warAndPeace.name = " + warAndPeace.getName());
        System.out.println("warAndPeace.author = " + warAndPeace.getAuthor());
        System.out.println("warAndPeace.yearOfPublication = " + warAndPeace.getYearOfPublication());
        warAndPeace.setYearOfPublication(1696);
        System.out.println("warAndPeace.getYearOfPublication() = " + warAndPeace.getYearOfPublication());

        Book theAdventuresOfTomSawyer = new Book("Приключения Тома Сойера", "Марк Твейн", 1876);
        System.out.println("theAdventuresOfTomSawyer.name = " + theAdventuresOfTomSawyer.getName());
        System.out.println("theAdventuresOfTomSawyer.author = " + theAdventuresOfTomSawyer.getAuthor());
        System.out.println("theAdventuresOfTomSawyer.yearOfPublication = " + theAdventuresOfTomSawyer.getYearOfPublication());

        Book leComteDeMonteCristo = new Book("Граф Монте-Кристо", "Дюма Александр", 1844);
        System.out.println("leComteDeMonteCristo.name = " + leComteDeMonteCristo.getName());
        System.out.println("leComteDeMonteCristo.author = " + leComteDeMonteCristo.getAuthor());
        System.out.println("leComteDeMonteCristo.yearOfPublication = " + leComteDeMonteCristo.getYearOfPublication());

    }
}