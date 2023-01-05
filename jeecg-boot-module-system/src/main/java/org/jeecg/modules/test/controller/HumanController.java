package org.jeecg.modules.test.controller;

import cn.hutool.core.util.RandomUtil;
import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.exceptions.ClientException;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.constant.CacheConstant;
import org.jeecg.common.constant.CommonConstant;
import org.jeecg.common.constant.SymbolConstant;
import org.jeecg.common.system.util.JwtUtil;
import org.jeecg.common.system.vo.LoginUser;
import org.jeecg.common.util.*;
import org.jeecg.common.util.encryption.EncryptedString;
import org.jeecg.modules.base.service.BaseCommonService;
import org.jeecg.modules.system.entity.SysDepart;
import org.jeecg.modules.system.entity.SysRoleIndex;
import org.jeecg.modules.system.entity.SysTenant;
import org.jeecg.modules.system.entity.SysUser;
import org.jeecg.modules.system.model.SysLoginModel;
import org.jeecg.modules.system.service.*;
import org.jeecg.modules.system.service.impl.SysBaseApiImpl;
import org.jeecg.modules.system.util.RandImageUtil;
import org.jeecg.modules.test.enums.WorkTypeEnum;
import org.jeecg.modules.test.service.IhumanService;
import org.jeecg.modules.test.strategy.factory.HumanFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * @Author scott
 * @since 2018-12-17
 */
@RestController
@RequestMapping("/human")
@Api(tags="人类")
@Slf4j
public class HumanController {

	@Resource
	private  HumanFactory humanFactory;

	/**
	 * 干工作
	 * @return
	 */
	@GetMapping("doWork")
	@ApiOperation("干工作")
	public Result doWork() {
		Result result = new Result<>();
		IhumanService humanService = humanFactory.getHumanFactory(WorkTypeEnum.DRINK);
		humanService.sleep(new Date());
		IhumanService humanService1 = humanFactory.getHumanFactory(WorkTypeEnum.GETCHILD);
		humanService1.sleep(new Date());
		result.setResult(null);
		return result;
	}



}
