package Codevita;

public class Wheels_And_Vehicles {
    public static void main(String[] args) {
        totalVehicles(200, 540);
    }

    public static void totalVehicles (int V, int W){
        if(W % 2 != 0 || 2 >= W || W < V){
            System.out.println("INVALID OUTPUT");
            return;
        }

        /*
            use math
            TW + FW = V             ------> 1
            (2 * TW) + (4 * FW) = W ------> 2

            rearrange eq 1 : FW = V - TW ------>3
            put 3 in 2
            (2 * TW) + 4 * (V - TW) = W
            2TW + 4V - 4TW = W
            4V - 2TW = W
            4V - W = 2TW
            (4V - W) = TW

            substitute TW in eq 3 to find FW
        */

        int TW = (4 * V - W) / 2;
        int FW = V - TW;


        System.out.println(TW + " Two wheelers");
        System.out.println(FW + " Four wheelers");
    }
}
