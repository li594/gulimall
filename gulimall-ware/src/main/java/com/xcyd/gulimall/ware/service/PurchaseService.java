package com.xcyd.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xcyd.common.utils.PageUtils;
import com.xcyd.gulimall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author xcyd
 * @email xcyd@gmail.com
 * @date 2023-07-25 12:48:34
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

