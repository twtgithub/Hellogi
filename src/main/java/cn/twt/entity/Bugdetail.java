package cn.twt.entity;
import java.util.Date;

/**
 * bug详细表
 */
public class Bugdetail {
    private Integer id;             //编号
    private Bugproject bugproject; //项目
    private Integer projectId;     //对应项目表的主键
    private int serverity;         //严重性
    private String title;           //标题
    private String reportUser;     //报告人
    private Date createDate;       //创建时间

    public Bugproject getBugproject() {
        return bugproject;
    }

    public void setBugproject(Bugproject bugproject) {
        this.bugproject = bugproject;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public int getServerity() {
        return serverity;
    }

    public void setServerity(int serverity) {
        this.serverity = serverity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReportUser() {
        return reportUser;
    }

    public void setReportUser(String reportUser) {
        this.reportUser = reportUser;
    }

    public Date getCaeateDate() {
        return createDate;
    }

    public void setCaeateDate(Date caeateDate) {
        this.createDate = caeateDate;
    }
}
