package E6;

import C6.C1031v;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.C3289v;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final C1031v f2081a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2082b;

    /* loaded from: classes5.dex */
    /* synthetic */ class a extends C3289v implements InterfaceC2072n {
        a(Object obj) {
            super(2, obj, y.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        public final Boolean d(A6.f p02, int i8) {
            AbstractC3292y.i(p02, "p0");
            return Boolean.valueOf(((y) this.receiver).e(p02, i8));
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return d((A6.f) obj, ((Number) obj2).intValue());
        }
    }

    public y(A6.f descriptor) {
        AbstractC3292y.i(descriptor, "descriptor");
        this.f2081a = new C1031v(descriptor, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(A6.f fVar, int i8) {
        boolean z8;
        if (!fVar.i(i8) && fVar.h(i8).c()) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f2082b = z8;
        return z8;
    }

    public final boolean b() {
        return this.f2082b;
    }

    public final void c(int i8) {
        this.f2081a.a(i8);
    }

    public final int d() {
        return this.f2081a.d();
    }
}
