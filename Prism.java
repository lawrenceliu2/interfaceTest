public class Prism extends Rectangle{

    private double height;

    public Prism(double length, double width, double height, String name){
	super(lenght,width,name);
	this.height = height;
    }

    public double getHeight(){
	return height;
    }

    public String toString(){
	return "FIXME!";
    }

    public double getVolume(){
	return length*width*height;
    }
}