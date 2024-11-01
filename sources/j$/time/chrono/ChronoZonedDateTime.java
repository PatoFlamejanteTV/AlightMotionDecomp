package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.InterfaceC2984b;

/* loaded from: classes2.dex */
public interface ChronoZonedDateTime<D extends InterfaceC2984b> extends j$.time.temporal.m, Comparable<ChronoZonedDateTime<?>> {
    long C();

    m a();

    j$.time.k b();

    InterfaceC2984b c();

    ZoneOffset g();

    ChronoZonedDateTime h(ZoneId zoneId);

    ZoneId p();

    Instant toInstant();

    InterfaceC2987e x();
}
