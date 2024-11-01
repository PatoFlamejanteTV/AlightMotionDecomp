package j4;

import C6.C1013e;
import Q5.s;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: j4.e0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3177e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C3177e0 f34112a = new C3177e0();

    /* renamed from: b, reason: collision with root package name */
    private static final D6.a f34113b = D6.o.b(null, a.f34115a, 1, null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f34114c = 8;

    /* renamed from: j4.e0$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34115a = new a();

        a() {
            super(1);
        }

        public final void a(D6.d Json) {
            AbstractC3292y.i(Json, "$this$Json");
            Json.f(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((D6.d) obj);
            return Q5.I.f8786a;
        }
    }

    private C3177e0() {
    }

    public final Object a(String str) {
        AbstractC3292y.i(str, "str");
        try {
            s.a aVar = Q5.s.f8810b;
            return Q5.s.b((List) f34113b.b(new C1013e(C3171b0.Companion.serializer()), str));
        } catch (Throwable th) {
            s.a aVar2 = Q5.s.f8810b;
            return Q5.s.b(Q5.t.a(th));
        }
    }
}
