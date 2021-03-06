package com.yunzainfo.pitcher.plugin.project.controller.OAManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @Description: 预警消息
 * @Auther: Mr.Bin
 * @create: 2018-04-23 14:34
 */
@Controller
@RequestMapping("/warningMessage")
public class WarningMessageController {

    private static final Logger LOGGER = LoggerFactory.getLogger(WarningMessageController.class);

    /**
     * 进入主页
     * @param request the request
     * @param session the session
     * @param model   the model
     * @return jsp页面路径
     */
    @RequestMapping(method = RequestMethod.GET)
    public String index(HttpServletRequest request, HttpSession session,
                        Model model) {
        return "views/warningMessage/warningMessage";

    }
}
