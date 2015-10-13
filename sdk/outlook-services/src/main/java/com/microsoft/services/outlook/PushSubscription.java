/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.outlook;





/**
 * The type Push Subscription.
*/
public class PushSubscription extends Subscription {

    public PushSubscription(){
        setODataType("#Microsoft.OutlookServices.PushSubscription");
    }
            
    private String CallbackURL;
     
    /**
    * Gets the Callback URL.
    *
    * @return the String
    */
    public String getCallbackURL() {
        return this.CallbackURL; 
    }

    /**
    * Sets the Callback URL.
    *
    * @param value the String
    */
    public void setCallbackURL(String value) { 
        this.CallbackURL = value; 
        valueChanged("CallbackURL", value);

    }
            
    private java.util.Calendar ExpirationTime;
     
    /**
    * Gets the Expiration Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getExpirationTime() {
        return this.ExpirationTime; 
    }

    /**
    * Sets the Expiration Time.
    *
    * @param value the java.util.Calendar
    */
    public void setExpirationTime(java.util.Calendar value) { 
        this.ExpirationTime = value; 
        valueChanged("ExpirationTime", value);

    }
}

