/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * AcceptReservedInstancesExchangeQuoteRequest Marshaller
 */

public class AcceptReservedInstancesExchangeQuoteRequestMarshaller implements
        Marshaller<Request<AcceptReservedInstancesExchangeQuoteRequest>, AcceptReservedInstancesExchangeQuoteRequest> {

    public Request<AcceptReservedInstancesExchangeQuoteRequest> marshall(AcceptReservedInstancesExchangeQuoteRequest acceptReservedInstancesExchangeQuoteRequest) {

        if (acceptReservedInstancesExchangeQuoteRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<AcceptReservedInstancesExchangeQuoteRequest> request = new DefaultRequest<AcceptReservedInstancesExchangeQuoteRequest>(
                acceptReservedInstancesExchangeQuoteRequest, "AmazonEC2");
        request.addParameter("Action", "AcceptReservedInstancesExchangeQuote");
        request.addParameter("Version", "2016-09-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> acceptReservedInstancesExchangeQuoteRequestReservedInstanceIdsList = (com.amazonaws.internal.SdkInternalList<String>) acceptReservedInstancesExchangeQuoteRequest
                .getReservedInstanceIds();
        if (!acceptReservedInstancesExchangeQuoteRequestReservedInstanceIdsList.isEmpty()
                || !acceptReservedInstancesExchangeQuoteRequestReservedInstanceIdsList.isAutoConstruct()) {
            int reservedInstanceIdsListIndex = 1;

            for (String acceptReservedInstancesExchangeQuoteRequestReservedInstanceIdsListValue : acceptReservedInstancesExchangeQuoteRequestReservedInstanceIdsList) {
                if (acceptReservedInstancesExchangeQuoteRequestReservedInstanceIdsListValue != null) {
                    request.addParameter("ReservedInstanceId." + reservedInstanceIdsListIndex,
                            StringUtils.fromString(acceptReservedInstancesExchangeQuoteRequestReservedInstanceIdsListValue));
                }
                reservedInstanceIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<TargetConfigurationRequest> acceptReservedInstancesExchangeQuoteRequestTargetConfigurationsList = (com.amazonaws.internal.SdkInternalList<TargetConfigurationRequest>) acceptReservedInstancesExchangeQuoteRequest
                .getTargetConfigurations();
        if (!acceptReservedInstancesExchangeQuoteRequestTargetConfigurationsList.isEmpty()
                || !acceptReservedInstancesExchangeQuoteRequestTargetConfigurationsList.isAutoConstruct()) {
            int targetConfigurationsListIndex = 1;

            for (TargetConfigurationRequest acceptReservedInstancesExchangeQuoteRequestTargetConfigurationsListValue : acceptReservedInstancesExchangeQuoteRequestTargetConfigurationsList) {

                if (acceptReservedInstancesExchangeQuoteRequestTargetConfigurationsListValue.getOfferingId() != null) {
                    request.addParameter("TargetConfiguration." + targetConfigurationsListIndex + ".OfferingId",
                            StringUtils.fromString(acceptReservedInstancesExchangeQuoteRequestTargetConfigurationsListValue.getOfferingId()));
                }

                if (acceptReservedInstancesExchangeQuoteRequestTargetConfigurationsListValue.getInstanceCount() != null) {
                    request.addParameter("TargetConfiguration." + targetConfigurationsListIndex + ".InstanceCount",
                            StringUtils.fromInteger(acceptReservedInstancesExchangeQuoteRequestTargetConfigurationsListValue.getInstanceCount()));
                }
                targetConfigurationsListIndex++;
            }
        }

        return request;
    }

}
