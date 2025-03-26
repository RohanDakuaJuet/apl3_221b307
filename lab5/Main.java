package lab5;

class Main{
    public static void main(String args[]){
        Beverage b = new Whisky();
        b.templateMethod(35);
        
        b = new Beer();
        b.templateMethod(200);
    }
}