package strategy;

public class QuickSortStrategy<E> implements SortStrategy<E>{
    @Override
    public E[] sort(E[] dataset) {
        System.out.println("У кого самая быстрая рука на диком западе?");
        System.out.println("Делаем вид, что отсортировали.");
        return dataset;
    }
}
