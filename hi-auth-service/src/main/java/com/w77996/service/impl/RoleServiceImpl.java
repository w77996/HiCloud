package com.w77996.service.impl;

import com.w77996.bean.RoleVo;
import com.w77996.result.CodeMsg;
import com.w77996.result.Result;
import com.w77996.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Mr.Yangxiufeng
 * Date: 2018-06-13
 * Time: 11:06
 */
@Service
@Slf4j
public class RoleServiceImpl implements RoleService {
    @Override
    public Result<List<RoleVo>> getRoleByUserId(Integer userId) {
        log.info("调用{}失败","getRoleByUserId");
        return Result.error(CodeMsg.ERROR,"调用getRoleByUserId失败");
    }
}
