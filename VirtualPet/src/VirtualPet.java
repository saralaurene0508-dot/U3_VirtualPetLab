// Part A

public class VirtualPet {
    private String name;
    private int energyLevel;
    private int happinessLevel;
    private int weight;
    private int years;
    private int months;

    public VirtualPet(String name) {
        this.name = name;
        this.weight = 5;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Bubba's Information: " + "\n Energy: " + energyLevel + "\n Happiness: " + happinessLevel + "\n Weight: " + weight + "g\n" +
                "Age: " + months + " months and " + years + " years";
    }

    public void feed() {
        if (10 >= energyLevel && energyLevel <= 0) {
            energyLevel++;
        }
        weight++;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void play() {
        if (10 <= happinessLevel && happinessLevel >= 0) {
            happinessLevel++;
        }
        if (weight > 5) {
            weight--;
        }
    }

    public void updateStatus() {
        if (10 <= happinessLevel && happinessLevel >= 0) {
            happinessLevel--;
        }
        if (weight > 5) {
            weight--;
        }
        months++;
        if (months%12==0) {
            years++;
        }
    }
}
