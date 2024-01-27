package Fabric;

import Interface.iGameItem;
import Product.GoldReward;

public class GoldGenerator extends ItemGenerartor {

    @Override
    public iGameItem createItem() {
        return new GoldReward();
    }

}
