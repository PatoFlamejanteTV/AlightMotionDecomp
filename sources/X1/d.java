package X1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class d extends HashMap implements c, f {
    public static String a(Map map) {
        return b(map, i.f10944a);
    }

    public static String b(Map map, g gVar) {
        StringBuilder sb = new StringBuilder();
        try {
            f(map, sb, gVar);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public static void f(Map map, Appendable appendable, g gVar) {
        if (map == null) {
            appendable.append("null");
        } else {
            a2.d.f14065i.a(map, appendable, gVar);
        }
    }

    @Override // X1.c
    public String c(g gVar) {
        return b(this, gVar);
    }

    @Override // X1.e
    public void e(Appendable appendable) {
        f(this, appendable, i.f10944a);
    }

    @Override // X1.b
    public String g() {
        return b(this, i.f10944a);
    }

    @Override // X1.f
    public void j(Appendable appendable, g gVar) {
        f(this, appendable, gVar);
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return b(this, i.f10944a);
    }
}
