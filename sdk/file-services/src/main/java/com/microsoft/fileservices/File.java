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
package com.microsoft.fileservices;



/**
 * The type File.
*/
public class File extends Item {

    public File(){
        setODataType("#Microsoft.FileServices.File");
    }
            
    private String contentUrl;
     
    /**
    * Gets the content Url.
    *
    * @return the String
    */
    public String getcontentUrl() {
        return this.contentUrl; 
    }

    /**
    * Sets the content Url.
    *
    * @param value the String
    */
    public void setcontentUrl(String value) { 
        this.contentUrl = value; 
        valueChanged("contentUrl", value);

    }
            
    private ImageFacet image;
     
    /**
    * Gets the image.
    *
    * @return the ImageFacet
    */
    public ImageFacet getimage() {
        return this.image; 
    }

    /**
    * Sets the image.
    *
    * @param value the ImageFacet
    */
    public void setimage(ImageFacet value) { 
        this.image = value; 
        valueChanged("image", value);

    }
}

