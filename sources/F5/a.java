package F5;

import Q5.x;
import R5.Q;
import androidx.exifinterface.media.ExifInterface;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;
import l6.AbstractC3335a;
import l6.n;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0039a f2690a = new C0039a();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f2691b = Q.k(x.a(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, 0), x.a("B", 1), x.a("C", 2), x.a("D", 3), x.a(ExifInterface.LONGITUDE_EAST, 4), x.a("F", 5), x.a("G", 6), x.a("H", 7), x.a("I", 8), x.a("J", 9), x.a("K", 10), x.a("L", 11), x.a("M", 12), x.a("N", 13), x.a("O", 14), x.a("P", 15), x.a("Q", 16), x.a("R", 17), x.a(ExifInterface.LATITUDE_SOUTH, 18), x.a(ExifInterface.GPS_DIRECTION_TRUE, 19), x.a("U", 20), x.a(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, 21), x.a(ExifInterface.LONGITUDE_WEST, 22), x.a("X", 23), x.a("Y", 24), x.a("Z", 25), x.a("a", 26), x.a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, 27), x.a("c", 28), x.a("d", 29), x.a("e", 30), x.a("f", 31), x.a("g", 32), x.a(com.mbridge.msdk.c.h.f19256a, 33), x.a(com.mbridge.msdk.foundation.same.report.i.f21140a, 34), x.a("j", 35), x.a("k", 36), x.a("l", 37), x.a("m", 38), x.a("n", 39), x.a("o", 40), x.a(TtmlNode.TAG_P, 41), x.a(CampaignEx.JSON_KEY_AD_Q, 42), x.a(CampaignEx.JSON_KEY_AD_R, 43), x.a("s", 44), x.a("t", 45), x.a("u", 46), x.a("v", 47), x.a("w", 48), x.a("x", 49), x.a("y", 50), x.a("z", 51), x.a(MBridgeConstans.ENDCARD_URL_TYPE_PL, 52), x.a("1", 53), x.a("2", 54), x.a(ExifInterface.GPS_MEASUREMENT_3D, 55), x.a("4", 56), x.a(CampaignEx.CLICKMODE_ON, 57), x.a("6", 58), x.a("7", 59), x.a("8", 60), x.a("9", 61), x.a("-", 62), x.a("_", 63));

    /* renamed from: F5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0039a {
        public final String a(String str) {
            String num;
            AbstractC3292y.i(str, "str");
            if (new l6.j("^[A-Za-z0-9\\-_]+$").e(str)) {
                int length = str.length();
                String str2 = "";
                int i8 = 0;
                while (i8 < length) {
                    char charAt = str.charAt(i8);
                    i8++;
                    Integer num2 = (Integer) a.f2691b.get(String.valueOf(charAt));
                    if (num2 == null) {
                        num = null;
                    } else {
                        num = Integer.toString(num2.intValue(), AbstractC3335a.a(2));
                        AbstractC3292y.h(num, "toString(this, checkRadix(radix))");
                    }
                    if (num != null) {
                        StringBuilder a9 = AbstractC4157a.a(str2);
                        a9.append(n.v(MBridgeConstans.ENDCARD_URL_TYPE_PL, 6 - num.length()));
                        a9.append((Object) num);
                        str2 = a9.toString();
                    }
                }
                return str2;
            }
            C0039a c0039a = a.f2690a;
            throw new e(AbstractC3292y.q("g.a", ": Invalidly encoded Base64URL string"));
        }

        public final String b(String str) {
            AbstractC3292y.i(str, "str");
            if (new l6.j("^[0-1]+$").e(str)) {
                Iterator it = n.O0(str, 6).iterator();
                String str2 = "";
                while (it.hasNext()) {
                    str2 = AbstractC3292y.q(str2, Character.valueOf("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(Integer.parseInt((String) it.next(), 2))));
                }
                return str2;
            }
            StringBuilder sb = new StringBuilder();
            C0039a c0039a = a.f2690a;
            sb.append((Object) "g.a");
            sb.append(": invalid bitField + ");
            sb.append(str);
            throw new e(sb.toString());
        }
    }
}
