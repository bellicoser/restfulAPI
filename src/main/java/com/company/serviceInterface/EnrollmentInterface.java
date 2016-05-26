/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.serviceInterface;

import com.company.bean.EnrollmentBean;
import java.util.List;

/**
 *
 * @author P0007
 */
public interface EnrollmentInterface {
    public List<EnrollmentBean> getEnrollResponse();
    public EnrollmentBean sentEnrollment(EnrollmentBean enroll);
}
