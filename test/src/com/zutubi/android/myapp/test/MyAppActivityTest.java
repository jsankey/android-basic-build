package com.zutubi.android.myapp.test;

import com.zutubi.android.myapp.MyAppActivity;

import android.test.ActivityInstrumentationTestCase2;

public class MyAppActivityTest extends ActivityInstrumentationTestCase2<MyAppActivity> {

	public MyAppActivityTest() {
		super("com.zutubi.android.myapp", MyAppActivity.class);
	}

	public void testSanity() {
		assertEquals(2, 1 + 1);
	}
}
