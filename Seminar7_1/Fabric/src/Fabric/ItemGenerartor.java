package Fabric;

import Interface.iGameItem;

public abstract class ItemGenerartor {
    public void openReward() {
        iGameItem gameItem = createItem();

    }

    public abstract iGameItem createItem();
}
