package template;

public class AndroidBuilder extends Builder {
    @Override
    public void test() {
        System.out.println("Запуск Android тестов.");
    }
    @Override
    public void lint() {
        System.out.println("Копирование Android кода.");
    }
    @Override
    public void assemble() {
        System.out.println("Android сборка.");
    }
    @Override
    public void deploy() {
        System.out.println("Развёртывание Android приложения на сервере.");
    }
}
