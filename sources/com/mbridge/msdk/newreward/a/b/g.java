package com.mbridge.msdk.newreward.a.b;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.newreward.function.d.c.q;
import com.mbridge.msdk.newreward.function.d.c.x;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes4.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.c f21999a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.newreward.a.e f22000b;

    /* renamed from: c, reason: collision with root package name */
    private int f22001c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.newreward.a.b.g$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22004a;

        static {
            int[] iArr = new int[com.mbridge.msdk.newreward.function.c.e.values().length];
            f22004a = iArr;
            try {
                iArr[com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22004a[com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.b.a
    public final void a(Object obj, final b bVar) throws IOException {
        com.mbridge.msdk.newreward.function.d.a.a aVar = (com.mbridge.msdk.newreward.function.d.a.a) obj;
        com.mbridge.msdk.newreward.function.d.c.h b9 = aVar.b();
        if (aVar.h().F() != null) {
            if (aVar.h().F().containsKey("command_manager")) {
                this.f21999a = (com.mbridge.msdk.newreward.function.c.c) aVar.h().F().get("command_manager");
            }
            if (aVar.h().F().containsKey("adapter_model")) {
                this.f22000b = (com.mbridge.msdk.newreward.a.e) aVar.h().F().get("adapter_model");
            }
        }
        if (b9 == null) {
            bVar.a(aVar);
            return;
        }
        if (b9.e() == 1) {
            this.f22001c = 1;
        } else {
            this.f22001c = 2;
        }
        a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_START, 0, aVar, null);
        b9.k().a(0, new x() { // from class: com.mbridge.msdk.newreward.a.b.g.1
            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.function.d.a.a aVar2, q qVar) {
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.function.d.a.a aVar2, q qVar) {
                if (bVar2.x()) {
                    bVar.a(aVar2);
                }
                g.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, 1, aVar2, null);
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.function.d.a.a aVar2, q qVar, MBridgeError mBridgeError) {
                if (bVar2.x()) {
                    bVar.a(aVar2);
                }
                g.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, 3, aVar2, mBridgeError);
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.function.d.a.a aVar2, q qVar, MBridgeError mBridgeError) {
                if (bVar2.x()) {
                    bVar.a(aVar2);
                }
                g.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, 2, aVar2, mBridgeError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.newreward.function.c.e eVar, int i8, com.mbridge.msdk.newreward.function.d.a.a aVar, MBridgeError mBridgeError) {
        com.mbridge.msdk.newreward.function.c.c cVar = this.f21999a;
        if (cVar == null || this.f22000b == null) {
            return;
        }
        try {
            Map a9 = cVar.a("resource_type", 6, "scenes", 1, "url", aVar.b().j(), "mraid_type", Integer.valueOf(aVar.i() ? 1 : 0));
            int i9 = AnonymousClass2.f22004a[eVar.ordinal()];
            if (i9 != 1) {
                if (i9 == 2 && this.f22001c == 2) {
                    a9.put("result", Integer.valueOf(i8));
                    if (i8 != 1 && mBridgeError != null) {
                        a9.put("reason", mBridgeError.getErrorMessage());
                    }
                    this.f21999a.a(this.f22000b, eVar, a9);
                    return;
                }
                return;
            }
            a9.put("cache", Integer.valueOf(this.f22001c));
            this.f21999a.a(this.f22000b, eVar, a9);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }
}
