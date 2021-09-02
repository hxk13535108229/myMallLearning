package com.hxk.mall.tiny.nosql.elasticsearch.document;

/**
 * @ClassName EsProductAttributeValue
 * @Description TODO
 * @Author OvO
 * @Date 2021-09-02 17:30
 * @Version 1.0
 **/

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * 搜索商品的属性信息
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class EsProductAttributeValue {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long productAttributeId;
    //属性值
    @Field(type = FieldType.Keyword)
    private String value;
    //属性参数：0->规格；1->参数
    private Integer type;
    //属性名称
    @Field(type=FieldType.Keyword)
    private String name;
}
