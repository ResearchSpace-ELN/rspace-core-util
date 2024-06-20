package com.researchspace.core.util;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.researchspace.core.testutil.AbstractJDependTest;

public class NoDependenciesonOtherRSpacePackagesTest extends AbstractJDependTest {

	@Test
	public void testNoPackageDependOnWebUtils() {
		assertTrue(assertLessThanOrEqNOutgoingDependencies("com.researchspace.core.util", 0, new String[] {
				"com.researchspace.core.util", "java", "w3c", "slf4j", "joda", "javax", "apache", "org.xml", "jdepend", "com.fasterxml" }));
	}

}
