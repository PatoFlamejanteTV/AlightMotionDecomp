package D6;

import A6.d;
import Q5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes5.dex */
public final class k implements y6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final k f1486a = new k();

    /* renamed from: b, reason: collision with root package name */
    private static final A6.f f1487b = A6.i.b("kotlinx.serialization.json.JsonElement", d.b.f255a, new A6.f[0], a.f1488a);

    /* loaded from: classes5.dex */
    static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1488a = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: D6.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0026a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0026a f1489a = new C0026a();

            C0026a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final A6.f invoke() {
                return y.f1512a.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final b f1490a = new b();

            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final A6.f invoke() {
                return u.f1503a.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class c extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final c f1491a = new c();

            c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final A6.f invoke() {
                return q.f1498a.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class d extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final d f1492a = new d();

            d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final A6.f invoke() {
                return w.f1507a.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class e extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            public static final e f1493a = new e();

            e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final A6.f invoke() {
                return D6.c.f1449a.a();
            }
        }

        a() {
            super(1);
        }

        public final void a(A6.a buildSerialDescriptor) {
            A6.f f8;
            A6.f f9;
            A6.f f10;
            A6.f f11;
            A6.f f12;
            AbstractC3292y.i(buildSerialDescriptor, "$this$buildSerialDescriptor");
            f8 = l.f(C0026a.f1489a);
            A6.a.b(buildSerialDescriptor, "JsonPrimitive", f8, null, false, 12, null);
            f9 = l.f(b.f1490a);
            A6.a.b(buildSerialDescriptor, "JsonNull", f9, null, false, 12, null);
            f10 = l.f(c.f1491a);
            A6.a.b(buildSerialDescriptor, "JsonLiteral", f10, null, false, 12, null);
            f11 = l.f(d.f1492a);
            A6.a.b(buildSerialDescriptor, "JsonObject", f11, null, false, 12, null);
            f12 = l.f(e.f1493a);
            A6.a.b(buildSerialDescriptor, "JsonArray", f12, null, false, 12, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((A6.a) obj);
            return I.f8786a;
        }
    }

    private k() {
    }

    @Override // y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return f1487b;
    }

    @Override // y6.InterfaceC4248a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public i d(B6.e decoder) {
        AbstractC3292y.i(decoder, "decoder");
        return l.d(decoder).l();
    }

    @Override // y6.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(B6.f encoder, i value) {
        AbstractC3292y.i(encoder, "encoder");
        AbstractC3292y.i(value, "value");
        l.h(encoder);
        if (value instanceof x) {
            encoder.z(y.f1512a, value);
        } else if (value instanceof v) {
            encoder.z(w.f1507a, value);
        } else if (value instanceof b) {
            encoder.z(c.f1449a, value);
        }
    }
}
