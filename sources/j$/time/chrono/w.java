package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class w extends AbstractC2983a implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final w f32872d = new w();
    private static final long serialVersionUID = 459996390165777884L;

    private w() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.m
    public final n B(int i8) {
        return z.y(i8);
    }

    @Override // j$.time.chrono.m
    public final String i() {
        return "Japanese";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC2984b k(j$.time.temporal.o oVar) {
        return oVar instanceof y ? (y) oVar : new y(j$.time.h.F(oVar));
    }

    public final j$.time.temporal.w m(j$.time.temporal.a aVar) {
        long L8;
        long j8;
        switch (v.f32871a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new RuntimeException("Unsupported field: " + aVar);
            case 5:
                return j$.time.temporal.w.k(z.D(), 999999999 - z.k().n().L());
            case 6:
                return j$.time.temporal.w.k(z.B(), j$.time.temporal.a.DAY_OF_YEAR.j().d());
            case 7:
                L8 = y.f32874d.L();
                j8 = 999999999;
                break;
            case 8:
                L8 = z.f32878d.getValue();
                j8 = z.k().getValue();
                break;
            default:
                return aVar.j();
        }
        return j$.time.temporal.w.j(L8, j8);
    }

    @Override // j$.time.chrono.m
    public final String q() {
        return "japanese";
    }

    Object writeReplace() {
        return new F((byte) 1, this);
    }

    @Override // j$.time.chrono.m
    public final ChronoZonedDateTime y(Instant instant, ZoneId zoneId) {
        return l.G(this, instant, zoneId);
    }
}
