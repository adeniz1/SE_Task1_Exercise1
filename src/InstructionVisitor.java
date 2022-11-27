public class InstructionVisitor implements PackingVisitor { //Concrete Visitor of PackingVisitor

    public void getInstruction(Glass glass) {
        System.out.println(glass.getName()+ ":") ;
        int l = glass.getLength()+1 ;
        int b = glass.getWidth()+1 ;
        int h = glass.getHeight()+1 ;
        System.out.println("> should be wrapped with Bubble wraps and  packed in a box with dimension: "
                + l +"x"+ b + "x" + h ) ;
    }
    public void getInstruction(Furniture furniture) {
        System.out.println(furniture.getName() + ":");
        System.out.println("> should be covered with waterproof covers with an area of:" + furniture.getLength()
                + "x" + furniture.getWidth());
    }
    public void getInstruction(Electronic electronic) {
        System.out.println(electronic.getName()+ ":");
        int l = electronic.getLength()+1 ;
        int b = electronic.getWidth()+1 ;
        int h = electronic.getHeight()+1 ;
        System.out.println(">should be  covered with Polyethylene foam film and packed in a box with dimension:"
        + l + "x" + b + "x" + h) ;

    }
}
