package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface DrawModifier extends Modifier.Element {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(DrawModifier drawModifier, Function1 function1) {
            boolean a9;
            a9 = androidx.compose.ui.b.a(drawModifier, function1);
            return a9;
        }

        @Deprecated
        public static boolean any(DrawModifier drawModifier, Function1 function1) {
            boolean b9;
            b9 = androidx.compose.ui.b.b(drawModifier, function1);
            return b9;
        }

        @Deprecated
        public static <R> R foldIn(DrawModifier drawModifier, R r8, InterfaceC2072n interfaceC2072n) {
            Object c8;
            c8 = androidx.compose.ui.b.c(drawModifier, r8, interfaceC2072n);
            return (R) c8;
        }

        @Deprecated
        public static <R> R foldOut(DrawModifier drawModifier, R r8, InterfaceC2072n interfaceC2072n) {
            Object d8;
            d8 = androidx.compose.ui.b.d(drawModifier, r8, interfaceC2072n);
            return (R) d8;
        }

        @Deprecated
        public static Modifier then(DrawModifier drawModifier, Modifier modifier) {
            Modifier a9;
            a9 = androidx.compose.ui.a.a(drawModifier, modifier);
            return a9;
        }
    }

    void draw(ContentDrawScope contentDrawScope);
}
