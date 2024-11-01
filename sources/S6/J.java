package s6;

import U5.g;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.V0;

/* loaded from: classes5.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final C3980F f39169a = new C3980F("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC2072n f39170b = a.f39173a;

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC2072n f39171c = b.f39174a;

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC2072n f39172d = c.f39175a;

    /* loaded from: classes5.dex */
    static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f39173a = new a();

        a() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, g.b bVar) {
            Integer num;
            int i8;
            if (bVar instanceof V0) {
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                } else {
                    num = null;
                }
                if (num != null) {
                    i8 = num.intValue();
                } else {
                    i8 = 1;
                }
                if (i8 != 0) {
                    return Integer.valueOf(i8 + 1);
                }
                return bVar;
            }
            return obj;
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f39174a = new b();

        b() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V0 invoke(V0 v02, g.b bVar) {
            if (v02 != null) {
                return v02;
            }
            if (bVar instanceof V0) {
                return (V0) bVar;
            }
            return null;
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f39175a = new c();

        c() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P invoke(P p8, g.b bVar) {
            if (bVar instanceof V0) {
                V0 v02 = (V0) bVar;
                p8.a(v02, v02.updateThreadContext(p8.f39182a));
            }
            return p8;
        }
    }

    public static final void a(U5.g gVar, Object obj) {
        if (obj == f39169a) {
            return;
        }
        if (obj instanceof P) {
            ((P) obj).b(gVar);
            return;
        }
        Object fold = gVar.fold(null, f39171c);
        AbstractC3292y.g(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((V0) fold).restoreThreadContext(gVar, obj);
    }

    public static final Object b(U5.g gVar) {
        Object fold = gVar.fold(0, f39170b);
        AbstractC3292y.f(fold);
        return fold;
    }

    public static final Object c(U5.g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        if (obj == 0) {
            return f39169a;
        }
        if (obj instanceof Integer) {
            return gVar.fold(new P(gVar, ((Number) obj).intValue()), f39172d);
        }
        AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((V0) obj).updateThreadContext(gVar);
    }
}
