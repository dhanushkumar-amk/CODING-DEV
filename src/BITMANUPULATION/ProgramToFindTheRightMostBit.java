package BITMANUPULATION;

public class ProgramToFindTheRightMostBit {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(rightMostSetBitPosition(n));
    }

    // method 1
    static  int rightMostSetBitPosition(int n){
        int mask = 1;
        int position = 0;  // assume intialize it zero


        while ((n & mask) == 0){
            mask = mask << 1;
            position++;
        }

        return position + 1; // for zero based indexing
    }
}