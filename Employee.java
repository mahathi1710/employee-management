class Employee
{
    int employeeid;
    String employeeName;
    public double salary;
    Employee(int employeeid,String employeeName)
    {
        this.employeeid=employeeid;
        this.employeeName=employeeName;
    }
    public int getEmployeeid()
    {
        return employeeid;
    }
    public void setEmployeeid(int employeeid)
    {
        this.employeeid=employeeid;
    }
public String getEmployeeName()
    {
        return employeeName;
    }
    public void setEmployeeName(String employeeName)
    {
        this.employeeName=employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = Math.round(salary);
        
    }
}
class ContractEmployee extends Employee
{
    double wage;
    float hoursWorked;

    ContractEmployee(int employeeid, String employeeName,double wage,float hoursWorked) {
        super(employeeid, employeeName);
        this.wage=wage;
        this.hoursWorked=hoursWorked;
    }
    public void calculateSalary()
    {
        setSalary(getHoursWorked()*getWage());

    }
public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
    public float getHoursWorked()
    {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}

class PermanentEmployee extends Employee
{
    double basicPay,hra;
    public float experience;
    PermanentEmployee(int employeeid, String employeeName,double basicPay,double hra,float experience) {
        super(employeeid, employeeName);
        this.basicPay=basicPay;
        this.hra=hra;
        this.experience=experience;
    }
public void calculateMonthlySalary()
    {
        double a=0,b;
        if(getExperience()<3) {
            a = 0;
        }
        else if(getExperience()>=3 && getExperience()<5) {
            a = 5;
        }
        else if(getExperience()>=5 && getExperience()<=7) {
            a = 7;
        }
        else if (getExperience()>10) {
            a = 12;
        }
        b=getBasicPay()*(a/100);
setSalary((float)(b+getBasicPay()+getHra()));
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getHra() {
        return hra;
    }
public void setHra(double hra)
    {
        this.hra=hra;
    }

    public float getExperience()
    {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }
}
public class pbl {
    public static void main(String[] args) {
        PermanentEmployee object1 = new PermanentEmployee(711211, "Rafael", 1855, 115, 3.5f);
        object1.calculateMonthlySalary();
        System.out.println("Hi "+object1.employeeName+", "+"your salary is $"+object1.salary);
        ContractEmployee object2=new ContractEmployee(102,"Jennifer",16,90);
        object2.calculateSalary();
        System.out.println("Hi "+object2.employeeName+", "+"your salary is $"+object2.getSalary());
  }
}