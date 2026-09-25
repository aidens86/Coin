public class Main {
    public static void main(String[] args) {
        Game g = new Game();
        g.play();

        Coin penny = new Coin();
        System.out.println(penny);
        System.out.println(penny.getState());
        penny.flip();
        System.out.println(penny.getState());
        System.out.println(penny.getHeads());
        System.out.println(penny.getTails());
        penny.flip(99);
        System.out.println(penny.getHeads());
        System.out.println(penny.getTails());
        Coin nickel = new Coin(.9);
        nickel.flip(100);
        System.out.println(nickel.getHeads());
        System.out.println(nickel.getTails());
        nickel.setPTails(.5);
        nickel.flip(1000);
        System.out.println(nickel.getHeads());
        System.out.println(nickel.getTails());
    
Player sanders = new Player(100);
        sanders.flip(penny, "heads", 25);
        System.out.println(sanders.getBalance());
    
   
}

}