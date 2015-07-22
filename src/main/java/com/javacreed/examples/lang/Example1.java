/*
 * #%L
 * Boolean Versus Enum
 * %%
 * Copyright (C) 2012 - 2015 Java Creed
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.javacreed.examples.lang;

import java.util.concurrent.TimeUnit;

public class Example1 {

    public static void main(final String[] args) throws Exception {
        TimeUnit.SECONDS.sleep(2);

        final int size = 100000000;
        final boolean[] array = new boolean[size];
        TimeUnit.SECONDS.sleep(5);

        for (int i = 0; i < size; i++) {
            array[i] = false;
        }

        TimeUnit.SECONDS.sleep(5);
    }
}
