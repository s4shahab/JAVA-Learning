class Circles{


    public int radius;

    Circles(){
        System.out.println("I am circle constructor without argument");
    }

    Circles(int r){
        System.out.println("I am circle constructor with argument");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }

}

class Cyliner extends Circles{
    public int height;

    Cyliner(int r, int h){
//        super(r);
        System.out.println("I am Cylinder constructor");
        this.height=h;

    }
    public double volume(){
        return Math.PI*this.height*this.radius*this.radius;
    }


}

//---------

class Rectangles{
    public int lengths;
    public int bredth;

    public int heights;

    public int getLengths() {
        return lengths;
    }

    public void setLengths(int lengths) {
        this.lengths = lengths;
    }

    public int getBredth() {
        return bredth;
    }

    public void setBredth(int bredth) {
        this.bredth = bredth;
    }

    public int getHeights() {
        return heights;
    }

    public void setHeights(int heights) {
        this.heights = heights;
    }

    Rectangles(int l, int b, int hi){
        System.out.println("I am rectangle constructor: ");
        this.lengths=l;
        this.bredth=b;
        this.heights=hi;

    }

    public double Rarea(){
        return this.lengths*this.bredth;

    }

    public double Rvolume(){
        return this.lengths*this.bredth*this.heights;
    }

}

class Cuboid extends Rectangles{
    Cuboid(int l,int b,int hi){
        super(l,b,hi);

    }

    public double Carea(){
        return 2*(this.lengths+this.bredth+this.heights);
    }

    public double Cvolume(){
        return this.lengths*this.bredth*this.heights;
    }
}

public class cwh_52_Practice {
    public static void main(String[] args) {
//        Problem 01

//        Circles objC=new Circles(4);
//Cyliner objcl=new Cyliner(4,25);

//Problem 02

//        Rectangles Robj=new Rectangles(2,3,5);
//        System.out.println(Robj.Rarea());
//        System.out.println(Robj.Rvolume());

        Cuboid Cobj=new Cuboid(4,4,4);
        System.out.println(Cobj.Carea());
        System.out.println(Cobj.Cvolume());



    }
}
