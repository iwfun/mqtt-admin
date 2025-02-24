package com.iwfun.mqtt.admin.core.service.impl;

import com.iwfun.mqtt.admin.core.config.AdminProperties;
import com.iwfun.mqtt.admin.core.enums.Role;
import com.iwfun.mqtt.admin.core.repository.TenantRepository;
import com.iwfun.mqtt.admin.core.service.AdminDetailsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author darin
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class AdminDetailsServiceImpl implements AdminDetailsService {
    private final AdminProperties adminProperties;
    private final TenantRepository tenantRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (StringUtils.equals(username, adminProperties.getUsername())) {
            return User.builder()
                    .username(adminProperties.getUsername())
                    .password("{noop}" + adminProperties.getPassword())
                    .roles(Role.Admin.name().toUpperCase())
                    .build();
        }

        var tenant = tenantRepository.getByUsername(username);
        if (tenant.isPresent()) {
            return User.builder()
                    .username(tenant.get().getUsername())
                    .password(tenant.get().getPassword())
                    .roles(Role.Tenant.name().toUpperCase())
                    .build();
        } else {
            throw new UsernameNotFoundException("用户名或密码错误");
        }
    }
}
