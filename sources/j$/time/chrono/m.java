package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;

/* loaded from: classes2.dex */
public interface m extends Comparable {
    n B(int i8);

    String i();

    InterfaceC2984b k(j$.time.temporal.o oVar);

    InterfaceC2987e n(LocalDateTime localDateTime);

    String q();

    ChronoZonedDateTime y(Instant instant, ZoneId zoneId);
}
