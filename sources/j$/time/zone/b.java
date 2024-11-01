package j$.time.zone;

import j$.time.Duration;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC2991i;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class b implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;

    /* renamed from: a, reason: collision with root package name */
    private final long f33016a;

    /* renamed from: b, reason: collision with root package name */
    private final LocalDateTime f33017b;

    /* renamed from: c, reason: collision with root package name */
    private final ZoneOffset f33018c;

    /* renamed from: d, reason: collision with root package name */
    private final ZoneOffset f33019d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(long j8, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f33016a = j8;
        this.f33017b = LocalDateTime.P(j8, 0, zoneOffset);
        this.f33018c = zoneOffset;
        this.f33019d = zoneOffset2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        localDateTime.getClass();
        this.f33016a = AbstractC2991i.n(localDateTime, zoneOffset);
        this.f33017b = localDateTime;
        this.f33018c = zoneOffset;
        this.f33019d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    public final long C() {
        return this.f33016a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void D(DataOutput dataOutput) {
        a.c(this.f33016a, dataOutput);
        a.d(this.f33018c, dataOutput);
        a.d(this.f33019d, dataOutput);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f33016a, ((b) obj).f33016a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f33016a == bVar.f33016a && this.f33018c.equals(bVar.f33018c) && this.f33019d.equals(bVar.f33019d);
    }

    public final int hashCode() {
        return (this.f33017b.hashCode() ^ this.f33018c.hashCode()) ^ Integer.rotateLeft(this.f33019d.hashCode(), 16);
    }

    public final LocalDateTime j() {
        return this.f33017b.R(this.f33019d.J() - this.f33018c.J());
    }

    public final LocalDateTime l() {
        return this.f33017b;
    }

    public final Duration m() {
        return Duration.r(this.f33019d.J() - this.f33018c.J());
    }

    public final ZoneOffset r() {
        return this.f33019d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(z() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f33017b);
        sb.append(this.f33018c);
        sb.append(" to ");
        sb.append(this.f33019d);
        sb.append(']');
        return sb.toString();
    }

    public final ZoneOffset u() {
        return this.f33018c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List v() {
        return z() ? Collections.emptyList() : j$.com.android.tools.r8.a.h(new Object[]{this.f33018c, this.f33019d});
    }

    public final boolean z() {
        return this.f33019d.J() > this.f33018c.J();
    }
}
