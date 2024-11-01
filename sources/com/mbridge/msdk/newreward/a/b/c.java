package com.mbridge.msdk.newreward.a.b;

import android.os.SystemClock;
import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeTaskManager;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes4.dex */
public final class c implements com.mbridge.msdk.newreward.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.a.e f21968a;

    /* loaded from: classes4.dex */
    private static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.function.d.a.b f21969a;

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.function.d.b.b f21970b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f21971c;

        /* renamed from: d, reason: collision with root package name */
        private final int f21972d;

        /* renamed from: e, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f21973e;

        /* renamed from: f, reason: collision with root package name */
        private final String f21974f;

        public a(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.b.b bVar2, boolean z8, int i8, com.mbridge.msdk.newreward.a.b.b bVar3, String str) {
            this.f21969a = bVar;
            this.f21970b = bVar2;
            this.f21971c = z8;
            this.f21972d = i8;
            this.f21973e = bVar3;
            this.f21974f = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private com.mbridge.msdk.foundation.c.b a(int r11) {
            /*
                r10 = this;
                java.lang.String r0 = "load exception with no mCampaignRequestError"
                r1 = 0
                r2 = 0
                r3 = 880002(0xd6d82, float:1.233145E-39)
                com.mbridge.msdk.newreward.function.d.b.b r4 = r10.f21970b     // Catch: java.lang.Exception -> L3f
                if (r4 == 0) goto Ldc
                int r4 = r4.c()     // Catch: java.lang.Exception -> L3f
                r5 = 9
                r6 = 880003(0xd6d83, float:1.233147E-39)
                java.lang.String r7 = ""
                if (r4 != r5) goto L42
                com.mbridge.msdk.newreward.function.d.b.b r4 = r10.f21970b     // Catch: java.lang.Exception -> L3f
                int r2 = r4.a()     // Catch: java.lang.Exception -> L3f
                com.mbridge.msdk.newreward.function.d.b.b r4 = r10.f21970b     // Catch: java.lang.Exception -> L3f
                java.lang.String r0 = r4.b()     // Catch: java.lang.Exception -> L3f
                com.mbridge.msdk.newreward.function.d.b.b r4 = r10.f21970b     // Catch: java.lang.Exception -> L3f
                int r3 = r4.c()     // Catch: java.lang.Exception -> L3f
                r4 = -1
                if (r3 != r4) goto L31
                r3 = 880017(0xd6d91, float:1.233166E-39)
                goto L34
            L31:
                r3 = 880003(0xd6d83, float:1.233147E-39)
            L34:
                com.mbridge.msdk.newreward.function.d.b.b r4 = r10.f21970b     // Catch: java.lang.Exception -> L3f
                java.lang.String r4 = r4.f()     // Catch: java.lang.Exception -> L3f
                r5 = 1
                r9 = r7
                r7 = r4
                r4 = r9
                goto L9f
            L3f:
                r11 = move-exception
                goto Ld9
            L42:
                com.mbridge.msdk.newreward.function.d.b.b r4 = r10.f21970b     // Catch: java.lang.Exception -> L3f
                int r4 = r4.c()     // Catch: java.lang.Exception -> L3f
                r5 = 10
                if (r4 != r5) goto L64
                r4 = 880023(0xd6d97, float:1.233175E-39)
                com.mbridge.msdk.newreward.function.d.b.b r5 = r10.f21970b     // Catch: java.lang.Exception -> L5e
                java.lang.String r0 = r5.d()     // Catch: java.lang.Exception -> L5e
                r4 = r7
                r2 = 880023(0xd6d97, float:1.233175E-39)
                r3 = 880023(0xd6d97, float:1.233175E-39)
            L5c:
                r5 = 0
                goto L9f
            L5e:
                r11 = move-exception
                r2 = 880023(0xd6d97, float:1.233175E-39)
                goto Ld9
            L64:
                com.mbridge.msdk.newreward.function.d.b.b r4 = r10.f21970b     // Catch: java.lang.Exception -> L3f
                int r4 = r4.c()     // Catch: java.lang.Exception -> L3f
                switch(r4) {
                    case 0: goto L72;
                    case 1: goto L75;
                    case 2: goto L75;
                    case 3: goto L75;
                    case 4: goto L75;
                    case 5: goto L72;
                    case 6: goto L6e;
                    case 7: goto L6e;
                    default: goto L6d;
                }     // Catch: java.lang.Exception -> L3f
            L6d:
                goto L75
            L6e:
                r3 = 880003(0xd6d83, float:1.233147E-39)
                goto L75
            L72:
                r3 = 880020(0xd6d94, float:1.23317E-39)
            L75:
                com.mbridge.msdk.newreward.function.d.b.b r4 = r10.f21970b     // Catch: java.lang.Exception -> L3f
                com.mbridge.msdk.e.a.z r4 = r4.e()     // Catch: java.lang.Exception -> L3f
                if (r4 == 0) goto L9d
                com.mbridge.msdk.newreward.function.d.b.b r4 = r10.f21970b     // Catch: java.lang.Exception -> L3f
                com.mbridge.msdk.e.a.z r4 = r4.e()     // Catch: java.lang.Exception -> L3f
                int r4 = r4.b()     // Catch: java.lang.Exception -> L3f
                com.mbridge.msdk.newreward.function.d.b.b r5 = r10.f21970b     // Catch: java.lang.Exception -> L9a
                com.mbridge.msdk.e.a.z r5 = r5.e()     // Catch: java.lang.Exception -> L9a
                java.lang.String r0 = r5.c()     // Catch: java.lang.Exception -> L9a
                com.mbridge.msdk.newreward.function.d.b.b r5 = r10.f21970b     // Catch: java.lang.Exception -> L9a
                java.lang.String r5 = r5.d()     // Catch: java.lang.Exception -> L9a
                r2 = r4
                r4 = r5
                goto L5c
            L9a:
                r11 = move-exception
                r2 = r4
                goto Ld9
            L9d:
                r4 = r7
                goto L5c
            L9f:
                com.mbridge.msdk.foundation.c.b r1 = com.mbridge.msdk.foundation.c.a.a(r2, r3, r0)     // Catch: java.lang.Exception -> L3f
                java.lang.String r6 = "can_retry"
                boolean r8 = r10.f21971c     // Catch: java.lang.Exception -> L3f
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Exception -> L3f
                r1.a(r6, r8)     // Catch: java.lang.Exception -> L3f
                java.lang.String r6 = "campaign_request_error_type"
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Exception -> L3f
                r1.a(r6, r11)     // Catch: java.lang.Exception -> L3f
                java.lang.String r11 = "campaign_request_error"
                com.mbridge.msdk.newreward.function.d.b.b r6 = r10.f21970b     // Catch: java.lang.Exception -> L3f
                r1.a(r11, r6)     // Catch: java.lang.Exception -> L3f
                r1.b(r5)     // Catch: java.lang.Exception -> L3f
                boolean r11 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L3f
                if (r11 != 0) goto Lca
                r1.d(r7)     // Catch: java.lang.Exception -> L3f
            Lca:
                boolean r11 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L3f
                if (r11 != 0) goto Ld3
                r1.e(r4)     // Catch: java.lang.Exception -> L3f
            Ld3:
                java.lang.String r11 = r10.f21974f     // Catch: java.lang.Exception -> L3f
                r1.c(r11)     // Catch: java.lang.Exception -> L3f
                goto Ldc
            Ld9:
                r11.printStackTrace()
            Ldc:
                if (r1 != 0) goto Le2
                com.mbridge.msdk.foundation.c.b r1 = com.mbridge.msdk.foundation.c.a.a(r2, r3, r0)
            Le2:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.a.b.c.a.a(int):com.mbridge.msdk.foundation.c.b");
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.newreward.a.b.b bVar = this.f21973e;
            if (bVar != null && this.f21970b != null) {
                try {
                    bVar.a(a(this.f21972d));
                } catch (Exception e8) {
                    ad.a("ReqCampaignService", "run: ", e8);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    private static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.function.d.a.b f21975a;

        /* renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f21976b;

        public b(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
            this.f21975a = bVar;
            this.f21976b = bVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.newreward.function.d.a.b bVar;
            com.mbridge.msdk.newreward.a.b.b bVar2 = this.f21976b;
            if (bVar2 != null && (bVar = this.f21975a) != null) {
                try {
                    bVar2.a(bVar);
                } catch (Exception e8) {
                    ad.a("ReqCampaignService", "run: ", e8);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.mbridge.msdk.newreward.a.b.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0413c implements com.mbridge.msdk.newreward.function.d.b.c {

        /* renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f21977a;

        public C0413c(com.mbridge.msdk.newreward.a.b.b bVar) {
            this.f21977a = bVar;
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.c
        public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.b.a aVar) {
            MBridgeTaskManager.commonExecute(new b(bVar, this.f21977a));
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.c
        public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.b.a aVar, com.mbridge.msdk.newreward.function.d.b.b bVar2) {
            MBridgeTaskManager.commonExecute(new a(bVar, bVar2, true, 401, this.f21977a, aVar.i()));
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.c
        public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.b.a aVar, com.mbridge.msdk.newreward.function.d.b.b bVar2) {
            MBridgeTaskManager.commonExecute(new a(bVar, bVar2, false, 402, this.f21977a, aVar.i()));
        }

        @Override // com.mbridge.msdk.newreward.function.d.b.c
        public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.b.a aVar, long j8, com.mbridge.msdk.newreward.function.d.b.b bVar2) {
            MBridgeTaskManager.commonExecute(new a(bVar, bVar2, false, MBridgeCommon.CampaignState.STATE_LOAD_FAILED_TIMEOUT, this.f21977a, aVar.i()));
        }
    }

    public c(com.mbridge.msdk.newreward.a.e eVar) {
        this.f21968a = eVar;
    }

    @Override // com.mbridge.msdk.newreward.a.b.a
    public final void a(Object obj, com.mbridge.msdk.newreward.a.b.b bVar) throws IOException {
        int i8;
        int d8;
        if (obj != null) {
            try {
                long g8 = this.f21968a.g();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (g8 <= 0) {
                    this.f21968a.b(elapsedRealtime);
                    g8 = elapsedRealtime;
                }
                com.mbridge.msdk.newreward.function.g.d dVar = (com.mbridge.msdk.newreward.function.g.d) obj;
                Map<String, String> f8 = dVar.f();
                com.mbridge.msdk.newreward.function.d.b.h hVar = new com.mbridge.msdk.newreward.function.d.b.h(dVar.b(), dVar.c(), dVar.d(), Math.max(this.f21968a.I() - (elapsedRealtime - g8), 0L), dVar.e());
                hVar.a(f8);
                hVar.b(this.f21968a.z());
                hVar.a((com.mbridge.msdk.newreward.function.d.b.c) new C0413c(bVar));
                byte[] o8 = hVar.o();
                if (o8 != null) {
                    i8 = o8.length;
                } else {
                    i8 = 0;
                }
                hVar.a(com.mbridge.msdk.foundation.same.net.h.e.f20972h, String.valueOf(i8));
                if (o8 != null && (d8 = com.mbridge.msdk.foundation.same.net.g.d.f().d()) > 0 && i8 > d8) {
                    hVar.a(1);
                    hVar.b("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
                }
                com.mbridge.msdk.newreward.function.d.b.f.a().b().a(hVar);
                return;
            } catch (Exception e8) {
                throw new IOException(e8);
            }
        }
        throw new IOException("ReqCampaignService doReq: params is null");
    }
}
