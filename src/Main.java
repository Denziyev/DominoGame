public class Main {
    public static void main(String[] args) {


         DaminoStones daminoStones=new DaminoStones();
         daminoStones.shuffle();
         System.out.println();
         for(int i=1;i<=28;i++){
             System.out.print(daminoStones.NextStone().toString());
             System.out.print("     |     ");
             if(i%4==0){
                 System.out.println();
             }
         }
    }
}