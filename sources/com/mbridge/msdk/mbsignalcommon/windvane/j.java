package com.mbridge.msdk.mbsignalcommon.windvane;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f21864a = {"wv_hybrid:", "mraid:", "ssp:", "mvb_hybrid:"};

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f21865b = Pattern.compile("hybrid://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f21866c = Pattern.compile("mraid://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f21867d = Pattern.compile("ssp://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f21868e = Pattern.compile("mv://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: f, reason: collision with root package name */
    private static Map<String, String> f21869f = new HashMap();

    static {
        for (e eVar : e.values()) {
            f21869f.put(eVar.a(), eVar.b());
        }
    }

    public static boolean a(String str) {
        for (String str2 : f21864a) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static Pattern b(String str) {
        if ("wv_hybrid:".equals(str)) {
            return f21868e;
        }
        if ("mraid:".equals(str)) {
            return f21866c;
        }
        if ("ssp:".equals(str)) {
            return f21867d;
        }
        if ("mvb_hybrid:".equals(str)) {
            return f21868e;
        }
        return null;
    }

    public static String c(String str) {
        char[] cArr = {'\'', '\\'};
        StringBuffer stringBuffer = new StringBuffer(1000);
        stringBuffer.setLength(0);
        for (int i8 = 0; i8 < str.length(); i8++) {
            char charAt = str.charAt(i8);
            if (charAt > 255) {
                stringBuffer.append("\\u");
                String upperCase = Integer.toHexString(charAt >>> '\b').toUpperCase();
                if (upperCase.length() == 1) {
                    stringBuffer.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
                stringBuffer.append(upperCase);
                String upperCase2 = Integer.toHexString(charAt & 255).toUpperCase();
                if (upperCase2.length() == 1) {
                    stringBuffer.append(MBridgeConstans.ENDCARD_URL_TYPE_PL);
                }
                stringBuffer.append(upperCase2);
            } else {
                int i9 = 0;
                while (true) {
                    if (i9 < 2) {
                        if (cArr[i9] == charAt) {
                            stringBuffer.append("\\" + charAt);
                            break;
                        }
                        i9++;
                    } else {
                        stringBuffer.append(charAt);
                        break;
                    }
                }
            }
        }
        return new String(stringBuffer);
    }

    public static boolean d(String str) {
        return e(str).startsWith("image");
    }

    public static String e(String str) {
        String str2 = f21869f.get(f(str));
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    private static String f(String str) {
        String path;
        int lastIndexOf;
        if (TextUtils.isEmpty(str) || (path = Uri.parse(str).getPath()) == null || (lastIndexOf = path.lastIndexOf(".")) == -1) {
            return "";
        }
        return path.substring(lastIndexOf + 1);
    }
}
