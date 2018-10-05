package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

public interface SuccessKilledDao {
    /**
     * 插入购买明细，可过滤重复
     * @param seckillId
     * @param userPhone
     * @return s
     * 插入行数
     */
    int insertSuccessKilled(long seckillId, long userPhone);

    /**
     * 根据id查询SuccessKilled并携带秒杀 产品对象实体
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill (long seckillId);
}
