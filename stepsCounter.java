import java.io.*;

class StepsCounter {

    static int countWays(int distance) {
        if (distance < 0) return 0;
        if (distance == 0) return 1;

        return countWays(distance - 1) + 
               countWays(distance - 2) +
               countWays(distance - 3);
    }
    
    public static void main(String[] args) {
        int distance = 4;
        System.out.println(countWays(distance));
    }
}
