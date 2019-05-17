package cn.twt.service;

import cn.twt.entity.Bugdetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BugdetailService {
    public List<Bugdetail> queryBugdetailList(Integer projectId);           //按项目查询Bug详细表
    public int insertBugdetail(Bugdetail bugdetail);                        //增加Bug详细
}
