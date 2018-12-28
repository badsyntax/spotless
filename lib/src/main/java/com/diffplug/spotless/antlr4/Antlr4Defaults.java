/*
 * Copyright 2016 DiffPlug
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.diffplug.spotless.antlr4;

import java.util.Arrays;
import java.util.List;

public class Antlr4Defaults {

	private static final String LICENSE_HEADER_DELIMITER = "(grammar|lexer grammar|parser grammar)";

	private static final List<String> defaultIncludes = Arrays.asList("src/main/antlr4/**/*.g4", "src/test/antlr4/**/*.g4");

	private Antlr4Defaults() {}

	public static String licenseHeaderDelimiter() {
		return LICENSE_HEADER_DELIMITER;
	}

	public static List<String> defaultIncludes() {
		return defaultIncludes;
	}
}
