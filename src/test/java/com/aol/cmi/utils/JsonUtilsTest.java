package com.aol.cmi.utils;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JsonUtilsTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testToJsonString() {
		assertNull(JsonUtils.toJsonString(null));
	}

	@Test
	public void testToJsonStringNonNull() {
		assertNull(JsonUtils.toJsonStringNonNull(null));
	}

}
