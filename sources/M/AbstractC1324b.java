package M;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import e0.AbstractC2781e;
import j$.util.Objects;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q0.AbstractC3628n;
import q0.InterfaceC3620f;

/* renamed from: M.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1324b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static SoftReference f5448a;

    /* renamed from: b, reason: collision with root package name */
    private static SoftReference f5449b;

    private final int e(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    protected Executor a() {
        ExecutorService executorService;
        synchronized (AbstractC1324b.class) {
            try {
                SoftReference softReference = f5448a;
                if (softReference != null) {
                    executorService = (ExecutorService) softReference.get();
                } else {
                    executorService = null;
                }
                if (executorService == null) {
                    AbstractC2781e.a();
                    executorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new W.a("firebase-iid-executor")));
                    f5448a = new SoftReference(executorService);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    protected abstract int b(Context context, C1323a c1323a);

    protected abstract void c(Context context, Bundle bundle);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void d(Intent intent, final Context context, boolean z8, BroadcastReceiver.PendingResult pendingResult) {
        Intent intent2;
        int i8;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Executor executor = null;
            if (parcelableExtra instanceof Intent) {
                intent2 = (Intent) parcelableExtra;
            } else {
                intent2 = null;
            }
            if (intent2 != null) {
                i8 = e(context, intent2);
            } else if (intent.getExtras() == null) {
                i8 = 500;
            } else {
                final C1323a c1323a = new C1323a(intent);
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                synchronized (AbstractC1324b.class) {
                    try {
                        SoftReference softReference = f5449b;
                        if (softReference != null) {
                            executor = (Executor) softReference.get();
                        }
                        if (executor == null) {
                            AbstractC2781e.a();
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new W.a("pscm-ack-executor"));
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                            executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                            f5449b = new SoftReference(executor);
                        }
                    } finally {
                    }
                }
                executor.execute(new Runnable() { // from class: M.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        Task c8;
                        C1323a c1323a2 = c1323a;
                        if (TextUtils.isEmpty(c1323a2.u())) {
                            c8 = AbstractC3628n.e(null);
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putString("google.message_id", c1323a2.u());
                            Integer v8 = c1323a2.v();
                            if (v8 != null) {
                                bundle.putInt("google.product_id", v8.intValue());
                            }
                            Context context2 = context;
                            bundle.putBoolean("supports_message_handled", true);
                            c8 = D.b(context2).c(2, bundle);
                        }
                        final CountDownLatch countDownLatch2 = countDownLatch;
                        c8.b(new Executor() { // from class: M.m
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new InterfaceC3620f() { // from class: M.n
                            @Override // q0.InterfaceC3620f
                            public final void a(Task task) {
                                countDownLatch2.countDown();
                            }
                        });
                    }
                });
                int b9 = b(context, c1323a);
                try {
                    if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                        Log.w("CloudMessagingReceiver", "Message ack timed out");
                    }
                } catch (InterruptedException e8) {
                    Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e8.toString()));
                }
                i8 = b9;
            }
            if (z8 && pendingResult != null) {
                pendingResult.setResultCode(i8);
            }
            if (pendingResult != null) {
                pendingResult.finish();
            }
        } catch (Throwable th) {
            if (pendingResult != null) {
                pendingResult.finish();
            }
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        a().execute(new Runnable() { // from class: M.p
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1324b.this.d(intent, context, isOrderedBroadcast, goAsync);
            }
        });
    }
}
