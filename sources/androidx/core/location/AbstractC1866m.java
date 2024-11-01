package androidx.core.location;

import android.location.Location;
import android.os.Bundle;
import java.util.List;

/* renamed from: androidx.core.location.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC1866m {
    public static void b(LocationListenerCompat locationListenerCompat, List list) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            locationListenerCompat.onLocationChanged((Location) list.get(i8));
        }
    }

    public static void a(LocationListenerCompat locationListenerCompat, int i8) {
    }

    public static void c(LocationListenerCompat locationListenerCompat, String str) {
    }

    public static void d(LocationListenerCompat locationListenerCompat, String str) {
    }

    public static void e(LocationListenerCompat locationListenerCompat, String str, int i8, Bundle bundle) {
    }
}
