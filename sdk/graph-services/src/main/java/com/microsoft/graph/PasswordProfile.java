/*******************************************************************************
 Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
 Licensed under the MIT or Apache License; see LICENSE in the source repository
 root for authoritative license information.﻿

 **NOTE** This code was generated by a tool and will occasionally be
 overwritten. We welcome comments and issues regarding this code; they will be
 addressed in the generation tool. If you wish to submit pull requests, please
 do so for the templates in that tool.

 This code was generated by Vipr (https://github.com/microsoft/vipr) using
 the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).
 ******************************************************************************/
package com.microsoft.graph;

import com.microsoft.services.orc.ODataBaseEntity;


/**
 * The type Password Profile.
*/
public class PasswordProfile extends ODataBaseEntity {

    public PasswordProfile(){
        setODataType("#Microsoft.Graph.PasswordProfile");
    }

    private String password;

    /**
    * Gets the password.
    *
    * @return the String
    */
    public String getpassword() {
        return this.password; 
    }

    /**
    * Sets the password.
    *
    * @param value the String
    */
    public void setpassword(String value) { 
        this.password = value;
        valueChanged("password", value);

    }

    private Boolean forceChangePasswordNextLogin;

    /**
    * Gets the force Change Password Next Login.
    *
    * @return the Boolean
    */
    public Boolean getforceChangePasswordNextLogin() {
        return this.forceChangePasswordNextLogin; 
    }

    /**
    * Sets the force Change Password Next Login.
    *
    * @param value the Boolean
    */
    public void setforceChangePasswordNextLogin(Boolean value) { 
        this.forceChangePasswordNextLogin = value;
        valueChanged("forceChangePasswordNextLogin", value);

    }
}
