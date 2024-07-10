package org.example.core;

public class OilFetcher {

    public Oil fetchOil(int money){
        if(money < 100){
            return new MustardOil();
        } else {
            return new OliveOil();
        }
    }

}
