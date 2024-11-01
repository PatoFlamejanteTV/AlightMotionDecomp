package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes4.dex */
public class J {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f18556a;

    public J(Bundle bundle) {
        if (bundle != null) {
            this.f18556a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException(DataSchemeDataSource.SCHEME_DATA);
    }

    private static int d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    private static boolean s(String str) {
        if (!str.startsWith("google.c.a.") && !str.equals(TypedValues.TransitionType.S_FROM)) {
            return false;
        }
        return true;
    }

    public static boolean t(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString(v("gcm.n.e")))) {
            return false;
        }
        return true;
    }

    private static boolean u(String str) {
        if (!str.startsWith("google.c.") && !str.startsWith("gcm.n.") && !str.startsWith("gcm.notification.")) {
            return false;
        }
        return true;
    }

    private static String v(String str) {
        if (!str.startsWith("gcm.n.")) {
            return str;
        }
        return str.replace("gcm.n.", "gcm.notification.");
    }

    private String w(String str) {
        if (!this.f18556a.containsKey(str) && str.startsWith("gcm.n.")) {
            String v8 = v(str);
            if (this.f18556a.containsKey(v8)) {
                return v8;
            }
        }
        return str;
    }

    private static String z(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    public boolean a(String str) {
        String p8 = p(str);
        if (!"1".equals(p8) && !Boolean.parseBoolean(p8)) {
            return false;
        }
        return true;
    }

    public Integer b(String str) {
        String p8 = p(str);
        if (!TextUtils.isEmpty(p8)) {
            try {
                return Integer.valueOf(Integer.parseInt(p8));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + z(str) + "(" + p8 + ") into an int");
                return null;
            }
        }
        return null;
    }

    public JSONArray c(String str) {
        String p8 = p(str);
        if (!TextUtils.isEmpty(p8)) {
            try {
                return new JSONArray(p8);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + z(str) + ": " + p8 + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] e() {
        JSONArray c8 = c("gcm.n.light_settings");
        if (c8 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c8.length() == 3) {
                iArr[0] = d(c8.optString(0));
                iArr[1] = c8.optInt(1);
                iArr[2] = c8.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (IllegalArgumentException e8) {
            Log.w("NotificationParams", "LightSettings is invalid: " + c8 + ". " + e8.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + c8 + ". Skipping setting LightSettings");
            return null;
        }
    }

    public Uri f() {
        String p8 = p("gcm.n.link_android");
        if (TextUtils.isEmpty(p8)) {
            p8 = p("gcm.n.link");
        }
        if (!TextUtils.isEmpty(p8)) {
            return Uri.parse(p8);
        }
        return null;
    }

    public Object[] g(String str) {
        JSONArray c8 = c(str + "_loc_args");
        if (c8 == null) {
            return null;
        }
        int length = c8.length();
        String[] strArr = new String[length];
        for (int i8 = 0; i8 < length; i8++) {
            strArr[i8] = c8.optString(i8);
        }
        return strArr;
    }

    public String h(String str) {
        return p(str + "_loc_key");
    }

    public String i(Resources resources, String str, String str2) {
        String h8 = h(str2);
        if (TextUtils.isEmpty(h8)) {
            return null;
        }
        int identifier = resources.getIdentifier(h8, TypedValues.Custom.S_STRING, str);
        if (identifier == 0) {
            Log.w("NotificationParams", z(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] g8 = g(str2);
        if (g8 == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, g8);
        } catch (MissingFormatArgumentException e8) {
            Log.w("NotificationParams", "Missing format argument for " + z(str2) + ": " + Arrays.toString(g8) + " Default value will be used.", e8);
            return null;
        }
    }

    public Long j(String str) {
        String p8 = p(str);
        if (!TextUtils.isEmpty(p8)) {
            try {
                return Long.valueOf(Long.parseLong(p8));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + z(str) + "(" + p8 + ") into a long");
                return null;
            }
        }
        return null;
    }

    public String k() {
        return p("gcm.n.android_channel_id");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer l() {
        Integer b9 = b("gcm.n.notification_count");
        if (b9 == null) {
            return null;
        }
        if (b9.intValue() < 0) {
            Log.w("FirebaseMessaging", "notificationCount is invalid: " + b9 + ". Skipping setting notificationCount.");
            return null;
        }
        return b9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer m() {
        Integer b9 = b("gcm.n.notification_priority");
        if (b9 == null) {
            return null;
        }
        if (b9.intValue() >= -2 && b9.intValue() <= 2) {
            return b9;
        }
        Log.w("FirebaseMessaging", "notificationPriority is invalid " + b9 + ". Skipping setting notificationPriority.");
        return null;
    }

    public String n(Resources resources, String str, String str2) {
        String p8 = p(str2);
        if (!TextUtils.isEmpty(p8)) {
            return p8;
        }
        return i(resources, str, str2);
    }

    public String o() {
        String p8 = p("gcm.n.sound2");
        if (TextUtils.isEmpty(p8)) {
            return p("gcm.n.sound");
        }
        return p8;
    }

    public String p(String str) {
        return this.f18556a.getString(w(str));
    }

    public long[] q() {
        JSONArray c8 = c("gcm.n.vibrate_timings");
        if (c8 == null) {
            return null;
        }
        try {
            if (c8.length() > 1) {
                int length = c8.length();
                long[] jArr = new long[length];
                for (int i8 = 0; i8 < length; i8++) {
                    jArr[i8] = c8.optLong(i8);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + c8 + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer r() {
        Integer b9 = b("gcm.n.visibility");
        if (b9 == null) {
            return null;
        }
        if (b9.intValue() >= -1 && b9.intValue() <= 1) {
            return b9;
        }
        Log.w("NotificationParams", "visibility is invalid: " + b9 + ". Skipping setting visibility.");
        return null;
    }

    public Bundle x() {
        Bundle bundle = new Bundle(this.f18556a);
        for (String str : this.f18556a.keySet()) {
            if (!s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public Bundle y() {
        Bundle bundle = new Bundle(this.f18556a);
        for (String str : this.f18556a.keySet()) {
            if (u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
