public class Inheritance {
    public static void main(String[] args) {
        Box box = new Box();
//        Box box1 = new BoxWeight(2, 4, 5, 6);
//        System.out.println(box1.weight);
//        BoxWeight box2 = new Box(2, 3, 4, 5)
//   Both the above statements will cause an error as mentioned in the notes. Refer to the notes for he detailed
//   explanantion.
        BoxPrice box3 = new BoxPrice(2, 3, 4, 5,6);
        System.out.println(box3.price + " " + box3.w);
    }
}
