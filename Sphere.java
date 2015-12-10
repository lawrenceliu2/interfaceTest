public class Sphere extends Circle{

    public Sphere(double radius, String name){
	super(radius,name);
    }

    public String toString(){
	return "FIXME!";
    }

    public double getVolume(){
	return (4.0/3)*Math.PI*Math.pow(radius,3);
    }
}