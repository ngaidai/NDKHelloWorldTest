package com.example.ndkhelloworld.test;

import com.example.ndkhelloworld.MainActivity;
import com.example.ndkhelloworld.R;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

public class DisplayTest extends ActivityInstrumentationTestCase2<MainActivity> {

	private TextView result;
	
	@SuppressWarnings("deprecation")
	public DisplayTest() {
		super("com.example.ndkhelloworld", MainActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		
		MainActivity mainActivity = getActivity();
		result = (TextView) mainActivity.findViewById(R.id.myTextField);
		
	}

	private static final String ADD_RESULT = "Hello From CPP";
	
	public void testDisplayText(){
		String textDisplay = result.getText().toString();
		assertEquals("Text display is NDK is:" + textDisplay + " " + "while text display in junit test is:" + ADD_RESULT, "the result is" + textDisplay.equals(ADD_RESULT));
	}
}
