class Car{
    private String color;
    private String model;
    private int year;
    private boolean rentalStatus;

    public Car(  String color,String model,int year)
    {
        this.color=color;
        this.model=model;
        this.year=year;
        rentalStatus=false;

    }

    public void output()
    {
        System.out.println("Color: "+color+" Model: "+model+" Year: "+year+" RentalStatus: "+rentalStatus);
    }
}




public class constructor1 {
    public static void main(String args[])
    {
        Car c1= new Car("White","Toyota",2022);
        Car c2= new Car("blue","Benz",2021);
        c1.output();
        c2.output();
    }
}
