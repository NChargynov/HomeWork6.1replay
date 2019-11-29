public class Musician <A extends Number> implements Playable<A> {
    A instrumentNumber;
    A numberMusician;

    public Musician(A instrumentNumber, A numberMusician) {
        this.instrumentNumber = instrumentNumber;
        this.numberMusician = numberMusician;

    }

    @Override
    public void playInstrument() {
        System.out.println("Музыкант под номером " + numberMusician +
                " играет в музыкальный инструмент под номером " + instrumentNumber);
    }

    @Override
    public void play(A a) {
        for (int i = 0; i < a.doubleValue() ; i++) {
            System.out.println("Музыкант под номером " + numberMusician + " " + a + "-раза играет в этом музыкальном инструменте");
        }
    }
}


