package Domain;

/*
 * Класс Bottle представлен как наследник от класса Product
 */
public class Bottle extends Product {

    private float bottleVolume;

    public Bottle(int price, int place, String name, long id, float bottleVolume) {
        super(price, place, name, id);
        this.bottleVolume = bottleVolume;
    }

    public float getBottleVolume() {
        return bottleVolume;
    }

    public void setBottleVolume(float bottleVolume) {
        this.bottleVolume = bottleVolume;
    }

    @Override
    // Переопределяем вывод для бутылок, добавлен объем бутылки
    public String toString() {
        return super.toString() + "volume = " + bottleVolume + " Liter\n";
    }

}
