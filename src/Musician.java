public class Musician <A extends Number> implements Playable<A> {
    A instrumentNumber;

    public Musician(A instrumentNumber) {
        this.instrumentNumber = instrumentNumber;
    }

    @Override
    public void playInstrument() {
        System.out.println("Играет в музыкальный инструмент под номером " + instrumentNumber);
    }
}


