package cn.wxroot.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 教材信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TextbookInfo {

    /**
     * ID
     */
    private String id;

    /**
     * 教材名称
     */
    private String name;

    /**
     * 教材出版社
     */
    private String publishingHouse;

    /**
     * 教材版本
     */
    private String version;

    /**
     * 教材作者
     */
    private String author;

    /**
     * 教材类型
     */
    private String type;

    /**
     * 教材使用状态
     */
    private String useStatus;

    /**
     * 教材开始使用时间
     */
    private String beginTime;

    /**
     * 教材结束使用时间
     */
    private String endTime;
}
