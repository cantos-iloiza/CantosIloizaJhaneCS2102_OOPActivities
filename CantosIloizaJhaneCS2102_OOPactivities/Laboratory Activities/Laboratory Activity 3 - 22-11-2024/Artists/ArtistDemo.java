public class ArtistDemo {
    public static void main(String[] args) {
        Artist artist = new Artist("Charlie Puth", 32, "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Nayeon Im", 29, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        Painter painter = new Painter("Kehinde Wiley", 47, "Art", Medium.OIL);
        painter.displayInfo();

        System.out.println();

        Writer writer = new Writer("Joanne 'J. K.' Rowling", 59, "Literature", WritingStyle.FICTION);
        writer.displayInfo();

        System.out.println();

        Dancer dancer = new Dancer("Audrey Lane", 20, "Dance", DanceStyle.HIPHOP);
        dancer.displayInfo();
    }
}
