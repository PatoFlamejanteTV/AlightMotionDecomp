package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface FocusRequesterModifier extends Modifier.Element {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(FocusRequesterModifier focusRequesterModifier, Function1 function1) {
            boolean a9;
            a9 = androidx.compose.ui.b.a(focusRequesterModifier, function1);
            return a9;
        }

        @Deprecated
        public static boolean any(FocusRequesterModifier focusRequesterModifier, Function1 function1) {
            boolean b9;
            b9 = androidx.compose.ui.b.b(focusRequesterModifier, function1);
            return b9;
        }

        @Deprecated
        public static <R> R foldIn(FocusRequesterModifier focusRequesterModifier, R r8, InterfaceC2072n interfaceC2072n) {
            Object c8;
            c8 = androidx.compose.ui.b.c(focusRequesterModifier, r8, interfaceC2072n);
            return (R) c8;
        }

        @Deprecated
        public static <R> R foldOut(FocusRequesterModifier focusRequesterModifier, R r8, InterfaceC2072n interfaceC2072n) {
            Object d8;
            d8 = androidx.compose.ui.b.d(focusRequesterModifier, r8, interfaceC2072n);
            return (R) d8;
        }

        @Deprecated
        public static Modifier then(FocusRequesterModifier focusRequesterModifier, Modifier modifier) {
            Modifier a9;
            a9 = androidx.compose.ui.a.a(focusRequesterModifier, modifier);
            return a9;
        }
    }

    FocusRequester getFocusRequester();
}
