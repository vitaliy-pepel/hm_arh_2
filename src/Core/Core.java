package Core;

import Abstractions.ItemGenerator;
import Rewards.Bronze.BronzeGenerator;
import Rewards.Diamond.DiamondGenerator;
import Rewards.Gold.GoldGenerator;
import Rewards.Silver.SilverGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Core {
    // Логика игры
    public void run() {


        ItemGenerator r1 = new GoldGenerator();
        r1.openReward();
        ItemGenerator r2 = new BronzeGenerator();
        r2.openReward();
        ItemGenerator r3 = new SilverGenerator();
        r3.openReward();
        ItemGenerator r4 = new DiamondGenerator();
        r4.openReward();
        Random rnd = ThreadLocalRandom.current();
        List<ItemGenerator> rList = new ArrayList<>();
        rList.add(r1);
        rList.add(r2);
        rList.add(r3);
        rList.add(r4);

        int index = (int) (Math.random() * rList.size());
        System.out.println(rList.get(index).openReward());


    }
}
