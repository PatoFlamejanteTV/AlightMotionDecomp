package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.PendingIntentCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class PendingIntentCompat {

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(23)
    /* loaded from: classes.dex */
    public static class Api23Impl {
        private Api23Impl() {
        }

        @DoNotInline
        public static void send(@NonNull PendingIntent pendingIntent, @NonNull Context context, int i8, @NonNull Intent intent, @Nullable PendingIntent.OnFinished onFinished, @Nullable Handler handler, @Nullable String str, @Nullable Bundle bundle) throws PendingIntent.CanceledException {
            pendingIntent.send(context, i8, intent, onFinished, handler, str, bundle);
        }
    }

    @RequiresApi(26)
    /* loaded from: classes.dex */
    private static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        public static PendingIntent getForegroundService(Context context, int i8, Intent intent, int i9) {
            return PendingIntent.getForegroundService(context, i8, intent, i9);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface Flags {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class GatedCallback implements Closeable {

        @Nullable
        private PendingIntent.OnFinished mCallback;
        private final CountDownLatch mComplete = new CountDownLatch(1);
        private boolean mSuccess = false;

        GatedCallback(@Nullable PendingIntent.OnFinished onFinished) {
            this.mCallback = onFinished;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onSendFinished(PendingIntent pendingIntent, Intent intent, int i8, String str, Bundle bundle) {
            boolean z8 = false;
            while (true) {
                try {
                    this.mComplete.await();
                    break;
                } catch (InterruptedException unused) {
                    z8 = true;
                } catch (Throwable th) {
                    if (z8) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z8) {
                Thread.currentThread().interrupt();
            }
            PendingIntent.OnFinished onFinished = this.mCallback;
            if (onFinished != null) {
                onFinished.onSendFinished(pendingIntent, intent, i8, str, bundle);
                this.mCallback = null;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.mSuccess) {
                this.mCallback = null;
            }
            this.mComplete.countDown();
        }

        public void complete() {
            this.mSuccess = true;
        }

        @Nullable
        public PendingIntent.OnFinished getCallback() {
            if (this.mCallback == null) {
                return null;
            }
            return new PendingIntent.OnFinished() { // from class: androidx.core.app.s
                @Override // android.app.PendingIntent.OnFinished
                public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i8, String str, Bundle bundle) {
                    PendingIntentCompat.GatedCallback.this.onSendFinished(pendingIntent, intent, i8, str, bundle);
                }
            };
        }
    }

    private PendingIntentCompat() {
    }

    private static int addMutabilityFlags(boolean z8, int i8) {
        int i9;
        if (z8) {
            if (Build.VERSION.SDK_INT >= 31) {
                i9 = 33554432;
            } else {
                return i8;
            }
        } else if (Build.VERSION.SDK_INT >= 23) {
            i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        } else {
            return i8;
        }
        return i8 | i9;
    }

    @NonNull
    public static PendingIntent getActivities(@NonNull Context context, int i8, @NonNull @SuppressLint({"ArrayReturn"}) Intent[] intentArr, int i9, @Nullable Bundle bundle, boolean z8) {
        return PendingIntent.getActivities(context, i8, intentArr, addMutabilityFlags(z8, i9), bundle);
    }

    @Nullable
    public static PendingIntent getActivity(@NonNull Context context, int i8, @NonNull Intent intent, int i9, boolean z8) {
        return PendingIntent.getActivity(context, i8, intent, addMutabilityFlags(z8, i9));
    }

    @Nullable
    public static PendingIntent getBroadcast(@NonNull Context context, int i8, @NonNull Intent intent, int i9, boolean z8) {
        return PendingIntent.getBroadcast(context, i8, intent, addMutabilityFlags(z8, i9));
    }

    @NonNull
    @RequiresApi(26)
    public static PendingIntent getForegroundService(@NonNull Context context, int i8, @NonNull Intent intent, int i9, boolean z8) {
        return Api26Impl.getForegroundService(context, i8, intent, addMutabilityFlags(z8, i9));
    }

    @Nullable
    public static PendingIntent getService(@NonNull Context context, int i8, @NonNull Intent intent, int i9, boolean z8) {
        return PendingIntent.getService(context, i8, intent, addMutabilityFlags(z8, i9));
    }

    @SuppressLint({"LambdaLast"})
    public static void send(@NonNull PendingIntent pendingIntent, int i8, @Nullable PendingIntent.OnFinished onFinished, @Nullable Handler handler) throws PendingIntent.CanceledException {
        GatedCallback gatedCallback = new GatedCallback(onFinished);
        try {
            pendingIntent.send(i8, gatedCallback.getCallback(), handler);
            gatedCallback.complete();
            gatedCallback.close();
        } catch (Throwable th) {
            try {
                gatedCallback.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @NonNull
    public static PendingIntent getActivities(@NonNull Context context, int i8, @NonNull @SuppressLint({"ArrayReturn"}) Intent[] intentArr, int i9, boolean z8) {
        return PendingIntent.getActivities(context, i8, intentArr, addMutabilityFlags(z8, i9));
    }

    @Nullable
    public static PendingIntent getActivity(@NonNull Context context, int i8, @NonNull Intent intent, int i9, @Nullable Bundle bundle, boolean z8) {
        return PendingIntent.getActivity(context, i8, intent, addMutabilityFlags(z8, i9), bundle);
    }

    @SuppressLint({"LambdaLast"})
    public static void send(@NonNull PendingIntent pendingIntent, @NonNull @SuppressLint({"ContextFirst"}) Context context, int i8, @NonNull Intent intent, @Nullable PendingIntent.OnFinished onFinished, @Nullable Handler handler) throws PendingIntent.CanceledException {
        send(pendingIntent, context, i8, intent, onFinished, handler, null, null);
    }

    @SuppressLint({"LambdaLast"})
    public static void send(@NonNull PendingIntent pendingIntent, @NonNull @SuppressLint({"ContextFirst"}) Context context, int i8, @NonNull Intent intent, @Nullable PendingIntent.OnFinished onFinished, @Nullable Handler handler, @Nullable String str, @Nullable Bundle bundle) throws PendingIntent.CanceledException {
        GatedCallback gatedCallback = new GatedCallback(onFinished);
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                Api23Impl.send(pendingIntent, context, i8, intent, onFinished, handler, str, bundle);
            } else {
                pendingIntent.send(context, i8, intent, gatedCallback.getCallback(), handler, str);
            }
            gatedCallback.complete();
            gatedCallback.close();
        } catch (Throwable th) {
            try {
                gatedCallback.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
