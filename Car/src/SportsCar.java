public class SportsCar extends Car{
    SportsCar(int nog,int spd,int bT){
        super.drive(nog,spd);
        this.bT =  bT;
    }
    int bT;
    public void display(){
        System.out.println("BallType: " + bT);
        System.out.println("Speed is"+this.speed);
        System.out.println("No Of Gears :"+this.noofGears);
    }
}
