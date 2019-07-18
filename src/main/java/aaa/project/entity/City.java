package aaa.project.entity;

/**
 * 区域
 */
public class City {
    private Integer id;
    private String distr;
    public City() {
    }

    public City(Integer id, String distr) {
        this.id = id;
        this.distr = distr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getdistr() {
        return distr;
    }

    public void setdistr(String distr) {
        this.distr = distr;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", distr='" + distr + '\'' +
                '}';
    }
}
