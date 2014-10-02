/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.office365.odata;;

import com.google.common.util.concurrent.*;
import com.microsoft.office365.odata.interfaces.*;
import com.microsoft.office365.exchange.services.*;

public class UserCollectionOperations extends ODataCollectionOperations {

    public UserCollectionOperations(String urlComponent, ODataExecutable parent) {
        super(urlComponent, parent);
    }
}
