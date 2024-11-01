package com.mbridge.msdk.mbsignalcommon.base;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes4.dex */
public final class c implements a {
    @Override // com.mbridge.msdk.mbsignalcommon.base.a
    public final boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            String scheme = Uri.parse(str).getScheme();
            if (!TextUtils.isEmpty(scheme) && scheme.equals("intent")) {
                return com.mbridge.msdk.click.c.d(com.mbridge.msdk.foundation.controller.c.m().c(), str);
            }
            return false;
        }
        return false;
    }
}
