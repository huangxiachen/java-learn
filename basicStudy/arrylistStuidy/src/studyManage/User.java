//升级：用户名、密码、身份证号码、手机号码
package studyManage;

public class User {
    private String uname;
    private String upassw;
    private String identity_id;
    private String phone_id;

    public User() {
    }

    public User(String uname, String upassw, String identity_id, String phone_id) {
        this.uname = uname;
        this.upassw = upassw;
        this.identity_id = identity_id;
        this.phone_id = phone_id;
    }

    /**
     * 获取
     * @return uname
     */
    public String getUname() {
        return uname;
    }

    /**
     * 设置
     * @param uname
     */
    public void setUname(String uname) {
        this.uname = uname;
    }

    /**
     * 获取
     * @return upassw
     */
    public String getUpassw() {
        return upassw;
    }

    /**
     * 设置
     * @param upassw
     */
    public void setUpassw(String upassw) {
        this.upassw = upassw;
    }

    /**
     * 获取
     * @return identity_id
     */
    public String getIdentity_id() {
        return identity_id;
    }

    /**
     * 设置
     * @param identity_id
     */
    public void setIdentity_id(String identity_id) {
        this.identity_id = identity_id;
    }

    /**
     * 获取
     * @return phone_id
     */
    public String getPhone_id() {
        return phone_id;
    }

    /**
     * 设置
     * @param phone_id
     */
    public void setPhone_id(String phone_id) {
        this.phone_id = phone_id;
    }

    public String toString() {
        return "User{uname = " + uname + ", upassw = " + upassw + ", identity_id = " + identity_id + ", phone_id = " + phone_id + "}";
    }
}
