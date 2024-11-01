package j$.time.chrono;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import j$.time.ZoneOffset;
import j$.util.Objects;

/* renamed from: j$.time.chrono.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2991i {
    public static j$.time.temporal.m a(InterfaceC2984b interfaceC2984b, j$.time.temporal.m mVar) {
        return mVar.d(interfaceC2984b.s(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static int b(InterfaceC2984b interfaceC2984b, InterfaceC2984b interfaceC2984b2) {
        int compare = Long.compare(interfaceC2984b.s(), interfaceC2984b2.s());
        if (compare != 0) {
            return compare;
        }
        return ((AbstractC2983a) interfaceC2984b.a()).i().compareTo(interfaceC2984b2.a().i());
    }

    public static int c(InterfaceC2987e interfaceC2987e, InterfaceC2987e interfaceC2987e2) {
        int compareTo = interfaceC2987e.c().compareTo(interfaceC2987e2.c());
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = interfaceC2987e.b().compareTo(interfaceC2987e2.b());
        if (compareTo2 != 0) {
            return compareTo2;
        }
        return ((AbstractC2983a) interfaceC2987e.a()).i().compareTo(interfaceC2987e2.a().i());
    }

    public static int d(ChronoZonedDateTime chronoZonedDateTime, ChronoZonedDateTime chronoZonedDateTime2) {
        int compare = Long.compare(chronoZonedDateTime.C(), chronoZonedDateTime2.C());
        if (compare != 0) {
            return compare;
        }
        int I8 = chronoZonedDateTime.b().I() - chronoZonedDateTime2.b().I();
        if (I8 != 0) {
            return I8;
        }
        int compareTo = chronoZonedDateTime.x().compareTo(chronoZonedDateTime2.x());
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = chronoZonedDateTime.p().i().compareTo(chronoZonedDateTime2.p().i());
        if (compareTo2 != 0) {
            return compareTo2;
        }
        return ((AbstractC2983a) chronoZonedDateTime.a()).i().compareTo(chronoZonedDateTime2.a().i());
    }

    public static int e(ChronoZonedDateTime chronoZonedDateTime, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.n.a(chronoZonedDateTime, rVar);
        }
        int i8 = AbstractC2992j.f32845a[((j$.time.temporal.a) rVar).ordinal()];
        if (i8 != 1) {
            return i8 != 2 ? chronoZonedDateTime.x().j(rVar) : chronoZonedDateTime.g().J();
        }
        throw new RuntimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public static int f(n nVar, j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.a.ERA ? nVar.getValue() : j$.time.temporal.n.a(nVar, rVar);
    }

    public static long g(n nVar, j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.ERA) {
            return nVar.getValue();
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new RuntimeException(j$.time.d.a("Unsupported field: ", rVar));
        }
        return rVar.l(nVar);
    }

    public static boolean h(InterfaceC2984b interfaceC2984b, j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) rVar).v() : rVar != null && rVar.m(interfaceC2984b);
    }

    public static boolean i(n nVar, j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.ERA : rVar != null && rVar.m(nVar);
    }

    public static Object j(InterfaceC2984b interfaceC2984b, j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.k() || tVar == j$.time.temporal.n.j() || tVar == j$.time.temporal.n.h() || tVar == j$.time.temporal.n.g()) {
            return null;
        }
        return tVar == j$.time.temporal.n.e() ? interfaceC2984b.a() : tVar == j$.time.temporal.n.i() ? j$.time.temporal.b.DAYS : tVar.a(interfaceC2984b);
    }

    public static Object k(InterfaceC2987e interfaceC2987e, j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.k() || tVar == j$.time.temporal.n.j() || tVar == j$.time.temporal.n.h()) {
            return null;
        }
        return tVar == j$.time.temporal.n.g() ? interfaceC2987e.b() : tVar == j$.time.temporal.n.e() ? interfaceC2987e.a() : tVar == j$.time.temporal.n.i() ? j$.time.temporal.b.NANOS : tVar.a(interfaceC2987e);
    }

    public static Object l(ChronoZonedDateTime chronoZonedDateTime, j$.time.temporal.t tVar) {
        return (tVar == j$.time.temporal.n.j() || tVar == j$.time.temporal.n.k()) ? chronoZonedDateTime.p() : tVar == j$.time.temporal.n.h() ? chronoZonedDateTime.g() : tVar == j$.time.temporal.n.g() ? chronoZonedDateTime.b() : tVar == j$.time.temporal.n.e() ? chronoZonedDateTime.a() : tVar == j$.time.temporal.n.i() ? j$.time.temporal.b.NANOS : tVar.a(chronoZonedDateTime);
    }

    public static Object m(n nVar, j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.n.i() ? j$.time.temporal.b.ERAS : j$.time.temporal.n.c(nVar, tVar);
    }

    public static long n(InterfaceC2987e interfaceC2987e, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
        return ((interfaceC2987e.c().s() * 86400) + interfaceC2987e.b().V()) - zoneOffset.J();
    }

    public static long o(ChronoZonedDateTime chronoZonedDateTime) {
        return ((chronoZonedDateTime.c().s() * 86400) + chronoZonedDateTime.b().V()) - chronoZonedDateTime.g().J();
    }

    public static m p(j$.time.temporal.o oVar) {
        Objects.requireNonNull(oVar, "temporal");
        Object obj = (m) oVar.u(j$.time.temporal.n.e());
        t tVar = t.f32869d;
        if (obj == null) {
            obj = Objects.requireNonNull(tVar, "defaultObj");
        }
        return (m) obj;
    }
}
