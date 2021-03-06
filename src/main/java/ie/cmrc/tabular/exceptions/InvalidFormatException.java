/* 
 * Copyright 2015 Coastal and Marine Research Centre (CMRC), Beaufort,
 * Environmental Research Institute (ERI), University College Cork (UCC).
 * Yassine Lassoued <y.lassoued@gmail.com, y.lassoued@ucc.ie>.
 *
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
 */

package ie.cmrc.tabular.exceptions;

/**
 * Exception thrown when the format of file that is provided to a given method
 * is invalid (e.g., unknown, not supported, etc.)
 * 
 * @author Yassine Lassoued
 */
public class InvalidFormatException extends Exception {

    /**
     * Creates a new instance of <code>InvalidFormatException</code> without
     * detail message.
     */
    public InvalidFormatException() {
    }

    /**
     * Constructs an instance of <code>InvalidFormatException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidFormatException(String msg) {
        super(msg);
    }
}
