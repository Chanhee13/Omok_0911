import processing.core.PApplet;

public class Main extends PApplet {
    public static void main(String[] args){
    	System.out.println("hello Omok");
        PApplet.main("Main");
    }
    @Override
    public void settings(){
        this.size(600,600);
    }

    @Override
    public void setup(){
        this.background(0);
    }

    @Override
    public void draw(){
        this.background(248, 196, 126);
    }
}
