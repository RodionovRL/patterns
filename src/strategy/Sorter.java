package strategy;

public class Sorter<E> {
    private final SortStrategy<E> sorter;

    public Sorter(SortStrategy<E> sorter) {
        this.sorter = sorter;
    }

    public E[] sort(E[] dataset) {
        return sorter.sort(dataset);
    }
}
