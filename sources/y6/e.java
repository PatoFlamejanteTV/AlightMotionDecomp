package y6;

import A6.d;
import A6.j;
import C6.AbstractC1007b;
import Q5.I;
import Q5.InterfaceC1416k;
import Q5.o;
import R5.AbstractC1428l;
import R5.AbstractC1435t;
import j6.InterfaceC3214c;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.Y;
import z6.AbstractC4273a;

/* loaded from: classes5.dex */
public final class e extends AbstractC1007b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3214c f41174a;

    /* renamed from: b, reason: collision with root package name */
    private List f41175b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1416k f41176c;

    /* loaded from: classes5.dex */
    static final class a extends AbstractC3293z implements Function0 {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: y6.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0943a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f41178a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0943a(e eVar) {
                super(1);
                this.f41178a = eVar;
            }

            public final void a(A6.a buildSerialDescriptor) {
                AbstractC3292y.i(buildSerialDescriptor, "$this$buildSerialDescriptor");
                A6.a.b(buildSerialDescriptor, "type", AbstractC4273a.D(Y.f34578a).a(), null, false, 12, null);
                A6.a.b(buildSerialDescriptor, "value", A6.i.c("kotlinx.serialization.Polymorphic<" + this.f41178a.j().b() + '>', j.a.f286a, new A6.f[0], null, 8, null), null, false, 12, null);
                buildSerialDescriptor.h(this.f41178a.f41175b);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((A6.a) obj);
                return I.f8786a;
            }
        }

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A6.f invoke() {
            return A6.b.c(A6.i.b("kotlinx.serialization.Polymorphic", d.a.f254a, new A6.f[0], new C0943a(e.this)), e.this.j());
        }
    }

    public e(InterfaceC3214c baseClass) {
        AbstractC3292y.i(baseClass, "baseClass");
        this.f41174a = baseClass;
        this.f41175b = AbstractC1435t.m();
        this.f41176c = Q5.l.a(o.f8804b, new a());
    }

    @Override // y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return (A6.f) this.f41176c.getValue();
    }

    @Override // C6.AbstractC1007b
    public InterfaceC3214c j() {
        return this.f41174a;
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + j() + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC3214c baseClass, Annotation[] classAnnotations) {
        this(baseClass);
        AbstractC3292y.i(baseClass, "baseClass");
        AbstractC3292y.i(classAnnotations, "classAnnotations");
        this.f41175b = AbstractC1428l.c(classAnnotations);
    }
}
