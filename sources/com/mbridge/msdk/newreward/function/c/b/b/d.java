package com.mbridge.msdk.newreward.function.c.b.b;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Map;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private int f22206a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f22207b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.newreward.function.c.b.b.d$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22211a;

        static {
            int[] iArr = new int[com.mbridge.msdk.newreward.function.c.e.values().length];
            f22211a = iArr;
            try {
                iArr[com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22211a[com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final void a(final e eVar, final com.mbridge.msdk.newreward.a.b.b bVar) {
        com.mbridge.msdk.newreward.a.e b9;
        com.mbridge.msdk.newreward.function.d.a.b b10;
        if (eVar == null || (b9 = eVar.b()) == null || b9.x() == null || (b10 = b9.x().b()) == null) {
            return;
        }
        a(com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_START, eVar, "", false);
        b9.d();
        b9.y().a(b10, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.function.c.b.b.d.1
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
                if (bVar != null) {
                    d.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_END, eVar, "", true);
                    bVar.a(obj);
                }
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar2) {
                if (bVar != null) {
                    d.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_END, eVar, bVar2 != null ? bVar2.b() : "", false);
                    bVar.a(bVar2);
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:            if (((java.lang.Boolean) r2).booleanValue() == false) goto L27;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.mbridge.msdk.newreward.function.c.b.b.e r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L8b
            com.mbridge.msdk.foundation.c.b r1 = r11.a()
            if (r1 == 0) goto L8b
            com.mbridge.msdk.newreward.a.e r1 = r11.b()
            if (r1 == 0) goto L8b
            com.mbridge.msdk.foundation.c.b r1 = r11.a()
            int r1 = r1.a()
            r2 = 2
            if (r1 != r2) goto L1b
            goto L8b
        L1b:
            com.mbridge.msdk.newreward.a.e r1 = r11.b()
            com.mbridge.msdk.newreward.function.f.a r1 = r1.x()
            if (r1 != 0) goto L26
            return r0
        L26:
            com.mbridge.msdk.newreward.function.d.a.b r1 = r1.b()
            if (r1 != 0) goto L2d
            return r0
        L2d:
            com.mbridge.msdk.newreward.a.e r1 = r11.b()
            com.mbridge.msdk.newreward.function.f.d r1 = r1.y()
            if (r1 != 0) goto L38
            return r0
        L38:
            com.mbridge.msdk.foundation.tools.af r1 = com.mbridge.msdk.foundation.tools.af.a()
            java.lang.String r2 = "retry_strategy"
            java.lang.String r3 = "download_retry_max"
            int r1 = r1.a(r2, r3, r0)
            if (r1 != 0) goto L47
            return r0
        L47:
            com.mbridge.msdk.foundation.c.b r2 = r11.a()
            java.lang.String r3 = "can_retry"
            java.lang.Object r2 = r2.a(r3)
            if (r2 == 0) goto L5c
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Exception -> L5b
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Exception -> L5b
            if (r2 != 0) goto L5c
        L5b:
            return r0
        L5c:
            int r2 = r10.f22206a
            if (r2 != 0) goto L66
            long r2 = java.lang.System.currentTimeMillis()
            r10.f22207b = r2
        L66:
            int r2 = r10.f22206a
            r3 = 1
            int r2 = r2 + r3
            r10.f22206a = r2
            com.mbridge.msdk.newreward.a.e r2 = r11.b()
            int r2 = r2.J()
            long r4 = (long) r2
            com.mbridge.msdk.newreward.a.e r11 = r11.b()
            long r6 = r11.f()
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r8 = r8 - r6
            int r11 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r11 >= 0) goto L8b
            int r11 = r10.f22206a
            if (r11 > r1) goto L8b
            r0 = 1
        L8b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.function.c.b.b.d.a(com.mbridge.msdk.newreward.function.c.b.b.e):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.newreward.function.c.e eVar, e eVar2, String str, boolean z8) {
        if (eVar2 == null) {
            return;
        }
        com.mbridge.msdk.newreward.function.c.c d8 = eVar2.d();
        com.mbridge.msdk.newreward.a.e b9 = eVar2.b();
        if (d8 == null || b9 == null) {
            return;
        }
        try {
            Map a9 = d8.a("retry_count", Integer.valueOf(this.f22206a), "type", 3);
            int i8 = AnonymousClass2.f22211a[eVar.ordinal()];
            if (i8 == 1) {
                d8.a(b9, com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_START, a9);
                return;
            }
            if (i8 != 2) {
                return;
            }
            a9.put(TypedValues.TransitionType.S_DURATION, Long.valueOf(System.currentTimeMillis() - this.f22207b));
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
