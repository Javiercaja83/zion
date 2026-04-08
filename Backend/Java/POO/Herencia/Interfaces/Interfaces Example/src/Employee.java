public class Employee implements java.lang.Comparable<Employee>{
    String name;
    double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    
    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public double getSalary() {
        return salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }



    // El metodo compareTo compara la edad de dos empleados y devuelve un entero que indica su orden relativo.
    // Si el resultado es negativo, significa que el empleado actual es menor que el otro empleado.
    // Si el resultado es positivo, significa que el empleado actual es mayor que el otro empleado
}
