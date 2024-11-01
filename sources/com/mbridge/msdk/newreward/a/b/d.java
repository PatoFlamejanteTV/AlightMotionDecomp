package com.mbridge.msdk.newreward.a.b;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.newreward.function.d.c.q;
import com.mbridge.msdk.newreward.function.d.c.x;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes4.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.c f21978a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.newreward.a.e f21979b;

    /* renamed from: c, reason: collision with root package name */
    private int f21980c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.newreward.a.b.d$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21984a;

        static {
            int[] iArr = new int[com.mbridge.msdk.newreward.function.c.e.values().length];
            f21984a = iArr;
            try {
                iArr[com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21984a[com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.b.a
    public final void a(Object obj, final b bVar) throws IOException {
        com.mbridge.msdk.newreward.function.d.a.b bVar2 = (com.mbridge.msdk.newreward.function.d.a.b) obj;
        final com.mbridge.msdk.newreward.function.d.c.d<?> u8 = bVar2.u();
        if (bVar2.F() != null) {
            if (bVar2.F().containsKey("command_manager")) {
                this.f21978a = (com.mbridge.msdk.newreward.function.c.c) bVar2.F().get("command_manager");
            }
            if (bVar2.F().containsKey("adapter_model")) {
                this.f21979b = (com.mbridge.msdk.newreward.a.e) bVar2.F().get("adapter_model");
            }
        }
        if (u8 == null) {
            bVar.a(bVar2);
            return;
        }
        if (u8.e() == 1) {
            this.f21980c = 1;
        } else {
            this.f21980c = 2;
        }
        a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_START, bVar2, 0, "");
        u8.k().a(0, new x() { // from class: com.mbridge.msdk.newreward.a.b.d.1
            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar3, com.mbridge.msdk.newreward.function.d.a.a aVar, q qVar) {
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar3, com.mbridge.msdk.newreward.function.d.a.a aVar, q qVar) {
                if (bVar3.x()) {
                    bVar.a(bVar3);
                }
                d.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, bVar3, 1, "");
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar3, com.mbridge.msdk.newreward.function.d.a.a aVar, q qVar, MBridgeError mBridgeError) {
                String str;
                if (mBridgeError != null) {
                    str = mBridgeError.getErrorMessage();
                } else {
                    str = "";
                }
                d.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, bVar3, 3, str);
                a(bVar3, bVar, mBridgeError, "errorCode: 3203 errorMessage:");
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar3, com.mbridge.msdk.newreward.function.d.a.a aVar, q qVar, MBridgeError mBridgeError) {
                String str;
                if (mBridgeError != null) {
                    str = mBridgeError.getErrorMessage();
                } else {
                    str = "";
                }
                d.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, bVar3, 2, str);
                a(bVar3, bVar, mBridgeError, "errorCode: 3401 errorMessage: ");
            }

            private void a(com.mbridge.msdk.newreward.function.d.a.b bVar3, b bVar4, MBridgeError mBridgeError, String str) {
                int errorCode;
                String errorMessage;
                if (bVar3.x()) {
                    try {
                        bVar4.a(bVar3);
                        return;
                    } catch (Exception e8) {
                        if (MBridgeConstans.DEBUG) {
                            ad.a("ReqDownBigTempleService", "doReq: ", e8);
                            return;
                        }
                        return;
                    }
                }
                if (mBridgeError == null) {
                    errorMessage = "big temp load fail ";
                    errorCode = -1;
                } else {
                    try {
                        errorCode = mBridgeError.getErrorCode();
                        errorMessage = mBridgeError.getErrorMessage();
                    } catch (Exception e9) {
                        if (MBridgeConstans.DEBUG) {
                            ad.a("ReqDownBigTempleService", "doReq: ", e9);
                            return;
                        }
                        return;
                    }
                }
                if (u8.c()) {
                    return;
                }
                bVar4.a(com.mbridge.msdk.foundation.c.a.a(errorCode, 880005, str + errorMessage));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.newreward.function.c.e eVar, com.mbridge.msdk.newreward.function.d.a.b bVar, int i8, String str) {
        com.mbridge.msdk.newreward.function.c.c cVar = this.f21978a;
        if (cVar == null || this.f21979b == null) {
            return;
        }
        try {
            Map a9 = cVar.a("resource_type", 1, "url", bVar.u().j());
            int i9 = AnonymousClass2.f21984a[eVar.ordinal()];
            if (i9 != 1) {
                if (i9 == 2 && this.f21980c == 2) {
                    a9.put("result", Integer.valueOf(i8));
                    if (i8 != 1) {
                        a9.put("reason", str);
                    }
                    this.f21978a.a(this.f21979b, eVar, a9);
                    return;
                }
                return;
            }
            a9.put("cache", Integer.valueOf(this.f21980c));
            this.f21978a.a(this.f21979b, eVar, a9);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }
}
