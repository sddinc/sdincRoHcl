package assingmentAccount.day5.Assigment;

public class LoopTest {
    public void doStuff(String arr[]){
        for (String a:arr) {
            if(a.equals("null")){
                System.out.println("an ex");
            }

        }
    }
    public void caller(){
        doStuff(new String[]{"b","null","A"});
    }


    public static void main(String[] args) {
        new LoopTest().caller();

    }
}
