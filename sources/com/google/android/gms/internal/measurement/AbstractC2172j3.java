package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import androidx.collection.ArrayMap;

/* renamed from: com.google.android.gms.internal.measurement.j3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2172j3 {

    /* renamed from: a, reason: collision with root package name */
    private static final ArrayMap f16783a = new ArrayMap();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (AbstractC2172j3.class) {
            ArrayMap arrayMap = f16783a;
            uri = (Uri) arrayMap.get(str);
            if (uri == null) {
                uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
                arrayMap.put(str, uri);
            }
        }
        return uri;
    }

    public static String b(Context context, String str) {
        if (!str.contains("#")) {
            return str + "#" + context.getPackageName();
        }
        throw new IllegalArgumentException("The passed in package cannot already have a subpackage: " + str);
    }

    public static boolean c(String str, String str2) {
        if (str.equals("eng") || str.equals("userdebug")) {
            if (!str2.contains("dev-keys") && !str2.contains("test-keys")) {
                return false;
            }
            return true;
        }
        return false;
    }
}
