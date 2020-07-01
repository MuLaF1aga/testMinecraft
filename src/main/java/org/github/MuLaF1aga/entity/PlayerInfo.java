package org.github.MuLaF1aga.entity;

import java.util.Objects;

public class PlayerInfo {
    String PlayerName;
    int age;

    public PlayerInfo(String playerName, int age) {
        PlayerName = playerName;
        this.age = age;
    }

    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String playerName) {
        PlayerName = playerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerInfo that = (PlayerInfo) o;
        return age == that.age &&
                Objects.equals(PlayerName, that.PlayerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PlayerName, age);
    }

    @Override
    public String toString() {
        return "PlayerInfo{" +
                "PlayerName='" + PlayerName + '\'' +
                ", age=" + age +
                '}';
    }
}
