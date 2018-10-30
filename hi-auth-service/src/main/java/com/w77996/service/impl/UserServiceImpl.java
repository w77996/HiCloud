package com.w77996.service.impl;

import com.w77996.bean.UserVo;
import com.w77996.result.CodeMsg;
import com.w77996.result.Result;
import com.w77996.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Mr.Yangxiufeng
 * Date: 2018-06-13
 * Time: 10:56
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Override
    public Result<UserVo> findByUsername(String username) {
        log.info("调用{}失败","findByUsername");
        return Result.error(CodeMsg.ERROR,"调用findByUsername接口失败");
    }
}
