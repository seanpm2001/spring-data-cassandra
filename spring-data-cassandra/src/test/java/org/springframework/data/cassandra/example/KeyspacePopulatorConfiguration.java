/*
 * Copyright 2020-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.cassandra.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.core.cql.session.init.KeyspacePopulator;
import org.springframework.data.cassandra.core.cql.session.init.ResourceKeyspacePopulator;
import org.springframework.lang.Nullable;

// tag::class[]
@Configuration
public class KeyspacePopulatorConfiguration extends AbstractCassandraConfiguration {

	@Nullable
	@Override
	protected KeyspacePopulator keyspacePopulator() {
		return new ResourceKeyspacePopulator(new ClassPathResource("com/foo/cql/db-schema.cql"),
				new ClassPathResource("com/foo/cql/db-test-data.cql"));
	}

	@Nullable
	@Override
	protected KeyspacePopulator keyspaceCleaner() {
		return new ResourceKeyspacePopulator(scriptOf("DROP TABLE my_table;"));
	}

	// ...
	// end::class[]

	@Override
	protected String getKeyspaceName() {
		return null;
	}
	// tag::class[]
}
// end::class[]
