package w3;

import Q5.p;
import j4.C3168a;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import r4.AbstractC3910i;
import r4.W;
import w3.d;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f40702a = new f();

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40703a;

        static {
            int[] iArr = new int[d.b.values().length];
            try {
                iArr[d.b.f40689a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.b.f40690b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.b.f40691c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f40703a = iArr;
        }
    }

    private f() {
    }

    public final C3168a a(boolean z8, e eVar, Function0 onNavigation) {
        f fVar;
        d.b bVar;
        C3168a c3168a;
        String str;
        Set set;
        Set f8;
        String str2;
        Set set2;
        d a9;
        AbstractC3292y.i(onNavigation, "onNavigation");
        C3168a c3168a2 = null;
        if (eVar != null && (a9 = eVar.a()) != null) {
            bVar = a9.b();
            fVar = this;
        } else {
            fVar = this;
            bVar = null;
        }
        W b9 = fVar.b(bVar);
        if (z8) {
            if (eVar != null) {
                str2 = eVar.p();
            } else {
                str2 = null;
            }
            if (eVar != null) {
                set2 = eVar.i();
            } else {
                set2 = null;
            }
            c3168a = new C3168a(null, null, null, false, new AbstractC3910i.b(str2, set2, b9, onNavigation), false, 39, null);
        } else {
            if (eVar != null) {
                str = eVar.p();
            } else {
                str = null;
            }
            if (eVar != null) {
                set = eVar.i();
            } else {
                set = null;
            }
            c3168a = new C3168a(null, null, null, false, new AbstractC3910i.c(str, set, b9, onNavigation), false, 39, null);
        }
        if (eVar != null && (f8 = eVar.f()) != null) {
            c3168a2 = C3168a.l(c3168a, null, f8, null, false, null, false, 61, null);
        }
        if (c3168a2 != null) {
            return c3168a2;
        }
        return c3168a;
    }

    public final W b(d.b bVar) {
        int i8;
        if (bVar == null) {
            i8 = -1;
        } else {
            i8 = a.f40703a[bVar.ordinal()];
        }
        if (i8 != -1) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        return W.f38209d;
                    }
                    throw new p();
                }
                return W.f38208c;
            }
            return W.f38207b;
        }
        return W.f38208c;
    }
}
