/*
 * Copyright (c) 2017 WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.apimgt.micro.gateway.throttling.synchronizer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel(description = "")
public class CustomRuleDTO extends ThrottlePolicyDTO {
  
  
  
  private String siddhiQuery = null;
  
  
  private String keyTemplate = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("siddhiQuery")
  public String getSiddhiQuery() {
    return siddhiQuery;
  }
  public void setSiddhiQuery(String siddhiQuery) {
    this.siddhiQuery = siddhiQuery;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("keyTemplate")
  public String getKeyTemplate() {
    return keyTemplate;
  }
  public void setKeyTemplate(String keyTemplate) {
    this.keyTemplate = keyTemplate;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomRuleDTO {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  siddhiQuery: ").append(siddhiQuery).append("\n");
    sb.append("  keyTemplate: ").append(keyTemplate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
