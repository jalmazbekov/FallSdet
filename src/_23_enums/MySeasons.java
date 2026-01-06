package _23_enums;

public enum MySeasons {

        SPRING("Весна"), // SPRING(""), SUMMER, AUTUMN, WINTER - это могут быть значения
        SUMMER("Лето"),
        AUTUMN("Осень"),
        WINTER("Зима");
        private final String season;

        MySeasons(String season) {
            this.season = season;
        }

        public String getSeason() {
            return season;
        }

}
