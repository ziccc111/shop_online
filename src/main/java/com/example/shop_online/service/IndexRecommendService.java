package com.example.shop_online.service;

import com.example.shop_online.entity.IndexRecommend;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.shop_online.vo.IndexRecommendVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhong
 * @since 2023-11-09
 */
public interface IndexRecommendService extends IService<IndexRecommend> {
    /**
     * 首页-热门推荐
     *
     * @return
     */
    List<IndexRecommendVO> getList();
}
