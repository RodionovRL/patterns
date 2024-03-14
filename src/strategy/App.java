package strategy;

public class App {
    public static void main(String[] args) {
        Integer[] dataset = new Integer[]{7, 2, 13, 2, 9};

        Sorter<Integer> sorterForSmall = new Sorter<>(new BubbleSortStrategy<>());
        Sorter<Integer> sorterForBig = new Sorter<>(new QuickSortStrategy<>());

        sorterForBig.sort(dataset);
        System.out.println("---------------------");
        sorterForSmall.sort(dataset);
    }
}
