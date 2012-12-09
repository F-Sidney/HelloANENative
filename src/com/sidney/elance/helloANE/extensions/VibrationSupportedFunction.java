package com.sidney.elance.helloANE.extensions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.adobe.fre.FREWrongThreadException;

public class VibrationSupportedFunction implements FREFunction {

	@Override
	public FREObject call(FREContext context, FREObject[] passedArgs) {
		// TODO Auto-generated method stub
		FREObject result = null;
		VibrationExtensionContext vbc = (VibrationExtensionContext)context;
		try {
			if (vbc.vb == null) {
				result = FREObject.newObject(false);
			} else {
				result = FREObject.newObject(true);
			}
			return result;
		} catch (FREWrongThreadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
	}

}
