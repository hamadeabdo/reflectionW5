package reflection5;

import e6.Furniture;
import e6.Step;

public class AddLegs implements Step {

    @Override
    public void perform(Furniture furniture)  {
        furniture.add("Leg");
    }
}
