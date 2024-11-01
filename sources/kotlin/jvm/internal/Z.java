package kotlin.jvm.internal;

import Q5.InterfaceC1412g;
import c6.InterfaceC2059a;
import c6.InterfaceC2060b;
import c6.InterfaceC2062d;
import c6.InterfaceC2063e;
import c6.InterfaceC2064f;
import c6.InterfaceC2065g;
import c6.InterfaceC2066h;
import c6.InterfaceC2067i;
import c6.InterfaceC2068j;
import c6.InterfaceC2069k;
import c6.InterfaceC2070l;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import c6.InterfaceC2074p;
import c6.InterfaceC2075q;
import c6.InterfaceC2076r;
import c6.InterfaceC2077s;
import c6.InterfaceC2078t;
import c6.InterfaceC2079u;
import d6.InterfaceC2767a;
import d6.InterfaceC2768b;
import d6.InterfaceC2769c;
import d6.InterfaceC2770d;
import d6.InterfaceC2771e;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public abstract class Z {
    public static Collection a(Object obj) {
        if ((obj instanceof InterfaceC2767a) && !(obj instanceof InterfaceC2768b)) {
            o(obj, "kotlin.collections.MutableCollection");
        }
        return e(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof InterfaceC2767a) && !(obj instanceof InterfaceC2769c)) {
            o(obj, "kotlin.collections.MutableIterable");
        }
        return f(obj);
    }

    public static Map c(Object obj) {
        if ((obj instanceof InterfaceC2767a) && !(obj instanceof InterfaceC2770d)) {
            o(obj, "kotlin.collections.MutableMap");
        }
        return g(obj);
    }

    public static Object d(Object obj, int i8) {
        if (obj != null && !i(obj, i8)) {
            o(obj, "kotlin.jvm.functions.Function" + i8);
        }
        return obj;
    }

    public static Collection e(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e8) {
            throw n(e8);
        }
    }

    public static Iterable f(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e8) {
            throw n(e8);
        }
    }

    public static Map g(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e8) {
            throw n(e8);
        }
    }

    public static int h(Object obj) {
        if (obj instanceof InterfaceC3287t) {
            return ((InterfaceC3287t) obj).getArity();
        }
        if (obj instanceof Function0) {
            return 0;
        }
        if (obj instanceof Function1) {
            return 1;
        }
        if (obj instanceof InterfaceC2072n) {
            return 2;
        }
        if (obj instanceof InterfaceC2073o) {
            return 3;
        }
        if (obj instanceof InterfaceC2074p) {
            return 4;
        }
        if (obj instanceof InterfaceC2075q) {
            return 5;
        }
        if (obj instanceof InterfaceC2076r) {
            return 6;
        }
        if (obj instanceof InterfaceC2077s) {
            return 7;
        }
        if (obj instanceof InterfaceC2078t) {
            return 8;
        }
        if (obj instanceof InterfaceC2079u) {
            return 9;
        }
        if (obj instanceof InterfaceC2059a) {
            return 10;
        }
        if (obj instanceof InterfaceC2060b) {
            return 11;
        }
        if (obj instanceof InterfaceC2062d) {
            return 13;
        }
        if (obj instanceof InterfaceC2063e) {
            return 14;
        }
        if (obj instanceof InterfaceC2064f) {
            return 15;
        }
        if (obj instanceof InterfaceC2065g) {
            return 16;
        }
        if (obj instanceof InterfaceC2066h) {
            return 17;
        }
        if (obj instanceof InterfaceC2067i) {
            return 18;
        }
        if (obj instanceof InterfaceC2068j) {
            return 19;
        }
        if (obj instanceof InterfaceC2069k) {
            return 20;
        }
        if (obj instanceof InterfaceC2070l) {
            return 21;
        }
        return -1;
    }

    public static boolean i(Object obj, int i8) {
        if ((obj instanceof InterfaceC1412g) && h(obj) == i8) {
            return true;
        }
        return false;
    }

    public static boolean j(Object obj) {
        if ((obj instanceof Map) && (!(obj instanceof InterfaceC2767a) || (obj instanceof InterfaceC2770d))) {
            return true;
        }
        return false;
    }

    public static boolean k(Object obj) {
        if ((obj instanceof Map.Entry) && (!(obj instanceof InterfaceC2767a) || (obj instanceof InterfaceC2770d.a))) {
            return true;
        }
        return false;
    }

    public static boolean l(Object obj) {
        if ((obj instanceof Set) && (!(obj instanceof InterfaceC2767a) || (obj instanceof InterfaceC2771e))) {
            return true;
        }
        return false;
    }

    private static Throwable m(Throwable th) {
        return AbstractC3292y.p(th, Z.class.getName());
    }

    public static ClassCastException n(ClassCastException classCastException) {
        throw ((ClassCastException) m(classCastException));
    }

    public static void o(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        p(name + " cannot be cast to " + str);
    }

    public static void p(String str) {
        throw n(new ClassCastException(str));
    }
}
