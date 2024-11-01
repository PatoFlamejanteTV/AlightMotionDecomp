package x1;

import com.mbridge.msdk.MBridgeConstans;
import java.util.regex.Pattern;
import y1.C4236a;

/* renamed from: x1.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4206j {

    /* renamed from: a, reason: collision with root package name */
    private static Pattern f40939a = Pattern.compile("^[0-1]*$", 2);

    public static int a(String str) {
        if (f40939a.matcher(str).matches()) {
            int i8 = 0;
            int i9 = 0;
            while (i8 < str.length()) {
                int i10 = i8 + 1;
                if (str.charAt(str.length() - i10) == '1') {
                    i9 += 1 << i8;
                }
                i8 = i10;
            }
            return i9;
        }
        throw new C4236a("Undecodable FixedInteger '" + str + "'");
    }

    public static String b(int i8, int i9) {
        String str = "";
        while (i8 > 0) {
            if ((i8 & 1) == 1) {
                str = "1" + str;
            } else {
                str = MBridgeConstans.ENDCARD_URL_TYPE_PL + str;
            }
            i8 >>= 1;
        }
        while (str.length() < i9) {
            str = MBridgeConstans.ENDCARD_URL_TYPE_PL + str;
        }
        return str;
    }
}
