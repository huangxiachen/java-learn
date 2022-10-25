/**
 * 属性：编号，姓名
 * 行为：其负责的工作
 */
package extendStudy01;

public class Employee {
    private String id;
    private String name;


    public Employee() {
    }

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Employee{id = " + id + ", name = " + name + "}";
    }

    //工作
    public void work(){
        System.out.println("员工在工作");
    }
}
