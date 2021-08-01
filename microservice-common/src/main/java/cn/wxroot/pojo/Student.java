package cn.wxroot.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    /**
     * ID
     */
    //自动生成主键
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 出生日期
     */
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:sss")
    private Date birthday;

    /**
     * 备注
     */
    private String description;
}
