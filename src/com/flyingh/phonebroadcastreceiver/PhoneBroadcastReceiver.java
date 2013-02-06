package com.flyingh.phonebroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class PhoneBroadcastReceiver extends BroadcastReceiver {

	private static final String TAG = "PhoneBroadcastReceiver";

	@Override
	public void onReceive(Context context, Intent intent) {
		Log.i(TAG, "here");
		String resultData = getResultData();
		Log.i(TAG, resultData);
		setResultData(new StringBuilder(resultData).reverse().toString());
	}

}
