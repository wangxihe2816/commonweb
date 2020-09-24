package com.module.commonweb;

import com.module.pojo.Admininfo;
import com.module.service.AdmininfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class adminTest {
    @Autowired
    AdmininfoService admininfoService;


    @Test
    public void adminTest(){
        Admininfo admininfo= admininfoService.selectAdmininfoById(1);
        String a=admininfo.toString();
        System.out.println(a);
    }
}
