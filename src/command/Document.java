package command;

public class Document {
    public void insert(String str, int position) {
        System.out.printf("Текст \"%s\" добавлен на позицию %d \n", str, position);
    }
    public String delete(int position, int noOfChars) {
        System.out.printf("%d символов удалены начиная с позиции %d\n", noOfChars, position);
        return String.format("Здесь строка длинной %d удалённая с позиции начиная с %d", noOfChars, position);
    }
    public void copy(int position, int noOfChars) {
        System.out.printf("%d символов начиная с позиции %d скопированы\n", noOfChars, position);
    }
}
