package cn.twt.service;

import cn.twt.dao.BugprojectMapper;
import cn.twt.entity.Bugproject;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BugprojectServiceImpl implements BugprojectService {

    @Resource
    private BugprojectMapper bugprojectMapper;

    @Override
    public List<Bugproject> queryBugprojectAll() {
        return bugprojectMapper.queryBugprojectAll();
    }
}
