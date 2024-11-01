package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.IMultiInstanceInvalidationService;
import androidx.room.InvalidationTracker;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class MultiInstanceInvalidationClient {
    private final Context appContext;
    private final IMultiInstanceInvalidationCallback callback;
    private int clientId;
    private final Executor executor;
    private final InvalidationTracker invalidationTracker;
    private final String name;
    public InvalidationTracker.Observer observer;
    private final Runnable removeObserverRunnable;
    private IMultiInstanceInvalidationService service;
    private final ServiceConnection serviceConnection;
    private final Runnable setUpRunnable;
    private final AtomicBoolean stopped;

    public MultiInstanceInvalidationClient(Context context, String name, Intent serviceIntent, InvalidationTracker invalidationTracker, Executor executor) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(name, "name");
        AbstractC3292y.i(serviceIntent, "serviceIntent");
        AbstractC3292y.i(invalidationTracker, "invalidationTracker");
        AbstractC3292y.i(executor, "executor");
        this.name = name;
        this.invalidationTracker = invalidationTracker;
        this.executor = executor;
        Context applicationContext = context.getApplicationContext();
        this.appContext = applicationContext;
        this.callback = new MultiInstanceInvalidationClient$callback$1(this);
        this.stopped = new AtomicBoolean(false);
        ServiceConnection serviceConnection = new ServiceConnection() { // from class: androidx.room.MultiInstanceInvalidationClient$serviceConnection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName name2, IBinder service) {
                AbstractC3292y.i(name2, "name");
                AbstractC3292y.i(service, "service");
                MultiInstanceInvalidationClient.this.setService(IMultiInstanceInvalidationService.Stub.asInterface(service));
                MultiInstanceInvalidationClient.this.getExecutor().execute(MultiInstanceInvalidationClient.this.getSetUpRunnable());
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName name2) {
                AbstractC3292y.i(name2, "name");
                MultiInstanceInvalidationClient.this.getExecutor().execute(MultiInstanceInvalidationClient.this.getRemoveObserverRunnable());
                MultiInstanceInvalidationClient.this.setService(null);
            }
        };
        this.serviceConnection = serviceConnection;
        this.setUpRunnable = new Runnable() { // from class: androidx.room.d
            @Override // java.lang.Runnable
            public final void run() {
                MultiInstanceInvalidationClient.setUpRunnable$lambda$1(MultiInstanceInvalidationClient.this);
            }
        };
        this.removeObserverRunnable = new Runnable() { // from class: androidx.room.e
            @Override // java.lang.Runnable
            public final void run() {
                MultiInstanceInvalidationClient.removeObserverRunnable$lambda$2(MultiInstanceInvalidationClient.this);
            }
        };
        Object[] array = invalidationTracker.getTableIdLookup$room_runtime_release().keySet().toArray(new String[0]);
        AbstractC3292y.g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        setObserver(new InvalidationTracker.Observer((String[]) array) { // from class: androidx.room.MultiInstanceInvalidationClient.1
            @Override // androidx.room.InvalidationTracker.Observer
            public boolean isRemote$room_runtime_release() {
                return true;
            }

            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(Set<String> tables) {
                AbstractC3292y.i(tables, "tables");
                if (MultiInstanceInvalidationClient.this.getStopped().get()) {
                    return;
                }
                try {
                    IMultiInstanceInvalidationService service = MultiInstanceInvalidationClient.this.getService();
                    if (service != null) {
                        int clientId = MultiInstanceInvalidationClient.this.getClientId();
                        Object[] array2 = tables.toArray(new String[0]);
                        AbstractC3292y.g(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        service.broadcastInvalidation(clientId, (String[]) array2);
                    }
                } catch (RemoteException e8) {
                    Log.w(Room.LOG_TAG, "Cannot broadcast invalidation", e8);
                }
            }
        });
        applicationContext.bindService(serviceIntent, serviceConnection, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeObserverRunnable$lambda$2(MultiInstanceInvalidationClient this$0) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.invalidationTracker.removeObserver(this$0.getObserver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpRunnable$lambda$1(MultiInstanceInvalidationClient this$0) {
        AbstractC3292y.i(this$0, "this$0");
        try {
            IMultiInstanceInvalidationService iMultiInstanceInvalidationService = this$0.service;
            if (iMultiInstanceInvalidationService != null) {
                this$0.clientId = iMultiInstanceInvalidationService.registerCallback(this$0.callback, this$0.name);
                this$0.invalidationTracker.addObserver(this$0.getObserver());
            }
        } catch (RemoteException e8) {
            Log.w(Room.LOG_TAG, "Cannot register multi-instance invalidation callback", e8);
        }
    }

    public final IMultiInstanceInvalidationCallback getCallback() {
        return this.callback;
    }

    public final int getClientId() {
        return this.clientId;
    }

    public final Executor getExecutor() {
        return this.executor;
    }

    public final InvalidationTracker getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public final String getName() {
        return this.name;
    }

    public final InvalidationTracker.Observer getObserver() {
        InvalidationTracker.Observer observer = this.observer;
        if (observer != null) {
            return observer;
        }
        AbstractC3292y.y("observer");
        return null;
    }

    public final Runnable getRemoveObserverRunnable() {
        return this.removeObserverRunnable;
    }

    public final IMultiInstanceInvalidationService getService() {
        return this.service;
    }

    public final ServiceConnection getServiceConnection() {
        return this.serviceConnection;
    }

    public final Runnable getSetUpRunnable() {
        return this.setUpRunnable;
    }

    public final AtomicBoolean getStopped() {
        return this.stopped;
    }

    public final void setClientId(int i8) {
        this.clientId = i8;
    }

    public final void setObserver(InvalidationTracker.Observer observer) {
        AbstractC3292y.i(observer, "<set-?>");
        this.observer = observer;
    }

    public final void setService(IMultiInstanceInvalidationService iMultiInstanceInvalidationService) {
        this.service = iMultiInstanceInvalidationService;
    }

    public final void stop() {
        if (this.stopped.compareAndSet(false, true)) {
            this.invalidationTracker.removeObserver(getObserver());
            try {
                IMultiInstanceInvalidationService iMultiInstanceInvalidationService = this.service;
                if (iMultiInstanceInvalidationService != null) {
                    iMultiInstanceInvalidationService.unregisterCallback(this.callback, this.clientId);
                }
            } catch (RemoteException e8) {
                Log.w(Room.LOG_TAG, "Cannot unregister multi-instance invalidation callback", e8);
            }
            this.appContext.unbindService(this.serviceConnection);
        }
    }
}
