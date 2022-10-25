

package arrayObject02;

import java.util.Scanner;

public class Good {
    private int id;
    private String gName;
    private double price;
    private long  repertory;

    public Good() {
    }

    public Good(int id, String gName, double price, long repertory) {
        this.id = id;
        this.gName = gName;
        this.price = price;
        this.repertory = repertory;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return gName
     */
    public String getGName() {
        return gName;
    }

    /**
     * 设置
     * @param gName
     */
    public void setGName(String gName) {
        this.gName = gName;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return repertory
     */
    public long getRepertory() {
        return repertory;
    }

    /**
     * 设置
     * @param repertory
     */
    public void setRepertory(long repertory) {
        this.repertory = repertory;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", gName='" + gName + '\'' +
                ", price=" + price +
                ", repertory=" + repertory;
    }

}
