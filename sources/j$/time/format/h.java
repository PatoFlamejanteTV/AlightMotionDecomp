package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class h implements f {
    @Override // j$.time.format.f
    public final boolean j(p pVar, StringBuilder sb) {
        Long e8 = pVar.e(j$.time.temporal.a.INSTANT_SECONDS);
        j$.time.temporal.o d8 = pVar.d();
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long valueOf = d8.f(aVar) ? Long.valueOf(pVar.d().r(aVar)) : null;
        int i8 = 0;
        if (e8 == null) {
            return false;
        }
        long longValue = e8.longValue();
        int z8 = aVar.z(valueOf != null ? valueOf.longValue() : 0L);
        if (longValue >= -62167219200L) {
            long j8 = longValue - 253402300800L;
            long k8 = j$.com.android.tools.r8.a.k(j8, 315569520000L) + 1;
            LocalDateTime P8 = LocalDateTime.P(j$.com.android.tools.r8.a.j(j8, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (k8 > 0) {
                sb.append('+');
                sb.append(k8);
            }
            sb.append(P8);
            if (P8.I() == 0) {
                sb.append(":00");
            }
        } else {
            long j9 = longValue + 62167219200L;
            long j10 = j9 / 315569520000L;
            long j11 = j9 % 315569520000L;
            LocalDateTime P9 = LocalDateTime.P(j11 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(P9);
            if (P9.I() == 0) {
                sb.append(":00");
            }
            if (j10 < 0) {
                if (P9.J() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j10 - 1));
                } else if (j11 == 0) {
                    sb.insert(length, j10);
                } else {
                    sb.insert(length + 1, Math.abs(j10));
                }
            }
        }
        if (z8 > 0) {
            sb.append('.');
            int i9 = 100000000;
            while (true) {
                if (z8 <= 0 && i8 % 3 == 0 && i8 >= -2) {
                    break;
                }
                int i10 = z8 / i9;
                sb.append((char) (i10 + 48));
                z8 -= i10 * i9;
                i9 /= 10;
                i8++;
            }
        }
        sb.append('Z');
        return true;
    }

    public final String toString() {
        return "Instant()";
    }
}
