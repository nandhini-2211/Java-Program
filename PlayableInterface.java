interface Playable{
    void play();
}
class FootBall implements Playable{
    @Override
    public void play(){
        System.out.println("Playing Football");
    }
   
    
}
class VolleyBall implements Playable{
    @Override
    public void play(){
        System.out.println("Playing Volleyball");
    }
   
    
}
class BasketBall implements Playable{
    @Override
    public void play(){
        System.out.println("Playing Basketball");
    }
   
    
}
class Main {
    public static void main(String[] args) {
        FootBall f=new FootBall();
        VolleyBall v=new VolleyBall();
        BasketBall b=new BasketBall();
        f.play();
        v.play();
        b.play();
        
        
    }
}
