package j$.time.zone;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC2991i;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class f implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    private static final long[] f33031i = new long[0];

    /* renamed from: j, reason: collision with root package name */
    private static final e[] f33032j = new e[0];

    /* renamed from: k, reason: collision with root package name */
    private static final LocalDateTime[] f33033k = new LocalDateTime[0];

    /* renamed from: l, reason: collision with root package name */
    private static final b[] f33034l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* renamed from: a, reason: collision with root package name */
    private final long[] f33035a;

    /* renamed from: b, reason: collision with root package name */
    private final ZoneOffset[] f33036b;

    /* renamed from: c, reason: collision with root package name */
    private final long[] f33037c;

    /* renamed from: d, reason: collision with root package name */
    private final LocalDateTime[] f33038d;

    /* renamed from: e, reason: collision with root package name */
    private final ZoneOffset[] f33039e;

    /* renamed from: f, reason: collision with root package name */
    private final e[] f33040f;

    /* renamed from: g, reason: collision with root package name */
    private final TimeZone f33041g;

    /* renamed from: h, reason: collision with root package name */
    private final transient ConcurrentHashMap f33042h = new ConcurrentHashMap();

    private f(ZoneOffset zoneOffset) {
        this.f33036b = r0;
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        long[] jArr = f33031i;
        this.f33035a = jArr;
        this.f33037c = jArr;
        this.f33038d = f33033k;
        this.f33039e = zoneOffsetArr;
        this.f33040f = f33032j;
        this.f33041g = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(TimeZone timeZone) {
        this.f33036b = r0;
        ZoneOffset[] zoneOffsetArr = {j(timeZone.getRawOffset())};
        long[] jArr = f33031i;
        this.f33035a = jArr;
        this.f33037c = jArr;
        this.f33038d = f33033k;
        this.f33039e = zoneOffsetArr;
        this.f33040f = f33032j;
        this.f33041g = timeZone;
    }

    private f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        LocalDateTime l8;
        this.f33035a = jArr;
        this.f33036b = zoneOffsetArr;
        this.f33037c = jArr2;
        this.f33039e = zoneOffsetArr2;
        this.f33040f = eVarArr;
        if (jArr2.length == 0) {
            this.f33038d = f33033k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i8 = 0;
            while (i8 < jArr2.length) {
                int i9 = i8 + 1;
                b bVar = new b(jArr2[i8], zoneOffsetArr2[i8], zoneOffsetArr2[i9]);
                if (bVar.z()) {
                    arrayList.add(bVar.l());
                    l8 = bVar.j();
                } else {
                    arrayList.add(bVar.j());
                    l8 = bVar.l();
                }
                arrayList.add(l8);
                i8 = i9;
            }
            this.f33038d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.f33041g = null;
    }

    private static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime l8 = bVar.l();
        boolean z8 = bVar.z();
        boolean L8 = localDateTime.L(l8);
        return z8 ? L8 ? bVar.u() : localDateTime.L(bVar.j()) ? bVar : bVar.r() : !L8 ? bVar.r() : localDateTime.L(bVar.j()) ? bVar.u() : bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b[] b(int i8) {
        long j8;
        Integer valueOf = Integer.valueOf(i8);
        ConcurrentHashMap concurrentHashMap = this.f33042h;
        b[] bVarArr = (b[]) concurrentHashMap.get(valueOf);
        if (bVarArr != null) {
            return bVarArr;
        }
        TimeZone timeZone = this.f33041g;
        if (timeZone == null) {
            e[] eVarArr = this.f33040f;
            b[] bVarArr2 = new b[eVarArr.length];
            for (int i9 = 0; i9 < eVarArr.length; i9++) {
                bVarArr2[i9] = eVarArr[i9].a(i8);
            }
            if (i8 < 2100) {
                concurrentHashMap.putIfAbsent(valueOf, bVarArr2);
            }
            return bVarArr2;
        }
        b[] bVarArr3 = f33034l;
        if (i8 < 1800) {
            return bVarArr3;
        }
        long n8 = AbstractC2991i.n(LocalDateTime.M(i8 - 1), this.f33036b[0]);
        int offset = timeZone.getOffset(n8 * 1000);
        long j9 = 31968000 + n8;
        while (n8 < j9) {
            long j10 = 7776000 + n8;
            long j11 = n8;
            if (offset != timeZone.getOffset(j10 * 1000)) {
                n8 = j11;
                while (j10 - n8 > 1) {
                    int i10 = offset;
                    long j12 = j9;
                    long k8 = j$.com.android.tools.r8.a.k(j10 + n8, 2L);
                    if (timeZone.getOffset(k8 * 1000) == i10) {
                        n8 = k8;
                    } else {
                        j10 = k8;
                    }
                    offset = i10;
                    j9 = j12;
                }
                j8 = j9;
                int i11 = offset;
                if (timeZone.getOffset(n8 * 1000) == i11) {
                    n8 = j10;
                }
                ZoneOffset j13 = j(i11);
                offset = timeZone.getOffset(n8 * 1000);
                ZoneOffset j14 = j(offset);
                if (c(n8, j14) == i8) {
                    bVarArr3 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length + 1);
                    bVarArr3[bVarArr3.length - 1] = new b(n8, j13, j14);
                }
            } else {
                j8 = j9;
                n8 = j10;
            }
            j9 = j8;
        }
        if (1916 <= i8 && i8 < 2100) {
            concurrentHashMap.putIfAbsent(valueOf, bVarArr3);
        }
        return bVarArr3;
    }

    private static int c(long j8, ZoneOffset zoneOffset) {
        return j$.time.h.R(j$.com.android.tools.r8.a.k(j8 + zoneOffset.J(), 86400)).L();
    }

    private Object e(LocalDateTime localDateTime) {
        Object obj = null;
        ZoneOffset[] zoneOffsetArr = this.f33036b;
        int i8 = 0;
        TimeZone timeZone = this.f33041g;
        if (timeZone != null) {
            b[] b9 = b(localDateTime.J());
            if (b9.length == 0) {
                return j(timeZone.getOffset(AbstractC2991i.n(localDateTime, zoneOffsetArr[0]) * 1000));
            }
            int length = b9.length;
            while (i8 < length) {
                b bVar = b9[i8];
                Object a9 = a(localDateTime, bVar);
                if ((a9 instanceof b) || a9.equals(bVar.u())) {
                    return a9;
                }
                i8++;
                obj = a9;
            }
            return obj;
        }
        if (this.f33037c.length == 0) {
            return zoneOffsetArr[0];
        }
        int length2 = this.f33040f.length;
        LocalDateTime[] localDateTimeArr = this.f33038d;
        if (length2 > 0 && localDateTime.K(localDateTimeArr[localDateTimeArr.length - 1])) {
            b[] b10 = b(localDateTime.J());
            int length3 = b10.length;
            while (i8 < length3) {
                b bVar2 = b10[i8];
                Object a10 = a(localDateTime, bVar2);
                if ((a10 instanceof b) || a10.equals(bVar2.u())) {
                    return a10;
                }
                i8++;
                obj = a10;
            }
            return obj;
        }
        int binarySearch = Arrays.binarySearch(localDateTimeArr, localDateTime);
        ZoneOffset[] zoneOffsetArr2 = this.f33039e;
        if (binarySearch == -1) {
            return zoneOffsetArr2[0];
        }
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        } else if (binarySearch < localDateTimeArr.length - 1) {
            int i9 = binarySearch + 1;
            if (localDateTimeArr[binarySearch].equals(localDateTimeArr[i9])) {
                binarySearch = i9;
            }
        }
        if ((binarySearch & 1) != 0) {
            return zoneOffsetArr2[(binarySearch / 2) + 1];
        }
        LocalDateTime localDateTime2 = localDateTimeArr[binarySearch];
        LocalDateTime localDateTime3 = localDateTimeArr[binarySearch + 1];
        int i10 = binarySearch / 2;
        ZoneOffset zoneOffset = zoneOffsetArr2[i10];
        ZoneOffset zoneOffset2 = zoneOffsetArr2[i10 + 1];
        return zoneOffset2.J() > zoneOffset.J() ? new b(localDateTime2, zoneOffset, zoneOffset2) : new b(localDateTime3, zoneOffset, zoneOffset2);
    }

    public static f i(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
        return new f(zoneOffset);
    }

    private static ZoneOffset j(int i8) {
        return ZoneOffset.M(i8 / 1000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f k(DataInput dataInput) {
        int readInt = dataInput.readInt();
        long[] jArr = f33031i;
        long[] jArr2 = readInt == 0 ? jArr : new long[readInt];
        for (int i8 = 0; i8 < readInt; i8++) {
            jArr2[i8] = a.a(dataInput);
        }
        int i9 = readInt + 1;
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            zoneOffsetArr[i10] = a.b(dataInput);
        }
        int readInt2 = dataInput.readInt();
        if (readInt2 != 0) {
            jArr = new long[readInt2];
        }
        long[] jArr3 = jArr;
        for (int i11 = 0; i11 < readInt2; i11++) {
            jArr3[i11] = a.a(dataInput);
        }
        int i12 = readInt2 + 1;
        ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            zoneOffsetArr2[i13] = a.b(dataInput);
        }
        int readByte = dataInput.readByte();
        e[] eVarArr = readByte == 0 ? f33032j : new e[readByte];
        for (int i14 = 0; i14 < readByte; i14++) {
            eVarArr[i14] = e.b(dataInput);
        }
        return new f(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, eVarArr);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.f33041g != null ? (byte) 100 : (byte) 1, this);
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.f33041g;
        if (timeZone != null) {
            return j(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.f33037c;
        if (jArr.length == 0) {
            return this.f33036b[0];
        }
        long E8 = instant.E();
        int length = this.f33040f.length;
        ZoneOffset[] zoneOffsetArr = this.f33039e;
        if (length <= 0 || E8 <= jArr[jArr.length - 1]) {
            int binarySearch = Arrays.binarySearch(jArr, E8);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            return zoneOffsetArr[binarySearch + 1];
        }
        b[] b9 = b(c(E8, zoneOffsetArr[zoneOffsetArr.length - 1]));
        b bVar = null;
        for (int i8 = 0; i8 < b9.length; i8++) {
            bVar = b9[i8];
            if (E8 < bVar.C()) {
                return bVar.u();
            }
        }
        return bVar.r();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Objects.equals(this.f33041g, fVar.f33041g) && Arrays.equals(this.f33035a, fVar.f33035a) && Arrays.equals(this.f33036b, fVar.f33036b) && Arrays.equals(this.f33037c, fVar.f33037c) && Arrays.equals(this.f33039e, fVar.f33039e) && Arrays.equals(this.f33040f, fVar.f33040f);
    }

    public final b f(LocalDateTime localDateTime) {
        Object e8 = e(localDateTime);
        if (e8 instanceof b) {
            return (b) e8;
        }
        return null;
    }

    public final List g(LocalDateTime localDateTime) {
        Object e8 = e(localDateTime);
        return e8 instanceof b ? ((b) e8).v() : Collections.singletonList((ZoneOffset) e8);
    }

    public final boolean h() {
        b bVar;
        TimeZone timeZone = this.f33041g;
        if (timeZone == null) {
            return this.f33037c.length == 0;
        }
        if (timeZone.useDaylightTime() || timeZone.getDSTSavings() != 0) {
            return false;
        }
        Instant G8 = Instant.G();
        long E8 = G8.E();
        if (G8.F() > 0 && E8 < Long.MAX_VALUE) {
            E8++;
        }
        int c8 = c(E8, d(G8));
        b[] b9 = b(c8);
        int length = b9.length - 1;
        while (true) {
            if (length < 0) {
                if (c8 > 1800) {
                    b[] b10 = b(c8 - 1);
                    int length2 = b10.length - 1;
                    while (true) {
                        if (length2 < 0) {
                            int offset = timeZone.getOffset((E8 - 1) * 1000);
                            long s8 = j$.time.h.P(1800, 1, 1).s() * 86400;
                            for (long min = Math.min(E8 - 31104000, (j$.time.b.b().a() / 1000) + 31968000); s8 <= min; min -= 7776000) {
                                int offset2 = timeZone.getOffset(min * 1000);
                                if (offset != offset2) {
                                    int c9 = c(min, j(offset2));
                                    b[] b11 = b(c9 + 1);
                                    int length3 = b11.length - 1;
                                    while (true) {
                                        if (length3 < 0) {
                                            b[] b12 = b(c9);
                                            bVar = b12[b12.length - 1];
                                            break;
                                        }
                                        if (E8 > b11[length3].C()) {
                                            bVar = b11[length3];
                                            break;
                                        }
                                        length3--;
                                    }
                                }
                            }
                        } else {
                            if (E8 > b10[length2].C()) {
                                bVar = b10[length2];
                                break;
                            }
                            length2--;
                        }
                    }
                }
                bVar = null;
            } else {
                if (E8 > b9[length].C()) {
                    bVar = b9[length];
                    break;
                }
                length--;
            }
        }
        return bVar == null;
    }

    public final int hashCode() {
        TimeZone timeZone = this.f33041g;
        return (((((timeZone != null ? timeZone.hashCode() : 0) ^ Arrays.hashCode(this.f33035a)) ^ Arrays.hashCode(this.f33036b)) ^ Arrays.hashCode(this.f33037c)) ^ Arrays.hashCode(this.f33039e)) ^ Arrays.hashCode(this.f33040f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(DataOutput dataOutput) {
        long[] jArr = this.f33035a;
        dataOutput.writeInt(jArr.length);
        for (long j8 : jArr) {
            a.c(j8, dataOutput);
        }
        for (ZoneOffset zoneOffset : this.f33036b) {
            a.d(zoneOffset, dataOutput);
        }
        long[] jArr2 = this.f33037c;
        dataOutput.writeInt(jArr2.length);
        for (long j9 : jArr2) {
            a.c(j9, dataOutput);
        }
        for (ZoneOffset zoneOffset2 : this.f33039e) {
            a.d(zoneOffset2, dataOutput);
        }
        e[] eVarArr = this.f33040f;
        dataOutput.writeByte(eVarArr.length);
        for (e eVar : eVarArr) {
            eVar.c(dataOutput);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f33041g.getID());
    }

    public final String toString() {
        StringBuilder sb;
        TimeZone timeZone = this.f33041g;
        if (timeZone != null) {
            String id = timeZone.getID();
            sb = new StringBuilder("ZoneRules[timeZone=");
            sb.append(id);
        } else {
            ZoneOffset zoneOffset = this.f33036b[r1.length - 1];
            sb = new StringBuilder("ZoneRules[currentStandardOffset=");
            sb.append(zoneOffset);
        }
        sb.append("]");
        return sb.toString();
    }
}
