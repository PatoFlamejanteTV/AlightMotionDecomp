package X1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class a extends ArrayList implements List, c, f {
    public static String d(List list, g gVar) {
        StringBuilder sb = new StringBuilder();
        try {
            k(list, sb, gVar);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public static void k(Iterable iterable, Appendable appendable, g gVar) {
        if (iterable == null) {
            appendable.append("null");
        } else {
            a2.d.f14063g.a(iterable, appendable, gVar);
        }
    }

    @Override // X1.c
    public String c(g gVar) {
        return d(this, gVar);
    }

    @Override // X1.e
    public void e(Appendable appendable) {
        k(this, appendable, i.f10944a);
    }

    @Override // X1.b
    public String g() {
        return d(this, i.f10944a);
    }

    @Override // X1.f
    public void j(Appendable appendable, g gVar) {
        k(this, appendable, gVar);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return g();
    }
}
