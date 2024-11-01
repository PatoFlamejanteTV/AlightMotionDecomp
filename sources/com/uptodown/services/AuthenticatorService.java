package com.uptodown.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3790o;

/* loaded from: classes5.dex */
public final class AuthenticatorService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        AbstractC3292y.i(intent, "intent");
        IBinder iBinder = new C3790o(this).getIBinder();
        AbstractC3292y.h(iBinder, "getIBinder(...)");
        return iBinder;
    }
}
