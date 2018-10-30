package com.w77996.endpoint;

import com.w77996.result.CodeMsg;
import com.w77996.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.endpoint.FrameworkEndpoint;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * token信息移除
 * 2018-8-18 19:51:50
 * @author w77996
 */
@FrameworkEndpoint
public class RevokeTokenEndpoint {
    @Autowired
    private ConsumerTokenServices consumerTokenServices;

    @RequestMapping(value = "/oauth/token", method= RequestMethod.DELETE)
    public @ResponseBody
    Result revokeToken(@RequestParam String remove_token){
        CodeMsg msg = null;
        if (consumerTokenServices.revokeToken(remove_token)){
            msg = new CodeMsg(200,"success");

        }else {
            msg = new CodeMsg(-100,"error");
        }
        return Result.success(msg);
    }
}
