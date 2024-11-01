package E3;

import A4.g;
import E3.c;
import Q5.I;
import Q5.t;
import R5.AbstractC1435t;
import androidx.recyclerview.widget.ItemTouchHelper;
import c6.InterfaceC2072n;
import java.io.Closeable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import m6.AbstractC3376c;
import m6.C3374a;
import m6.EnumC3377d;
import n6.AbstractC3462k;
import n6.M;
import n6.X;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;
import q6.w;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final M f1578a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f1579b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f1580c;

    /* renamed from: d, reason: collision with root package name */
    private final w f1581d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3813L f1582e;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1583a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E3.c invoke(List it) {
            AbstractC3292y.i(it, "it");
            return (E3.c) AbstractC1435t.y0(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0028b extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f1584a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0 f1585b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f1586c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0028b(Function0 function0, b bVar, U5.d dVar) {
            super(2, dVar);
            this.f1585b = function0;
            this.f1586c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C0028b(this.f1585b, this.f1586c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f1584a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C3374a.C0804a c0804a = C3374a.f35036b;
                long s8 = AbstractC3376c.s(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, EnumC3377d.f35045d);
                this.f1584a = 1;
                if (X.c(s8, this) == e8) {
                    return e8;
                }
            }
            this.f1585b.invoke();
            this.f1586c.f1580c.set(false);
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((C0028b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m0invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m0invoke() {
            b.this.j();
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3293z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ E3.c f1589b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(E3.c cVar) {
            super(0);
            this.f1589b = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m1invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m1invoke() {
            b.this.n(this.f1589b);
        }
    }

    public b(M coroutineScope, Function1 poppedScreenHandler) {
        AbstractC3292y.i(coroutineScope, "coroutineScope");
        AbstractC3292y.i(poppedScreenHandler, "poppedScreenHandler");
        this.f1578a = coroutineScope;
        this.f1579b = poppedScreenHandler;
        this.f1580c = new AtomicBoolean(false);
        w a9 = AbstractC3815N.a(AbstractC1435t.e(c.g.f1641a));
        this.f1581d = a9;
        this.f1582e = g.m(a9, a.f1583a);
    }

    private final void g(Function0 function0) {
        if (!this.f1580c.getAndSet(true)) {
            AbstractC3462k.d(this.f1578a, null, null, new C0028b(function0, this, null), 3, null);
        }
    }

    private final void h(E3.c cVar) {
        if (cVar instanceof Closeable) {
            ((Closeable) cVar).close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        Object value;
        List Z02;
        w wVar = this.f1581d;
        do {
            value = wVar.getValue();
            Z02 = AbstractC1435t.Z0((List) value);
            E3.c cVar = (E3.c) AbstractC1435t.P(Z02);
            h(cVar);
            this.f1579b.invoke(cVar);
        } while (!wVar.a(value, AbstractC1435t.W0(Z02)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(E3.c cVar) {
        Object value;
        w wVar = this.f1581d;
        do {
            value = wVar.getValue();
        } while (!wVar.a(value, AbstractC1435t.H0(AbstractC1435t.E0((List) value, c.g.f1641a), cVar)));
    }

    public final void d() {
        Iterator it = ((Iterable) this.f1581d.getValue()).iterator();
        while (it.hasNext()) {
            h((E3.c) it.next());
        }
    }

    public final boolean e() {
        if (((List) this.f1581d.getValue()).size() > 1) {
            return true;
        }
        return false;
    }

    public final InterfaceC3813L f() {
        return this.f1582e;
    }

    public final void i() {
        if (!this.f1580c.get()) {
            j();
        }
    }

    public final void k() {
        g(new c());
    }

    public final void l(List screens) {
        AbstractC3292y.i(screens, "screens");
        if (!this.f1580c.get()) {
            List<E3.c> list = (List) this.f1581d.getValue();
            this.f1581d.setValue(screens);
            for (E3.c cVar : list) {
                if (!screens.contains(cVar)) {
                    h(cVar);
                }
            }
        }
    }

    public final void m(E3.c target) {
        AbstractC3292y.i(target, "target");
        if (!this.f1580c.get()) {
            n(target);
        }
    }

    public final void o(E3.c target) {
        AbstractC3292y.i(target, "target");
        g(new d(target));
    }
}
