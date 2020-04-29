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
@TableName("t_role_department")
@ApiModel(value = "角色部门")
public class RoleDepartment extends BaseEntity {
    private static final long serialVersionUID = -4629537565295300405L;
    @ApiModelProperty(value = "角色id")
    private String roleId;

    @ApiModelProperty(value = "部门id")
    private String departmentId;
}
