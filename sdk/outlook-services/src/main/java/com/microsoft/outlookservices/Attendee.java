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
package com.microsoft.outlookservices;



/**
 * The type Attendee.
*/
public class Attendee extends Recipient {

    public Attendee(){
        setODataType("#Microsoft.OutlookServices.Attendee");
    }

    private ResponseStatus Status;

    /**
    * Gets the Status.
    *
    * @return the ResponseStatus
    */
    public ResponseStatus getStatus() {
        return this.Status; 
    }

    /**
    * Sets the Status.
    *
    * @param value the ResponseStatus
    */
    public void setStatus(ResponseStatus value) { 
        this.Status = value;
        valueChanged("Status", value);

    }

    private AttendeeType Type;

    /**
    * Gets the Type.
    *
    * @return the AttendeeType
    */
    public AttendeeType getType() {
        return this.Type; 
    }

    /**
    * Sets the Type.
    *
    * @param value the AttendeeType
    */
    public void setType(AttendeeType value) { 
        this.Type = value;
        valueChanged("Type", value);

    }
}
