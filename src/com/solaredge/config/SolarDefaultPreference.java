package com.solaredge.config;

import android.content.Context;

public class SolarDefaultPreference extends BasePreference {

	SolarDefaultPreference() {
		mSharedPref = mContext.getSharedPreferences(
				AppConfig.PreferenceModule.SOLAR_PREFERENCE_APPLICATION,
				Context.MODE_PRIVATE);
	}

	public boolean getShortCutCreated() {
		return getBooleanKey(AppConfig.PreferenceSolar.SOLAR_SHORT_CUT_CREATED);
	}

	public void setShortCutCreated() {
		putBooleanKey(AppConfig.PreferenceSolar.SOLAR_SHORT_CUT_CREATED, true);
	}

	public String getAppLanguage() {
		return getStringKey(AppConfig.PreferenceSolar.SOLAR_SYSTEM_LANGUAGE);
	}

	public void setAppLanguage(String language) {
		putStringKey(AppConfig.PreferenceSolar.SOLAR_SYSTEM_LANGUAGE, language);
	}

}
