package E6;

import A6.j;
import A6.k;
import j6.InterfaceC3214c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class M implements F6.d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f2025a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2026b;

    public M(boolean z8, String discriminator) {
        AbstractC3292y.i(discriminator, "discriminator");
        this.f2025a = z8;
        this.f2026b = discriminator;
    }

    private final void d(A6.f fVar, InterfaceC3214c interfaceC3214c) {
        int e8 = fVar.e();
        for (int i8 = 0; i8 < e8; i8++) {
            String f8 = fVar.f(i8);
            if (AbstractC3292y.d(f8, this.f2026b)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + interfaceC3214c + " has property '" + f8 + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    private final void e(A6.f fVar, InterfaceC3214c interfaceC3214c) {
        A6.j kind = fVar.getKind();
        if (!(kind instanceof A6.d) && !AbstractC3292y.d(kind, j.a.f286a)) {
            if (this.f2025a) {
                return;
            }
            if (!AbstractC3292y.d(kind, k.b.f289a) && !AbstractC3292y.d(kind, k.c.f290a) && !(kind instanceof A6.e) && !(kind instanceof j.b)) {
                return;
            }
            throw new IllegalArgumentException("Serializer for " + interfaceC3214c.b() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
        }
        throw new IllegalArgumentException("Serializer for " + interfaceC3214c.b() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
    }

    @Override // F6.d
    public void a(InterfaceC3214c baseClass, Function1 defaultSerializerProvider) {
        AbstractC3292y.i(baseClass, "baseClass");
        AbstractC3292y.i(defaultSerializerProvider, "defaultSerializerProvider");
    }

    @Override // F6.d
    public void b(InterfaceC3214c baseClass, InterfaceC3214c actualClass, y6.b actualSerializer) {
        AbstractC3292y.i(baseClass, "baseClass");
        AbstractC3292y.i(actualClass, "actualClass");
        AbstractC3292y.i(actualSerializer, "actualSerializer");
        A6.f a9 = actualSerializer.a();
        e(a9, actualClass);
        if (!this.f2025a) {
            d(a9, actualClass);
        }
    }

    @Override // F6.d
    public void c(InterfaceC3214c baseClass, Function1 defaultDeserializerProvider) {
        AbstractC3292y.i(baseClass, "baseClass");
        AbstractC3292y.i(defaultDeserializerProvider, "defaultDeserializerProvider");
    }
}
