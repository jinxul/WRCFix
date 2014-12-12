package com.givekesh.wrcfix;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.preference.PreferenceManager;
import android.util.Log;

/**
 * Created by Ahmad-Pc on 12/10/2014.
 */
public class Receiver extends BroadcastReceiver {
    @Override
        public void onReceive(Context context, Intent intent) {
            new Util().ChangeCountryCode(context.getContentResolver());
        }
}
