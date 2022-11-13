package exercise;

/**
 * @description:演员类
 * @author: Luck_chen
 * @date: 2022/11/6 20:49
 * @Version 1.0.0.0
 */
public class Actor {
    private String name;

    public Actor(String name) {
        this.name = name;
    }

    public Actor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                '}';
    }
}
