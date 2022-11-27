public class TransportCostsVisitor implements CalculationVisitor {//ConcreteVisitor of CalculationVisitor

    //Konstruktor
    public TransportCostsVisitor() {

    }

    public double calculate(Glass glass) {
       double highFrag = 0.02 ; //Price per cm for thickness = 1 (2/100)
       double mediumFrag = 0.012 ; //Price per cm for thickness = 2 (1.2/100)
        double lowFrag = 0.007 ; //Price per cm for thickness = 3 (0.7/100)
        double result =  0 ;
        if(glass.thickness==1 ) {
            result = glass.getLength()*highFrag ;
        } else if (glass.thickness==2) {
            result =  glass.getLength()*mediumFrag ;
        } else {
            result =  glass.getLength()*lowFrag ;
        }
        System.out.println("Total  cost for " + glass.getName() +  " is: " + result)  ;
        return result ;
    }

    public double calculate(Furniture furniture) {
        double pricePerKg = 0.25 ; //Price per Kg  (5/20)
        double result = pricePerKg*furniture.getWeight() ;
        System.out.println("Total cost for " + furniture.getName() + " is: " + result) ;
        return result ;

    }
    public double calculate(Electronic electronic) {

        double result = 0 ;
        double priceFrag = 0.5 ;
        double priceNotFrag = (double) 5/15 ;
        if(electronic.getFragile()==true) {
            result = electronic.getWeight()*priceFrag ;
        }
        if(electronic.getFragile()==false){
            result = electronic.getWeight()*priceNotFrag ;
        }
        System.out.println("Total cost for " + electronic.getName() + " is: " + result)  ;
        return result ;

    }





}
