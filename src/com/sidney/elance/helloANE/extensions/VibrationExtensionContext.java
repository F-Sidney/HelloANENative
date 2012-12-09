package com.sidney.elance.helloANE.extensions;

import java.util.HashMap;
import java.util.Map;

import android.os.Vibrator;
import android.telephony.TelephonyManager;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;

public class VibrationExtensionContext extends FREContext {

	public Vibrator vb = null;
	public TelephonyManager tm = null;
	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, FREFunction> getFunctions() {
		// TODO Auto-generated method stub
		Map<String, FREFunction> functionMap = new HashMap<String, FREFunction>();
		functionMap.put("initMe", new VibrationInitFunction());
		functionMap.put("isSupported", new VibrationSupportedFunction());
		functionMap.put("vibrateMe", new VibrationVibrateFunction());
		functionMap.put("isSupportTM", new TMSupportedFunction());
		functionMap.put("simid", new SimIdFunction());
		functionMap.put("imei", new ImeiFunction());
		return functionMap;
	}

}
