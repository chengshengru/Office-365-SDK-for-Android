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
package com.microsoft.onenote.api;

import com.microsoft.services.orc.ODataBaseEntity;


/**
 * The type Site.
*/
public class Site extends ODataBaseEntity {

    public Site(){
        setODataType("#Microsoft.OneNote.Api.Site");
    }
            
    private String id;
     
    /**
    * Gets the id.
    *
    * @return the String
    */
    public String getid() {
        return this.id; 
    }

    /**
    * Sets the id.
    *
    * @param value the String
    */
    public void setid(String value) { 
        this.id = value; 
        valueChanged("id", value);

    }
            
    private Notes notes;
     
    /**
    * Gets the notes.
    *
    * @return the Notes
    */
    public Notes getnotes() {
        return this.notes; 
    }

    /**
    * Sets the notes.
    *
    * @param value the Notes
    */
    public void setnotes(Notes value) { 
        this.notes = value; 
        valueChanged("notes", value);

    }
}

