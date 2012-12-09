package com.sidney.elance.helloANE.extensions;

import android.app.Activity;
import android.content.Context;
import android.os.Vibrator;
import android.telephony.TelephonyManager;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

public class VibrationInitFunction implements FREFunction {

	@Override
	public FREObject call(FREContext context, FREObject[] passedArgs) {
		// TODO Auto-generated method stub
		VibrationExtensionContext vbc = (VibrationExtensionContext)context;
		Activity a = vbc.getActivity();
		vbc.vb = (Vibrator)a.getSystemService(Context.VIBRATOR_SERVICE);
		vbc.tm = (TelephonyManager)a.getSystemService(Context.TELEPHONY_SERVICE);
		return null;
	}
	

}
