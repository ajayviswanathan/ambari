/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.ambari.logsearch.query.converter;

import org.apache.ambari.logsearch.model.request.impl.ServiceLogTruncatedRequest;
import org.apache.ambari.logsearch.query.model.ServiceLogTruncatedSearchCriteria;
import org.springframework.stereotype.Component;

@Component
public class ServiceLogTruncatedRequestConverter extends AbstractCommonServiceLogRequestConverter<ServiceLogTruncatedRequest, ServiceLogTruncatedSearchCriteria> {

  @Override
  public ServiceLogTruncatedSearchCriteria createCriteria(ServiceLogTruncatedRequest request) {
    ServiceLogTruncatedSearchCriteria criteria = new ServiceLogTruncatedSearchCriteria();
    criteria.addParam("hostLogFile", request.getHostLogFile());
    criteria.addParam("compLogFile", request.getComponentLogFile());
    criteria.addParam("id", request.getId());
    criteria.addParam("scrollType", request.getScrollType());
    criteria.addParam("numberRows", request.getNumberRows());
    return criteria;
  }
}
