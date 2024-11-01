package j$.time.chrono;

import androidx.exifinterface.media.ExifInterface;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class t extends AbstractC2983a implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final t f32869d = new t();
    private static final long serialVersionUID = -1440403870442975015L;

    private t() {
    }

    public static boolean m(long j8) {
        return (3 & j8) == 0 && (j8 % 100 != 0 || j8 % 400 == 0);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.m
    public final n B(int i8) {
        if (i8 == 0) {
            return u.BCE;
        }
        if (i8 == 1) {
            return u.CE;
        }
        throw new RuntimeException("Invalid era: " + i8);
    }

    @Override // j$.time.chrono.m
    public final String i() {
        return ExifInterface.TAG_RW2_ISO;
    }

    @Override // j$.time.chrono.m
    public final InterfaceC2984b k(j$.time.temporal.o oVar) {
        return j$.time.h.F(oVar);
    }

    @Override // j$.time.chrono.AbstractC2983a, j$.time.chrono.m
    public final InterfaceC2987e n(LocalDateTime localDateTime) {
        return LocalDateTime.E(localDateTime);
    }

    @Override // j$.time.chrono.m
    public final String q() {
        return "iso8601";
    }

    Object writeReplace() {
        return new F((byte) 1, this);
    }

    @Override // j$.time.chrono.m
    public final ChronoZonedDateTime y(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.ofInstant(instant, zoneId);
    }
}
