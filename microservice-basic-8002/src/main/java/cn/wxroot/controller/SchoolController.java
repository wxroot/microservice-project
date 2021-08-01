package cn.wxroot.controller;

import cn.wxroot.dao.SchoolMapper;
import cn.wxroot.pojo.SchoolInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/school")
@RestController
public class SchoolController {

    @Autowired
    private SchoolMapper schoolMapper;

    @GetMapping("/lists")
    public List<SchoolInfo> lists() {

        return schoolMapper.queryAll();
    }
}
