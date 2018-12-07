package reflection5;

import e6.Furniture;

import java.util.ArrayList;
import java.util.List;

public class TvTable implements Furniture {
    List<String> parts = new ArrayList<>();

    @Override
    public void add(String part) {
        parts.add(part);
    }
}
