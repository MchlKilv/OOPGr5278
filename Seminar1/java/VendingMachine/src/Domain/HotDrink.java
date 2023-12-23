package Domain;

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
        // Переопределили вывод для горячих напитков
        return super.toString() + "temperature=" + cupTemperature + "\n";
    }

}
