package com.w77996.service.impl;

import com.w77996.bean.MenuVo;
import com.w77996.result.CodeMsg;
import com.w77996.result.Result;
import com.w77996.service.PermissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Mr.Yangxiufeng
 * Date: 2018-06-13
 * Time: 11:14
 */
@Slf4j
@Service
public class PermissionServiceImpl implements PermissionService {
    @Override
    public Result<List<MenuVo>> getRolePermission(Integer roleId) {
        log.info("调用{}失败","getRolePermission");
        return Result.error(CodeMsg.ERROR,"调用getRolePermission失败");
    }
}
