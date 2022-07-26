package assingmentAccount;

public class day22 {
    public static void main(String[] args) {

        String emails[] = {

                "ramesh@gmail.com",
                "rakesh@outlook.com",
                "lokesh@linkedin.com",
                "mahesh@gmail.com",
                "ganesh@gmail.com",
                "rajesh@outlook.com"
        };


            /*
             * Write the code to count the number of users in particular 			domain
             * for example
             * gmail has 3 users
             * outlook has 2 users
             * linkedin has 1 user
             *
             * HINT : use endsWith() of String class
             * */
            int cntGmail=0;
            int cntLinkedin=0;
            int cntOutlook=0;
            for (String w:emails) {
                if(w.endsWith("gmail.com")){
               cntGmail++;
                }else if(w.endsWith("outlook.com")){
                    cntOutlook++;
                }else if(w.endsWith("linkedin.com")){
                    cntLinkedin++;

                }else {
                    System.out.println("0");
                }

            }
        System.out.println("gmail="+cntGmail);
        System.out.println("outlook="+cntOutlook);
        System.out.println("linkedin="+cntLinkedin);

    }
}
