package Q;

import Q.InterfaceC1390j;
import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: Q.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC1381a extends InterfaceC1390j.a {
    public static Account k(InterfaceC1390j interfaceC1390j) {
        Account account = null;
        if (interfaceC1390j != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    account = interfaceC1390j.x();
                } catch (RemoteException unused) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                }
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }
}
