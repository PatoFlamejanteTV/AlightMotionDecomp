package com.mbridge.msdk.newreward.function.c.b;

import com.mbridge.msdk.newreward.function.c.b.a.g;
import com.mbridge.msdk.newreward.function.c.b.a.h;
import com.mbridge.msdk.newreward.function.c.b.a.j;
import com.mbridge.msdk.newreward.function.c.b.a.k;
import com.mbridge.msdk.newreward.function.c.b.a.l;
import com.mbridge.msdk.newreward.function.c.e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f22216a;

    /* renamed from: b, reason: collision with root package name */
    private Map<e, Object> f22217b;

    /* renamed from: com.mbridge.msdk.newreward.function.c.b.c$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22218a;

        static {
            int[] iArr = new int[e.values().length];
            f22218a = iArr;
            try {
                iArr[e.RESTORE_DB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22218a[e.SMART_LOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22218a[e.NORMAL_LOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22218a[e.PRE_HANDLE_LOAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22218a[e.UNIT_INIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22218a[e.CHECK_IS_REQUEST_CONTROL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22218a[e.UPDATE_CAM_TOKEN_RULE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22218a[e.START_LOAD_CHECK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22218a[e.CANDIDATE_LOAD_ACTION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private c() {
    }

    public static c a() {
        if (f22216a == null) {
            synchronized (c.class) {
                try {
                    if (f22216a == null) {
                        f22216a = new c();
                    }
                } finally {
                }
            }
        }
        return f22216a;
    }

    public final <T extends d> T b(e eVar) {
        T t8 = null;
        switch (AnonymousClass1.f22218a[eVar.ordinal()]) {
            case 6:
                return new g();
            case 7:
                return new l();
            case 8:
                return new com.mbridge.msdk.newreward.function.c.b.a.c();
            case 9:
                if (this.f22217b == null) {
                    this.f22217b = new HashMap();
                }
                Map<e, Object> map = this.f22217b;
                e eVar2 = e.CANDIDATE_LOAD_ACTION;
                if (map.containsKey(eVar2)) {
                    t8 = (T) this.f22217b.get(eVar2);
                }
                if (t8 == null) {
                    com.mbridge.msdk.newreward.function.c.b.a.a aVar = new com.mbridge.msdk.newreward.function.c.b.a.a();
                    this.f22217b.put(eVar2, aVar);
                    return aVar;
                }
                return t8;
            default:
                return null;
        }
    }

    public final <T extends a> T a(e eVar) {
        int i8 = AnonymousClass1.f22218a[eVar.ordinal()];
        if (i8 == 1) {
            return new h();
        }
        if (i8 == 2) {
            return new j();
        }
        if (i8 == 3) {
            return new com.mbridge.msdk.newreward.function.c.b.a.d();
        }
        if (i8 == 4) {
            return new com.mbridge.msdk.newreward.function.c.b.a.e();
        }
        if (i8 != 5) {
            return null;
        }
        return new k();
    }
}
