package com.tailless.xadmin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tailless.xadmin.entity.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 请填写类注释
 *
 * @author tailless
 * @since 2019/08/21
 */
@Mapper
@Component
public interface PermissionMapper extends BaseMapper<Permission> {
}
