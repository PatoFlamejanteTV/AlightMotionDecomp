package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface DrawCacheModifier extends DrawModifier {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(DrawCacheModifier drawCacheModifier, Function1 function1) {
            boolean a9;
            a9 = androidx.compose.ui.b.a(drawCacheModifier, function1);
            return a9;
        }

        @Deprecated
        public static boolean any(DrawCacheModifier drawCacheModifier, Function1 function1) {
            boolean b9;
            b9 = androidx.compose.ui.b.b(drawCacheModifier, function1);
            return b9;
        }

        @Deprecated
        public static <R> R foldIn(DrawCacheModifier drawCacheModifier, R r8, InterfaceC2072n interfaceC2072n) {
            Object c8;
            c8 = androidx.compose.ui.b.c(drawCacheModifier, r8, interfaceC2072n);
            return (R) c8;
        }

        @Deprecated
        public static <R> R foldOut(DrawCacheModifier drawCacheModifier, R r8, InterfaceC2072n interfaceC2072n) {
            Object d8;
            d8 = androidx.compose.ui.b.d(drawCacheModifier, r8, interfaceC2072n);
            return (R) d8;
        }

        @Deprecated
        public static Modifier then(DrawCacheModifier drawCacheModifier, Modifier modifier) {
            Modifier a9;
            a9 = androidx.compose.ui.a.a(drawCacheModifier, modifier);
            return a9;
        }
    }

    void onBuildCache(BuildDrawCacheParams buildDrawCacheParams);
}
