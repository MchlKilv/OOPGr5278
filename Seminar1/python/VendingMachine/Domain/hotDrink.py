from Domain.product import Product


class HotDrink(Product):
    def __init__(self, price, place, name, id):
        super().__init__(price, place, name, id)
        self.hotDrinkVolume = 0.0

    def __init__(self, price, place, name, id):
        super().__init__(price, place, name, id)

        self.hotDrinkTemperature = 0.0

    def __init__(self, price, place, name, id, hotDrinkVolume, hotDrinkTemperature):
        super().__init__(price, place, name, id)
        self.hotDrinkVolume = hotDrinkVolume
        self.hotDrinkTemperature = hotDrinkTemperature

    def getHotDrinkVolume(self):
        return self.hotDrinkVolume

    def setHotDrinkVolume(self, hotDrinkVolume):
        self.hotDrinkVolume = hotDrinkVolume

    def getHotDrinkTemperature(self):
        return self.hotDrinkTemperature

    def setHotDrinkVolume(self, hotDrinkTemperature):
        self.hotDrinkTemperature = hotDrinkTemperature

    def __str__(self):
        return (
            super().__str__()
            + "volume = "
            + str(self.hotDrinkVolume)
            + "\ntemperature = "
            + str(self.hotDrinkTemperature)
        )
