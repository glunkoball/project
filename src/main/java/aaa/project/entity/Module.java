package aaa.project.entity;

import java.util.List;

public class Module {
    private Integer id;
    private String name;
    private String url;
    private Integer slevel;
    private Module parent;
    private List<Module> children;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSlevel() {
        return slevel;
    }

    public void setSlevel(Integer slevel) {
        this.slevel = slevel;
    }

    public Module getParent() {
        return parent;
    }

    public void setParent(Module parent) {
        this.parent = parent;
    }

    public List<Module> getChildren() {
        return children;
    }

    public void setChildren(List<Module> children) {
        this.children = children;
    }
}
