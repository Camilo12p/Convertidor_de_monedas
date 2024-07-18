package com.convertidordemonedas;

import com.convertidordemonedas.corefiles.CoreFIles;
import com.convertidordemonedas.monedas.MonedaRecord;

public class Main {
    public static void main(String[] args) {
        String direccion ="https://v6.exchangerate-api.com/v6/c2b5369d2a9caee6429cdbcf/latest/USD";
        MonedaRecord moneda = CoreFIles.usoApi(direccion);
        System.out.println(moneda);
    }
}