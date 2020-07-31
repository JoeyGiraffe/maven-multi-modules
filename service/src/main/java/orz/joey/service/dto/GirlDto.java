package orz.joey.service.dto;

import java.io.Serializable;

public class GirlDto implements Serializable {
    private static final long serialVersionUID = 601718002773593572L;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GirlDto{" +
                "name='" + name + '\'' +
                '}';
    }
}
