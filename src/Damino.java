public class Damino {
    private final int LeftSquare;
    private final int RightSquare;

    public Damino(int leftSquare,int rightSquare) {
        LeftSquare = leftSquare;
        RightSquare=rightSquare;
    }

    @Override
    public String toString() {
        return Integer.toString(RightSquare)+" and "+Integer.toString(LeftSquare);
    }
}
