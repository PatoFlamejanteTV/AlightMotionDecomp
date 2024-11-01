package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class PostMessageService extends Service {
    private d.a mBinder = new d.a() { // from class: androidx.browser.customtabs.PostMessageService.1
        @Override // android.support.customtabs.d
        public void onMessageChannelReady(@NonNull android.support.customtabs.a aVar, @Nullable Bundle bundle) throws RemoteException {
            aVar.onMessageChannelReady(bundle);
        }

        @Override // android.support.customtabs.d
        public void onPostMessage(@NonNull android.support.customtabs.a aVar, @NonNull String str, @Nullable Bundle bundle) throws RemoteException {
            aVar.onPostMessage(str, bundle);
        }
    };

    @Override // android.app.Service
    @NonNull
    public IBinder onBind(@Nullable Intent intent) {
        return this.mBinder;
    }
}
