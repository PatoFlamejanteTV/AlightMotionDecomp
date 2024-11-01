package k6;

import R5.AbstractC1428l;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: k6.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3261m extends AbstractC3260l {

    /* renamed from: k6.m$a */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC3255g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f34536a;

        public a(Iterator it) {
            this.f34536a = it;
        }

        @Override // k6.InterfaceC3255g
        public Iterator iterator() {
            return this.f34536a;
        }
    }

    /* renamed from: k6.m$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f34537a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke(Iterable it) {
            AbstractC3292y.i(it, "it");
            return it.iterator();
        }
    }

    /* renamed from: k6.m$d */
    /* loaded from: classes5.dex */
    static final class d extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f34539a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function0 function0) {
            super(1);
            this.f34539a = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object it) {
            AbstractC3292y.i(it, "it");
            return this.f34539a.invoke();
        }
    }

    /* renamed from: k6.m$e */
    /* loaded from: classes5.dex */
    static final class e extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f34540a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Object obj) {
            super(0);
            this.f34540a = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f34540a;
        }
    }

    public static InterfaceC3255g c(Iterator it) {
        AbstractC3292y.i(it, "<this>");
        return AbstractC3258j.d(new a(it));
    }

    public static InterfaceC3255g d(InterfaceC3255g interfaceC3255g) {
        AbstractC3292y.i(interfaceC3255g, "<this>");
        if (!(interfaceC3255g instanceof C3249a)) {
            return new C3249a(interfaceC3255g);
        }
        return interfaceC3255g;
    }

    public static InterfaceC3255g e() {
        return C3251c.f34511a;
    }

    private static final InterfaceC3255g f(InterfaceC3255g interfaceC3255g, Function1 function1) {
        if (interfaceC3255g instanceof C3266r) {
            return ((C3266r) interfaceC3255g).d(function1);
        }
        return new C3253e(interfaceC3255g, c.f34538a, function1);
    }

    public static InterfaceC3255g g(InterfaceC3255g interfaceC3255g) {
        AbstractC3292y.i(interfaceC3255g, "<this>");
        return f(interfaceC3255g, b.f34537a);
    }

    public static InterfaceC3255g h(Object obj, Function1 nextFunction) {
        AbstractC3292y.i(nextFunction, "nextFunction");
        if (obj == null) {
            return C3251c.f34511a;
        }
        return new C3254f(new e(obj), nextFunction);
    }

    public static InterfaceC3255g i(Function0 nextFunction) {
        AbstractC3292y.i(nextFunction, "nextFunction");
        return AbstractC3258j.d(new C3254f(nextFunction, new d(nextFunction)));
    }

    public static InterfaceC3255g j(Function0 seedFunction, Function1 nextFunction) {
        AbstractC3292y.i(seedFunction, "seedFunction");
        AbstractC3292y.i(nextFunction, "nextFunction");
        return new C3254f(seedFunction, nextFunction);
    }

    public static InterfaceC3255g k(Object... elements) {
        AbstractC3292y.i(elements, "elements");
        return AbstractC1428l.R(elements);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k6.m$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f34538a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return obj;
        }
    }
}
