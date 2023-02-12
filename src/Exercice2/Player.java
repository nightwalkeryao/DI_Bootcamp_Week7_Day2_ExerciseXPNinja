package Exercice2;

public class Player {
    private String namePlayer;
    private int agePlayer;
    private String gameType;

    public Player(String namePlayer, int agePlayer, String gameType) {
        this.namePlayer = namePlayer;
        this.agePlayer = agePlayer;
        this.gameType = gameType;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public int getAgePlayer() {
        return agePlayer;
    }

    public String getGameType() {
        return gameType;
    }
}
