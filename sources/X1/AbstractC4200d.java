package x1;

import com.mbridge.msdk.MBridgeConstans;
import y1.C4236a;

/* renamed from: x1.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4200d {
    public static boolean a(String str) {
        if (str.equals("1")) {
            return true;
        }
        if (str.equals(MBridgeConstans.ENDCARD_URL_TYPE_PL)) {
            return false;
        }
        throw new C4236a("Undecodable Boolean '" + str + "'");
    }

    public static String b(Boolean bool) {
        if (bool.booleanValue()) {
            return "1";
        }
        if (!bool.booleanValue()) {
            return MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        throw new y1.b("Unencodable Boolean '" + bool + "'");
    }
}
