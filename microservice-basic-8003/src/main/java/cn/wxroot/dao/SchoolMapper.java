package cn.wxroot.dao;

import cn.wxroot.pojo.SchoolInfo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolMapper {

    List<SchoolInfo> queryAll();
}
