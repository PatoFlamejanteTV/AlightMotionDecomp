package r4;

import com.mbridge.msdk.MBridgeConstans;
import kotlin.jvm.internal.AbstractC3292y;
import l6.AbstractC3335a;

/* renamed from: r4.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3919s {
    public static final String a(String input) {
        AbstractC3292y.i(input, "input");
        String str = MBridgeConstans.ENDCARD_URL_TYPE_PL + input;
        if ((!(!l6.n.T(input)) || input.charAt(0) == '0' || input.charAt(0) == '1') && (input.length() <= 1 || input.charAt(0) != '1' || AbstractC3335a.g(input.charAt(1)) <= 2)) {
            str = null;
        }
        if (str != null) {
            return str;
        }
        return input;
    }
}
