package x1;

import com.mbridge.msdk.MBridgeConstans;
import java.util.regex.Pattern;
import y1.C4236a;

/* loaded from: classes4.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private static Pattern f40942a = Pattern.compile("^[0-1]*$", 2);

    public static long a(String str) {
        if (f40942a.matcher(str).matches()) {
            long j8 = 0;
            int i8 = 0;
            while (i8 < str.length()) {
                int i9 = i8 + 1;
                if (str.charAt(str.length() - i9) == '1') {
                    j8 += 1 << i8;
                }
                i8 = i9;
            }
            return j8;
        }
        throw new C4236a("Undecodable FixedLong '" + str + "'");
    }

    public static String b(long j8, int i8) {
        String str = "";
        while (j8 > 0) {
            if ((j8 & 1) == 1) {
                str = "1" + str;
            } else {
                str = MBridgeConstans.ENDCARD_URL_TYPE_PL + str;
            }
            j8 >>= 1;
        }
        while (str.length() < i8) {
            str = MBridgeConstans.ENDCARD_URL_TYPE_PL + str;
        }
        return str;
    }
}
