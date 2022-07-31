package assingmentAccount.day5.week1CoreJava;

public class MainRunner  {

	/*
	 *   Requirement (to be done by stream API only )
	 *   1. Update email on the basis of accountNumber
	 *   2. display Account based on maximum sumAssuredAmount
	 *   3. update premium amount of all medical policies by 10%
	 *   4. filter accounts based on following
	 *      4.a) state and policyname
	 *      4.b) state and premiumAmount (higher than certain amount) and total balance
	 *   5. count accounts where premium date is over
	          Note :- use setter method to Set premium date
			     LocalDate.of()  // is used to create date
				 LocalDate.now() // is used to get current date
	 *   6. Store account's email in a Set<String> where policy is null
	 *
	 *   Note:- Add couple of more records based on requirement
	 * */




    public static void main(String[] args) {
/*
        Policy p1 = new Policy(new Random().nextInt(6000),"Medical Policy-1",2000,1500000);
        Policy p2 = new Policy(new Random().nextInt(6000),"Car Policy-1",2000,1500000);
        Policy p3 = new Policy(new Random().nextInt(6000),"Medical Policy-2",2500,1800000);
        Policy p4 = new Policy(new Random().nextInt(6000),"Term Policy-1",2000,15000000);

        ContactDetails c1 = new ContactDetails("123-New Delhi","Delhi",1212122,"abc@gmail.com");
        ContactDetails c2 = new ContactDetails("454-New Delhi","Delhi",45412122,"xyz@gmail.com");
        ContactDetails c3 = new ContactDetails("A1-Gurgoan","Delhi-NCR",45412122,"a@gmail.com");
        ContactDetails c4 = new ContactDetails("A2-Gurgoan","Delhi-NCR",45412122,"b@gmail.com");


        Account a1= addAccount("Ramesh", Arrays.asList(p1,p2,p3), 5000, c1);
        Account a2=addAccount("Mike", Arrays.asList(p1,p4), 15000, c2);
        Account a3=addAccount("Kirti", Arrays.asList(p1), 25000, c3);
        Account a4=addAccount("Ajay", Arrays.asList(p1,p4), 17000, c4);

/*

        List<Account> allAccount = Arrays.asList(a1,a2,a3,a4);


        allAccount.stream().filter((a)-> {
            return (a.getBalance() > 10000) ? true : false
        }).map(a)->{
            return a1.getPolicies();
        }).forEach((p)->{
            System.out.println(p.get);

        }

        }}
        });


/*
        Stream<String> stream = Stream.of(c1.email);
        int emailList = stream.min(new Comparator<String>() {

            @Override
            public String compare(String obj) {

                return obj;
            }

        }).get();

        System.out.println(emailList);
*/





    }
    /*
    public  static Account addAccount(String name, List<Policy> policyList, int balance, ContactDetails contactDetails)
    {

        Account a = new Account();
        a.setAccountHolderName(name);
        a.setBalance(balance);
        a.setPolicies(policyList);
        a.setContactDetails(contactDetails);


        return a;
    }
*/
}