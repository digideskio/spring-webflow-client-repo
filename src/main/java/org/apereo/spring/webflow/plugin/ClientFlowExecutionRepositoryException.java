/**
 * Licensed to Apereo under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Apereo licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
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
package org.apereo.spring.webflow.plugin;

import org.springframework.webflow.execution.repository.FlowExecutionRepositoryException;

/**
 * Describes exceptions unique to {@link ClientFlowExecutionRepository}.
 *
 * @author Marvin S. Addison
 */
public class ClientFlowExecutionRepositoryException extends FlowExecutionRepositoryException {

    private static final long serialVersionUID = 2164175424974041060L;

    public ClientFlowExecutionRepositoryException(final String message) {
        super(message);
    }

    public ClientFlowExecutionRepositoryException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
