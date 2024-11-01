package C6;

import j6.InterfaceC3214c;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.C3277i;
import kotlin.jvm.internal.C3278j;
import kotlin.jvm.internal.C3280l;
import kotlin.jvm.internal.C3285q;
import kotlin.jvm.internal.C3291x;
import l6.AbstractC3335a;
import m6.C3374a;
import z6.AbstractC4273a;

/* loaded from: classes5.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f1075a = R5.Q.k(Q5.x.a(kotlin.jvm.internal.U.b(String.class), AbstractC4273a.D(kotlin.jvm.internal.Y.f34578a)), Q5.x.a(kotlin.jvm.internal.U.b(Character.TYPE), AbstractC4273a.x(C3280l.f34592a)), Q5.x.a(kotlin.jvm.internal.U.b(char[].class), AbstractC4273a.c()), Q5.x.a(kotlin.jvm.internal.U.b(Double.TYPE), AbstractC4273a.y(C3285q.f34601a)), Q5.x.a(kotlin.jvm.internal.U.b(double[].class), AbstractC4273a.d()), Q5.x.a(kotlin.jvm.internal.U.b(Float.TYPE), AbstractC4273a.z(kotlin.jvm.internal.r.f34602a)), Q5.x.a(kotlin.jvm.internal.U.b(float[].class), AbstractC4273a.e()), Q5.x.a(kotlin.jvm.internal.U.b(Long.TYPE), AbstractC4273a.B(kotlin.jvm.internal.A.f34566a)), Q5.x.a(kotlin.jvm.internal.U.b(long[].class), AbstractC4273a.h()), Q5.x.a(kotlin.jvm.internal.U.b(Q5.C.class), AbstractC4273a.s(Q5.C.f8775b)), Q5.x.a(kotlin.jvm.internal.U.b(Q5.D.class), AbstractC4273a.n()), Q5.x.a(kotlin.jvm.internal.U.b(Integer.TYPE), AbstractC4273a.A(C3291x.f34603a)), Q5.x.a(kotlin.jvm.internal.U.b(int[].class), AbstractC4273a.f()), Q5.x.a(kotlin.jvm.internal.U.b(Q5.A.class), AbstractC4273a.r(Q5.A.f8770b)), Q5.x.a(kotlin.jvm.internal.U.b(Q5.B.class), AbstractC4273a.m()), Q5.x.a(kotlin.jvm.internal.U.b(Short.TYPE), AbstractC4273a.C(kotlin.jvm.internal.W.f34576a)), Q5.x.a(kotlin.jvm.internal.U.b(short[].class), AbstractC4273a.k()), Q5.x.a(kotlin.jvm.internal.U.b(Q5.F.class), AbstractC4273a.t(Q5.F.f8781b)), Q5.x.a(kotlin.jvm.internal.U.b(Q5.G.class), AbstractC4273a.o()), Q5.x.a(kotlin.jvm.internal.U.b(Byte.TYPE), AbstractC4273a.w(C3278j.f34590a)), Q5.x.a(kotlin.jvm.internal.U.b(byte[].class), AbstractC4273a.b()), Q5.x.a(kotlin.jvm.internal.U.b(Q5.y.class), AbstractC4273a.q(Q5.y.f8824b)), Q5.x.a(kotlin.jvm.internal.U.b(Q5.z.class), AbstractC4273a.l()), Q5.x.a(kotlin.jvm.internal.U.b(Boolean.TYPE), AbstractC4273a.v(C3277i.f34589a)), Q5.x.a(kotlin.jvm.internal.U.b(boolean[].class), AbstractC4273a.a()), Q5.x.a(kotlin.jvm.internal.U.b(Q5.I.class), AbstractC4273a.u(Q5.I.f8786a)), Q5.x.a(kotlin.jvm.internal.U.b(Void.class), AbstractC4273a.j()), Q5.x.a(kotlin.jvm.internal.U.b(C3374a.class), AbstractC4273a.E(C3374a.f35036b)));

    public static final A6.f a(String serialName, A6.e kind) {
        AbstractC3292y.i(serialName, "serialName");
        AbstractC3292y.i(kind, "kind");
        d(serialName);
        return new k0(serialName, kind);
    }

    public static final y6.b b(InterfaceC3214c interfaceC3214c) {
        AbstractC3292y.i(interfaceC3214c, "<this>");
        return (y6.b) f1075a.get(interfaceC3214c);
    }

    private static final String c(String str) {
        String valueOf;
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                valueOf = AbstractC3335a.i(charAt);
            } else {
                valueOf = String.valueOf(charAt);
            }
            sb.append((Object) valueOf);
            String substring = str.substring(1);
            AbstractC3292y.h(substring, "substring(...)");
            sb.append(substring);
            return sb.toString();
        }
        return str;
    }

    private static final void d(String str) {
        Iterator it = f1075a.keySet().iterator();
        while (it.hasNext()) {
            String b9 = ((InterfaceC3214c) it.next()).b();
            AbstractC3292y.f(b9);
            String c8 = c(b9);
            if (l6.n.s(str, "kotlin." + c8, true) || l6.n.s(str, c8, true)) {
                throw new IllegalArgumentException(l6.n.e("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exist " + c(c8) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
