package assingmentAccount;

public class day21 {

    private String employees[] = {"101001011","102001022","103002011","104003080","105002020","106002080"};
    public static void main(String[] args) {

        String employees[] = {"101001011","102001022","103002011","104003080","105002020","106002080"};

        for (String w:employees) {
           // System.out.println(w);
           // System.out.println(w.substring(6));
            if(w.substring(6).equals("011")){
                System.out.println("Delhi ");
            }else if(w.substring(6).equals("022")){
                System.out.println("Mumbai  ");
            }else if(w.substring(6).equals("080")){
                System.out.println("Banglore ");
            }else{
                System.out.println("Pune ");
            }
        }

    /*
     * Note : employee codes are designed in following way:
     * a) first 3 digits are employee code
     * b) next 3 digits are related to their department id.
     * c) and last 3 digits are the city code of their work location
     *     for example
     *       011 : Delhi
     *       022 : Mumbai
     *       080 : Banglore
     *       020 : Pune
     * */

    }
    public String[] getEmployeeCodes()
    {
        String codes[] = new String[employees.length];
        int count = -1;
        for (String empid : employees) {
            codes[++count] = empid.substring(0, 3);
        }

        return codes;
    }

}
