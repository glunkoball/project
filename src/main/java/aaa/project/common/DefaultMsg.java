package aaa.project.common;

/**
 * 默认返回的信息实体类
 */
public class DefaultMsg {

    private Integer success = 1;
    private String error;

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
