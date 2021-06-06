package javaapplication2;

public class Car {
    
    //state, fields
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;
    
    public void setModel (String model){
        String validModel = model.toLowerCase();
        //to test if a string value is equal to another type
        //adding conditions to validate the class
        if(validModel.equals("carrera") || validModel.equals("commodore")){
        this.model = model;
        }else{
            this.model = "Unknown";
        }
        //private string model = parameter model passed
    }
    
    public String getModel(){
        //not void because something is expected to be return
        return this.model;
    }
    
    
    
}
