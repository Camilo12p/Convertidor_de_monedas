package com.convertidordemonedas.monedas;

public class MonedaCOP {
    // atributos
    private float precioEnDolar;

    public MonedaCOP(MonedaRecord moneda){
        this.precioEnDolar = moneda.conversion_rates().get("COP");
    }

    public float getPrecioEnDolar(){
        return this.precioEnDolar;
    }
}
