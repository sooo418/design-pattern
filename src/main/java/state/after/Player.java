package state.after;

public class Player {

    PlayerLevel level;

    public Player() {
        level = new BeginnerLevel();
    }

    public void play(int time) {
        level.go(time);
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }
}
