package androidx.compose.ui.platform;

import U5.g;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface InfiniteAnimationPolicy extends g.b {
    public static final Key Key = Key.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static <R> R fold(InfiniteAnimationPolicy infiniteAnimationPolicy, R r8, InterfaceC2072n interfaceC2072n) {
            return (R) g.b.a.a(infiniteAnimationPolicy, r8, interfaceC2072n);
        }

        public static <E extends g.b> E get(InfiniteAnimationPolicy infiniteAnimationPolicy, g.c cVar) {
            return (E) g.b.a.b(infiniteAnimationPolicy, cVar);
        }

        @Deprecated
        public static g.c getKey(InfiniteAnimationPolicy infiniteAnimationPolicy) {
            g.c a9;
            a9 = J.a(infiniteAnimationPolicy);
            return a9;
        }

        public static U5.g minusKey(InfiniteAnimationPolicy infiniteAnimationPolicy, g.c cVar) {
            return g.b.a.c(infiniteAnimationPolicy, cVar);
        }

        public static U5.g plus(InfiniteAnimationPolicy infiniteAnimationPolicy, U5.g gVar) {
            return g.b.a.d(infiniteAnimationPolicy, gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class Key implements g.c {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @Override // U5.g.b, U5.g
    /* synthetic */ Object fold(Object obj, InterfaceC2072n interfaceC2072n);

    @Override // U5.g.b, U5.g
    /* synthetic */ g.b get(g.c cVar);

    @Override // U5.g.b
    g.c getKey();

    @Override // U5.g.b, U5.g
    /* synthetic */ U5.g minusKey(g.c cVar);

    <R> Object onInfiniteOperation(Function1 function1, U5.d dVar);

    @Override // U5.g
    /* synthetic */ U5.g plus(U5.g gVar);
}
