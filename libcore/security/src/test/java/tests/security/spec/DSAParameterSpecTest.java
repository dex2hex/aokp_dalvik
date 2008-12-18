/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

/**
* @author Vladimir N. Molotkov
* @version $Revision$
*/

package tests.security.spec;

import dalvik.annotation.TestInfo;
import dalvik.annotation.TestLevel;
import dalvik.annotation.TestTarget;
import dalvik.annotation.TestTargetClass;

import junit.framework.TestCase;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;

/**
 * Tests for <code>DSAParameterSpec</code>
 * 
 */
@TestTargetClass(DSAParameterSpec.class)
public class DSAParameterSpecTest extends TestCase {

    /**
     * Constructor for DSAParameterSpecTest.
     * @param name
     */
    public DSAParameterSpecTest(String name) {
        super(name);
    }

    /**
     * Ctor test 
     */
    @TestInfo(
      level = TestLevel.COMPLETE,
      purpose = "",
      targets = {
        @TestTarget(
          methodName = "DSAParameterSpec",
          methodArgs = {java.math.BigInteger.class, java.math.BigInteger.class, java.math.BigInteger.class}
        )
    })
    public final void testDSAParameterSpec() {
        AlgorithmParameterSpec aps = new DSAParameterSpec(
                new BigInteger("1"),
                new BigInteger("2"),
                new BigInteger("3"));
        
        assertTrue(aps instanceof DSAParameterSpec);
    }

    /**
     * getG() test
     */
    @TestInfo(
      level = TestLevel.COMPLETE,
      purpose = "",
      targets = {
        @TestTarget(
          methodName = "getG",
          methodArgs = {}
        )
    })
    public final void testGetG() {
        DSAParameterSpec dps = new DSAParameterSpec(
                new BigInteger("1"),
                new BigInteger("2"),
                new BigInteger("3"));
        
        assertEquals(3, dps.getG().intValue());
    }

    /**
     * getP() test
     */
    @TestInfo(
      level = TestLevel.COMPLETE,
      purpose = "",
      targets = {
        @TestTarget(
          methodName = "getP",
          methodArgs = {}
        )
    })
    public final void testGetP() {
        DSAParameterSpec dps = new DSAParameterSpec(
                new BigInteger("1"),
                new BigInteger("2"),
                new BigInteger("3"));
        
        assertEquals(1, dps.getP().intValue());
    }

    /**
     * getQ() test 
     */
    @TestInfo(
      level = TestLevel.COMPLETE,
      purpose = "",
      targets = {
        @TestTarget(
          methodName = "getQ",
          methodArgs = {}
        )
    })
    public final void testGetQ() {
        DSAParameterSpec dps = new DSAParameterSpec(
                new BigInteger("1"),
                new BigInteger("2"),
                new BigInteger("3"));
        
        assertEquals(2, dps.getQ().intValue());
    }
}