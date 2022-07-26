package assingmentAccount;

public class day23 {


    public static void main(String[] args) {

        String slang[]={"idiot","stupid"};
        String newWord=" ";
        String str="you are stupid and idiot";
        String arr[]=str.split(" ");

        String str1="";
        for (int i = 0; i < arr.length; i++) {
            for (String s : slang) {

                if (arr[i].equals(s)) {
                    newWord = newWord + " " + "*";
                    if((arr.length>i)){
                        i++;
                    }


                }
            }
            newWord=newWord+" "+arr[i];


        }

        System.out.println(newWord);
    }
}
