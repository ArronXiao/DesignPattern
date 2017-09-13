package com.arron.pattern.builder;


//与建造者的相对应的部分就指挥者，一个对象的构造过程如果是复杂的．就有必要将进行进一步的封装，方便具体的使用者
public class CarBuilderDirector {

    CarBuilder mBuilder;
    
    public CarBuilderDirector(CarBuilder builder) {
        mBuilder = builder;
    }
    
    
    public Car getProduct() {
        //如果建造的过程中是要求有序的，这里还可以通过操作顺序，体现更加复杂的构造过程，整个的加工过程都在完成，是具体的操作者
        Car car = new Car(mBuilder.getName(), mBuilder.getCarShoe() , mBuilder.getCarCarEngineer());
        return car;
    }
    
    
}
