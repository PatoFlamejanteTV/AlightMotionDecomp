package n6;

import U5.e;
import U5.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import s6.AbstractC3994n;
import s6.C3990j;
import s6.C3993m;

/* loaded from: classes5.dex */
public abstract class I extends U5.a implements U5.e {
    public static final a Key = new a(null);

    /* loaded from: classes5.dex */
    public static final class a extends U5.b {

        /* renamed from: n6.I$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0812a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0812a f35660a = new C0812a();

            C0812a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final I invoke(g.b bVar) {
                if (bVar instanceof I) {
                    return (I) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }

        private a() {
            super(U5.e.f10146a0, C0812a.f35660a);
        }
    }

    public I() {
        super(U5.e.f10146a0);
    }

    public abstract void dispatch(U5.g gVar, Runnable runnable);

    public void dispatchYield(U5.g gVar, Runnable runnable) {
        dispatch(gVar, runnable);
    }

    @Override // U5.a, U5.g.b, U5.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) e.a.a(this, cVar);
    }

    @Override // U5.e
    public final <T> U5.d interceptContinuation(U5.d dVar) {
        return new C3990j(this, dVar);
    }

    public boolean isDispatchNeeded(U5.g gVar) {
        return true;
    }

    public I limitedParallelism(int i8) {
        AbstractC3994n.a(i8);
        return new C3993m(this, i8);
    }

    @Override // U5.a, U5.g.b, U5.g
    public U5.g minusKey(g.c cVar) {
        return e.a.b(this, cVar);
    }

    @Override // U5.e
    public final void releaseInterceptedContinuation(U5.d dVar) {
        AbstractC3292y.g(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C3990j) dVar).u();
    }

    public String toString() {
        return Q.a(this) + '@' + Q.b(this);
    }

    public final I plus(I i8) {
        return i8;
    }
}
