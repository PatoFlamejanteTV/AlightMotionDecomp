package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class B extends AbstractC2983a implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final B f32822d = new B();
    private static final long serialVersionUID = 1039765215346859963L;

    private B() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.m
    public final n B(int i8) {
        if (i8 == 0) {
            return E.BEFORE_ROC;
        }
        if (i8 == 1) {
            return E.ROC;
        }
        throw new RuntimeException("Invalid era: " + i8);
    }

    @Override // j$.time.chrono.m
    public final String i() {
        return "Minguo";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC2984b k(j$.time.temporal.o oVar) {
        return oVar instanceof D ? (D) oVar : new D(j$.time.h.F(oVar));
    }

    public final j$.time.temporal.w m(j$.time.temporal.a aVar) {
        int i8 = A.f32821a[aVar.ordinal()];
        if (i8 == 1) {
            j$.time.temporal.w j8 = j$.time.temporal.a.PROLEPTIC_MONTH.j();
            return j$.time.temporal.w.j(j8.e() - 22932, j8.d() - 22932);
        }
        if (i8 == 2) {
            j$.time.temporal.w j9 = j$.time.temporal.a.YEAR.j();
            return j$.time.temporal.w.k(j9.d() - 1911, (-j9.e()) + 1912);
        }
        if (i8 != 3) {
            return aVar.j();
        }
        j$.time.temporal.w j10 = j$.time.temporal.a.YEAR.j();
        return j$.time.temporal.w.j(j10.e() - 1911, j10.d() - 1911);
    }

    @Override // j$.time.chrono.m
    public final String q() {
        return "roc";
    }

    Object writeReplace() {
        return new F((byte) 1, this);
    }

    @Override // j$.time.chrono.m
    public final ChronoZonedDateTime y(Instant instant, ZoneId zoneId) {
        return l.G(this, instant, zoneId);
    }
}
