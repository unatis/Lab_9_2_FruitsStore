package com.company;

public class StoreVitrine {

    Fruits[] FruitsVitrine = new Fruits[5];
    Vegetables[] VegetablesVitrine = new Vegetables[5];

    public void GetProduct (Fruits fruit){

        for(int i = 0;  i < FruitsVitrine.length; i++ ){

            if(FruitsVitrine[i] == null){
                FruitsVitrine[i] = fruit;
                break;
            }
        }

    }

    public void GetProduct (Vegetables Vegetable){

        for(int i = 0;  i < VegetablesVitrine.length; i++ ){

            if(VegetablesVitrine[i] == null){
                VegetablesVitrine[i] = Vegetable;
                break;
            }
        }


    }

    public void ShowVitrine (){

        for(int i = 0;  i < FruitsVitrine.length; i++ ){

            System.out.println("FruitsVitrine");
            System.out.println(FruitsVitrine[i].Name);

        }

        for(int i = 0;  i < VegetablesVitrine.length; i++ ){

            System.out.println("VegetablesVitrine");
            System.out.println(VegetablesVitrine[i].Name);
        }

    }

}
