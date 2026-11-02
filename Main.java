public class Main {
    public static void main(String[] args) {
        //These are the six test cases abcde and f
        Feeder a = new Feeder(500);
        a.simulateOneDay(12);
        System.out.println(a.getCurrentFood());

        Feeder b = new Feeder(1000);
        b.simulateOneDay(22);
        System.out.println(b.getCurrentFood());

        Feeder c = new Feeder(100);
        c.simulateOneDay(5);
        System.out.println(c.getCurrentFood());

        Feeder d = new Feeder(2400);
        System.out.println(d.simulateManyDays(10, 4));
        
        Feeder e = new Feeder(250);
        System.out.println(e.simulateManyDays(10, 5));
        
        Feeder f = new Feeder(0);
        System.out.println(f.simulateManyDays(5, 10));
    }
}