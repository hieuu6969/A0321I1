package controllers;

import model.MailSetting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import static model.MailSettingDAO.*;

@Controller
public class MailSettingController {

    @GetMapping("settings")
    public ModelAndView setting() {
        ModelAndView modelAndView = new ModelAndView("settingForm", "mailSetting", mailSetting);
        return modelAndView;
    }

    @PostMapping("settings/update")
    public ModelAndView updateSetting(@ModelAttribute("mailSetting") MailSetting mailSetting) {
        ModelAndView modelAndView = new ModelAndView("settingForm");
        modelAndView.addObject("mailSetting", mailSetting);
        modelAndView.addObject("message","Updated Successfully");
        return modelAndView;
    }
}
