package assingmentAccount.day5.Assigment;

public class test {
    public static void main(String[] args) {

        String str="";
        int x=5;
        StringBuffer sb= new StringBuffer();

        if(x<15)str.concat("java");
                else sb.append("java");
        System.out.println(str+sb);
        System.out.println("--------------");
        String s1=null;
        String s2=null;
        if(s1==s2) System.out.println("A");
        if(s1.equals(s2)) System.out.println("B");

    }
}
