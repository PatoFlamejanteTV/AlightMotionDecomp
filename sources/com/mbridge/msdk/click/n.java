package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.click.m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.e.a;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import java.util.concurrent.Semaphore;

/* loaded from: classes4.dex */
public final class n extends e implements a.InterfaceC0402a {

    /* renamed from: a, reason: collision with root package name */
    private f f19437a;

    /* renamed from: b, reason: collision with root package name */
    private JumpLoaderResult f19438b;

    /* renamed from: d, reason: collision with root package name */
    private boolean f19440d;

    /* renamed from: e, reason: collision with root package name */
    private Context f19441e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.e.b f19442f;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f19443g;

    /* renamed from: c, reason: collision with root package name */
    private boolean f19439c = true;

    /* renamed from: h, reason: collision with root package name */
    private Handler f19444h = new Handler(Looper.getMainLooper());

    public n(Context context) {
        this.f19441e = context;
        this.f19442f = new com.mbridge.msdk.foundation.same.e.b(context, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, f fVar, boolean z8, String str2, String str3, CampaignEx campaignEx, boolean z9, boolean z10, int i8) {
        a aVar;
        this.f19437a = fVar;
        this.f19440d = z8;
        com.mbridge.msdk.click.entity.b bVar = new com.mbridge.msdk.click.entity.b();
        bVar.a(this.f19441e);
        bVar.a(str);
        bVar.c(z8);
        bVar.b(str2);
        bVar.c(str3);
        bVar.a(campaignEx);
        bVar.a(z9);
        bVar.b(z10);
        bVar.a(i8);
        if (str.startsWith("tcp")) {
            k kVar = new k(bVar);
            kVar.a(this.f19437a);
            kVar.a(new j() { // from class: com.mbridge.msdk.click.n.1
                @Override // com.mbridge.msdk.click.j
                public final void a(JumpLoaderResult jumpLoaderResult) {
                    n.this.f19438b = jumpLoaderResult;
                }
            });
            aVar = kVar;
        } else {
            aVar = new a(this.f19441e, str, str2, str3, campaignEx, z9, z10, i8);
        }
        this.f19442f.a(aVar, this);
    }

    @Override // com.mbridge.msdk.click.e
    public final void a() {
        this.f19439c = false;
    }

    @Override // com.mbridge.msdk.foundation.same.e.a.InterfaceC0402a
    public final void a(a.b bVar) {
        if (bVar == a.b.FINISH && this.f19439c) {
            this.f19444h.post(new Runnable() { // from class: com.mbridge.msdk.click.n.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (n.this.f19437a != null) {
                        if (n.this.f19438b.isSuccess()) {
                            n.this.f19437a.b(n.this.f19438b);
                        } else {
                            n.this.f19437a.a(n.this.f19438b, n.this.f19438b.getMsg());
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class a extends com.mbridge.msdk.foundation.same.e.a {

        /* renamed from: c, reason: collision with root package name */
        private final Context f19449c;

        /* renamed from: d, reason: collision with root package name */
        private String f19450d;

        /* renamed from: e, reason: collision with root package name */
        private String f19451e;

        /* renamed from: f, reason: collision with root package name */
        private String f19452f;

        /* renamed from: g, reason: collision with root package name */
        private CampaignEx f19453g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f19454h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f19455i;

        /* renamed from: j, reason: collision with root package name */
        private int f19456j;

        /* renamed from: b, reason: collision with root package name */
        private final Semaphore f19448b = new Semaphore(0);

        /* renamed from: k, reason: collision with root package name */
        private m.a f19457k = new m.a() { // from class: com.mbridge.msdk.click.n.a.1
            @Override // com.mbridge.msdk.click.m.a
            public final boolean a(String str) {
                boolean a9 = a.a(a.this, str);
                if (a9) {
                    a();
                }
                return a9;
            }

            @Override // com.mbridge.msdk.click.m.a
            public final boolean b(String str) {
                boolean a9 = a.a(a.this, str);
                if (a9) {
                    a();
                }
                return a9;
            }

            @Override // com.mbridge.msdk.click.m.a
            public final boolean c(String str) {
                return false;
            }

            @Override // com.mbridge.msdk.click.m.a
            public final void a(String str, boolean z8, String str2) {
                a.a(a.this, str);
                n.this.f19438b.setContent(str2);
                a();
            }

            @Override // com.mbridge.msdk.click.m.a
            public final void a(int i8, String str, String str2, String str3) {
                if (!TextUtils.isEmpty(str2)) {
                    n.this.f19438b.setExceptionMsg(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    n.this.f19438b.setContent(str3);
                }
                a.a(a.this, str);
                a();
            }

            private void a() {
                synchronized (n.this) {
                    n.this.f19438b.setSuccess(true);
                    a.a(a.this);
                }
            }
        };

        public a(Context context, String str, String str2, String str3, CampaignEx campaignEx, boolean z8, boolean z9, int i8) {
            this.f19449c = context;
            this.f19450d = str;
            this.f19451e = str2;
            this.f19452f = str3;
            this.f19453g = campaignEx;
            this.f19454h = z8;
            this.f19455i = z9;
            this.f19456j = i8;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01f0 A[EDGE_INSN: B:85:0x01f0->B:34:0x01f0 BREAK  A[LOOP:0: B:16:0x005a->B:58:0x01e9], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private com.mbridge.msdk.click.entity.JumpLoaderResult a(java.lang.String r16, boolean r17, boolean r18, com.mbridge.msdk.foundation.entity.CampaignEx r19, int r20) {
            /*
                Method dump skipped, instructions count: 497
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.n.a.a(java.lang.String, boolean, boolean, com.mbridge.msdk.foundation.entity.CampaignEx, int):com.mbridge.msdk.click.entity.JumpLoaderResult");
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void pauseTask(boolean z8) {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void runTask() {
            if (n.this.f19437a != null) {
                n.this.f19437a.a(null);
            }
            n.this.f19438b = new JumpLoaderResult();
            n.this.f19438b.setUrl(this.f19450d);
            n.this.f19438b = a(this.f19450d, this.f19454h, this.f19455i, this.f19453g, this.f19456j);
            if (!TextUtils.isEmpty(n.this.f19438b.getExceptionMsg())) {
                n.this.f19438b.setSuccess(true);
            }
            if (!n.this.f19439c || !n.this.f19438b.isSuccess()) {
                return;
            }
            if (n.this.f19443g != null) {
                n.this.f19438b.setStatusCode(n.this.f19443g.f19365f);
            }
            CampaignEx campaignEx = this.f19453g;
            JumpLoaderResult jumpLoaderResult = n.this.f19438b;
            com.mbridge.msdk.click.entity.a aVar = n.this.f19443g;
            String str = this.f19451e;
            String str2 = this.f19452f;
            Context context = this.f19449c;
            m.a aVar2 = this.f19457k;
            Semaphore semaphore = this.f19448b;
            if (!ah.a.b(jumpLoaderResult.getUrl()) && 200 == aVar.f19365f && !TextUtils.isEmpty(jumpLoaderResult.getContent()) && !jumpLoaderResult.getContent().contains("EXCEPTION_CAMPAIGN_NOT_ACTIVE")) {
                jumpLoaderResult.setType(2);
                if (!TextUtils.isEmpty(jumpLoaderResult.getContent())) {
                    new m().a(str, str2, context, jumpLoaderResult.getUrl(), jumpLoaderResult.getContent(), aVar2);
                } else {
                    try {
                        new m().a(str, str2, context, jumpLoaderResult.getUrl(), aVar2);
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("WebViewSpiderLoaderDiff", e8.getMessage());
                        }
                    }
                }
                semaphore.acquireUninterruptibly();
                return;
            }
            if (aVar != null) {
                jumpLoaderResult.setType(1);
                jumpLoaderResult.setExceptionMsg(aVar.f19367h);
                jumpLoaderResult.setStatusCode(aVar.f19365f);
                jumpLoaderResult.setHeader(aVar.a());
                jumpLoaderResult.setContent(aVar.f19366g);
            }
            o.a(jumpLoaderResult.getUrl(), campaignEx, jumpLoaderResult);
        }

        private boolean a(String str) {
            return !URLUtil.isNetworkUrl(str);
        }

        static /* synthetic */ boolean a(a aVar, String str) {
            return o.a(str, aVar.f19453g, n.this.f19438b);
        }

        static /* synthetic */ void a(a aVar) {
            aVar.f19448b.release();
        }
    }
}
