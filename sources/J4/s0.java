package j4;

import C6.C1013e;
import Q5.s;
import android.util.Log;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes4.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final s0 f34263a = new s0();

    /* renamed from: b, reason: collision with root package name */
    private static final D6.a f34264b = D6.o.b(null, a.f34266a, 1, null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f34265c = 8;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34266a = new a();

        a() {
            super(1);
        }

        public final void a(D6.d Json) {
            AbstractC3292y.i(Json, "$this$Json");
            Json.f(true);
            Json.c("#class");
            Json.d(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((D6.d) obj);
            return Q5.I.f8786a;
        }
    }

    private s0() {
    }

    public final Object a(String str) {
        Object b9;
        AbstractC3292y.i(str, "str");
        try {
            s.a aVar = Q5.s.f8810b;
            b9 = Q5.s.b((List) f34264b.b(new C1013e(H0.Companion.serializer()), str));
        } catch (Throwable th) {
            s.a aVar2 = Q5.s.f8810b;
            b9 = Q5.s.b(Q5.t.a(th));
        }
        Throwable e8 = Q5.s.e(b9);
        if (e8 != null) {
            Log.w("STRIPE", "Error parsing LPMs", e8);
        }
        return b9;
    }
}
