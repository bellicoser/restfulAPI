/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.controller;

/**
 *
 * @author P0007
 */
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.company.bean.EnrollmentBean;
import com.company.serviceImpl.EnrollmentService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Request;

@Path("/enrollment")
public class EnrollmentController {

    EnrollmentService service = new EnrollmentService();
     
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<EnrollmentBean> getEnrollRsesponse() {
        System.out.println("GET METHOD FOR TEST"); 
        return service.getEnrollResponse();
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    @Produces(MediaType.APPLICATION_JSON)
    public EnrollmentBean sentEnrollment(EnrollmentBean bean) {
        System.out.println("POST METHOD JSON/XML Consumes");
        return service.sentEnrollment(bean);
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public EnrollmentBean post(MultivaluedMap<String, String> formParams) {
        System.out.println("POST METHOD FORM Consumes");
        EnrollmentBean bean = new EnrollmentBean();
        System.out.println("merchantId = "+formParams.get("merchantId"));
        bean.setMerchantId(formParams.getFirst("merchantId"));
        bean.setPassword(formParams.getFirst("password"));
        bean.setCardNumber(formParams.getFirst("cardNumber"));
        bean.setCardExp(formParams.getFirst("cardExp"));
        bean.setCardSecurityCode(formParams.getFirst("cardSecurityCode"));
        bean.setUserAgent(formParams.getFirst("userAgent"));
        bean.setTermURL(formParams.getFirst("termURL"));
        bean.setAmount(formParams.getFirst("amount"));
        bean.setCurrency(formParams.getFirst("currency"));
        return service.sentEnrollment(bean);
    }
     

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public EnrollmentBean sentEnrollmentPUT(EnrollmentBean bean) {
        service.sentEnrollment(bean);
        return bean;
    }
    
    /////request validation 
    public void requestvalidation(EnrollmentBean bean){
       
    }

}
