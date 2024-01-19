import sys

# from PyQt5.QtWidgets import QApplication

from typing import List
from Domain.bottle import Bottle
from Domain.product import Product
from Services.coin_dispenser import CoinDispenser
from Services.display import Display
from Services.holder import Holder
from Services.vending_machine import VendingMachine
from Domain.hotDrink import HotDrink

# from main_frame import MainFrame


if __name__ == "__main__":
    assort: List[Product] = []
    item1 = Product(100, 1, "Lays")
    item2 = Bottle(50, 2, "Cola", 100, 0.5)
    item3 = Bottle(150, 3, "Mineral Water", 101, 1.5)
    # горячие напитки
    item4 = HotDrink(100, 4, "Black Tea", 102, 0.3, 79.9)
    item5 = HotDrink(120, 5, "Hot Chocolate", 103, 0.35, 64.9)
    assort.append(item1)
    assort.append(item2)
    assort.append(item3)
    assort.append(item4)
    assort.append(item5)

    hold1 = Holder(4, 4)
    coinDesp = CoinDispenser(0)
    disp = Display()

    venMachine = VendingMachine(hold1, coinDesp, assort, disp)

    for prod in venMachine.getProducts():
        print(prod)

    # app = QApplication(sys.argv)
    # myFrame = MainFrame()
    # myFrame.show()
    # sys.exit(app.exec_())
