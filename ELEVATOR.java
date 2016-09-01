
public class ELEVATOR
{
    // instance variables - replace the example below with your own
    private int current_floor;
    private int top_floor;

    public ELEVATOR()
    {
        current_floor = 0;
        top_floor = 10;
    }

    public void ascend() {

        if (current_floor < top_floor){
            current_floor = current_floor + 1;
        }
        else 
        {
            System.out.println ("Sorry you are at the top");  
        }
      
    }
    
    
    public void descend(){
        if (current_floor <= top_floor){
            current_floor = current_floor - 1;
        }
        else{
            System.out.println ("Sorry you are at the bottom");
        }
        
    }
}
