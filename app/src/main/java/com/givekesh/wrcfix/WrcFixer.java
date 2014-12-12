package com.givekesh.wrcfix;

import android.app.Service;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.IBinder;

public class WrcFixer extends Service {
    public WrcFixer() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        WifiManager wifiManager = (WifiManager)getSystemService(WIFI_SERVICE);
        if (wifiManager.isWifiEnabled())
            wifiManager.setWifiEnabled(false);

        new Util().ChangeCountryCode(getContentResolver());
        stopSelf();
        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
