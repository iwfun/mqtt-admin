package com.iwfun.mqtt.admin.core.service.impl;

import com.iwfun.mqtt.admin.core.repository.TenantRepository;
import com.iwfun.mqtt.admin.core.service.TenantService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author darin
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class TenantServiceImpl implements TenantService {
    private final TenantRepository tenantRepository;
}
