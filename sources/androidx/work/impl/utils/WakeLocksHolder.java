package androidx.work.impl.utils;

import android.os.PowerManager;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class WakeLocksHolder {
    public static final WakeLocksHolder INSTANCE = new WakeLocksHolder();
    private static final WeakHashMap<PowerManager.WakeLock, String> wakeLocks = new WeakHashMap<>();

    private WakeLocksHolder() {
    }

    public final WeakHashMap<PowerManager.WakeLock, String> getWakeLocks() {
        return wakeLocks;
    }
}
