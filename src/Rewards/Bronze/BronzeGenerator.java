package Rewards.Bronze;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;
import Rewards.Diamond.DiamondRewards;
import Rewards.Gold.GoldRewards;

public class BronzeGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new BronzeRewards();
    }
}
