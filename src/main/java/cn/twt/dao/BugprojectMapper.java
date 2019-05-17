package cn.twt.dao;

import cn.twt.entity.Bugproject;

import java.util.List;

public interface BugprojectMapper {
    public List<Bugproject> queryBugprojectAll();       //查询出全部的项目
}
