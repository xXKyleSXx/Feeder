public class Feeder {
    private int currentFood = 500;


    public void simulateOneDay(int birds) {
        int foodEaten = (int) (10 + (Math.random() * 40) * birds);
        currentFood = currentFood - foodEaten;
        if (currentFood < 0) {
            currentFood = 0;
        }
        if (Math.random() < 0.05) {
            currentFood = 0;
        }
    }
}