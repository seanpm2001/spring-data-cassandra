/*
 * Copyright 2013-2014 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * https://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.cassandra.test.integration.support;

import org.springframework.cassandra.config.java.AbstractSessionConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
public abstract class AbstractTestJavaConfig extends AbstractSessionConfiguration {

	public static SpringCqlBuildProperties PROPS = new SpringCqlBuildProperties();
	public static final int PORT = PROPS.getCassandraPort();

	@Override
	protected int getPort() {
		return PORT;
	}
}