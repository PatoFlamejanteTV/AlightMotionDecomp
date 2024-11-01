package androidx.work;

import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.PeriodicWorkRequest;
import j$.time.Duration;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class PeriodicWorkRequestKt {
    public static final /* synthetic */ <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(long j8, TimeUnit repeatIntervalTimeUnit) {
        AbstractC3292y.i(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
        AbstractC3292y.n(4, ExifInterface.LONGITUDE_WEST);
        return new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) ListenableWorker.class, j8, repeatIntervalTimeUnit);
    }

    @RequiresApi(26)
    public static final /* synthetic */ <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(Duration repeatInterval) {
        AbstractC3292y.i(repeatInterval, "repeatInterval");
        AbstractC3292y.n(4, ExifInterface.LONGITUDE_WEST);
        return new PeriodicWorkRequest.Builder(ListenableWorker.class, repeatInterval);
    }

    public static final /* synthetic */ <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(long j8, TimeUnit repeatIntervalTimeUnit, long j9, TimeUnit flexTimeIntervalUnit) {
        AbstractC3292y.i(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
        AbstractC3292y.i(flexTimeIntervalUnit, "flexTimeIntervalUnit");
        AbstractC3292y.n(4, ExifInterface.LONGITUDE_WEST);
        return new PeriodicWorkRequest.Builder(ListenableWorker.class, j8, repeatIntervalTimeUnit, j9, flexTimeIntervalUnit);
    }

    @RequiresApi(26)
    public static final /* synthetic */ <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(Duration repeatInterval, Duration flexTimeInterval) {
        AbstractC3292y.i(repeatInterval, "repeatInterval");
        AbstractC3292y.i(flexTimeInterval, "flexTimeInterval");
        AbstractC3292y.n(4, ExifInterface.LONGITUDE_WEST);
        return new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) ListenableWorker.class, repeatInterval, flexTimeInterval);
    }
}
