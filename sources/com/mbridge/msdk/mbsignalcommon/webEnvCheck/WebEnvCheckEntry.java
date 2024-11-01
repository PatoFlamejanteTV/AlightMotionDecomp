package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import android.content.Context;
import com.mbridge.msdk.c.b.b;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;

/* loaded from: classes4.dex */
public class WebEnvCheckEntry {
    public void check(Context context) {
        new WindVaneWebView(context).loadDataWithBaseURL(null, "<html><script>" + b.a().b() + "</script></html>", "text/html", "utf-8", null);
    }
}
