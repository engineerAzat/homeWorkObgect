public class Main {


    public static void main(String[] args) {

        Author tolstoi = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и Мир", tolstoi, 1965);
        System.out.println("Книга - " + warAndPeace.getName());
        System.out.println(tolstoi);
        System.out.println("Год издания - " + warAndPeace.getYearOfPublication());
        warAndPeace.setYearOfPublication(1966);
        System.out.println("Год издания - " + warAndPeace.getYearOfPublication());



        Author tven = new Author("Марк", "Твейн");
        Book theAdventuresOfTomSawyer = new Book("Приключение кота мотроскина", tven, 2089 );
        System.out.println("Книга - " + theAdventuresOfTomSawyer.getName());
        System.out.println(tven);
        System.out.println("Год издания - " + theAdventuresOfTomSawyer.getYearOfPublication());

        Author duma = new Author("Александр", "Дюма");
        Book leComteDeMonteCristo = new Book("Граф Монте-Кристо", tven, 1884 );
        System.out.println("Книга - " + leComteDeMonteCristo.getName());
        System.out.println(duma);
        System.out.println("Год издания - " + leComteDeMonteCristo.getYearOfPublication());



    }
}