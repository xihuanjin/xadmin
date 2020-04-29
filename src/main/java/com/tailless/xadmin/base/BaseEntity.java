package com.tailless.xadmin.base;

import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.tailless.xadmin.common.constant.CommonConstant;
import com.tailless.xadmin.common.utils.SnowFlakeUtil;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 请填写类注释
 *
 * @author tailless
 * @since 2019/08/15
 */
@Data

public class BaseEntity implements Serializable {

    @TableId
    @ApiModelProperty(value = "唯一标识")
    private String id = String.valueOf(SnowFlakeUtil.getFlowIdInstance().nextId());

    @ApiModelProperty(value = "创建者")
    private String CreateBy;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "创建时间")
    private Data createTime;

    @ApiModelProperty(value = "更新者")
    private String updateBy;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "更新时间")
    private Data updateTime;

    @ApiModelProperty(value = "删除标志 默认0")
    private Integer delFlag = CommonConstant.DELETE_FALSE;
}
