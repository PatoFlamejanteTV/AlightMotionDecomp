package n6;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: n6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3450e {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f35704b = AtomicIntegerFieldUpdater.newUpdater(C3450e.class, "notCompletedCount");

    /* renamed from: a, reason: collision with root package name */
    private final U[] f35705a;
    private volatile int notCompletedCount;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n6.e$a */
    /* loaded from: classes5.dex */
    public final class a extends E0 {

        /* renamed from: h, reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f35706h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer");
        private volatile Object _disposer;

        /* renamed from: e, reason: collision with root package name */
        private final InterfaceC3470o f35707e;

        /* renamed from: f, reason: collision with root package name */
        public InterfaceC3449d0 f35708f;

        public a(InterfaceC3470o interfaceC3470o) {
            this.f35707e = interfaceC3470o;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            r((Throwable) obj);
            return Q5.I.f8786a;
        }

        @Override // n6.AbstractC3439E
        public void r(Throwable th) {
            if (th != null) {
                Object m8 = this.f35707e.m(th);
                if (m8 != null) {
                    this.f35707e.C(m8);
                    b u8 = u();
                    if (u8 != null) {
                        u8.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C3450e.f35704b.decrementAndGet(C3450e.this) == 0) {
                InterfaceC3470o interfaceC3470o = this.f35707e;
                U[] uArr = C3450e.this.f35705a;
                ArrayList arrayList = new ArrayList(uArr.length);
                for (U u9 : uArr) {
                    arrayList.add(u9.g());
                }
                interfaceC3470o.resumeWith(Q5.s.b(arrayList));
            }
        }

        public final b u() {
            return (b) f35706h.get(this);
        }

        public final InterfaceC3449d0 v() {
            InterfaceC3449d0 interfaceC3449d0 = this.f35708f;
            if (interfaceC3449d0 != null) {
                return interfaceC3449d0;
            }
            AbstractC3292y.y("handle");
            return null;
        }

        public final void w(b bVar) {
            f35706h.set(this, bVar);
        }

        public final void x(InterfaceC3449d0 interfaceC3449d0) {
            this.f35708f = interfaceC3449d0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n6.e$b */
    /* loaded from: classes5.dex */
    public final class b extends AbstractC3466m {

        /* renamed from: a, reason: collision with root package name */
        private final a[] f35710a;

        public b(a[] aVarArr) {
            this.f35710a = aVarArr;
        }

        @Override // n6.AbstractC3468n
        public void a(Throwable th) {
            b();
        }

        public final void b() {
            for (a aVar : this.f35710a) {
                aVar.v().dispose();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Q5.I.f8786a;
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f35710a + ']';
        }
    }

    public C3450e(U[] uArr) {
        this.f35705a = uArr;
        this.notCompletedCount = uArr.length;
    }

    public final Object c(U5.d dVar) {
        C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
        c3472p.B();
        int length = this.f35705a.length;
        a[] aVarArr = new a[length];
        for (int i8 = 0; i8 < length; i8++) {
            U u8 = this.f35705a[i8];
            u8.start();
            a aVar = new a(c3472p);
            aVar.x(u8.u(aVar));
            Q5.I i9 = Q5.I.f8786a;
            aVarArr[i8] = aVar;
        }
        b bVar = new b(aVarArr);
        for (int i10 = 0; i10 < length; i10++) {
            aVarArr[i10].w(bVar);
        }
        if (c3472p.b()) {
            bVar.b();
        } else {
            c3472p.f(bVar);
        }
        Object y8 = c3472p.y();
        if (y8 == V5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y8;
    }
}
