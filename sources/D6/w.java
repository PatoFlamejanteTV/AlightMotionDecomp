package D6;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Y;
import z6.AbstractC4273a;

/* loaded from: classes5.dex */
public final class w implements y6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final w f1507a = new w();

    /* renamed from: b, reason: collision with root package name */
    private static final A6.f f1508b = a.f1509b;

    /* loaded from: classes5.dex */
    private static final class a implements A6.f {

        /* renamed from: b, reason: collision with root package name */
        public static final a f1509b = new a();

        /* renamed from: c, reason: collision with root package name */
        private static final String f1510c = "kotlinx.serialization.json.JsonObject";

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ A6.f f1511a = AbstractC4273a.i(AbstractC4273a.D(Y.f34578a), k.f1486a).a();

        private a() {
        }

        @Override // A6.f
        public String a() {
            return f1510c;
        }

        @Override // A6.f
        public boolean c() {
            return this.f1511a.c();
        }

        @Override // A6.f
        public int d(String name) {
            AbstractC3292y.i(name, "name");
            return this.f1511a.d(name);
        }

        @Override // A6.f
        public int e() {
            return this.f1511a.e();
        }

        @Override // A6.f
        public String f(int i8) {
            return this.f1511a.f(i8);
        }

        @Override // A6.f
        public List g(int i8) {
            return this.f1511a.g(i8);
        }

        @Override // A6.f
        public List getAnnotations() {
            return this.f1511a.getAnnotations();
        }

        @Override // A6.f
        public A6.j getKind() {
            return this.f1511a.getKind();
        }

        @Override // A6.f
        public A6.f h(int i8) {
            return this.f1511a.h(i8);
        }

        @Override // A6.f
        public boolean i(int i8) {
            return this.f1511a.i(i8);
        }

        @Override // A6.f
        public boolean isInline() {
            return this.f1511a.isInline();
        }
    }

    private w() {
    }

    @Override // y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return f1508b;
    }

    @Override // y6.InterfaceC4248a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public v d(B6.e decoder) {
        AbstractC3292y.i(decoder, "decoder");
        l.g(decoder);
        return new v((Map) AbstractC4273a.i(AbstractC4273a.D(Y.f34578a), k.f1486a).d(decoder));
    }

    @Override // y6.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(B6.f encoder, v value) {
        AbstractC3292y.i(encoder, "encoder");
        AbstractC3292y.i(value, "value");
        l.h(encoder);
        AbstractC4273a.i(AbstractC4273a.D(Y.f34578a), k.f1486a).e(encoder, value);
    }
}
