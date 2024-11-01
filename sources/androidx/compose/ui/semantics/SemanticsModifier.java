package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.b;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface SemanticsModifier extends Modifier.Element {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(SemanticsModifier semanticsModifier, Function1 function1) {
            boolean a9;
            a9 = b.a(semanticsModifier, function1);
            return a9;
        }

        @Deprecated
        public static boolean any(SemanticsModifier semanticsModifier, Function1 function1) {
            boolean b9;
            b9 = b.b(semanticsModifier, function1);
            return b9;
        }

        @Deprecated
        public static <R> R foldIn(SemanticsModifier semanticsModifier, R r8, InterfaceC2072n interfaceC2072n) {
            Object c8;
            c8 = b.c(semanticsModifier, r8, interfaceC2072n);
            return (R) c8;
        }

        @Deprecated
        public static <R> R foldOut(SemanticsModifier semanticsModifier, R r8, InterfaceC2072n interfaceC2072n) {
            Object d8;
            d8 = b.d(semanticsModifier, r8, interfaceC2072n);
            return (R) d8;
        }

        @Deprecated
        public static int getId(SemanticsModifier semanticsModifier) {
            int a9;
            a9 = a.a(semanticsModifier);
            return a9;
        }

        public static /* synthetic */ void getId$annotations() {
        }

        @Deprecated
        public static Modifier then(SemanticsModifier semanticsModifier, Modifier modifier) {
            Modifier a9;
            a9 = androidx.compose.ui.a.a(semanticsModifier, modifier);
            return a9;
        }
    }

    int getId();

    SemanticsConfiguration getSemanticsConfiguration();
}
