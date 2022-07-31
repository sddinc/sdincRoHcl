package assingmentAccount.day3.EmployeeFilter.MyDataBase;



    public class InvalidSalaryException extends Exception {

        String errorMsg;

        public InvalidSalaryException(String errorMsg) {
            this.errorMsg = errorMsg;
        }

        @Override
        public String toString() {
            return "InvalidSalaryException [errorMsg=" + errorMsg + "]";
        }
    }
