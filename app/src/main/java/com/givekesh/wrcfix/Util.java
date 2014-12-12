package com.givekesh.wrcfix;

import android.content.ContentResolver;
import android.provider.Settings;

/**
 * Created by Ahmad-Pc on 12/12/2014.
 */
public class Util {

    protected void ChangeCountryCode(ContentResolver resolver){
        Settings.Global.putString(resolver, "wifi_country_code","eu");
    }

}
