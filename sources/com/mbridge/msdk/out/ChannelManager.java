package com.mbridge.msdk.out;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.net.Aa;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class ChannelManager {
    public static void setChannel(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                Aa aa = new Aa();
                Method declaredMethod = Aa.class.getDeclaredMethod(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, String.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(aa, str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
