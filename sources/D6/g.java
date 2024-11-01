package D6;

import A6.d;
import Q5.C1413h;
import j6.InterfaceC3214c;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.U;
import y6.InterfaceC4248a;

/* loaded from: classes5.dex */
public abstract class g implements y6.b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3214c f1483a;

    /* renamed from: b, reason: collision with root package name */
    private final A6.f f1484b;

    public g(InterfaceC3214c baseClass) {
        AbstractC3292y.i(baseClass, "baseClass");
        this.f1483a = baseClass;
        this.f1484b = A6.i.c("JsonContentPolymorphicSerializer<" + baseClass.b() + '>', d.b.f255a, new A6.f[0], null, 8, null);
    }

    private final Void g(InterfaceC3214c interfaceC3214c, InterfaceC3214c interfaceC3214c2) {
        String b9 = interfaceC3214c.b();
        if (b9 == null) {
            b9 = String.valueOf(interfaceC3214c);
        }
        throw new y6.h("Class '" + b9 + "' is not registered for polymorphic serialization " + ("in the scope of '" + interfaceC3214c2.b() + '\'') + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
    }

    @Override // y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return this.f1484b;
    }

    @Override // y6.InterfaceC4248a
    public final Object d(B6.e decoder) {
        AbstractC3292y.i(decoder, "decoder");
        h d8 = l.d(decoder);
        i l8 = d8.l();
        InterfaceC4248a f8 = f(l8);
        AbstractC3292y.g(f8, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
        return d8.d().a((y6.b) f8, l8);
    }

    @Override // y6.i
    public final void e(B6.f encoder, Object value) {
        AbstractC3292y.i(encoder, "encoder");
        AbstractC3292y.i(value, "value");
        y6.i e8 = encoder.b().e(this.f1483a, value);
        if (e8 == null && (e8 = y6.j.a(U.b(value.getClass()))) == null) {
            g(U.b(value.getClass()), this.f1483a);
            throw new C1413h();
        }
        ((y6.b) e8).e(encoder, value);
    }

    protected abstract InterfaceC4248a f(i iVar);
}
