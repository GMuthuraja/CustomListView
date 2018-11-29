package app.example.app.customlistview;

public class Cars {

    int image;
    String name, brand;


    public Cars(int car_image, String car_name, String car_brand){
        this.image = car_image;
        this.name = car_name;
        this.brand = car_brand;
    }

    public int getImage(){
        return  image;
    }


    public String getName(){
        return name;
    }

    public String getBrand(){
        return brand;
    }

}
