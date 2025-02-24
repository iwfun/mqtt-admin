package com.iwfun.mqtt.admin.core.repository.impl;

import com.baomidou.mybatisplus.extension.repository.CrudRepository;
import com.iwfun.mqtt.admin.core.domain.Tenant;
import com.iwfun.mqtt.admin.core.mapper.TenantMapper;
import com.iwfun.mqtt.admin.core.repository.TenantRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author darin
 */
@Repository
public class TenantRepositoryImpl extends CrudRepository<TenantMapper, Tenant> implements TenantRepository {

    @Override
    public Optional<Tenant> getByUsername(String username) {
        return lambdaQuery().eq(Tenant::getUsername, username).oneOpt();
    }
}
