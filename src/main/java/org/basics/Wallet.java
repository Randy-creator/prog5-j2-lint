package org.basics;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Wallet {
    private String color;
    private double height;
    private boolean isOpen;
    private boolean isLost;
    private Double money;

    public Wallet(boolean isOpen, String color, Double height, boolean isLost, Double money) {
        this.isOpen = isOpen;
        this.color = color;
        this.height = height;
        this.isLost = isLost;
        this.money = Math.max(money, 0);
    }

    public double addMoney(double moneyToAdd) {
        if (!isOpen || isLost || moneyToAdd <= 0) return money;
        money += moneyToAdd;
        return money;
    }

    public double getMoney(double moneyToTake) {
        if (!isOpen || isLost || moneyToTake <= 0) return money;
        money -= moneyToTake;
        return money;
    }

    public Double checkMoney() {
        return money;
    }
}
