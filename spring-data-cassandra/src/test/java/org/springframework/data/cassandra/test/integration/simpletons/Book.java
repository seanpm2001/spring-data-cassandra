/*
 * Copyright 2013-2019 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.cassandra.test.integration.simpletons;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

/**
 * Test POJO
 *
 * @author David Webb
 * @author Mark Paluch
 */
@Table("book")
@Data
@NoArgsConstructor
public class Book {

	@PrimaryKey private String isbn;

	private String title;
	private String author;
	private int pages;
	private Date saleDate;
	private boolean isInStock;
	private BookCondition condition;

	public Book(String isbn) {
		this.isbn = isbn;
	}
}