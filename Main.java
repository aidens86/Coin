import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public static double standardError(double p, int sample) {
    return Math.sqrt((p * (1 - p)) / sample);
}


    
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Game g = new Game();
        g.play();
        

        File file = new File("flips.txt");
        Scanner s = new Scanner(file);
        int heads = 0;
        int tails = 0;

        while (s.hasNext()) {
            if (s.next().equals("heads"))
                heads++;
            else
                tails++;
        }
        s.close();

        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
        System.out.println(heads + tails);

            double se = standardError(0.5, 97);
    double pHat = (double) tails / (heads + tails);
    System.out.println(pHat);
    double z = (pHat - 0.5) / se;
    System.out.println(z);
    System.out.println(2 * pHat - 1);



                public static int simulate(int flips, String guess, double tails, double risk) {
            Player p = new Player(100);
            Coin c = new Coin(tails);
            while (flips > 0) {
                p.flip(c, guess, (int)(risk * p.getBalance() + 0.5));
                flips--;
            }
            return p.getBalance();
            System.out.println(simulate(97, "tails", pHat, 2 * pHat - 1));


        }

    }


}

