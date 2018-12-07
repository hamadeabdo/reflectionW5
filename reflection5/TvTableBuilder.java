package reflection5;

import e6.AddShelf;
import e6.AddTop;
import e6.Step;

import java.util.Arrays;
import java.util.List;

public class TvTableBuilder {
    List<Step> steps= Arrays.asList(new AddLegs() , new AddLegs(), new AddLegs(), new AddLegs()
            ,new AddShelf(),new AddTop());

    public TvTable build(){
        TvTable tvTable = new TvTable();
        for (Step step:steps){
            step.perform(tvTable);
        }
        return tvTable;


    }
}

