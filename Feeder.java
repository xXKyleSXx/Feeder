public class Feeder {
    private int currentFood;
    private int elapsedDays;

    public Feeder(int food) {
        currentFood = food;
    }

    public int getCurrentFood() {
        return currentFood;
    }

    public void simulateOneDay(int numBirds) {
        int foodEaten = (int) (10 + (Math.random() * 40) * numBirds);
        currentFood = currentFood - foodEaten;
        if (currentFood < 0) {
            currentFood = 0;
        }
        if (Math.random() < 0.05) {
            currentFood = 0;
        }
    }

    public int simulateManyDays(int numBirds, int numDays) {
        while (currentFood > 0 && numDays > 0) {
            int foodEaten = (int) (10 + (Math.random() * 40) * numBirds);
            currentFood = currentFood - foodEaten;
            if (currentFood < 0) {
                currentFood = 0;
            }
            if (Math.random() < 0.05) {
                currentFood = 0;
            }
            numDays -= 1;
            elapsedDays += 1;
        }
        return elapsedDays;
    }
}