/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

/**
 *
 * @author human
 */
public class Worker {

    private int id;
    private String name;
    private Double salary;

    public Worker(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        return 76 * 12 * id; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() == Worker.class) {
            Worker w = (Worker) obj;
            
            if (w.id == this.id) {
                return true;
            }
        }

        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Worker{" + "name=" + name + ", salary=" + salary + '}';
    }
}
