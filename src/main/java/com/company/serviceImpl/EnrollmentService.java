/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.serviceImpl;

import com.company.bean.EnrollmentBean;
import com.company.serviceInterface.EnrollmentInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 *
 * @author P0007
 */

public class EnrollmentService implements EnrollmentInterface{
    
    static HashMap<Integer,EnrollmentBean> map = new HashMap<>();
    static final Logger log = LogManager.getLogger(EnrollmentService.class.getName());
    
    @Override
    public List<EnrollmentBean> getEnrollResponse() {
        log.entry();
        log.error("debug for test");
        List<EnrollmentBean> List = new ArrayList<>(map.values());
        return List;
    }
    
    @Override
    public EnrollmentBean sentEnrollment(EnrollmentBean enroll) {
        log.entry();
        log.error("debug sentEnrollment");
        log.error("debug "+enroll.getMerchantId());
        enroll.setAuthenticationStatus("Dummy_Test");
        enroll.setCAVV("Dummy_Test");
        enroll.setECI("Dummy_Test");
        enroll.setXID("Dummy_Test");
        map = new HashMap();
        map.put(1,enroll);
        List<EnrollmentBean> List = new ArrayList<>(map.values());
        return enroll;
    }

}
