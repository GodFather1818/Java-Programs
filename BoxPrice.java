public class BoxPrice extends BoxWeight{
    float price;


    BoxPrice(){
//        System.out.println();
        super();
        System.out.println("I just the super class Constructor from BoxPrice");
        this.price = -1.0f;
    }
    BoxPrice(double w, double l, double h, double weight, float price){
        super(l, w, h, weight);
        System.out.println("I called the my SuperClass Constructor i.e. BoxWeight from BoxPrice. ");
        this.price = price;
    }
}
