package com.google.firebase.iid;

import M.AbstractC1324b;
import M.C1323a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.C2582n;
import com.google.firebase.messaging.H;
import java.util.concurrent.ExecutionException;
import q0.AbstractC3628n;

/* loaded from: classes3.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC1324b {
    private static Intent f(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // M.AbstractC1324b
    protected int b(Context context, C1323a c1323a) {
        try {
            return ((Integer) AbstractC3628n.a(new C2582n(context).k(c1323a.s()))).intValue();
        } catch (InterruptedException | ExecutionException e8) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e8);
            return 500;
        }
    }

    @Override // M.AbstractC1324b
    protected void c(Context context, Bundle bundle) {
        Intent f8 = f(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (H.D(f8)) {
            H.v(f8);
        }
    }
}
