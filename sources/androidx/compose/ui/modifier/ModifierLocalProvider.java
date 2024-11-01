package androidx.compose.ui.modifier;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;

@Stable
/* loaded from: classes.dex */
public interface ModifierLocalProvider<T> extends Modifier.Element {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> boolean all(ModifierLocalProvider<T> modifierLocalProvider, Function1 function1) {
            boolean a9;
            a9 = androidx.compose.ui.b.a(modifierLocalProvider, function1);
            return a9;
        }

        @Deprecated
        public static <T> boolean any(ModifierLocalProvider<T> modifierLocalProvider, Function1 function1) {
            boolean b9;
            b9 = androidx.compose.ui.b.b(modifierLocalProvider, function1);
            return b9;
        }

        @Deprecated
        public static <T, R> R foldIn(ModifierLocalProvider<T> modifierLocalProvider, R r8, InterfaceC2072n interfaceC2072n) {
            Object c8;
            c8 = androidx.compose.ui.b.c(modifierLocalProvider, r8, interfaceC2072n);
            return (R) c8;
        }

        @Deprecated
        public static <T, R> R foldOut(ModifierLocalProvider<T> modifierLocalProvider, R r8, InterfaceC2072n interfaceC2072n) {
            Object d8;
            d8 = androidx.compose.ui.b.d(modifierLocalProvider, r8, interfaceC2072n);
            return (R) d8;
        }

        @Deprecated
        public static <T> Modifier then(ModifierLocalProvider<T> modifierLocalProvider, Modifier modifier) {
            Modifier a9;
            a9 = androidx.compose.ui.a.a(modifierLocalProvider, modifier);
            return a9;
        }
    }

    ProvidableModifierLocal<T> getKey();

    T getValue();
}
