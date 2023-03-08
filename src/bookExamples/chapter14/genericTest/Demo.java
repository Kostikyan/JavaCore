package bookExamples.chapter14.genericTest;

public class Demo {
    static void showXY(Coords<?> a){
        for (int i = 0; i < a.coords.length; i++) {
            System.out.println(a.coords[i].x + " "  + a.coords[i].y);
        }
        System.out.println();
    }
    static void showXYZ(Coords<? extends ThreeD> a){
        for (int i = 0; i < a.coords.length; i++) {
            System.out.println(a.coords[i].x + " " + a.coords[i].y + " " + a.coords[i].z);
        }
        System.out.println();
    }
    static void showALL(Coords<? extends FourD> a){
        for (int i = 0; i < a.coords.length; i++) {
            System.out.println(a.coords[i].x + " " + a.coords[i].y + " " + a.coords[i].z + " " + a.coords[i].d + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TwoD[] td = {
                new TwoD(1, 2),
                new TwoD(23, 24),
                new TwoD(123,123),
                new TwoD(92, 82)
        };

        Coords<TwoD> tdlocs = new Coords<>(td);
        showXY(tdlocs);

        FourD[] fd = {
                new FourD(1, 2, 3, 4),
                new FourD(6, 8, 14, 8),
                new FourD(22, 9, 4, 9),
                new FourD(3, -2, -23, 17)
        };
        Coords<FourD> fdlocs = new Coords<FourD>(fd);
        showXY(fdlocs);
        showXYZ(fdlocs);
        showALL(fdlocs) ;

    }
}
