package D6;

import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import z6.AbstractC4273a;

/* loaded from: classes5.dex */
public final class c implements y6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1449a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final A6.f f1450b = a.f1451b;

    /* loaded from: classes5.dex */
    private static final class a implements A6.f {

        /* renamed from: b, reason: collision with root package name */
        public static final a f1451b = new a();

        /* renamed from: c, reason: collision with root package name */
        private static final String f1452c = "kotlinx.serialization.json.JsonArray";

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ A6.f f1453a = AbstractC4273a.g(k.f1486a).a();

        private a() {
        }

        @Override // A6.f
        public String a() {
            return f1452c;
        }

        @Override // A6.f
        public boolean c() {
            return this.f1453a.c();
        }

        @Override // A6.f
        public int d(String name) {
            AbstractC3292y.i(name, "name");
            return this.f1453a.d(name);
        }

        @Override // A6.f
        public int e() {
            return this.f1453a.e();
        }

        @Override // A6.f
        public String f(int i8) {
            return this.f1453a.f(i8);
        }

        @Override // A6.f
        public List g(int i8) {
            return this.f1453a.g(i8);
        }

        @Override // A6.f
        public List getAnnotations() {
            return this.f1453a.getAnnotations();
        }

        @Override // A6.f
        public A6.j getKind() {
            return this.f1453a.getKind();
        }

        @Override // A6.f
        public A6.f h(int i8) {
            return this.f1453a.h(i8);
        }

        @Override // A6.f
        public boolean i(int i8) {
            return this.f1453a.i(i8);
        }

        @Override // A6.f
        public boolean isInline() {
            return this.f1453a.isInline();
        }
    }

    private c() {
    }

    @Override // y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return f1450b;
    }

    @Override // y6.InterfaceC4248a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public b d(B6.e decoder) {
        AbstractC3292y.i(decoder, "decoder");
        l.b(decoder);
        return new b((List) AbstractC4273a.g(k.f1486a).d(decoder));
    }

    @Override // y6.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(B6.f encoder, b value) {
        AbstractC3292y.i(encoder, "encoder");
        AbstractC3292y.i(value, "value");
        l.c(encoder);
        AbstractC4273a.g(k.f1486a).e(encoder, value);
    }
}
