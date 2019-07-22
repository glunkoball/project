package aaa.project.common;

import java.util.List;

/**
 * 封装分页数据
 */
public class PageModel<T> {
    //数据的总条数
    private Integer total;

    //分页数据
    private List<T> rows;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
