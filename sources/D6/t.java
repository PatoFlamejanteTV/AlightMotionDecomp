package D6;

import Q5.InterfaceC1416k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

@y6.g(with = u.class)
/* loaded from: classes5.dex */
public final class t extends x {
    public static final t INSTANCE = new t();

    /* renamed from: a, reason: collision with root package name */
    private static final String f1500a = "null";

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC1416k f1501b = Q5.l.a(Q5.o.f8804b, a.f1502a);

    /* loaded from: classes5.dex */
    static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1502a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y6.b invoke() {
            return u.f1503a;
        }
    }

    private t() {
        super(null);
    }

    private final /* synthetic */ y6.b e() {
        return (y6.b) f1501b.getValue();
    }

    @Override // D6.x
    public String c() {
        return f1500a;
    }

    public final y6.b serializer() {
        return e();
    }
}
