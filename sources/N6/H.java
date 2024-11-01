package n6;

import U5.g;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes5.dex */
public abstract class H {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35655a = new a();

        a() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final U5.g invoke(U5.g gVar, g.b bVar) {
            return gVar.plus(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.T f35656a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35657b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.jvm.internal.T t8, boolean z8) {
            super(2);
            this.f35656a = t8;
            this.f35657b = z8;
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final U5.g invoke(U5.g gVar, g.b bVar) {
            return gVar.plus(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f35658a = new c();

        c() {
            super(2);
        }

        public final Boolean a(boolean z8, g.b bVar) {
            return Boolean.valueOf(z8);
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (g.b) obj2);
        }
    }

    private static final U5.g a(U5.g gVar, U5.g gVar2, boolean z8) {
        boolean c8 = c(gVar);
        boolean c9 = c(gVar2);
        if (!c8 && !c9) {
            return gVar.plus(gVar2);
        }
        kotlin.jvm.internal.T t8 = new kotlin.jvm.internal.T();
        t8.f34573a = gVar2;
        U5.h hVar = U5.h.f10149a;
        U5.g gVar3 = (U5.g) gVar.fold(hVar, new b(t8, z8));
        if (c9) {
            t8.f34573a = ((U5.g) t8.f34573a).fold(hVar, a.f35655a);
        }
        return gVar3.plus((U5.g) t8.f34573a);
    }

    public static final String b(U5.g gVar) {
        return null;
    }

    private static final boolean c(U5.g gVar) {
        return ((Boolean) gVar.fold(Boolean.FALSE, c.f35658a)).booleanValue();
    }

    public static final U5.g d(U5.g gVar, U5.g gVar2) {
        if (!c(gVar2)) {
            return gVar.plus(gVar2);
        }
        return a(gVar, gVar2, false);
    }

    public static final U5.g e(M m8, U5.g gVar) {
        U5.g a9 = a(m8.getCoroutineContext(), gVar, true);
        if (a9 != C3445b0.a() && a9.get(U5.e.f10146a0) == null) {
            return a9.plus(C3445b0.a());
        }
        return a9;
    }

    public static final c1 f(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof Y) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof c1) {
                return (c1) eVar;
            }
        }
        return null;
    }

    public static final c1 g(U5.d dVar, U5.g gVar, Object obj) {
        if (!(dVar instanceof kotlin.coroutines.jvm.internal.e) || gVar.get(d1.f35703a) == null) {
            return null;
        }
        c1 f8 = f((kotlin.coroutines.jvm.internal.e) dVar);
        if (f8 != null) {
            f8.O0(gVar, obj);
        }
        return f8;
    }
}
