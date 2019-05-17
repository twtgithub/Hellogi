package cn.twt.controller;

import cn.twt.entity.Bugdetail;
import cn.twt.service.BugdetailService;
import cn.twt.service.BugprojectService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/bug")
public class BugdetailController {

    @Resource
    private BugdetailService bugdetailService;

    @Resource
    private BugprojectService bugprojectService;

    @RequestMapping("/list")
    public String BugdetailList(@RequestParam(value = "bugpro",required = false) Integer projectId,
                                @RequestParam(value = "resultSu",required = false)String resultSu, Model model){
        model.addAttribute("pro",bugprojectService.queryBugprojectAll());
        model.addAttribute("buglist",bugdetailService.queryBugdetailList(projectId));
        model.addAttribute("projectId",projectId);
        if (resultSu!=null&&!resultSu.equals("")){
            model.addAttribute("resultSu",resultSu);
        }
        return "/BugdetailList";
    }

    @RequestMapping("/toins")
    public String toins(Model model,@RequestParam(value = "resultRe",required = false)String resultRe){
        model.addAttribute("pro",bugprojectService.queryBugprojectAll());
        model.addAttribute("buglist",bugdetailService.queryBugdetailList(0));
        if (resultRe!=null&&!resultRe.equals("")){
            model.addAttribute("resultRe",resultRe);
        }
        return "/InsBugdetail";
    }

    @RequestMapping("/ins")
    public String ins(Bugdetail bugdetail,Model model){
        bugdetail.setCaeateDate(new Date());
        if (bugdetailService.insertBugdetail(bugdetail)>0){
            model.addAttribute("resultSu","添加成功！");
            return "redirect:/bug/list";
        }
        model.addAttribute("resultRe","添加失败！");
        return "redirect:/bug/toins";
    }
}
