public class Card {
    private String shape;
    private String colour;
    private String pattern;

    Card(String shape,String colour,String pattern){
        this.shape = shape;
        this.colour = colour;
        this.pattern = pattern;

    }


    public Boolean equal(Card other){

        if(this.shape.equals(other.shape) && this.colour.equals(other.colour) && this.pattern.equals(other.pattern)){
            return true;
        }else{
        return false;
        }



    }
    public Boolean unique(Card other){

        
            if(!this.shape.equals(other.shape) && !this.colour.equals(other.colour) && !this.pattern.equals(other.pattern)){
            return true;
        }else{
            return false;
        }
        



    }


   



}
