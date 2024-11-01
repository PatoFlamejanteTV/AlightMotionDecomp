package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class H extends AbstractC2983a implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final H f32829d = new H();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap.put("en", new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put("en", new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        hashMap3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private H() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.m
    public final n B(int i8) {
        if (i8 == 0) {
            return K.BEFORE_BE;
        }
        if (i8 == 1) {
            return K.BE;
        }
        throw new RuntimeException("Invalid era: " + i8);
    }

    @Override // j$.time.chrono.m
    public final String i() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC2984b k(j$.time.temporal.o oVar) {
        return oVar instanceof J ? (J) oVar : new J(j$.time.h.F(oVar));
    }

    public final j$.time.temporal.w m(j$.time.temporal.a aVar) {
        int i8 = G.f32828a[aVar.ordinal()];
        if (i8 == 1) {
            j$.time.temporal.w j8 = j$.time.temporal.a.PROLEPTIC_MONTH.j();
            return j$.time.temporal.w.j(j8.e() + 6516, j8.d() + 6516);
        }
        if (i8 == 2) {
            j$.time.temporal.w j9 = j$.time.temporal.a.YEAR.j();
            return j$.time.temporal.w.k((-(j9.e() + 543)) + 1, j9.d() + 543);
        }
        if (i8 != 3) {
            return aVar.j();
        }
        j$.time.temporal.w j10 = j$.time.temporal.a.YEAR.j();
        return j$.time.temporal.w.j(j10.e() + 543, j10.d() + 543);
    }

    @Override // j$.time.chrono.m
    public final String q() {
        return "buddhist";
    }

    Object writeReplace() {
        return new F((byte) 1, this);
    }

    @Override // j$.time.chrono.m
    public final ChronoZonedDateTime y(Instant instant, ZoneId zoneId) {
        return l.G(this, instant, zoneId);
    }
}
