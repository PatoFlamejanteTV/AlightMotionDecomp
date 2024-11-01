package j$.time;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class Duration implements Comparable<Duration>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final Duration f32797c = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* renamed from: a, reason: collision with root package name */
    private final long f32798a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32799b;

    static {
        BigInteger.valueOf(C.NANOS_PER_SECOND);
    }

    private Duration(long j8, int i8) {
        this.f32798a = j8;
        this.f32799b = i8;
    }

    private static Duration j(long j8, int i8) {
        return (((long) i8) | j8) == 0 ? f32797c : new Duration(j8, i8);
    }

    public static Duration ofMillis(long j8) {
        long j9 = j8 / 1000;
        int i8 = (int) (j8 % 1000);
        if (i8 < 0) {
            i8 += 1000;
            j9--;
        }
        return j(j9, i8 * 1000000);
    }

    public static Duration ofMinutes(long j8) {
        return j(j$.com.android.tools.r8.a.l(j8, 60), 0);
    }

    public static Duration r(long j8) {
        return j(j8, 0);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static Duration u(long j8, long j9) {
        return j(j$.com.android.tools.r8.a.f(j8, j$.com.android.tools.r8.a.k(j9, C.NANOS_PER_SECOND)), (int) j$.com.android.tools.r8.a.j(j9, C.NANOS_PER_SECOND));
    }

    private Object writeReplace() {
        return new s((byte) 1, this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        Duration duration2 = duration;
        int compare = Long.compare(this.f32798a, duration2.f32798a);
        return compare != 0 ? compare : this.f32799b - duration2.f32799b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        return this.f32798a == duration.f32798a && this.f32799b == duration.f32799b;
    }

    public final int hashCode() {
        long j8 = this.f32798a;
        return (this.f32799b * 51) + ((int) (j8 ^ (j8 >>> 32)));
    }

    public final int l() {
        return this.f32799b;
    }

    public final long m() {
        return this.f32798a;
    }

    public long toMillis() {
        long j8 = this.f32799b;
        long j9 = this.f32798a;
        if (j9 < 0) {
            j9++;
            j8 -= C.NANOS_PER_SECOND;
        }
        return j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.l(j9, 1000), j8 / 1000000);
    }

    public final String toString() {
        if (this == f32797c) {
            return "PT0S";
        }
        long j8 = this.f32798a;
        int i8 = this.f32799b;
        long j9 = (j8 >= 0 || i8 <= 0) ? j8 : 1 + j8;
        long j10 = j9 / 3600;
        int i9 = (int) ((j9 % 3600) / 60);
        int i10 = (int) (j9 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j10 != 0) {
            sb.append(j10);
            sb.append('H');
        }
        if (i9 != 0) {
            sb.append(i9);
            sb.append('M');
        }
        if (i10 == 0 && i8 == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j8 >= 0 || i8 <= 0 || i10 != 0) {
            sb.append(i10);
        } else {
            sb.append("-0");
        }
        if (i8 > 0) {
            int length = sb.length();
            sb.append(j8 < 0 ? 2000000000 - i8 : i8 + C.NANOS_PER_SECOND);
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v(DataOutput dataOutput) {
        dataOutput.writeLong(this.f32798a);
        dataOutput.writeInt(this.f32799b);
    }
}
