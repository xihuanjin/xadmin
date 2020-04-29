package com.tailless.xadmin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tailless.xadmin.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * 请填写类注释
 *
 * @author tailless
 * @since 2019/08/19
 */
@Mapper
@Component
public interface UserRoleMapper extends BaseMapper<UserRole> {
}
