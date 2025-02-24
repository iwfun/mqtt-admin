package com.iwfun.mqtt.admin.core.repository;

import com.baomidou.mybatisplus.extension.repository.IRepository;
import com.iwfun.mqtt.admin.core.domain.Tenant;

import java.util.Optional;

/**
 * @author darin
 */
public interface TenantRepository extends IRepository<Tenant> {
    Optional<Tenant> getByUsername(String username);
}
