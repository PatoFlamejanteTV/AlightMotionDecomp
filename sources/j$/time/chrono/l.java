package j$.time.chrono;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes2.dex */
final class l implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* renamed from: a, reason: collision with root package name */
    private final transient C2989g f32847a;

    /* renamed from: b, reason: collision with root package name */
    private final transient ZoneOffset f32848b;

    /* renamed from: c, reason: collision with root package name */
    private final transient ZoneId f32849c;

    private l(ZoneId zoneId, ZoneOffset zoneOffset, C2989g c2989g) {
        this.f32847a = (C2989g) Objects.requireNonNull(c2989g, "dateTime");
        this.f32848b = (ZoneOffset) Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
        this.f32849c = (ZoneId) Objects.requireNonNull(zoneId, "zone");
    }

    static l D(m mVar, j$.time.temporal.m mVar2) {
        l lVar = (l) mVar2;
        AbstractC2983a abstractC2983a = (AbstractC2983a) mVar;
        if (abstractC2983a.equals(lVar.a())) {
            return lVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + abstractC2983a.i() + ", actual: " + lVar.a().i());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:            if (r2.contains(r7) != false) goto L15;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static j$.time.chrono.ChronoZonedDateTime F(j$.time.ZoneId r6, j$.time.ZoneOffset r7, j$.time.chrono.C2989g r8) {
        /*
            java.lang.String r0 = "localDateTime"
            j$.util.Objects.requireNonNull(r8, r0)
            java.lang.String r0 = "zone"
            j$.util.Objects.requireNonNull(r6, r0)
            boolean r0 = r6 instanceof j$.time.ZoneOffset
            if (r0 == 0) goto L17
            j$.time.chrono.l r7 = new j$.time.chrono.l
            r0 = r6
            j$.time.ZoneOffset r0 = (j$.time.ZoneOffset) r0
            r7.<init>(r6, r0, r8)
            return r7
        L17:
            j$.time.zone.f r0 = r6.D()
            j$.time.LocalDateTime r1 = j$.time.LocalDateTime.E(r8)
            java.util.List r2 = r0.g(r1)
            int r3 = r2.size()
            r4 = 1
            r5 = 0
            if (r3 != r4) goto L32
        L2b:
            java.lang.Object r7 = r2.get(r5)
            j$.time.ZoneOffset r7 = (j$.time.ZoneOffset) r7
            goto L55
        L32:
            int r3 = r2.size()
            if (r3 != 0) goto L4d
            j$.time.zone.b r7 = r0.f(r1)
            j$.time.Duration r0 = r7.m()
            long r0 = r0.m()
            j$.time.chrono.g r8 = r8.H(r0)
            j$.time.ZoneOffset r7 = r7.r()
            goto L55
        L4d:
            if (r7 == 0) goto L2b
            boolean r0 = r2.contains(r7)
            if (r0 == 0) goto L2b
        L55:
            java.lang.String r0 = "offset"
            j$.util.Objects.requireNonNull(r7, r0)
            j$.time.chrono.l r0 = new j$.time.chrono.l
            r0.<init>(r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.l.F(j$.time.ZoneId, j$.time.ZoneOffset, j$.time.chrono.g):j$.time.chrono.ChronoZonedDateTime");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l G(m mVar, Instant instant, ZoneId zoneId) {
        ZoneOffset d8 = zoneId.D().d(instant);
        Objects.requireNonNull(d8, TypedValues.CycleType.S_WAVE_OFFSET);
        return new l(zoneId, d8, (C2989g) mVar.n(LocalDateTime.P(instant.E(), instant.F(), d8)));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 3, this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long C() {
        return AbstractC2991i.o(this);
    }

    @Override // j$.time.temporal.m
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final ChronoZonedDateTime z(long j8, j$.time.temporal.u uVar) {
        return D(a(), j$.time.temporal.n.b(this, j8, uVar));
    }

    @Override // j$.time.temporal.m
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final ChronoZonedDateTime e(long j8, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return D(a(), uVar.j(this, j8));
        }
        return D(a(), this.f32847a.e(j8, uVar).v(this));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final m a() {
        return c().a();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.k b() {
        return ((C2989g) x()).b();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC2984b c() {
        return ((C2989g) x()).c();
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j8, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return D(a(), rVar.r(this, j8));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i8 = AbstractC2993k.f32846a[aVar.ordinal()];
        if (i8 == 1) {
            return e(j8 - AbstractC2991i.o(this), j$.time.temporal.b.SECONDS);
        }
        ZoneId zoneId = this.f32849c;
        C2989g c2989g = this.f32847a;
        if (i8 != 2) {
            return F(zoneId, this.f32848b, c2989g.d(j8, rVar));
        }
        ZoneOffset M8 = ZoneOffset.M(aVar.z(j8));
        c2989g.getClass();
        return G(a(), Instant.H(AbstractC2991i.n(c2989g, M8), c2989g.b().I()), zoneId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && AbstractC2991i.d(this, (ChronoZonedDateTime) obj) == 0;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return (rVar instanceof j$.time.temporal.a) || (rVar != null && rVar.m(this));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset g() {
        return this.f32848b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime h(ZoneId zoneId) {
        return F(zoneId, this.f32848b, this.f32847a);
    }

    public final int hashCode() {
        return (this.f32847a.hashCode() ^ this.f32848b.hashCode()) ^ Integer.rotateLeft(this.f32849c.hashCode(), 3);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ int j(j$.time.temporal.r rVar) {
        return AbstractC2991i.e(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m l(j$.time.h hVar) {
        return D(a(), hVar.v(this));
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? (rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) rVar).j() : ((C2989g) x()).m(rVar) : rVar.u(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId p() {
        return this.f32849c;
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.l(this);
        }
        int i8 = AbstractC2992j.f32845a[((j$.time.temporal.a) rVar).ordinal()];
        return i8 != 1 ? i8 != 2 ? ((C2989g) x()).r(rVar) : g().J() : C();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.H(C(), b().I());
    }

    public final String toString() {
        String c2989g = this.f32847a.toString();
        ZoneOffset zoneOffset = this.f32848b;
        String str = c2989g + zoneOffset.toString();
        ZoneId zoneId = this.f32849c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ Object u(j$.time.temporal.t tVar) {
        return AbstractC2991i.l(this, tVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        return AbstractC2991i.d(this, chronoZonedDateTime);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f32847a);
        objectOutput.writeObject(this.f32848b);
        objectOutput.writeObject(this.f32849c);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC2987e x() {
        return this.f32847a;
    }
}
