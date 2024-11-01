package com.google.firebase.messaging;

import android.os.Bundle;
import androidx.collection.ArrayMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2573e {

    /* renamed from: a, reason: collision with root package name */
    public static final long f18654a = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: com.google.firebase.messaging.e$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static ArrayMap a(Bundle bundle) {
            ArrayMap arrayMap = new ArrayMap();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals(TypedValues.TransitionType.S_FROM) && !str.equals("message_type") && !str.equals("collapse_key")) {
                        arrayMap.put(str, str2);
                    }
                }
            }
            return arrayMap;
        }
    }
}
