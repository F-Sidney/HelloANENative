package com.sidney.elance.helloANE.extensions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

public class SimIdFunction implements FREFunction {

	@Override
	public FREObject call(FREContext context, FREObject[] arg1) {
		FREObject result = null;
		VibrationExtensionContext vbc = (VibrationExtensionContext)context;
		try {
			result = FREObject.newObject(vbc.tm.getSimSerialNumber());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
