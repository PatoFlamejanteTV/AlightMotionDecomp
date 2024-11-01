package com.mbridge.msdk.newreward.function.common;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public class JSONUtils {
    public static JSONObject parse(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
