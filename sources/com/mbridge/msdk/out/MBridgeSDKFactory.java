package com.mbridge.msdk.out;

import com.mbridge.msdk.system.MBridgeSDKImpl;

/* loaded from: classes4.dex */
public class MBridgeSDKFactory {
    private static volatile MBridgeSDKImpl instance;

    private MBridgeSDKFactory() {
    }

    public static MBridgeSDKImpl getMBridgeSDK() {
        if (instance == null) {
            synchronized (MBridgeSDKFactory.class) {
                try {
                    if (instance == null) {
                        instance = new MBridgeSDKImpl();
                    }
                } finally {
                }
            }
        }
        return instance;
    }
}
