package strategy;

public class BubbleSortStrategy<E> implements SortStrategy<E> {
    @Override
    public E[] sort(E[] dataset) {
        System.out.println("Здесь без пузырька не обойтись.");
        System.out.println("Делаем вид, что отсортировали.");
        return dataset;
    }
}
