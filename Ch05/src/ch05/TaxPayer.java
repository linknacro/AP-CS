
public class TaxPayer {

    int IDnumber;
    String Ename;
    double Income;
    static int i;

    public TaxPayer() {
        IDnumber = i++;
        Ename = "dont know";
        Income = 0.0;
    }

    public TaxPayer(String ename, double sal) {
        IDnumber = i++;
        Ename = ename;
        Income = sal;
    }
    
    public int getID(){
        return IDnumber;
    }
    
    public int compareTo(TaxPayer tp){
        return this.IDnumber - tp.getID();
    }

    public String toString() {
        return "Tax ID Number: " + IDnumber + "\n" + "Ename " + Ename + "\n" + "Income" + Income;
    }

}
