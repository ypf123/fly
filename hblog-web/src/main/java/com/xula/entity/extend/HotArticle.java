package com.xula.entity.extend;

import lombok.Data;

/**
 * 热门信息
 * @author xla
 */
@Data
public class HotArticle {

    /**
     * 编号
     */
    private  Integer id;

    /**
     * 标题
     */
    private  String title;

    /**
     * 链接
     */
    private  String url;

    /**
     * 消息数
     */
    private  Integer messageNum;


}
