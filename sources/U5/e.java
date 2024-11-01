package U5;

import U5.g;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public interface e extends g.b {

    /* renamed from: a0, reason: collision with root package name */
    public static final b f10146a0 = b.f10147a;

    /* loaded from: classes5.dex */
    public static final class a {
        public static g.b a(e eVar, g.c key) {
            AbstractC3292y.i(key, "key");
            if (key instanceof U5.b) {
                U5.b bVar = (U5.b) key;
                if (!bVar.a(eVar.getKey())) {
                    return null;
                }
                g.b b9 = bVar.b(eVar);
                if (!(b9 instanceof g.b)) {
                    return null;
                }
                return b9;
            }
            if (e.f10146a0 != key) {
                return null;
            }
            AbstractC3292y.g(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
            return eVar;
        }

        public static g b(e eVar, g.c key) {
            AbstractC3292y.i(key, "key");
            if (key instanceof U5.b) {
                U5.b bVar = (U5.b) key;
                if (bVar.a(eVar.getKey()) && bVar.b(eVar) != null) {
                    return h.f10149a;
                }
                return eVar;
            }
            if (e.f10146a0 == key) {
                return h.f10149a;
            }
            return eVar;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b implements g.c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f10147a = new b();

        private b() {
        }
    }

    d interceptContinuation(d dVar);

    void releaseInterceptedContinuation(d dVar);
}
