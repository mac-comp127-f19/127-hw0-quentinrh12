package BestGameMyEdits;

import comp127graphics.CanvasWindow;

import java.util.ArrayList;
import java.util.List;

public class SidekickManager {
    private List<Sidekick> sidekicks = new ArrayList<>();
    private final int numOfSC = 20;

    public SidekickManager(CanvasWindow canvas) {
        for (int x = 0; x < numOfSC; x++) {
            Sidekick sidekick = new Sidekick();
            sidekicks.add(sidekick);
            canvas.add(sidekick, -50, 50);
        }
    }
}