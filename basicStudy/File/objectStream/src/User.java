import java.io.Serializable;

/**
 * @description://TODO
 * @author: Luck_chen
 * @date: 2022/11/12 19:28
 * @Version 1.0.0.0
 */
public class User implements Serializable {
    //定义序列号
    private static final long SerialVersionUID = 1l;
    private String user;
    //不被序列化
    private transient String password;

    public User() {
    }

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    /**
     * 获取
     * @return user
     */
    public String getUser() {
        return user;
    }

    /**
     * 设置
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "User{user = " + user + ", password = " + password + "}";
    }
}
