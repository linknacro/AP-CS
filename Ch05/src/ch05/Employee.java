
public class Employee implements Comparable<Employee> {

    int EmpID;
    String Ename;
    double Sal;
    static int i;

    public Employee() {
        EmpID = i++;
        Ename = "dont know";
        Sal = 0.0;
    }

    public Employee(String ename, double sal) {
        EmpID = i++;
        Ename = ename;
        Sal = sal;
    }
    
    public int getID(){
        return EmpID;
    }

    public String toString() {
        return "EmpID " + EmpID + "\n" + "Ename " + Ename + "\n" + "Sal" + Sal;
    }

    public int compareTo(Employee ep) {
        return ep.getID() - this.EmpID;
    }
    
    
}
