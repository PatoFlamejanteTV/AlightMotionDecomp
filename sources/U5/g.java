package U5;

import U5.e;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes5.dex */
public interface g {

    /* loaded from: classes5.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: U5.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0215a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            public static final C0215a f10148a = new C0215a();

            C0215a() {
                super(2);
            }

            @Override // c6.InterfaceC2072n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g invoke(g acc, b element) {
                U5.c cVar;
                AbstractC3292y.i(acc, "acc");
                AbstractC3292y.i(element, "element");
                g minusKey = acc.minusKey(element.getKey());
                h hVar = h.f10149a;
                if (minusKey != hVar) {
                    e.b bVar = e.f10146a0;
                    e eVar = (e) minusKey.get(bVar);
                    if (eVar == null) {
                        cVar = new U5.c(minusKey, element);
                    } else {
                        g minusKey2 = minusKey.minusKey(bVar);
                        if (minusKey2 == hVar) {
                            return new U5.c(element, eVar);
                        }
                        cVar = new U5.c(new U5.c(minusKey2, element), eVar);
                    }
                    return cVar;
                }
                return element;
            }
        }

        public static g a(g gVar, g context) {
            AbstractC3292y.i(context, "context");
            if (context != h.f10149a) {
                return (g) context.fold(gVar, C0215a.f10148a);
            }
            return gVar;
        }
    }

    /* loaded from: classes5.dex */
    public interface b extends g {

        /* loaded from: classes5.dex */
        public static final class a {
            public static Object a(b bVar, Object obj, InterfaceC2072n operation) {
                AbstractC3292y.i(operation, "operation");
                return operation.invoke(obj, bVar);
            }

            public static b b(b bVar, c key) {
                AbstractC3292y.i(key, "key");
                if (AbstractC3292y.d(bVar.getKey(), key)) {
                    AbstractC3292y.g(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return bVar;
                }
                return null;
            }

            public static g c(b bVar, c key) {
                AbstractC3292y.i(key, "key");
                if (AbstractC3292y.d(bVar.getKey(), key)) {
                    return h.f10149a;
                }
                return bVar;
            }

            public static g d(b bVar, g context) {
                AbstractC3292y.i(context, "context");
                return a.a(bVar, context);
            }
        }

        @Override // U5.g
        Object fold(Object obj, InterfaceC2072n interfaceC2072n);

        @Override // U5.g
        b get(c cVar);

        c getKey();

        @Override // U5.g
        g minusKey(c cVar);
    }

    /* loaded from: classes5.dex */
    public interface c {
    }

    Object fold(Object obj, InterfaceC2072n interfaceC2072n);

    b get(c cVar);

    g minusKey(c cVar);

    g plus(g gVar);
}
