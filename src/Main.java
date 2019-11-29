public class Main {

    public static void main(String[] args) {

        Musician<Number> musician1= new Musician<>(1, 1);
        musician1.playInstrument();
        musician1.play(2);

        Musician<Integer> musician2 = new Musician<>(2, 2);
        musician2.playInstrument();
        musician2.play(3);

        Musician<Double> musician3 = new Musician<>(3.0, 3.0);
        musician3.playInstrument();
        musician3.play(4.0);
    }
}
