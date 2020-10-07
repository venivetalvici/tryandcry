package Day18.golden_hands;

public class Main {
    public static void main(String[] args) {
        final double MASTER_PRICE_PRO_METER2_PRO_HOUR = 27.0;
        double tilesWidth = 20.0;
        double tilesLength = 30.0;
        // эти данные даёт клиент по телефону
        double roomWidth = 4;
        double roomLength = 5.5;
        double tilesPrice = 3.0;
        TilesApplication.startApplication(tilesWidth, tilesLength, roomWidth, roomLength,
                tilesPrice, MASTER_PRICE_PRO_METER2_PRO_HOUR);
// Ожидаем

    }
}