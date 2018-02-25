package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {
    private final String roll;
    private final String burgers;
    private final String sauce;
    private final List<String> ingredients;

    public BigMac(final String roll, final String burgers, final String sauce, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getRoll() {
        return roll;
    }

    public String getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "roll='" + roll + '\'' +
                ", burgers='" + burgers + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    public static class BigMacBuilder{
        private String roll;
        private String burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder roll(String roll) {
            this.roll = roll;
            return this;
        }
        public BigMacBuilder burgers(String burgers) {
            this.burgers = burgers;
            return this;
        }
        public BigMacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }
        public BigMacBuilder ingredients(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }
        public BigMac build(){
            return new BigMac(roll,burgers,sauce,ingredients);
        }
    }

}
