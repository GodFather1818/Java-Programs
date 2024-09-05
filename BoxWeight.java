public class BoxWeight extends Box{
    double weight;

    BoxWeight() {
        super();
        System.out.println("I just the super class Constructor from BoxWeight");
        this.weight = -1;
    }

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);
        System.out.println("I just the super class Constructor(i.e Box)  from BoxWeight");
        this.weight = weight;
    }
}
