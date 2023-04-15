import java.security.SecureRandom;

public class DaminoStones {
    private Damino[] DaminoStoness;
    private int CurrentStone;
    private static final int NumberofStones=28;
    private static final SecureRandom RandomNumbers=new SecureRandom();

    public DaminoStones(){
        DaminoStoness=new Damino[NumberofStones];
        int count=0;
        for(int i=0;i<=6;i++){
            for(int j=i;j<=6;j++){
                DaminoStoness[count]=new Damino(i,j);
                count++;
            }
        }
    }



    public void shuffle(){
        CurrentStone=0;
        for (int i=0;i<DaminoStoness.length;i++){
            int j=RandomNumbers.nextInt(NumberofStones);
            Damino temp=DaminoStoness[i];
            DaminoStoness[i]=DaminoStoness[j];
            DaminoStoness[j]=temp;
        }
    }

    public Damino NextStone(){
        if(CurrentStone<28){
            return DaminoStoness[CurrentStone++];
        }
        else{
            return null;
        }
    }

}
