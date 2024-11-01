package androidx.compose.ui.platform;

import k6.InterfaceC3255g;

/* loaded from: classes.dex */
public interface InspectableValue {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static InterfaceC3255g getInspectableElements(InspectableValue inspectableValue) {
            InterfaceC3255g a9;
            a9 = K.a(inspectableValue);
            return a9;
        }

        @Deprecated
        public static String getNameFallback(InspectableValue inspectableValue) {
            String b9;
            b9 = K.b(inspectableValue);
            return b9;
        }

        @Deprecated
        public static Object getValueOverride(InspectableValue inspectableValue) {
            Object c8;
            c8 = K.c(inspectableValue);
            return c8;
        }
    }

    InterfaceC3255g getInspectableElements();

    String getNameFallback();

    Object getValueOverride();
}
