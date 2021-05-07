package com.example.manytomanyemailverificationwithtoken.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "mail")
public class MailProperties {
    public static class SMTP{
        String host;
        String port;
        String username;
        String password;
        public String getHost(){return host;}
        public void setHost(String host){this.host = host;}
        public String getPort(){return port;}
        public void setPort(String port){this.port = port;}
        public String getUsername(){return username;}
        public void setUsername(String username){this.username = username;}
        public String getPassword(){return password;}
        public void setPassword(String password){this.password = password;}
    }
    private SMTP smtp;
    private String form;
    private String formName;
    private String verificationapi;

    public SMTP getSmtp() {
        return smtp;
    }
    public void setSmtp(SMTP smtp){this.smtp = smtp;}
    public String getForm(){return form;}
    public void setForm(String form){this.form = form;}
    public String getFormName(){return formName;}
    public void setFormName(String formName){this.formName = formName;}
    public String getVerificationapi(){return verificationapi;}
    public void setVerificationapi(String verificationapi){this.verificationapi = verificationapi;}
}
