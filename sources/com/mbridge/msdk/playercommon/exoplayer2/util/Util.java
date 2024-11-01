package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayerLibraryInfo;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.SeekParameters;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import j$.util.DesugarTimeZone;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class Util {
    private static final int[] CRC32_BYTES_MSBF;
    public static final String DEVICE;
    public static final String DEVICE_DEBUG_INFO;
    private static final Pattern ESCAPED_CHARACTER_PATTERN;
    public static final String MANUFACTURER;
    public static final String MODEL;
    public static final int SDK_INT;
    private static final String TAG = "Util";
    private static final Pattern XS_DATE_TIME_PATTERN;
    private static final Pattern XS_DURATION_PATTERN;

    static {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') {
            i8 = 26;
        }
        SDK_INT = i8;
        String str = Build.DEVICE;
        DEVICE = str;
        String str2 = Build.MANUFACTURER;
        MANUFACTURER = str2;
        String str3 = Build.MODEL;
        MODEL = str3;
        DEVICE_DEBUG_INFO = str + ", " + str3 + ", " + str2 + ", " + i8;
        XS_DATE_TIME_PATTERN = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        XS_DURATION_PATTERN = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        ESCAPED_CHARACTER_PATTERN = Pattern.compile("%([A-Fa-f0-9]{2})");
        CRC32_BYTES_MSBF = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    }

    private Util() {
    }

    public static long addWithOverflowDefault(long j8, long j9, long j10) {
        long j11 = j8 + j9;
        return ((j8 ^ j11) & (j9 ^ j11)) < 0 ? j10 : j11;
    }

    public static boolean areEqual(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static int binarySearchCeil(long[] jArr, long j8, boolean z8, boolean z9) {
        int i8;
        int i9;
        int binarySearch = Arrays.binarySearch(jArr, j8);
        if (binarySearch < 0) {
            i9 = ~binarySearch;
        } else {
            while (true) {
                i8 = binarySearch + 1;
                if (i8 >= jArr.length || jArr[i8] != j8) {
                    break;
                }
                binarySearch = i8;
            }
            i9 = z8 ? binarySearch : i8;
        }
        return z9 ? Math.min(jArr.length - 1, i9) : i9;
    }

    public static int binarySearchFloor(int[] iArr, int i8, boolean z8, boolean z9) {
        int i9;
        int i10;
        int binarySearch = Arrays.binarySearch(iArr, i8);
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            while (true) {
                i9 = binarySearch - 1;
                if (i9 < 0 || iArr[i9] != i8) {
                    break;
                }
                binarySearch = i9;
            }
            i10 = z8 ? binarySearch : i9;
        }
        return z9 ? Math.max(0, i10) : i10;
    }

    public static int ceilDivide(int i8, int i9) {
        return ((i8 + i9) - 1) / i9;
    }

    public static void closeQuietly(DataSource dataSource) {
        if (dataSource != null) {
            try {
                dataSource.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int compareLong(long j8, long j9) {
        if (j8 < j9) {
            return -1;
        }
        return j8 == j9 ? 0 : 1;
    }

    public static int constrainValue(int i8, int i9, int i10) {
        return Math.max(i9, Math.min(i8, i10));
    }

    public static boolean contains(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (areEqual(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int crc(byte[] bArr, int i8, int i9, int i10) {
        while (i8 < i9) {
            i10 = CRC32_BYTES_MSBF[((i10 >>> 24) ^ (bArr[i8] & 255)) & 255] ^ (i10 << 8);
            i8++;
        }
        return i10;
    }

    public static File createTempDirectory(Context context, String str) throws IOException {
        File createTempFile = createTempFile(context, str);
        createTempFile.delete();
        createTempFile.mkdir();
        return createTempFile;
    }

    public static File createTempFile(Context context, String str) throws IOException {
        return File.createTempFile(str, null, context.getCacheDir());
    }

    public static String escapeFileName(String str) {
        int length = str.length();
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (shouldEscapeCharacter(str.charAt(i10))) {
                i9++;
            }
        }
        if (i9 == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder((i9 * 2) + length);
        while (i9 > 0) {
            int i11 = i8 + 1;
            char charAt = str.charAt(i8);
            if (shouldEscapeCharacter(charAt)) {
                sb.append('%');
                sb.append(Integer.toHexString(charAt));
                i9--;
            } else {
                sb.append(charAt);
            }
            i8 = i11;
        }
        if (i8 < length) {
            sb.append((CharSequence) str, i8, length);
        }
        return sb.toString();
    }

    public static String formatInvariant(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String fromUtf8Bytes(byte[] bArr) {
        return new String(bArr, Charset.forName(C.UTF8_NAME));
    }

    public static int getAudioContentTypeForStreamType(int i8) {
        if (i8 != 0) {
            return (i8 == 1 || i8 == 2 || i8 == 4 || i8 == 5 || i8 == 8) ? 4 : 2;
        }
        return 1;
    }

    public static int getAudioUsageForStreamType(int i8) {
        if (i8 == 0) {
            return 2;
        }
        if (i8 == 1) {
            return 13;
        }
        if (i8 == 2) {
            return 6;
        }
        int i9 = 4;
        if (i8 != 4) {
            i9 = 5;
            if (i8 != 5) {
                return i8 != 8 ? 1 : 3;
            }
        }
        return i9;
    }

    public static byte[] getBytesFromHexString(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 * 2;
            bArr[i8] = (byte) ((Character.digit(str.charAt(i9), 16) << 4) + Character.digit(str.charAt(i9 + 1), 16));
        }
        return bArr;
    }

    public static String getCodecsOfType(String str, int i8) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = split(str.trim(), "(\\s*,\\s*)");
        StringBuilder sb = new StringBuilder();
        for (String str2 : split) {
            if (i8 == MimeTypes.getTrackTypeOfCodec(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() <= 0) {
            return null;
        }
        return sb.toString();
    }

    public static String getCommaDelimitedSimpleClassNames(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < objArr.length; i8++) {
            sb.append(objArr[i8].getClass().getSimpleName());
            if (i8 < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static int getDefaultBufferSize(int i8) {
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3 || i8 == 4) {
                        return 131072;
                    }
                    throw new IllegalStateException();
                }
                return C.DEFAULT_VIDEO_BUFFER_SIZE;
            }
            return C.DEFAULT_AUDIO_BUFFER_SIZE;
        }
        return 16777216;
    }

    private static void getDisplaySizeV16(Display display, Point point) {
        display.getSize(point);
    }

    private static void getDisplaySizeV17(Display display, Point point) {
        display.getRealSize(point);
    }

    private static void getDisplaySizeV23(Display display, Point point) {
        Display.Mode mode;
        int physicalWidth;
        int physicalHeight;
        mode = display.getMode();
        physicalWidth = mode.getPhysicalWidth();
        point.x = physicalWidth;
        physicalHeight = mode.getPhysicalHeight();
        point.y = physicalHeight;
    }

    private static void getDisplaySizeV9(Display display, Point point) {
        point.x = display.getWidth();
        point.y = display.getHeight();
    }

    public static UUID getDrmUuid(String str) {
        String lowerInvariant = toLowerInvariant(str);
        lowerInvariant.hashCode();
        char c8 = 65535;
        switch (lowerInvariant.hashCode()) {
            case -1860423953:
                if (lowerInvariant.equals("playready")) {
                    c8 = 0;
                    break;
                }
                break;
            case -1400551171:
                if (lowerInvariant.equals("widevine")) {
                    c8 = 1;
                    break;
                }
                break;
            case 790309106:
                if (lowerInvariant.equals("clearkey")) {
                    c8 = 2;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                return C.PLAYREADY_UUID;
            case 1:
                return C.WIDEVINE_UUID;
            case 2:
                return C.CLEARKEY_UUID;
            default:
                try {
                    return UUID.fromString(str);
                } catch (RuntimeException unused) {
                    return null;
                }
        }
    }

    public static int getIntegerCodeForString(String str) {
        boolean z8;
        int length = str.length();
        if (length <= 4) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkArgument(z8);
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            i8 = (i8 << 8) | str.charAt(i9);
        }
        return i8;
    }

    public static long getMediaDurationForPlayoutDuration(long j8, float f8) {
        if (f8 == 1.0f) {
            return j8;
        }
        return Math.round(j8 * f8);
    }

    public static int getPcmEncoding(int i8) {
        if (i8 == 8) {
            return 3;
        }
        if (i8 == 16) {
            return 2;
        }
        if (i8 != 24) {
            return i8 != 32 ? 0 : 1073741824;
        }
        return Integer.MIN_VALUE;
    }

    public static int getPcmFrameSize(int i8, int i9) {
        if (i8 != Integer.MIN_VALUE) {
            if (i8 != 1073741824) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 != 4) {
                            throw new IllegalArgumentException();
                        }
                    } else {
                        return i9;
                    }
                } else {
                    return i9 * 2;
                }
            }
            return i9 * 4;
        }
        return i9 * 3;
    }

    public static Point getPhysicalDisplaySize(Context context) {
        return getPhysicalDisplaySize(context, ((WindowManager) context.getSystemService("window")).getDefaultDisplay());
    }

    public static long getPlayoutDurationForMediaDuration(long j8, float f8) {
        if (f8 == 1.0f) {
            return j8;
        }
        return Math.round(j8 / f8);
    }

    public static int getStreamTypeForAudioUsage(int i8) {
        if (i8 == 13) {
            return 1;
        }
        switch (i8) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static String getStringForTime(StringBuilder sb, Formatter formatter, long j8) {
        if (j8 == C.TIME_UNSET) {
            j8 = 0;
        }
        long j9 = (j8 + 500) / 1000;
        long j10 = j9 % 60;
        long j11 = (j9 / 60) % 60;
        long j12 = j9 / 3600;
        sb.setLength(0);
        if (j12 > 0) {
            return formatter.format("%d:%02d:%02d", Long.valueOf(j12), Long.valueOf(j11), Long.valueOf(j10)).toString();
        }
        return formatter.format("%02d:%02d", Long.valueOf(j11), Long.valueOf(j10)).toString();
    }

    public static String getUserAgent(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        return str + "/" + str2 + " (Linux;Android " + Build.VERSION.RELEASE + ") " + ExoPlayerLibraryInfo.VERSION_SLASHY;
    }

    public static byte[] getUtf8Bytes(String str) {
        return str.getBytes(Charset.forName(C.UTF8_NAME));
    }

    public static int inferContentType(Uri uri, String str) {
        if (TextUtils.isEmpty(str)) {
            return inferContentType(uri);
        }
        return inferContentType("." + str);
    }

    public static boolean isEncodingHighResolutionIntegerPcm(int i8) {
        return i8 == Integer.MIN_VALUE || i8 == 1073741824;
    }

    public static boolean isEncodingPcm(int i8) {
        return i8 == 3 || i8 == 2 || i8 == Integer.MIN_VALUE || i8 == 1073741824 || i8 == 4;
    }

    public static boolean isLinebreak(int i8) {
        return i8 == 10 || i8 == 13;
    }

    public static boolean isLocalFileUri(Uri uri) {
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme) && !"file".equals(scheme)) {
            return false;
        }
        return true;
    }

    public static boolean maybeRequestReadExternalStoragePermission(Activity activity, Uri... uriArr) {
        return false;
    }

    public static ExecutorService newSingleThreadExecutor(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.mbridge.msdk.playercommon.exoplayer2.util.Util.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, str);
            }
        });
    }

    public static String normalizeLanguageCode(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new Locale(str).getISO3Language();
        } catch (MissingResourceException unused) {
            return toLowerInvariant(str);
        }
    }

    public static <T> T[] nullSafeArrayCopy(T[] tArr, int i8) {
        boolean z8;
        if (i8 <= tArr.length) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkArgument(z8);
        return (T[]) Arrays.copyOf(tArr, i8);
    }

    public static long parseXsDateTime(String str) throws ParserException {
        Matcher matcher = XS_DATE_TIME_PATTERN.matcher(str);
        if (matcher.matches()) {
            int i8 = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                i8 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                if ("-".equals(matcher.group(11))) {
                    i8 *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (i8 != 0) {
                return timeInMillis - (i8 * MBridgeCommon.DEFAULT_LOAD_TIMEOUT);
            }
            return timeInMillis;
        }
        throw new ParserException("Invalid date/time format: " + str);
    }

    public static long parseXsDuration(String str) {
        double d8;
        double d9;
        double d10;
        double d11;
        double d12;
        Matcher matcher = XS_DURATION_PATTERN.matcher(str);
        if (matcher.matches()) {
            boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
            String group = matcher.group(3);
            double d13 = 0.0d;
            if (group != null) {
                d8 = Double.parseDouble(group) * 3.1556908E7d;
            } else {
                d8 = 0.0d;
            }
            String group2 = matcher.group(5);
            if (group2 != null) {
                d9 = Double.parseDouble(group2) * 2629739.0d;
            } else {
                d9 = 0.0d;
            }
            double d14 = d8 + d9;
            String group3 = matcher.group(7);
            if (group3 != null) {
                d10 = Double.parseDouble(group3) * 86400.0d;
            } else {
                d10 = 0.0d;
            }
            double d15 = d14 + d10;
            String group4 = matcher.group(10);
            if (group4 != null) {
                d11 = Double.parseDouble(group4) * 3600.0d;
            } else {
                d11 = 0.0d;
            }
            double d16 = d15 + d11;
            String group5 = matcher.group(12);
            if (group5 != null) {
                d12 = Double.parseDouble(group5) * 60.0d;
            } else {
                d12 = 0.0d;
            }
            double d17 = d16 + d12;
            String group6 = matcher.group(14);
            if (group6 != null) {
                d13 = Double.parseDouble(group6);
            }
            long j8 = (long) ((d17 + d13) * 1000.0d);
            if (isEmpty) {
                return -j8;
            }
            return j8;
        }
        return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
    }

    public static boolean readBoolean(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static void recursiveDelete(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                recursiveDelete(file2);
            }
        }
        file.delete();
    }

    public static <T> void removeRange(List<T> list, int i8, int i9) {
        list.subList(i8, i9).clear();
    }

    public static long resolveSeekPositionUs(long j8, SeekParameters seekParameters, long j9, long j10) {
        boolean z8;
        if (SeekParameters.EXACT.equals(seekParameters)) {
            return j8;
        }
        long subtractWithOverflowDefault = subtractWithOverflowDefault(j8, seekParameters.toleranceBeforeUs, Long.MIN_VALUE);
        long addWithOverflowDefault = addWithOverflowDefault(j8, seekParameters.toleranceAfterUs, Long.MAX_VALUE);
        boolean z9 = false;
        if (subtractWithOverflowDefault <= j9 && j9 <= addWithOverflowDefault) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (subtractWithOverflowDefault <= j10 && j10 <= addWithOverflowDefault) {
            z9 = true;
        }
        if (z8 && z9) {
            if (Math.abs(j9 - j8) <= Math.abs(j10 - j8)) {
                return j9;
            }
            return j10;
        }
        if (z8) {
            return j9;
        }
        if (z9) {
            return j10;
        }
        return subtractWithOverflowDefault;
    }

    public static long scaleLargeTimestamp(long j8, long j9, long j10) {
        if (j10 >= j9 && j10 % j9 == 0) {
            return j8 / (j10 / j9);
        }
        if (j10 < j9 && j9 % j10 == 0) {
            return j8 * (j9 / j10);
        }
        return (long) (j8 * (j9 / j10));
    }

    public static long[] scaleLargeTimestamps(List<Long> list, long j8, long j9) {
        int size = list.size();
        long[] jArr = new long[size];
        int i8 = 0;
        if (j9 >= j8 && j9 % j8 == 0) {
            long j10 = j9 / j8;
            while (i8 < size) {
                jArr[i8] = list.get(i8).longValue() / j10;
                i8++;
            }
        } else if (j9 < j8 && j8 % j9 == 0) {
            long j11 = j8 / j9;
            while (i8 < size) {
                jArr[i8] = list.get(i8).longValue() * j11;
                i8++;
            }
        } else {
            double d8 = j8 / j9;
            while (i8 < size) {
                jArr[i8] = (long) (list.get(i8).longValue() * d8);
                i8++;
            }
        }
        return jArr;
    }

    public static void scaleLargeTimestampsInPlace(long[] jArr, long j8, long j9) {
        int i8 = 0;
        if (j9 >= j8 && j9 % j8 == 0) {
            long j10 = j9 / j8;
            while (i8 < jArr.length) {
                jArr[i8] = jArr[i8] / j10;
                i8++;
            }
            return;
        }
        if (j9 < j8 && j8 % j9 == 0) {
            long j11 = j8 / j9;
            while (i8 < jArr.length) {
                jArr[i8] = jArr[i8] * j11;
                i8++;
            }
            return;
        }
        double d8 = j8 / j9;
        while (i8 < jArr.length) {
            jArr[i8] = (long) (jArr[i8] * d8);
            i8++;
        }
    }

    private static boolean shouldEscapeCharacter(char c8) {
        return c8 == '\"' || c8 == '%' || c8 == '*' || c8 == '/' || c8 == ':' || c8 == '<' || c8 == '\\' || c8 == '|' || c8 == '>' || c8 == '?';
    }

    public static void sneakyThrow(Throwable th) {
        sneakyThrowInternal(th);
    }

    public static String[] split(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] splitAtFirst(String str, String str2) {
        return str.split(str2, 2);
    }

    public static ComponentName startForegroundService(Context context, Intent intent) {
        ComponentName startForegroundService;
        if (SDK_INT >= 26) {
            startForegroundService = context.startForegroundService(intent);
            return startForegroundService;
        }
        return context.startService(intent);
    }

    public static long subtractWithOverflowDefault(long j8, long j9, long j10) {
        long j11 = j8 - j9;
        return ((j8 ^ j11) & (j9 ^ j8)) < 0 ? j10 : j11;
    }

    public static int[] toArray(List<Integer> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i8 = 0; i8 < size; i8++) {
            iArr[i8] = list.get(i8).intValue();
        }
        return iArr;
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static String toLowerInvariant(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.US);
    }

    public static String toUpperInvariant(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(Locale.US);
    }

    public static String unescapeFileName(String str) {
        int length = str.length();
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) == '%') {
                i9++;
            }
        }
        if (i9 == 0) {
            return str;
        }
        int i11 = length - (i9 * 2);
        StringBuilder sb = new StringBuilder(i11);
        Matcher matcher = ESCAPED_CHARACTER_PATTERN.matcher(str);
        while (i9 > 0 && matcher.find()) {
            char parseInt = (char) Integer.parseInt(matcher.group(1), 16);
            sb.append((CharSequence) str, i8, matcher.start());
            sb.append(parseInt);
            i8 = matcher.end();
            i9--;
        }
        if (i8 < length) {
            sb.append((CharSequence) str, i8, length);
        }
        if (sb.length() != i11) {
            return null;
        }
        return sb.toString();
    }

    public static void writeBoolean(Parcel parcel, boolean z8) {
        parcel.writeInt(z8 ? 1 : 0);
    }

    public static long ceilDivide(long j8, long j9) {
        return ((j8 + j9) - 1) / j9;
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long constrainValue(long j8, long j9, long j10) {
        return Math.max(j9, Math.min(j8, j10));
    }

    public static String fromUtf8Bytes(byte[] bArr, int i8, int i9) {
        return new String(bArr, i8, i9, Charset.forName(C.UTF8_NAME));
    }

    public static float constrainValue(float f8, float f9, float f10) {
        return Math.max(f9, Math.min(f8, f10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0070, code lost:            if (r6.equals("TPM171E") == false) goto L40;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Point getPhysicalDisplaySize(android.content.Context r6, android.view.Display r7) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.util.Util.getPhysicalDisplaySize(android.content.Context, android.view.Display):android.graphics.Point");
    }

    public static <T> int binarySearchCeil(List<? extends Comparable<? super T>> list, T t8, boolean z8, boolean z9) {
        int i8;
        int i9;
        int binarySearch = Collections.binarySearch(list, t8);
        if (binarySearch < 0) {
            i9 = ~binarySearch;
        } else {
            int size = list.size();
            while (true) {
                i8 = binarySearch + 1;
                if (i8 >= size || list.get(i8).compareTo(t8) != 0) {
                    break;
                }
                binarySearch = i8;
            }
            i9 = z8 ? binarySearch : i8;
        }
        return z9 ? Math.min(list.size() - 1, i9) : i9;
    }

    public static int binarySearchFloor(long[] jArr, long j8, boolean z8, boolean z9) {
        int i8;
        int i9;
        int binarySearch = Arrays.binarySearch(jArr, j8);
        if (binarySearch < 0) {
            i9 = -(binarySearch + 2);
        } else {
            while (true) {
                i8 = binarySearch - 1;
                if (i8 < 0 || jArr[i8] != j8) {
                    break;
                }
                binarySearch = i8;
            }
            i9 = z8 ? binarySearch : i8;
        }
        return z9 ? Math.max(0, i9) : i9;
    }

    public static int inferContentType(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return 3;
        }
        return inferContentType(path);
    }

    public static int inferContentType(String str) {
        String lowerInvariant = toLowerInvariant(str);
        if (lowerInvariant.endsWith(".mpd")) {
            return 0;
        }
        if (lowerInvariant.endsWith(".m3u8")) {
            return 2;
        }
        return lowerInvariant.matches(".*\\.ism(l)?(/manifest(\\(.+\\))?)?") ? 1 : 3;
    }

    public static <T> int binarySearchFloor(List<? extends Comparable<? super T>> list, T t8, boolean z8, boolean z9) {
        int i8;
        int i9;
        int binarySearch = Collections.binarySearch(list, t8);
        if (binarySearch < 0) {
            i9 = -(binarySearch + 2);
        } else {
            while (true) {
                i8 = binarySearch - 1;
                if (i8 < 0 || list.get(i8).compareTo(t8) != 0) {
                    break;
                }
                binarySearch = i8;
            }
            i9 = z8 ? binarySearch : i8;
        }
        return z9 ? Math.max(0, i9) : i9;
    }

    private static <T extends Throwable> void sneakyThrowInternal(Throwable th) throws Throwable {
        throw th;
    }
}
