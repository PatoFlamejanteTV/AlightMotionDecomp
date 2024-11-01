package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface OnPlacedModifier extends Modifier.Element {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(OnPlacedModifier onPlacedModifier, Function1 function1) {
            boolean a9;
            a9 = androidx.compose.ui.b.a(onPlacedModifier, function1);
            return a9;
        }

        @Deprecated
        public static boolean any(OnPlacedModifier onPlacedModifier, Function1 function1) {
            boolean b9;
            b9 = androidx.compose.ui.b.b(onPlacedModifier, function1);
            return b9;
        }

        @Deprecated
        public static <R> R foldIn(OnPlacedModifier onPlacedModifier, R r8, InterfaceC2072n interfaceC2072n) {
            Object c8;
            c8 = androidx.compose.ui.b.c(onPlacedModifier, r8, interfaceC2072n);
            return (R) c8;
        }

        @Deprecated
        public static <R> R foldOut(OnPlacedModifier onPlacedModifier, R r8, InterfaceC2072n interfaceC2072n) {
            Object d8;
            d8 = androidx.compose.ui.b.d(onPlacedModifier, r8, interfaceC2072n);
            return (R) d8;
        }

        @Deprecated
        public static Modifier then(OnPlacedModifier onPlacedModifier, Modifier modifier) {
            Modifier a9;
            a9 = androidx.compose.ui.a.a(onPlacedModifier, modifier);
            return a9;
        }
    }

    void onPlaced(LayoutCoordinates layoutCoordinates);
}
