package model;

import java.util.ArrayList;
import java.util.List;

public class MailSettingDAO {
    public static MailSetting mailSetting;
    static {
        mailSetting = new MailSetting("English",25,false,"Thor");
    }
}
