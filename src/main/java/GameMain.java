import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.util.Scanner;

public class GameMain {

    public static short MAX_CARDS_SIZE = 999;
    public static short MAX_CARDS_VALUE = 1000;

    public static void main(String[] args) throws Exception {

        var cardsSize = getCardsSize();
        var cards = getCardsByConsole(cardsSize);
        var winner = startGame(cards);

        System.out.println(winner);
    }

    public static short getCardsSize() throws Exception{
        var scanner = new Scanner(System.in);
        var cardsSize = scanner.nextShort();

        if(cardsSize > MAX_CARDS_SIZE) throw new Exception("MAX_CARDS_SIZE");
        else return cardsSize;
    }

    public static short[] getCardsByConsole(short size) throws Exception {
        var scanner = new Scanner(System.in);
        short[] cards = new short[size];

        for(var i = 0; i < size; i++) {
            cards[i] = scanner.nextShort();
            if(cards[i] > MAX_CARDS_VALUE) throw new Exception("MAX_CARDS_VALUE");
        }

        return cards;
    }

    public static String startGame(short[] cards) {
        int petya = 0;
        int vasya = 0;

        for(short i = 2; i < cards.length; i += 3) {
            petya += cards[i - 2];
            vasya += cards[i - 1];
            if(cards[i - 2] < cards[i - 1]) {
                petya += cards[i];
            }else {
                vasya += cards[i];
            }
        }

        if(petya > vasya) return "Petya";
        else return "Vasya";
    }



}
