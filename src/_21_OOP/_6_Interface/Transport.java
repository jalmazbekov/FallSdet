package _21_OOP._6_Interface;

public interface Transport {
    void name();
    default void stop() {
        System.out.println("Транспорт остановлен");
    }

}
