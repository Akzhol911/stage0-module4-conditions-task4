package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int greatest;
        greatest = first>second?
                first:
                second>third?
                        second:
                        third>first?
                            third:
                            first;
        System.out.println(greatest);

    }
}
