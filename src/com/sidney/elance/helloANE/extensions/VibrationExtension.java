package com.sidney.elance.helloANE.extensions;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

public class VibrationExtension implements FREExtension {

	@Override
	public FREContext createContext(String contextType) {
		
		return new VibrationExtensionContext();
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		
	}


}
