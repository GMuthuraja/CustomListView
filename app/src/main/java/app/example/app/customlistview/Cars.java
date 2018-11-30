package app.example.app.customlistview;


public class Cars {

    int id, image, price;
    String name, brand, model;


    public Cars(int car_id, int car_image, String car_name, String car_brand, String car_model, int car_price){
        this.id = car_id;
        this.image = car_image;
        this.name = car_name;
        this.brand = car_brand;
        this.model = car_model;
        this.price = car_price;
    }

    public int getId(){return id;}

    public int getPrice() {return  price;}

    public int getImage(){
        return  image;
    }

    public String getName(){
        return name;
    }

    public String getBrand(){ return brand; }

    public String getModel(){return model;}

}
