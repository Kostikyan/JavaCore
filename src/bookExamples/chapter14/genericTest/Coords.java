package bookExamples.chapter14.genericTest;

public class Coords<T extends TwoD> {
    public T[] coords;
    public Coords(T[] o){
        this.coords = o;
    }
}
