package cn.wxroot.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 专业信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfessionInfo {

    /**
     * ID
     */
    private String id;

    /**
     * 专业名称
     */
    private String name;

    /**
     * 专业开设时间
     */
    private String time;

    /**
     * 专业介绍
     */
    private String introduction;
}
