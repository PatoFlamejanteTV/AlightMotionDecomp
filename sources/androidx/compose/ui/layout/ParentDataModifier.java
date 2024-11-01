package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface ParentDataModifier extends Modifier.Element {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(ParentDataModifier parentDataModifier, Function1 function1) {
            boolean a9;
            a9 = androidx.compose.ui.b.a(parentDataModifier, function1);
            return a9;
        }

        @Deprecated
        public static boolean any(ParentDataModifier parentDataModifier, Function1 function1) {
            boolean b9;
            b9 = androidx.compose.ui.b.b(parentDataModifier, function1);
            return b9;
        }

        @Deprecated
        public static <R> R foldIn(ParentDataModifier parentDataModifier, R r8, InterfaceC2072n interfaceC2072n) {
            Object c8;
            c8 = androidx.compose.ui.b.c(parentDataModifier, r8, interfaceC2072n);
            return (R) c8;
        }

        @Deprecated
        public static <R> R foldOut(ParentDataModifier parentDataModifier, R r8, InterfaceC2072n interfaceC2072n) {
            Object d8;
            d8 = androidx.compose.ui.b.d(parentDataModifier, r8, interfaceC2072n);
            return (R) d8;
        }

        @Deprecated
        public static Modifier then(ParentDataModifier parentDataModifier, Modifier modifier) {
            Modifier a9;
            a9 = androidx.compose.ui.a.a(parentDataModifier, modifier);
            return a9;
        }
    }

    Object modifyParentData(Density density, Object obj);
}
