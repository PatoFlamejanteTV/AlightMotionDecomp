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
public final class k implements com.mbridge.msdk.newreward.a.b.a {

    /* loaded from: classes4.dex */
    private static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.foundation.c.b f22015a;

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f22016b;

        public a(com.mbridge.msdk.foundation.c.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
            this.f22015a = bVar;
            this.f22016b = bVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.foundation.c.b bVar;
            com.mbridge.msdk.newreward.a.b.b bVar2 = this.f22016b;
            if (bVar2 != null && (bVar = this.f22015a) != null) {
                bVar2.a(bVar);
            }
        }
    }

    /* loaded from: classes4.dex */
    private static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private JSONObject f22017a;

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f22018b;

        public b(JSONObject jSONObject, com.mbridge.msdk.newreward.a.b.b bVar) {
            this.f22017a = jSONObject;
            this.f22018b = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.videocommon.d.a aVar;
            if (this.f22018b != null && this.f22017a != null) {
                try {
                    String k8 = com.mbridge.msdk.foundation.controller.c.m().k();
                    if (ai.a(this.f22017a)) {
                        JSONObject optJSONObject = this.f22017a.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        this.f22017a = optJSONObject;
                        if (optJSONObject != null) {
                            if (optJSONObject.optInt("vtag_status", 0) == 1) {
                                String g8 = com.mbridge.msdk.videocommon.d.b.a().g(k8);
                                if (!TextUtils.isEmpty(g8)) {
                                    this.f22017a = com.mbridge.msdk.c.h.a().a(new JSONObject(g8), this.f22017a);
                                }
                            }
                            this.f22017a.put("current_time", System.currentTimeMillis());
                            com.mbridge.msdk.videocommon.d.b.a().c(k8, this.f22017a.toString());
                            aVar = com.mbridge.msdk.videocommon.d.a.a(this.f22017a.toString());
                            this.f22018b.a(aVar);
                        }
                    } else {
                        com.mbridge.msdk.videocommon.d.b.a().f(k8);
                    }
                    aVar = null;
                    this.f22018b.a(aVar);
                } catch (Throwable th) {
                    ad.b("ReqRewardSettingService", th.getMessage());
                }
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.b.a
    public final void a(Object obj, com.mbridge.msdk.newreward.a.b.b bVar) throws IOException {
        String str;
        int i8;
        int d8;
        String a9;
        if (obj != null) {
            com.mbridge.msdk.newreward.function.g.c cVar = (com.mbridge.msdk.newreward.function.g.c) obj;
            cVar.b(com.mbridge.msdk.newreward.function.d.b.g.f22337a);
            if (com.mbridge.msdk.videocommon.d.b.a().d()) {
                return;
            }
            com.mbridge.msdk.videocommon.d.b.a().a(true);
            try {
                com.mbridge.msdk.videocommon.d.a e8 = com.mbridge.msdk.videocommon.d.b.a().e();
                if (e8 == null) {
                    a9 = "";
                } else {
                    a9 = e8.a();
                }
                cVar.b(a9);
            } catch (Throwable th) {
                ad.b("ReqRewardSettingService", th.getMessage());
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
                    com.mbridge.msdk.foundation.same.net.m.a().a(com.mbridge.msdk.foundation.same.net.g.d.f().f20944l, com.mbridge.msdk.foundation.same.net.g.d.f().f20948p, jSONObject.toString(), true, new c(bVar));
                    return;
                }
                com.mbridge.msdk.newreward.function.d.b.g gVar = new com.mbridge.msdk.newreward.function.d.b.g(str);
                gVar.a(cVar.c());
                gVar.a((com.mbridge.msdk.newreward.function.d.b.e) new c(bVar));
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
            } catch (Exception e9) {
                throw new IOException(e9);
            }
        }
        throw new IOException("ReqRewardSettingService doReq: params is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class c implements com.mbridge.msdk.foundation.same.net.e<JSONObject>, com.mbridge.msdk.newreward.function.d.b.e {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f22019a;

        public c(com.mbridge.msdk.newreward.a.b.b bVar) {
            this.f22019a = bVar;
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.e
        public final void a(JSONObject jSONObject, p<JSONObject> pVar) {
            com.mbridge.msdk.videocommon.d.b.a().a(false);
            MBridgeTaskManager.commonExecute(new b(jSONObject, this.f22019a));
        }

        @Override // com.mbridge.msdk.foundation.same.net.e
        public final void onCancel() {
        }

        @Override // com.mbridge.msdk.foundation.same.net.e
        public final void onError(com.mbridge.msdk.foundation.same.net.b.a aVar) {
            com.mbridge.msdk.videocommon.d.b.a().a(false);
            MBridgeTaskManager.commonExecute(new a(new com.mbridge.msdk.foundation.c.b(880002, aVar.getMessage()), this.f22019a));
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
            com.mbridge.msdk.videocommon.d.b.a().a(false);
            MBridgeTaskManager.commonExecute(new b(kVar.f21000c, this.f22019a));
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.e
        public final void a(p<JSONObject> pVar, com.mbridge.msdk.newreward.function.d.b.d dVar) {
            com.mbridge.msdk.videocommon.d.b.a().a(false);
            MBridgeTaskManager.commonExecute(new a(new com.mbridge.msdk.foundation.c.b(880002, dVar.a()), this.f22019a));
        }
    }
}
