package com.w77996.service.impl;

import com.w77996.service.PermissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.CollectionUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * desc 权限信息查看
 * 2018-8-18 19:51:50
 * @author hhl
 */
@Service("permissionService")
@Slf4j
public class PermissionServiceImpl implements PermissionService {

    /**
     * 可以做URLs匹配，规则如下
     *
     * ？匹配一个字符
     * *匹配0个或多个字符
     * **匹配0个或多个目录
     * 用例如下
     */

    private AntPathMatcher antPathMatcher = new AntPathMatcher();

    @Override
    public boolean hasPermission(HttpServletRequest request, Authentication authentication) {
        Object principal = authentication.getPrincipal();
        String requestUrl = request.getRequestURI();
        log.info("requestUrl:{}",requestUrl);
        List<SimpleGrantedAuthority> grantedAuthorityList = (List<SimpleGrantedAuthority>) authentication.getAuthorities();
        boolean hasPermission = false;

        if (principal != null){
            if (CollectionUtils.isEmpty(grantedAuthorityList)){
                return hasPermission;
            }
            for (SimpleGrantedAuthority authority:grantedAuthorityList
                 ) {
                if (antPathMatcher.match(authority.getAuthority(),requestUrl)){
                    hasPermission = true;
                    break;
                }
            }
        }
        return hasPermission;
    }
}
