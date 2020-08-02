public class Car {

    protected int speed;
    protected int noofGears;

    public void drive(int nog,int spd){
        this.speed=spd;
        this.noofGears=nog;
    }

    public void display(){
        System.out.println("Speed is"+this.speed);
        System.out.println("No Of Gears :"+this.noofGears);
    }
}
