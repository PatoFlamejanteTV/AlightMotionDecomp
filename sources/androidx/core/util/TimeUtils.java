package androidx.core.util;

import androidx.annotation.RestrictTo;
import java.io.PrintWriter;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class TimeUtils {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int HUNDRED_DAY_FIELD_LEN = 19;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final Object sFormatSync = new Object();
    private static char[] sFormatStr = new char[24];

    private TimeUtils() {
    }

    private static int accumField(int i8, int i9, boolean z8, int i10) {
        if (i8 > 99 || (z8 && i10 >= 3)) {
            return i9 + 3;
        }
        if (i8 > 9 || (z8 && i10 >= 2)) {
            return i9 + 2;
        }
        if (z8 || i8 > 0) {
            return i9 + 1;
        }
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j8, StringBuilder sb) {
        synchronized (sFormatSync) {
            sb.append(sFormatStr, 0, formatDurationLocked(j8, 0));
        }
    }

    private static int formatDurationLocked(long j8, int i8) {
        char c8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z8;
        boolean z9;
        int i14;
        boolean z10;
        int i15;
        boolean z11;
        int i16;
        int i17;
        boolean z12;
        boolean z13;
        boolean z14;
        int i18;
        long j9 = j8;
        if (sFormatStr.length < i8) {
            sFormatStr = new char[i8];
        }
        char[] cArr = sFormatStr;
        if (j9 == 0) {
            int i19 = i8 - 1;
            while (i19 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j9 > 0) {
            c8 = '+';
        } else {
            j9 = -j9;
            c8 = '-';
        }
        int i20 = (int) (j9 % 1000);
        int floor = (int) Math.floor(j9 / 1000);
        if (floor > SECONDS_PER_DAY) {
            i9 = floor / SECONDS_PER_DAY;
            floor -= SECONDS_PER_DAY * i9;
        } else {
            i9 = 0;
        }
        if (floor > SECONDS_PER_HOUR) {
            i10 = floor / SECONDS_PER_HOUR;
            floor -= i10 * SECONDS_PER_HOUR;
        } else {
            i10 = 0;
        }
        if (floor > 60) {
            int i21 = floor / 60;
            i11 = floor - (i21 * 60);
            i12 = i21;
        } else {
            i11 = floor;
            i12 = 0;
        }
        if (i8 != 0) {
            int accumField = accumField(i9, 1, false, 0);
            if (accumField > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            int accumField2 = accumField + accumField(i10, 1, z12, 2);
            if (accumField2 > 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            int accumField3 = accumField2 + accumField(i12, 1, z13, 2);
            if (accumField3 > 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            int accumField4 = accumField3 + accumField(i11, 1, z14, 2);
            if (accumField4 > 0) {
                i18 = 3;
            } else {
                i18 = 0;
            }
            i13 = 0;
            for (int accumField5 = accumField4 + accumField(i20, 2, true, i18) + 1; accumField5 < i8; accumField5++) {
                cArr[i13] = ' ';
                i13++;
            }
        } else {
            i13 = 0;
        }
        cArr[i13] = c8;
        int i22 = i13 + 1;
        if (i8 != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        int printField = printField(cArr, i9, 'd', i22, false, 0);
        if (printField != i22) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z8) {
            i14 = 2;
        } else {
            i14 = 0;
        }
        int printField2 = printField(cArr, i10, 'h', printField, z9, i14);
        if (printField2 != i22) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z8) {
            i15 = 2;
        } else {
            i15 = 0;
        }
        int printField3 = printField(cArr, i12, 'm', printField2, z10, i15);
        if (printField3 != i22) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z8) {
            i16 = 2;
        } else {
            i16 = 0;
        }
        int printField4 = printField(cArr, i11, 's', printField3, z11, i16);
        if (z8 && printField4 != i22) {
            i17 = 3;
        } else {
            i17 = 0;
        }
        int printField5 = printField(cArr, i20, 'm', printField4, true, i17);
        cArr[printField5] = 's';
        return printField5 + 1;
    }

    private static int printField(char[] cArr, int i8, char c8, int i9, boolean z8, int i10) {
        int i11;
        if (z8 || i8 > 0) {
            if ((z8 && i10 >= 3) || i8 > 99) {
                int i12 = i8 / 100;
                cArr[i9] = (char) (i12 + 48);
                i11 = i9 + 1;
                i8 -= i12 * 100;
            } else {
                i11 = i9;
            }
            if ((z8 && i10 >= 2) || i8 > 9 || i9 != i11) {
                int i13 = i8 / 10;
                cArr[i11] = (char) (i13 + 48);
                i11++;
                i8 -= i13 * 10;
            }
            cArr[i11] = (char) (i8 + 48);
            cArr[i11 + 1] = c8;
            return i11 + 2;
        }
        return i9;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j8, PrintWriter printWriter, int i8) {
        synchronized (sFormatSync) {
            printWriter.print(new String(sFormatStr, 0, formatDurationLocked(j8, i8)));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j8, PrintWriter printWriter) {
        formatDuration(j8, printWriter, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j8, long j9, PrintWriter printWriter) {
        if (j8 == 0) {
            printWriter.print("--");
        } else {
            formatDuration(j8 - j9, printWriter, 0);
        }
    }
}
