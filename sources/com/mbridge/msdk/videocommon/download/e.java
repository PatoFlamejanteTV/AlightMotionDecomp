package com.mbridge.msdk.videocommon.download;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ao;
import java.io.File;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private String f24349a;

    /* renamed from: com.mbridge.msdk.videocommon.download.e$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass1 extends com.mbridge.msdk.foundation.same.e.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f24350a;

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void pauseTask(boolean z8) {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void runTask() {
            ab.a(this.f24350a.f24349a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static e f24351a = new e(null);
    }

    /* synthetic */ e(AnonymousClass1 anonymousClass1) {
        this();
    }

    public final String b(String str) {
        try {
            File file = new File(this.f24349a + "/" + SameMD5.getMD5(ao.b(str)) + ".html");
            if (file.exists()) {
                return ab.b(file);
            }
            return null;
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
                return null;
            }
            return null;
        }
    }

    private e() {
        this.f24349a = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_HTML);
    }

    public static e a() {
        return a.f24351a;
    }

    public final String a(String str) {
        try {
            String str2 = this.f24349a + "/" + SameMD5.getMD5(ao.b(str)) + ".html";
            File file = new File(str2);
            if (!file.exists()) {
                return null;
            }
            com.mbridge.msdk.c.g b9 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b9 != null && !TextUtils.isEmpty(b9.V())) {
                ab.a(com.mbridge.msdk.a.b.c(B1.b.a(MBridgeConstans.OMID_JS_SERVICE_CONTENT, ab.b(file))).getBytes(), file);
            }
            return "file:////" + str2;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }
}
