package com.mbridge.msdk.newreward.a.b;

import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.e.a.p;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.newreward.function.common.MBridgeTaskManager;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class l implements com.mbridge.msdk.newreward.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private String f22020a;

    /* loaded from: classes4.dex */
    private static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.foundation.c.b f22021a;

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f22022b;

        public a(com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
            this.f22021a = bVar;
            this.f22022b = bVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.foundation.c.b bVar;
            com.mbridge.msdk.newreward.a.b.b bVar2 = this.f22022b;
            if (bVar2 != null && (bVar = this.f22021a) != null) {
                bVar2.a(bVar);
            }
        }
    }

    /* loaded from: classes4.dex */
    private static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final String f22025a;

        /* renamed from: b, reason: collision with root package name */
        private JSONObject f22026b;

        /* renamed from: c, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f22027c;

        public c(String str, JSONObject jSONObject, com.mbridge.msdk.newreward.a.b.b bVar) {
            this.f22025a = str;
            this.f22026b = jSONObject;
            this.f22027c = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.videocommon.d.c cVar;
            if (this.f22027c != null && this.f22026b != null) {
                try {
                    String k8 = com.mbridge.msdk.foundation.controller.c.m().k();
                    if (ai.a(this.f22026b)) {
                        JSONObject optJSONObject = this.f22026b.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        this.f22026b = optJSONObject;
                        if (optJSONObject != null) {
                            if (optJSONObject.optInt("vtag_status", 0) == 1) {
                                String e8 = com.mbridge.msdk.videocommon.d.b.a().e(k8, this.f22025a);
                                if (!TextUtils.isEmpty(e8)) {
                                    this.f22026b = com.mbridge.msdk.c.h.a().a(new JSONObject(e8), this.f22026b);
                                }
                            }
                            if (com.mbridge.msdk.videocommon.d.b.e(this.f22026b.toString())) {
                                this.f22026b.put("current_time", System.currentTimeMillis());
                                com.mbridge.msdk.videocommon.d.b.a().a(k8, this.f22025a, this.f22026b.toString());
                            }
                            cVar = com.mbridge.msdk.videocommon.d.c.c(this.f22026b.toString());
                            this.f22027c.a(cVar);
                        }
                    } else {
                        com.mbridge.msdk.videocommon.d.b.a().d(k8, this.f22025a);
                    }
                    cVar = null;
                    this.f22027c.a(cVar);
                } catch (Throwable th) {
                    ad.b("ReqRewardUnitSettingService", th.getMessage());
                }
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.b.a
    public final void a(Object obj, com.mbridge.msdk.newreward.a.b.b bVar) throws IOException {
        String str;
        int i8;
        int d8;
        String j8;
        if (obj != null) {
            com.mbridge.msdk.newreward.function.g.c cVar = (com.mbridge.msdk.newreward.function.g.c) obj;
            String k8 = com.mbridge.msdk.foundation.controller.c.m().k();
            this.f22020a = cVar.b();
            cVar.b(com.mbridge.msdk.newreward.function.d.b.g.f22338b);
            if (com.mbridge.msdk.videocommon.d.b.a().d(this.f22020a)) {
                return;
            }
            com.mbridge.msdk.videocommon.d.b.a().a(this.f22020a);
            try {
                com.mbridge.msdk.videocommon.d.c f8 = com.mbridge.msdk.videocommon.d.b.a().f(k8, this.f22020a);
                if (f8 == null) {
                    j8 = "";
                } else {
                    j8 = f8.j();
                }
                cVar.b(j8);
            } catch (Throwable th) {
                ad.b("ReqRewardUnitSettingService", th.getMessage());
            }
            try {
                if (com.mbridge.msdk.foundation.same.net.g.d.f().f20950r) {
                    str = com.mbridge.msdk.foundation.same.net.g.d.f().f20916J;
                } else {
                    str = com.mbridge.msdk.foundation.same.net.g.d.f().f20915I;
                }
                if (com.mbridge.msdk.foundation.same.net.g.d.f().f20950r) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("uri", str);
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, cVar.d());
                    com.mbridge.msdk.foundation.same.net.m.a().a(com.mbridge.msdk.foundation.same.net.g.d.f().f20944l, com.mbridge.msdk.foundation.same.net.g.d.f().f20948p, jSONObject.toString(), true, new b(this.f22020a, bVar));
                    return;
                }
                com.mbridge.msdk.newreward.function.d.b.g gVar = new com.mbridge.msdk.newreward.function.d.b.g(str);
                gVar.a(cVar.c());
                gVar.a((com.mbridge.msdk.newreward.function.d.b.e) new b(this.f22020a, bVar));
                byte[] o8 = gVar.o();
                if (o8 != null) {
                    i8 = o8.length;
                } else {
                    i8 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(com.mbridge.msdk.foundation.same.net.h.e.f20972h, String.valueOf(i8));
                gVar.a((Map<String, String>) hashMap);
                if (o8 != null && (d8 = com.mbridge.msdk.foundation.same.net.g.d.f().d()) > 0 && i8 > d8) {
                    gVar.a(1);
                    gVar.a("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
                }
                com.mbridge.msdk.newreward.function.d.b.f.a().a(gVar);
                return;
            } catch (Exception e8) {
                throw new IOException(e8);
            }
        }
        throw new IOException("ReqRewardUnitSettingService doReq: params is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class b implements com.mbridge.msdk.foundation.same.net.e<JSONObject>, com.mbridge.msdk.newreward.function.d.b.e {

        /* renamed from: a, reason: collision with root package name */
        private final String f22023a;

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f22024b;

        public b(String str, com.mbridge.msdk.newreward.a.b.b bVar) {
            this.f22023a = str;
            this.f22024b = bVar;
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.e
        public final void a(JSONObject jSONObject, p<JSONObject> pVar) {
            com.mbridge.msdk.videocommon.d.b.a().b(this.f22023a);
            MBridgeTaskManager.commonExecute(new c(this.f22023a, jSONObject, this.f22024b));
        }

        @Override // com.mbridge.msdk.foundation.same.net.e
        public final void onCancel() {
        }

        @Override // com.mbridge.msdk.foundation.same.net.e
        public final void onError(com.mbridge.msdk.foundation.same.net.b.a aVar) {
            com.mbridge.msdk.videocommon.d.b.a().b(this.f22023a);
            MBridgeTaskManager.commonExecute(new a(new com.mbridge.msdk.foundation.c.b(880002, aVar.getMessage()), this.f22024b));
        }

        @Override // com.mbridge.msdk.foundation.same.net.e
        public final void onFinish() {
        }

        @Override // com.mbridge.msdk.foundation.same.net.e
        public final void onNetworking() {
        }

        @Override // com.mbridge.msdk.foundation.same.net.e
        public final void onPreExecute() {
        }

        @Override // com.mbridge.msdk.foundation.same.net.e
        public final void onProgressChange(long j8, long j9) {
        }

        @Override // com.mbridge.msdk.foundation.same.net.e
        public final void onRetry() {
        }

        @Override // com.mbridge.msdk.foundation.same.net.e
        public final void onSuccess(com.mbridge.msdk.foundation.same.net.k<JSONObject> kVar) {
            com.mbridge.msdk.videocommon.d.b.a().b(this.f22023a);
            MBridgeTaskManager.commonExecute(new c(this.f22023a, kVar.f21000c, this.f22024b));
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.e
        public final void a(p<JSONObject> pVar, com.mbridge.msdk.newreward.function.d.b.d dVar) {
            com.mbridge.msdk.videocommon.d.b.a().b(this.f22023a);
            MBridgeTaskManager.commonExecute(new a(new com.mbridge.msdk.foundation.c.b(880002, dVar.a()), this.f22024b));
        }
    }
}
