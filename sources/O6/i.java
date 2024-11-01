package O6;

import K6.r;
import K6.x;
import java.net.Proxy;

/* loaded from: classes5.dex */
public abstract class i {
    public static String a(x xVar, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(xVar.g());
        sb.append(' ');
        if (b(xVar, type)) {
            sb.append(xVar.i());
        } else {
            sb.append(c(xVar.i()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    private static boolean b(x xVar, Proxy.Type type) {
        if (!xVar.f() && type == Proxy.Type.HTTP) {
            return true;
        }
        return false;
    }

    public static String c(r rVar) {
        String g8 = rVar.g();
        String i8 = rVar.i();
        if (i8 != null) {
            return g8 + '?' + i8;
        }
        return g8;
    }
}
