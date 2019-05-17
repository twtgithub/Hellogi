package cn.twt.service;

import cn.twt.dao.BugdetailMapper;
import cn.twt.entity.Bugdetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BugdetailServiceImpl implements BugdetailService {

    @Resource
    private BugdetailMapper bugdetailMapper;

    @Override
    public List<Bugdetail> queryBugdetailList(Integer projectId) {
        return bugdetailMapper.queryBugdetailList(projectId);
    }

    @Override
    public int insertBugdetail(Bugdetail bugdetail) {
        return bugdetailMapper.insertBugdetail(bugdetail);
    }
}
