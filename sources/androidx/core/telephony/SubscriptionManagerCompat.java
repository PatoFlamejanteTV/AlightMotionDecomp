package androidx.core.telephony;

import android.os.Build;
import android.telephony.SubscriptionManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.content.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(22)
/* loaded from: classes3.dex */
public class SubscriptionManagerCompat {
    private static Method sGetSlotIndexMethod;

    @RequiresApi(29)
    /* loaded from: classes3.dex */
    private static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        static int getSlotIndex(int i8) {
            return SubscriptionManager.getSlotIndex(i8);
        }
    }

    private SubscriptionManagerCompat() {
    }

    public static int getSlotIndex(int i8) {
        if (i8 == -1) {
            return -1;
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 29) {
            return Api29Impl.getSlotIndex(i8);
        }
        try {
            if (sGetSlotIndexMethod == null) {
                if (i9 >= 26) {
                    sGetSlotIndexMethod = a.a().getDeclaredMethod("getSlotIndex", Integer.TYPE);
                } else {
                    sGetSlotIndexMethod = a.a().getDeclaredMethod("getSlotId", Integer.TYPE);
                }
                sGetSlotIndexMethod.setAccessible(true);
            }
            Integer num = (Integer) sGetSlotIndexMethod.invoke(null, Integer.valueOf(i8));
            if (num != null) {
                return num.intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return -1;
    }
}
