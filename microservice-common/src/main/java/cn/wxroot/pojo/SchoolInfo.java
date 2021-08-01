package cn.wxroot.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * 学校基本信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SchoolInfo {

    /**
     * ID
     */
    private String id;

    /**
     * 学校名称
     */
    private String name;

    /**
     * 学校建立时间
     */
//    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time;

    /**
     * 学校LOGO信息
     */
    private String logoInfo;

    /**
     * 学校咨询电话（座机）
     */
    private String landline;

    /**
     * 学校专业列表
     */
    private List<ProfessionInfo> professionInfoList;

    @Override
    public String toString() {
        return "SchoolInfo{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", logoInfo='" + logoInfo + '\'' +
                ", landline='" + landline + '\'' +
                ", professionInfoList=" + professionInfoList +
                '}';
    }
}
