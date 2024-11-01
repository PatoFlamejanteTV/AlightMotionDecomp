package I1;

import C1.i;
import C1.k;
import C1.n;
import android.text.TextUtils;

/* loaded from: classes4.dex */
public abstract class g {
    public static void a() {
        if (B1.a.b()) {
        } else {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    public static void b(k kVar, C1.f fVar, i iVar) {
        if (kVar != k.NONE) {
            if (fVar == C1.f.DEFINED_BY_JAVASCRIPT && kVar == k.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            if (iVar == i.DEFINED_BY_JAVASCRIPT && kVar == k.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            return;
        }
        throw new IllegalArgumentException("Impression owner is none");
    }

    public static void c(n nVar) {
        i(nVar);
        g(nVar);
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static void e(String str, int i8, String str2) {
        if (str.length() <= i8) {
        } else {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void f(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
        } else {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void g(n nVar) {
        if (!nVar.u()) {
        } else {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static void h(n nVar) {
        if (!nVar.z()) {
        } else {
            throw new IllegalStateException("AdSession is started");
        }
    }

    private static void i(n nVar) {
        if (nVar.z()) {
        } else {
            throw new IllegalStateException("AdSession is not started");
        }
    }

    public static void j(n nVar) {
        if (nVar.x()) {
        } else {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    public static void k(n nVar) {
        if (nVar.y()) {
        } else {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    public static void l(n nVar) {
        if (nVar.w().q() == null) {
        } else {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    public static void m(n nVar) {
        if (nVar.w().r() == null) {
        } else {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }
}
