package C6;

import C6.C;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class E {

    /* loaded from: classes5.dex */
    public static final class a implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y6.b f1002a;

        a(y6.b bVar) {
            this.f1002a = bVar;
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // C6.C
        public y6.b[] b() {
            return C.a.a(this);
        }

        @Override // C6.C
        public y6.b[] c() {
            return new y6.b[]{this.f1002a};
        }

        @Override // y6.InterfaceC4248a
        public Object d(B6.e decoder) {
            AbstractC3292y.i(decoder, "decoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // y6.i
        public void e(B6.f encoder, Object obj) {
            AbstractC3292y.i(encoder, "encoder");
            throw new IllegalStateException("unsupported".toString());
        }
    }

    public static final A6.f a(String name, y6.b primitiveSerializer) {
        AbstractC3292y.i(name, "name");
        AbstractC3292y.i(primitiveSerializer, "primitiveSerializer");
        return new D(name, new a(primitiveSerializer));
    }
}
