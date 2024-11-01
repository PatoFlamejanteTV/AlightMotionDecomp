package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface FocusOrderModifier extends Modifier.Element {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(FocusOrderModifier focusOrderModifier, Function1 function1) {
            boolean a9;
            a9 = androidx.compose.ui.b.a(focusOrderModifier, function1);
            return a9;
        }

        @Deprecated
        public static boolean any(FocusOrderModifier focusOrderModifier, Function1 function1) {
            boolean b9;
            b9 = androidx.compose.ui.b.b(focusOrderModifier, function1);
            return b9;
        }

        @Deprecated
        public static <R> R foldIn(FocusOrderModifier focusOrderModifier, R r8, InterfaceC2072n interfaceC2072n) {
            Object c8;
            c8 = androidx.compose.ui.b.c(focusOrderModifier, r8, interfaceC2072n);
            return (R) c8;
        }

        @Deprecated
        public static <R> R foldOut(FocusOrderModifier focusOrderModifier, R r8, InterfaceC2072n interfaceC2072n) {
            Object d8;
            d8 = androidx.compose.ui.b.d(focusOrderModifier, r8, interfaceC2072n);
            return (R) d8;
        }

        @Deprecated
        public static Modifier then(FocusOrderModifier focusOrderModifier, Modifier modifier) {
            Modifier a9;
            a9 = androidx.compose.ui.a.a(focusOrderModifier, modifier);
            return a9;
        }
    }

    void populateFocusOrder(FocusOrder focusOrder);
}
