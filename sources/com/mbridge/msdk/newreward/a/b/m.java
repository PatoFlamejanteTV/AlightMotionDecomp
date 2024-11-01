package com.mbridge.msdk.newreward.a.b;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.newreward.function.d.c.n;
import com.mbridge.msdk.newreward.function.d.c.q;
import com.mbridge.msdk.newreward.function.d.c.x;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes4.dex */
public final class m implements a {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.c f22028a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.newreward.a.e f22029b;

    /* renamed from: c, reason: collision with root package name */
    private int f22030c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.newreward.a.b.m$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22034a;

        static {
            int[] iArr = new int[com.mbridge.msdk.newreward.function.c.e.values().length];
            f22034a = iArr;
            try {
                iArr[com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22034a[com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.b.a
    public final void a(Object obj, final b bVar) throws IOException {
        com.mbridge.msdk.newreward.function.d.a.a aVar = (com.mbridge.msdk.newreward.function.d.a.a) obj;
        final n d8 = aVar.d();
        if (aVar.h().F() != null) {
            if (aVar.h().F().containsKey("command_manager")) {
                this.f22028a = (com.mbridge.msdk.newreward.function.c.c) aVar.h().F().get("command_manager");
            }
            if (aVar.h().F().containsKey("adapter_model")) {
                this.f22029b = (com.mbridge.msdk.newreward.a.e) aVar.h().F().get("adapter_model");
            }
        }
        if (d8 == null) {
            bVar.a(aVar);
            return;
        }
        if (d8.e() == 1) {
            this.f22030c = 1;
        } else {
            this.f22030c = 2;
        }
        a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_START, 0, aVar, null);
        d8.k().a(0, new x() { // from class: com.mbridge.msdk.newreward.a.b.m.1
            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.function.d.a.a aVar2, q qVar) {
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.function.d.a.a aVar2, q qVar) {
                m.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, 1, aVar2, null);
                try {
                    if (bVar2.x()) {
                        bVar.a(aVar2);
                    }
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.a("ReqVideoService", "doReq: ", e8);
                    }
                }
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.function.d.a.a aVar2, q qVar, MBridgeError mBridgeError) {
                m.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, 3, aVar2, mBridgeError);
                a(bVar2, bVar, aVar2, mBridgeError);
            }

            private void a(com.mbridge.msdk.newreward.function.d.a.b bVar2, b bVar3, com.mbridge.msdk.newreward.function.d.a.a aVar2, MBridgeError mBridgeError) {
                if (bVar2.x()) {
                    try {
                        bVar3.a(aVar2);
                        return;
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.a("ReqVideoService", "doReq: ", e8);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if (d8.c()) {
                        return;
                    }
                    bVar3.a(com.mbridge.msdk.foundation.c.a.a(mBridgeError.getErrorCode(), 880004, mBridgeError.getErrorMessage()));
                } catch (Exception e9) {
                    if (MBridgeConstans.DEBUG) {
                        ad.a("ReqVideoService", "doReq: ", e9);
                    }
                }
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.function.d.a.a aVar2, q qVar, MBridgeError mBridgeError) {
                m.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, 2, aVar2, mBridgeError);
                a(bVar2, bVar, aVar2, mBridgeError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.newreward.function.c.e eVar, int i8, com.mbridge.msdk.newreward.function.d.a.a aVar, MBridgeError mBridgeError) {
        com.mbridge.msdk.newreward.function.c.c cVar = this.f22028a;
        if (cVar == null || this.f22029b == null) {
            return;
        }
        try {
            Map a9 = cVar.a("resource_type", 4, "scenes", 1, "url", aVar.d().j(), "resumed_breakpoint", "2", CampaignEx.JSON_KEY_READY_RATE, 100, "mraid_type", Integer.valueOf(aVar.i() ? 1 : 0));
            int i9 = AnonymousClass2.f22034a[eVar.ordinal()];
            if (i9 != 1) {
                if (i9 == 2 && this.f22030c == 2) {
                    a9.put("result", Integer.valueOf(i8));
                    if (i8 != 1 && mBridgeError != null) {
                        a9.put("reason", mBridgeError.getErrorMessage());
                    }
                    this.f22028a.a(this.f22029b, eVar, a9);
                    return;
                }
                return;
            }
            a9.put("cache", Integer.valueOf(this.f22030c));
            this.f22028a.a(this.f22029b, eVar, a9);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }
}
