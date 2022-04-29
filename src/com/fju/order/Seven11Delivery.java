package com.fju.order;

public class Seven11Delivery extends Delivery {
    public Seven11Delivery() {
        name = "7-11";
        price = 60;
    }
}
class FamilyDelivery extends Delivery{
    public FamilyDelivery(){
        name="Family";
        price=60;
    }
}
class HiLifeDelivery extends Delivery{
    public HiLifeDelivery(){
        name="Hi-Life";
        price=50;
    }
}
class ShopeeDelivery extends Delivery{
    public ShopeeDelivery(){
        name="Shopee";
        price=19;
    }
}