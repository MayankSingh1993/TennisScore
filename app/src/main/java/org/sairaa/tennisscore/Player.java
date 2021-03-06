package org.sairaa.tennisscore;

public class Player {
    private String name;
    private int point, game, set, set1, set2, set3 = 0;
    Player(String name, int i){
        this.name = name;
        this.point = i;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void setGame(int game) {
        this.game = game;
    }

    public void setSet(int set) {
        this.set = set;
    }

    public void setSet1(int set1) {
        this.set1 = set1;
    }

    public void setSet2(int set2) {
        this.set2 = set2;
    }

    public void setSet3(int set3) {
        this.set3 = set3;
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }

    public int getGame() {
        return game;
    }

    public int getSet() {
        return set;
    }

    public int getSet1() {
        return set1;
    }

    public int getSet2() {
        return set2;
    }

    public int getSet3() {
        return set3;
    }

    public void reset() {
        this.point = 0;
        this.game = 0;
        this.set = 0;
        this.set1 = 0;
        this.set2 = 0;
        this.set3 = 0;
    }
}
