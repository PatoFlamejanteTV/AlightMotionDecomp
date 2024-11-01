package com.mbridge.msdk.videocommon.download;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ao;
import java.io.File;
import java.util.List;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static String f24352a = "ResourceManager";

    /* renamed from: b, reason: collision with root package name */
    private String f24353b;

    /* renamed from: com.mbridge.msdk.videocommon.download.g$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends com.mbridge.msdk.foundation.same.e.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f24354a;

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void pauseTask(boolean z8) {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void runTask() {
            ab.a(this.f24354a.f24353b);
        }
    }

    /* loaded from: classes4.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        public static g f24355a = new g(null);
    }

    /* synthetic */ g(AnonymousClass1 anonymousClass1) {
        this();
    }

    private g() {
        this.f24353b = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_RES);
    }

    public static g a() {
        return a.f24355a;
    }

    public final String a(String str) {
        String str2;
        String str3 = "";
        try {
            String str4 = this.f24353b + "/" + SameMD5.getMD5(ao.b(str));
            List<String> queryParameters = Uri.parse(str).getQueryParameters(ResourceManager.KEY_INDEX_HTML);
            if (queryParameters == null || queryParameters.size() <= 0) {
                return null;
            }
            String str5 = queryParameters.get(0);
            if (TextUtils.isEmpty(str5)) {
                return null;
            }
            String str6 = str4 + "/" + str5 + "/" + str5 + ".html";
            if (!ab.d(str6)) {
                return null;
            }
            try {
                com.mbridge.msdk.c.g b9 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
                if (b9 != null && !TextUtils.isEmpty(b9.V())) {
                    File file = new File(str6);
                    ab.a(com.mbridge.msdk.a.b.c(B1.b.a(MBridgeConstans.OMID_JS_SERVICE_CONTENT, ab.b(file))).getBytes(), file);
                }
                str2 = str.substring(str.indexOf("?") + 1);
            } catch (Exception unused) {
                str2 = "";
            }
            if (!TextUtils.isEmpty(str2)) {
                str3 = "?" + str2;
            }
            return "file://" + str6 + str3;
        } catch (Exception e8) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            e8.printStackTrace();
            return null;
        }
    }
}
