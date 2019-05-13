/*
 * Copyright 2013-2019 the original author or authors.
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
package org.springframework.cassandra.core;

import org.springframework.dao.DataAccessException;

import com.datastax.driver.core.Session;

/**
 * Interface for operations on a Cassandra Session.
 *
 * @author David Webb
 * @param <T>
 */
public interface SessionCallback<T> {

	/**
	 * Perform the operation in the given Session
	 *
	 * @param s
	 * @return
	 * @throws DataAccessException
	 */
	T doInSession(Session s) throws DataAccessException;

}