package com.mbridge.msdk.foundation.tools;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.net.URL;

/* loaded from: classes4.dex */
public final class ao {
    public static String a(String str) {
        try {
            if (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) {
                return "";
            }
            return new URL(str).getHost();
        } catch (Exception e8) {
            ad.b("UriUtil", e8.getMessage());
            return "";
        }
    }

    public static String b(String str) {
        try {
            if (!TextUtils.isEmpty(str) && URLUtil.isValidUrl(str)) {
                return new URL(str).getPath();
            }
            return str;
        } catch (Exception e8) {
            ad.b("UriUtil", e8.getMessage());
            return "";
        }
    }

    public static int c(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!URLUtil.isValidUrl(str)) {
                    if (str != null && str.length() > 5 && str.substring(0, 6).equalsIgnoreCase("tcp://")) {
                    }
                }
                return Uri.parse(str).getQueryParameterNames().size();
            }
        } catch (Exception e8) {
            ad.b("UriUtil", e8.getMessage());
        }
        return 0;
    }

    public static String d(String str) {
        try {
            Uri parse = Uri.parse(str);
            return parse.getScheme() + "://" + parse.getHost() + parse.getPath();
        } catch (Exception e8) {
            ad.b("UriUtil", e8.getMessage());
            return "";
        }
    }

    public static String a(String str, String str2) {
        try {
            return (TextUtils.isEmpty(str) || !URLUtil.isValidUrl(str)) ? str : Uri.parse(str).getQueryParameter(str2);
        } catch (Exception e8) {
            ad.b("UriUtil", e8.getMessage());
            return "";
        }
    }
}
