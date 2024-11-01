package com.mbridge.msdk.videocommon.download;

import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;

/* loaded from: classes4.dex */
public final class f {
    public static String a(String str) {
        try {
            return H5DownLoadManager.getInstance().getH5ResAddress(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String b(String str) {
        try {
            return HTMLResourceManager.getInstance().getHtmlContentFromUrl(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
