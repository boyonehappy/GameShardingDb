package com.snowcattle.game.db.service.jdbc.service.impl;

import com.snowcattle.game.db.common.annotation.AsyncEntityServiceSave;
import com.snowcattle.game.db.service.entity.EntityService;
import com.snowcattle.game.db.service.jdbc.entity.MoreOrder;
import com.snowcattle.game.db.service.jdbc.service.IMoreOrderService;
import com.snowcattle.game.db.sharding.EntityServiceShardingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jiangwenping on 17/4/5.
 */
@Service
@AsyncEntityServiceSave
public class MoreOrderService extends EntityService<MoreOrder> implements IMoreOrderService {
    @Override
    public EntityServiceShardingStrategy getEntityServiceShardingStrategy() {
        return getDefaultEntityServiceShardingStrategy();
    }

    @Override
    public List<MoreOrder> getOrderList(MoreOrder moreOrder) {
        return getEntityList(moreOrder);
    }

    @Override
    public void insertOrderList(List<MoreOrder> orderList) {
         insertEntityBatch(orderList);
    }
}
