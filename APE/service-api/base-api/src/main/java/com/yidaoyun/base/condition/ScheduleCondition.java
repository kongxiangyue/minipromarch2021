package com.yidaoyun.base.condition;

import lombok.Data;
import lombok.experimental.Accessors;
import org.apache.commons.lang3.StringUtils;

@Data
@Accessors(chain = true)
public class ScheduleCondition {
    /**
     * id (必传参数)
     */
    private String uuid;
    /**
     * 任务类型 (必传参数，uncode-single-task 单个任务，目前固定为这个值)
     */
    private String type;
    /**
     * 任务所在类名 (必传参数)
     */
    private String targetBean;
    /**
     * 方法名称 (必传参数)
     */
    private String targetMethod;
    /**
     * 开始时间
     */
    private String  startTime;
    /**
     * 周期 (ms)
     */
    private Integer period;
    /**
     * 结束时间
     */
    private String endTime;
    /**
     * 两次任务之间的间隔，上次任务执行完毕之后多久再执行下次，与period只设置一个即可
     */
    private Integer delay;
    /**
     * 参数
     */
    private String params;
    /**
     * corn表达式
     */
    private String cornExpression;
    /**
     * 结束时停止（默认为false，即任务结束，删除任务，设置为true，结束时只是停止任务）
     */
    private boolean endWithStop;

    /**
     * 验证参数是否已经设置
     * @return Boolean
     */
    public boolean check() {
        return StringUtils.isNotBlank(uuid) &&
                StringUtils.isNotBlank(startTime) &&
                (period != null || StringUtils.isNotBlank(cornExpression) || delay != null) &&
                StringUtils.isNotBlank(endTime) &&
                StringUtils.isNotBlank(targetBean) &&
                StringUtils.isNotBlank(targetMethod);
    }

}
