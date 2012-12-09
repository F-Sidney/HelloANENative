package com.sidney.elance.helloANE.extensions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

public class VibrationVibrateFunction implements FREFunction {

	@Override
	public FREObject call(FREContext context, FREObject[] passedArgs) {
		FREObject result = null;
		VibrationExtensionContext vbc = (VibrationExtensionContext)context;
		try {
			FREObject fro = passedArgs[0];
			int duration = fro.getAsInt();
			vbc.vb.vibrate(duration);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
