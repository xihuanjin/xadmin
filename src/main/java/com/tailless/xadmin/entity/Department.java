package com.tailless.xadmin.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.tailless.xadmin.base.BaseEntity;
import com.tailless.xadmin.common.constant.CommonConstant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 请填写类注释
 *
 * @author tailless
 * @since 2019/08/15
 */
@Data
@TableName("t_department")
@ApiModel(value = "部门")
public class Department extends BaseEntity {

    private static final long serialVersionUID = -387560464323975513L;

    @ApiModelProperty(value = "部门名称")
    private String title;

    @ApiModelProperty(value = "父id")
    private String parentId;

    @ApiModelProperty(value = "是否为父节点(含子节点) 默认false")
    private Boolean isParent = false;

    @ApiModelProperty(value = "排序值")
    private Integer sortOrder;

    @ApiModelProperty(value = "是否禁用 0启用 1禁用")
    private Integer status = CommonConstant.STATUS_ENABLE;

    @TableField(exist=false)
    @ApiModelProperty(value = "父节点名称")
    private String parentTitle;

    @TableField(exist=false)
    @ApiModelProperty(value = "主负责人")
    private List<String> mainHeader;

    @TableField(exist=false)
    @ApiModelProperty(value = "副负责人")
    private List<String> viceHeader;
}
