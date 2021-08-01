package cn.wxroot.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 科目信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Subject {

    /**
     * ID
     */
    private String id;

    /**
     * 科目名称
     */
    private String name;

    /**
     * 科目代码
     */
    private String code;

    /**
     * 科目性质
     */
    private String natural;

    /**
     * 科目考核方式
     */
    private String assessmentMethod;

    /**
     * 科目学分
     */
    private String score;

    /**
     * 科目教材信息
     */
    private List<TextbookInfo> textbookInfoList;
}
