package com.example.graphical;

public class foodProduct {
    String typeOfFood;
    double weight;
    double cost;
    int numberOfServings;
    double numberOfCaloriesPerServing;

    public void setTypeOfFood(String t) {
        typeOfFood = t;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setWeight(double w) {
        weight = w;
    }

    public double getWeight() {
        return weight;
    }

    public void setCost(double c) {
        cost = c;
    }

    public double getCost() {
        return cost;
    }

    public void setNumberOfServings(int ns) {
        numberOfServings = ns;
    }

    public int getNumberOfServings() {
        return numberOfServings;
    }

    public void setNumberOfCaloriesPerServing(double ncps) {
        numberOfCaloriesPerServing = ncps;
    }

    public double getNumberOfCaloriesPerServing() {
        return numberOfCaloriesPerServing;
    }

    /* The following three methods returns arithmetic calculation results. */

    public double getCostPer100Grams() {
        return cost / weight * 100;
        /* Example for test: 1000 / 500 * 100 = 200 */
    }

    public double getCostPerServing() {
        return cost / numberOfServings;
        /* Example for test: 1000 / 4 = 250 */
    }

    public double getTotalNumberOfCalories() {
        return numberOfCaloriesPerServing * numberOfServings;
        /* Example for test: 30 * 4 = 120 */
    }
}

