package x1;

import com.mbridge.msdk.MBridgeConstans;

/* loaded from: classes4.dex */
public class o extends AbstractC4199c {
    @Override // x1.AbstractC4199c
    protected String g(String str) {
        while (str.length() % 24 > 0) {
            str = str + MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        return str;
    }
}
