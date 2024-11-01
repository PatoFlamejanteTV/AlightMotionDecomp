package com.mbridge.msdk.newreward.function.c.b.b;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.a.a f22187a;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f22188b = false;

    /* renamed from: c, reason: collision with root package name */
    private int f22189c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f22190d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.newreward.function.c.b.b.b$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22194a;

        static {
            int[] iArr = new int[com.mbridge.msdk.newreward.function.c.e.values().length];
            f22194a = iArr;
            try {
                iArr[com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22194a[com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b(com.mbridge.msdk.newreward.function.c.a.a aVar) {
        this.f22187a = aVar;
    }

    public final boolean a() {
        return this.f22188b;
    }

    public final void a(final e eVar, final com.mbridge.msdk.newreward.a.b.b bVar) {
        a(com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_START, eVar, null, false);
        if (eVar == null) {
            return;
        }
        com.mbridge.msdk.newreward.function.c.b bVar2 = new com.mbridge.msdk.newreward.function.c.b();
        bVar2.a(com.mbridge.msdk.newreward.function.c.e.REQ_CAMPAIGN);
        HashMap hashMap = new HashMap();
        com.mbridge.msdk.newreward.a.e b9 = eVar.b();
        hashMap.put("adapter_model", b9);
        hashMap.put("command_manager", eVar.d());
        bVar2.a(hashMap);
        b9.c();
        this.f22187a.a(bVar2, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.function.c.b.b.b.1
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
                b.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_END, eVar, "", true);
                bVar.a(obj);
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar3) {
                b.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_END, eVar, bVar3 != null ? bVar3.b() : "", false);
                b.this.f22188b = true;
                bVar.a(bVar3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.newreward.function.c.e eVar, e eVar2, String str, boolean z8) {
        if (eVar2 == null) {
            return;
        }
        if (this.f22190d == 0) {
            this.f22190d = System.currentTimeMillis();
        }
        com.mbridge.msdk.newreward.function.c.c d8 = eVar2.d();
        com.mbridge.msdk.newreward.a.e b9 = eVar2.b();
        if (d8 == null || b9 == null) {
            return;
        }
        try {
            Map a9 = d8.a("retry_count", 1, "type", 2);
            int i8 = AnonymousClass2.f22194a[eVar.ordinal()];
            if (i8 == 1) {
                d8.a(b9, com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_START, a9);
                return;
            }
            if (i8 != 2) {
                return;
            }
            a9.put(TypedValues.TransitionType.S_DURATION, Long.valueOf(System.currentTimeMillis() - this.f22190d));
            if (!z8) {
                a9.put("reason", str);
            }
            a9.put("result", Integer.valueOf(z8 ? 1 : 2));
            d8.a(b9, com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_END, a9);
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }
}
