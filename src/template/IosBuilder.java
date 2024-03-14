package template;

public class IosBuilder extends Builder {
    @Override
    public void test() {
        System.out.println("Запуск IOS тестов.");
    }
    @Override
    public void lint() {
        System.out.println("Копирование IOS кода.");
    }
    @Override
    public void assemble() {
        System.out.println("IOS сборка.");
    }
    @Override
    public void deploy() {
        System.out.println("Развёртывание IOS приложения на сервере.");
    }
}
