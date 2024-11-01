package w6;

import Q5.I;
import U5.g;
import c6.InterfaceC2073o;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import n6.C3472p;
import n6.InterfaceC3470o;
import n6.Q;
import n6.e1;
import n6.r;
import s6.AbstractC3977C;
import s6.C3980F;
import v6.InterfaceC4136a;

/* renamed from: w6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C4159b extends C4161d implements InterfaceC4158a {

    /* renamed from: i, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f40750i = AtomicReferenceFieldUpdater.newUpdater(C4159b.class, Object.class, "owner");

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC2073o f40751h;
    private volatile Object owner;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w6.b$a */
    /* loaded from: classes5.dex */
    public final class a implements InterfaceC3470o, e1 {

        /* renamed from: a, reason: collision with root package name */
        public final C3472p f40752a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f40753b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: w6.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0923a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4159b f40755a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f40756b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0923a(C4159b c4159b, a aVar) {
                super(1);
                this.f40755a = c4159b;
                this.f40756b = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return I.f8786a;
            }

            public final void invoke(Throwable th) {
                this.f40755a.d(this.f40756b.f40753b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: w6.b$a$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0924b extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4159b f40757a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f40758b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0924b(C4159b c4159b, a aVar) {
                super(1);
                this.f40757a = c4159b;
                this.f40758b = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return I.f8786a;
            }

            public final void invoke(Throwable th) {
                C4159b.f40750i.set(this.f40757a, this.f40758b.f40753b);
                this.f40757a.d(this.f40758b.f40753b);
            }
        }

        public a(C3472p c3472p, Object obj) {
            this.f40752a = c3472p;
            this.f40753b = obj;
        }

        @Override // n6.InterfaceC3470o
        public void C(Object obj) {
            this.f40752a.C(obj);
        }

        @Override // n6.e1
        public void a(AbstractC3977C abstractC3977C, int i8) {
            this.f40752a.a(abstractC3977C, i8);
        }

        @Override // n6.InterfaceC3470o
        public boolean b() {
            return this.f40752a.b();
        }

        @Override // n6.InterfaceC3470o
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void o(I i8, Function1 function1) {
            C4159b.f40750i.set(C4159b.this, this.f40753b);
            this.f40752a.o(i8, new C0923a(C4159b.this, this));
        }

        @Override // n6.InterfaceC3470o
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void e(n6.I i8, I i9) {
            this.f40752a.e(i8, i9);
        }

        @Override // n6.InterfaceC3470o
        public void f(Function1 function1) {
            this.f40752a.f(function1);
        }

        @Override // n6.InterfaceC3470o
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Object n(I i8, Object obj, Function1 function1) {
            Object n8 = this.f40752a.n(i8, obj, new C0924b(C4159b.this, this));
            if (n8 != null) {
                C4159b.f40750i.set(C4159b.this, this.f40753b);
            }
            return n8;
        }

        @Override // U5.d
        public g getContext() {
            return this.f40752a.getContext();
        }

        @Override // n6.InterfaceC3470o
        public boolean isActive() {
            return this.f40752a.isActive();
        }

        @Override // n6.InterfaceC3470o
        public Object m(Throwable th) {
            return this.f40752a.m(th);
        }

        @Override // U5.d
        public void resumeWith(Object obj) {
            this.f40752a.resumeWith(obj);
        }

        @Override // n6.InterfaceC3470o
        public boolean t(Throwable th) {
            return this.f40752a.t(th);
        }
    }

    /* renamed from: w6.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0925b extends AbstractC3293z implements InterfaceC2073o {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: w6.b$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4159b f40760a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f40761b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C4159b c4159b, Object obj) {
                super(1);
                this.f40760a = c4159b;
                this.f40761b = obj;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return I.f8786a;
            }

            public final void invoke(Throwable th) {
                this.f40760a.d(this.f40761b);
            }
        }

        C0925b() {
            super(3);
        }

        public final Function1 a(InterfaceC4136a interfaceC4136a, Object obj, Object obj2) {
            return new a(C4159b.this, obj);
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            android.support.v4.media.a.a(obj);
            return a(null, obj2, obj3);
        }
    }

    public C4159b(boolean z8) {
        super(1, z8 ? 1 : 0);
        C3980F c3980f;
        if (!z8) {
            c3980f = AbstractC4160c.f40762a;
        } else {
            c3980f = null;
        }
        this.owner = c3980f;
        this.f40751h = new C0925b();
    }

    private final int o(Object obj) {
        C3980F c3980f;
        while (c()) {
            Object obj2 = f40750i.get(this);
            c3980f = AbstractC4160c.f40762a;
            if (obj2 != c3980f) {
                if (obj2 == obj) {
                    return 1;
                }
                return 2;
            }
        }
        return 0;
    }

    static /* synthetic */ Object p(C4159b c4159b, Object obj, U5.d dVar) {
        if (c4159b.b(obj)) {
            return I.f8786a;
        }
        Object q8 = c4159b.q(obj, dVar);
        if (q8 == V5.b.e()) {
            return q8;
        }
        return I.f8786a;
    }

    private final Object q(Object obj, U5.d dVar) {
        C3472p b9 = r.b(V5.b.c(dVar));
        try {
            e(new a(b9, obj));
            Object y8 = b9.y();
            if (y8 == V5.b.e()) {
                h.c(dVar);
            }
            if (y8 == V5.b.e()) {
                return y8;
            }
            return I.f8786a;
        } catch (Throwable th) {
            b9.K();
            throw th;
        }
    }

    private final int r(Object obj) {
        while (!k()) {
            if (obj == null) {
                return 1;
            }
            int o8 = o(obj);
            if (o8 == 1) {
                return 2;
            }
            if (o8 == 2) {
                return 1;
            }
        }
        f40750i.set(this, obj);
        return 0;
    }

    @Override // w6.InterfaceC4158a
    public Object a(Object obj, U5.d dVar) {
        return p(this, obj, dVar);
    }

    @Override // w6.InterfaceC4158a
    public boolean b(Object obj) {
        int r8 = r(obj);
        if (r8 == 0) {
            return true;
        }
        if (r8 != 1) {
            if (r8 != 2) {
                throw new IllegalStateException("unexpected".toString());
            }
            throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
        }
        return false;
    }

    @Override // w6.InterfaceC4158a
    public boolean c() {
        if (i() == 0) {
            return true;
        }
        return false;
    }

    @Override // w6.InterfaceC4158a
    public void d(Object obj) {
        C3980F c3980f;
        C3980F c3980f2;
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40750i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            c3980f = AbstractC4160c.f40762a;
            if (obj2 != c3980f) {
                if (obj2 == obj || obj == null) {
                    c3980f2 = AbstractC4160c.f40762a;
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj2, c3980f2)) {
                        j();
                        return;
                    }
                } else {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public String toString() {
        return "Mutex@" + Q.b(this) + "[isLocked=" + c() + ",owner=" + f40750i.get(this) + ']';
    }
}
