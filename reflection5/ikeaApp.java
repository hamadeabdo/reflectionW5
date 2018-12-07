package reflection5;

public class ikeaApp {
    public static void main(String[] args) {
    TvTableBuilder tvTableBuilder = new TvTableBuilder();
        System.out.println("Tv Table{parts=" + tvTableBuilder.build().parts + "}");
    }
}
