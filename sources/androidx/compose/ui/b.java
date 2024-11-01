package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static boolean a(Modifier.Element element, Function1 function1) {
        return ((Boolean) function1.invoke(element)).booleanValue();
    }

    public static boolean b(Modifier.Element element, Function1 function1) {
        return ((Boolean) function1.invoke(element)).booleanValue();
    }

    public static Object c(Modifier.Element element, Object obj, InterfaceC2072n interfaceC2072n) {
        return interfaceC2072n.invoke(obj, element);
    }

    public static Object d(Modifier.Element element, Object obj, InterfaceC2072n interfaceC2072n) {
        return interfaceC2072n.invoke(element, obj);
    }

    public static /* synthetic */ boolean e(Modifier.Element element, Function1 function1) {
        return a(element, function1);
    }

    public static /* synthetic */ boolean f(Modifier.Element element, Function1 function1) {
        return b(element, function1);
    }

    public static /* synthetic */ Object g(Modifier.Element element, Object obj, InterfaceC2072n interfaceC2072n) {
        return c(element, obj, interfaceC2072n);
    }

    public static /* synthetic */ Object h(Modifier.Element element, Object obj, InterfaceC2072n interfaceC2072n) {
        return d(element, obj, interfaceC2072n);
    }

    public static /* synthetic */ Modifier i(Modifier.Element element, Modifier modifier) {
        return a.a(element, modifier);
    }
}
