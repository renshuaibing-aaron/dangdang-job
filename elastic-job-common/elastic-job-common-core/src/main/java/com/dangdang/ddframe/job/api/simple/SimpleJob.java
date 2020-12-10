package com.dangdang.ddframe.job.api.simple;

import com.dangdang.ddframe.job.api.ElasticJob;
import com.dangdang.ddframe.job.api.ShardingContext;

/**
 * 简单分布式作业接口.
 *
 * @author zhangliang
 */
public interface SimpleJob extends ElasticJob {

    /**
     * 执行作业.
     *
     * @param shardingContext 分片上下文
     */
    void execute(ShardingContext shardingContext);
}
