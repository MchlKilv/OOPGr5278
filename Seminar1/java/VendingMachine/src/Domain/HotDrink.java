package Domain;

/*
 * Класс HotDrink представлен как наследник от класса Bottle
 */
public class HotDrink extends Bottle {

    private float cupTemperature;

    public HotDrink(int price, int place, String name, long id, float bottleVolume, float cupTemperature) {
        super(price, place, name, id, bottleVolume);
        this.cupTemperature = cupTemperature;
    }

    public float getCupTemperature() {
        return cupTemperature;
    }

    public void setCupTemperature(float cupTemperature) {
        this.cupTemperature = cupTemperature;
    }

    @Override
    public String toString() {
        // Переопределили вывод для горячих напитков добавлена температура напитка
        return super.toString() + "temperature = " + cupTemperature + " Celsius\n";
    }

}
