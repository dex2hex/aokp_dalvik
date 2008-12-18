package tests.security.cert;

import dalvik.annotation.TestTargetClass;
import dalvik.annotation.TestInfo;
import dalvik.annotation.TestLevel;
import dalvik.annotation.TestTarget;

import java.security.cert.CertPath;

import org.apache.harmony.security.tests.support.cert.MyCertPath;
import org.apache.harmony.security.tests.support.cert.MyCertPath.MyCertPathRep;

import java.security.cert.CertPathBuilderSpi;

import junit.framework.TestCase;

@TestTargetClass(CertPath.class)
public class CertPathCertPathRepTest extends TestCase {

    private static final byte[] testEncoding = new byte[] { (byte) 1, (byte) 2,
            (byte) 3, (byte) 4, (byte) 5 };

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test for <code>CertPath.CertPathRep(String type, byte[] data)</code>
     * method<br>
     */
    @TestInfo(
      level = TestLevel.PARTIAL,
      purpose = "Null/invalid parameters checking missed",
      targets = {
        @TestTarget(
          methodName = "!CertPathRep",
          methodArgs = {String.class, byte.class}
        )
    })
    public final void testCertPathCertPathRep() {
        MyCertPath cp = new MyCertPath(testEncoding);
        MyCertPathRep rep = cp.new MyCertPathRep("MyEncoding", testEncoding);
        assertEquals(testEncoding, rep.getData());
        assertEquals("MyEncoding", rep.getType());

        try {
            cp.new MyCertPathRep(null, null);
        } catch (Exception e) {
            fail("Unexpected exeption " + e.getMessage());
        }

    }
}