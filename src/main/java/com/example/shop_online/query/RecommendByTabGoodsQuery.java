package com.example.shop_online.query;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * author：zhong
 * Date：2023/11/11 14:56
 */
@Data
public class RecommendByTabGoodsQuery extends Query {
    @Schema(description = "分类 tabId")
    private Integer subType;
}
