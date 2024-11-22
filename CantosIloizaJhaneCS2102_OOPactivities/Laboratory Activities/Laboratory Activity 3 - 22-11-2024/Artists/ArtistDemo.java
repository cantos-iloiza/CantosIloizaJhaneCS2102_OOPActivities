public class ArtistDemo {
    public static void main(String[] args) {
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Nayeon Im", "Korean", 29, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        Painter painter = new Painter("Kehinde Wiley", "African-American", 47, "Art", Medium.OIL);
        painter.displayInfo();

        System.out.println();

        Writer writer = new Writer("Joanne 'J. K.' Rowling", "British", 59, "Literature", WritingStyle.FICTION);
        writer.displayInfo();

        System.out.println();

        Dancer dancer = new Dancer("Audrey Lane", "American", 20, "Dance", DanceStyle.HIPHOP);
        dancer.displayInfo();
    }
}