package com.tailless.xadmin.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.tailless.xadmin.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 请填写类注释
 *
 * @author tailless
 * @since 2019/08/19
 */
@Data
@TableName("t_user_role")
@ApiModel(value = "用户角色")
public class UserRole extends BaseEntity {

    private static final long serialVersionUID = -5525585684470896125L;

    @ApiModelProperty(value = "用户唯一id")
    private String userId;

    @ApiModelProperty(value = "角色唯一id")
    private String roleId;

    @TableField(exist=false)
    @ApiModelProperty(value = "角色名")
    private String roleName;
}
