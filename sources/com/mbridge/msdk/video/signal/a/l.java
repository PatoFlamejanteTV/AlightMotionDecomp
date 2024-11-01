package com.mbridge.msdk.video.signal.a;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class l extends d {

    /* renamed from: o, reason: collision with root package name */
    public boolean f23867o = true;

    private com.mbridge.msdk.click.a n() {
        if (this.f23841l == null) {
            this.f23841l = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.m().c(), this.f23839j);
        }
        return this.f23841l;
    }

    public final void a(JSONObject jSONObject) {
        try {
            jSONObject.put("device", new com.mbridge.msdk.foundation.tools.h(com.mbridge.msdk.foundation.controller.c.m().c()).a());
        } catch (JSONException e8) {
            throw new RuntimeException(e8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.mbridge.msdk.foundation.entity.CampaignEx r4, android.content.Context r5) {
        /*
            r3 = this;
            java.lang.String r5 = r4.getNoticeUrl()
            r0 = 0
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = com.mbridge.msdk.foundation.same.a.f20664m     // Catch: java.lang.Throwable -> L1a
            java.lang.String r5 = r5.getQueryParameter(r1)     // Catch: java.lang.Throwable -> L1a
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L1b
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
        L1b:
            r5 = 0
        L1c:
            com.mbridge.msdk.video.signal.a$a r1 = r3.f23842m
            r2 = 2
            if (r5 != r2) goto L22
            r0 = 1
        L22:
            r1.a(r0)
            com.mbridge.msdk.click.a r5 = r3.n()
            com.mbridge.msdk.video.signal.a$a r0 = r3.f23842m
            r5.a(r0)
            com.mbridge.msdk.click.a r5 = r3.n()
            r5.a(r4)
            com.mbridge.msdk.foundation.controller.c r5 = com.mbridge.msdk.foundation.controller.c.m()
            android.content.Context r5 = r5.c()
            com.mbridge.msdk.video.module.b.b.d(r5, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.signal.a.l.a(com.mbridge.msdk.foundation.entity.CampaignEx, android.content.Context):void");
    }
}
