package C6;

import A6.k;
import Q5.InterfaceC1416k;
import R5.AbstractC1428l;
import R5.AbstractC1435t;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: C6.a0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1006a0 implements y6.b {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1036a;

    /* renamed from: b, reason: collision with root package name */
    private List f1037b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1416k f1038c;

    /* renamed from: C6.a0$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1039a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1006a0 f1040b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: C6.a0$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0020a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1006a0 f1041a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0020a(C1006a0 c1006a0) {
                super(1);
                this.f1041a = c1006a0;
            }

            public final void a(A6.a buildSerialDescriptor) {
                AbstractC3292y.i(buildSerialDescriptor, "$this$buildSerialDescriptor");
                buildSerialDescriptor.h(this.f1041a.f1037b);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((A6.a) obj);
                return Q5.I.f8786a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, C1006a0 c1006a0) {
            super(0);
            this.f1039a = str;
            this.f1040b = c1006a0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A6.f invoke() {
            return A6.i.b(this.f1039a, k.d.f291a, new A6.f[0], new C0020a(this.f1040b));
        }
    }

    public C1006a0(String serialName, Object objectInstance) {
        AbstractC3292y.i(serialName, "serialName");
        AbstractC3292y.i(objectInstance, "objectInstance");
        this.f1036a = objectInstance;
        this.f1037b = AbstractC1435t.m();
        this.f1038c = Q5.l.a(Q5.o.f8804b, new a(serialName, this));
    }

    @Override // y6.b, y6.i, y6.InterfaceC4248a
    public A6.f a() {
        return (A6.f) this.f1038c.getValue();
    }

    @Override // y6.InterfaceC4248a
    public Object d(B6.e decoder) {
        int y8;
        AbstractC3292y.i(decoder, "decoder");
        A6.f a9 = a();
        B6.c c8 = decoder.c(a9);
        if (c8.z() || (y8 = c8.y(a())) == -1) {
            Q5.I i8 = Q5.I.f8786a;
            c8.a(a9);
            return this.f1036a;
        }
        throw new y6.h("Unexpected index " + y8);
    }

    @Override // y6.i
    public void e(B6.f encoder, Object value) {
        AbstractC3292y.i(encoder, "encoder");
        AbstractC3292y.i(value, "value");
        encoder.c(a()).a(a());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1006a0(String serialName, Object objectInstance, Annotation[] classAnnotations) {
        this(serialName, objectInstance);
        AbstractC3292y.i(serialName, "serialName");
        AbstractC3292y.i(objectInstance, "objectInstance");
        AbstractC3292y.i(classAnnotations, "classAnnotations");
        this.f1037b = AbstractC1428l.c(classAnnotations);
    }
}
