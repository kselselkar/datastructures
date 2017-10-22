package trees.ref;

public class TowersOfHanoi {

    void move(int numberOfDiscs,char from,char to,char inter){
        if(numberOfDiscs == 1){
            System.out.println("Moved disk " + numberOfDiscs + " from " + from + " to " + to );
        }
        else{
            move(numberOfDiscs-1,from,inter,to);
            System.out.println("Moved disk " + numberOfDiscs + " from " + from + " to " + to );
            move(numberOfDiscs-1,inter,to,from);
            System.out.println();
        }

    }
    public void strRec(String s) {
        if (s.length() < 5)
            System.out.println(s);
        strRec(s + "*");
    }
    public static void main(String[] args) {

        TowersOfHanoi th=new TowersOfHanoi();
       // th.move(4,'A','C','B');
        th.strRec("a");

    }

}
