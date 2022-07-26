package assingmentAccount;

public class day24 {

    public static void main(String[] args) {
        int arr[]={12,34,56,33,43,45,78,34,56};
        /*iteration
        * */
        int pos=0;
        int nr=56;

        for (int j : arr) {
            if (nr > j) {
                pos++;

            }
        }
        System.out.println(pos);
    }
}
