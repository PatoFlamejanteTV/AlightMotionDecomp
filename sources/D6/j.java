package D6;

import C6.E;
import E6.Q;
import E6.S;
import Q5.C1413h;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.Y;
import z6.AbstractC4273a;

/* loaded from: classes5.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static final A6.f f1485a = E.a("kotlinx.serialization.json.JsonUnquotedLiteral", AbstractC4273a.D(Y.f34578a));

    public static final x a(String str) {
        if (str == null) {
            return t.INSTANCE;
        }
        return new p(str, true, null, 4, null);
    }

    private static final Void b(i iVar, String str) {
        throw new IllegalArgumentException("Element " + U.b(iVar.getClass()) + " is not a " + str);
    }

    public static final Boolean c(x xVar) {
        AbstractC3292y.i(xVar, "<this>");
        return S.d(xVar.c());
    }

    public static final String d(x xVar) {
        AbstractC3292y.i(xVar, "<this>");
        if (xVar instanceof t) {
            return null;
        }
        return xVar.c();
    }

    public static final double e(x xVar) {
        AbstractC3292y.i(xVar, "<this>");
        return Double.parseDouble(xVar.c());
    }

    public static final float f(x xVar) {
        AbstractC3292y.i(xVar, "<this>");
        return Float.parseFloat(xVar.c());
    }

    public static final int g(x xVar) {
        AbstractC3292y.i(xVar, "<this>");
        try {
            long m8 = new Q(xVar.c()).m();
            if (-2147483648L <= m8 && m8 <= 2147483647L) {
                return (int) m8;
            }
            throw new NumberFormatException(xVar.c() + " is not an Int");
        } catch (E6.x e8) {
            throw new NumberFormatException(e8.getMessage());
        }
    }

    public static final v h(i iVar) {
        v vVar;
        AbstractC3292y.i(iVar, "<this>");
        if (iVar instanceof v) {
            vVar = (v) iVar;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            return vVar;
        }
        b(iVar, "JsonObject");
        throw new C1413h();
    }

    public static final x i(i iVar) {
        x xVar;
        AbstractC3292y.i(iVar, "<this>");
        if (iVar instanceof x) {
            xVar = (x) iVar;
        } else {
            xVar = null;
        }
        if (xVar != null) {
            return xVar;
        }
        b(iVar, "JsonPrimitive");
        throw new C1413h();
    }

    public static final A6.f j() {
        return f1485a;
    }

    public static final long k(x xVar) {
        AbstractC3292y.i(xVar, "<this>");
        try {
            return new Q(xVar.c()).m();
        } catch (E6.x e8) {
            throw new NumberFormatException(e8.getMessage());
        }
    }
}
