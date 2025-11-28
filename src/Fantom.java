public class Fantom {

    private String text;

    public Fantom(String text) {
        this.text = text;
    }

    public void printByLetters(int delayMillis) throws InterruptedException {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            Thread.sleep(delayMillis);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        String lyrics = "А на кухне суп мой стынет\n" +
                "В голове одно: «Я тебя люблю»\n" +
                "Мяч гоняю по двору\n" +
                "В голове одно: «Я тебя люблю»";

        Fantom song = new Fantom(lyrics);
        song.printByLetters(100); // задержка 100 миллисекунд
    }
}
