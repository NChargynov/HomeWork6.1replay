public class Main {

    public static void main(String[] args) {

        Musician<Number> musician1= new Musician<>(1);
        musician1.playInstrument();

        Musician<Integer> musician2 = new Musician<>(2);
        musician2.playInstrument();

        Musician<Double> musician3 = new Musician<>(3.0);
        musician3.playInstrument();
    }
}
