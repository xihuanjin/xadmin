package com.tailless.xadmin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.tailless.xadmin.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 请填写类注释
 *
 * @author tailless
 * @since 2019/08/15
 */
@Data
@TableName("t_role_permission")
@ApiModel(value = "角色权限")
public class RolePermission extends BaseEntity {
    private static final long serialVersionUID = -6565641052570395097L;
    @ApiModelProperty(value = "角色id")
    private String roleId;

    @ApiModelProperty(value = "权限id")
    private String permissionId;
}
