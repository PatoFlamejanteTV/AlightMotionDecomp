package com.mbridge.msdk.newreward.a.b;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.newreward.function.d.c.q;
import com.mbridge.msdk.newreward.function.d.c.x;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes4.dex */
public final class i implements a {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.c f22007a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.newreward.a.e f22008b;

    /* renamed from: c, reason: collision with root package name */
    private int f22009c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.newreward.a.b.i$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22012a;

        static {
            int[] iArr = new int[com.mbridge.msdk.newreward.function.c.e.values().length];
            f22012a = iArr;
            try {
                iArr[com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22012a[com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.b.a
    public final void a(Object obj, final b bVar) throws IOException {
        com.mbridge.msdk.newreward.function.d.a.a aVar = (com.mbridge.msdk.newreward.function.d.a.a) obj;
        com.mbridge.msdk.newreward.function.d.c.l e8 = aVar.e();
        if (aVar.h().F() != null) {
            if (aVar.h().F().containsKey("command_manager")) {
                this.f22007a = (com.mbridge.msdk.newreward.function.c.c) aVar.h().F().get("command_manager");
            }
            if (aVar.h().F().containsKey("adapter_model")) {
                this.f22008b = (com.mbridge.msdk.newreward.a.e) aVar.h().F().get("adapter_model");
            }
        }
        if (e8 == null) {
            bVar.a(aVar);
            return;
        }
        if (e8.e() == 1) {
            this.f22009c = 1;
        } else {
            this.f22009c = 2;
        }
        a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_START, 0, aVar, null);
        e8.k().a(0, new x() { // from class: com.mbridge.msdk.newreward.a.b.i.1
            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.function.d.a.a aVar2, q qVar) {
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.function.d.a.a aVar2, q qVar) {
                if (bVar2.x()) {
                    bVar.a(aVar2);
                }
                i.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, 1, aVar2, null);
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.function.d.a.a aVar2, q qVar, MBridgeError mBridgeError) {
                if (bVar2.x()) {
                    bVar.a(aVar2);
                }
                i.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, 3, aVar2, mBridgeError);
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.function.d.a.a aVar2, q qVar, MBridgeError mBridgeError) {
                if (bVar2.x()) {
                    bVar.a(aVar2);
                }
                i.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, 2, aVar2, mBridgeError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.newreward.function.c.e eVar, int i8, com.mbridge.msdk.newreward.function.d.a.a aVar, MBridgeError mBridgeError) {
        com.mbridge.msdk.newreward.function.c.c cVar = this.f22007a;
        if (cVar == null || this.f22008b == null) {
            return;
        }
        try {
            Map a9 = cVar.a("resource_type", 7, "url", aVar.e().j(), "mraid_type", Integer.valueOf(aVar.i() ? 1 : 0));
            int i9 = AnonymousClass2.f22012a[eVar.ordinal()];
            if (i9 != 1) {
                if (i9 == 2 && this.f22009c == 2) {
                    a9.put("result", Integer.valueOf(i8));
                    if (i8 != 1 && mBridgeError != null) {
                        a9.put("reason", mBridgeError.getErrorMessage());
                    }
                    this.f22007a.a(this.f22008b, eVar, a9);
                    return;
                }
                return;
            }
            a9.put("cache", Integer.valueOf(this.f22009c));
            this.f22007a.a(this.f22008b, eVar, a9);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }
}
