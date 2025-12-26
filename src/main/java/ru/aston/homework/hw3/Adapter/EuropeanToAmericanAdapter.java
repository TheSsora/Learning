package ru.aston.homework.hw3.Adapter;

public class EuropeanToAmericanAdapter implements AmericanSocket{
    private EuropeanPlug europeanPlug;

    public EuropeanToAmericanAdapter(EuropeanPlug europeanPlug) {
        this.europeanPlug = europeanPlug;
    }

    @Override
    public void plugIn() {
        // Адаптируем вызовы: вместо plugIn() вызываем insert() и use()
        europeanPlug.insert();
        europeanPlug.use();
        System.out.println("(через адаптер)");
    }
}
