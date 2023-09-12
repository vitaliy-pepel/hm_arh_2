package Rewards.Silver;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;
import Rewards.Gold.GoldRewards;

public class SilverGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new SilverRewards();
    }
}
