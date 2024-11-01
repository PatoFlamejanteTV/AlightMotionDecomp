package androidx.work.impl.background.systemjob;

import android.annotation.SuppressLint;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.BackoffPolicy;
import androidx.work.Clock;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.model.WorkSpec;
import java.util.Iterator;

@RequiresApi(api = 23)
@SuppressLint({"ClassVerificationFailure"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
class SystemJobInfoConverter {
    static final String EXTRA_IS_PERIODIC = "EXTRA_IS_PERIODIC";
    static final String EXTRA_WORK_SPEC_GENERATION = "EXTRA_WORK_SPEC_GENERATION";
    static final String EXTRA_WORK_SPEC_ID = "EXTRA_WORK_SPEC_ID";
    private static final String TAG = Logger.tagWithPrefix("SystemJobInfoConverter");
    private final Clock mClock;
    private final ComponentName mWorkServiceComponent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.background.systemjob.SystemJobInfoConverter$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$work$NetworkType;

        static {
            int[] iArr = new int[NetworkType.values().length];
            $SwitchMap$androidx$work$NetworkType = iArr;
            try {
                iArr[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$work$NetworkType[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$work$NetworkType[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$work$NetworkType[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$work$NetworkType[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SystemJobInfoConverter(@NonNull Context context, Clock clock) {
        this.mClock = clock;
        this.mWorkServiceComponent = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    @RequiresApi(24)
    private static JobInfo.TriggerContentUri convertContentUriTrigger(Constraints.ContentUriTrigger contentUriTrigger) {
        boolean isTriggeredForDescendants = contentUriTrigger.isTriggeredForDescendants();
        j.a();
        return i.a(contentUriTrigger.getUri(), isTriggeredForDescendants ? 1 : 0);
    }

    static int convertNetworkType(NetworkType networkType) {
        int i8 = AnonymousClass1.$SwitchMap$androidx$work$NetworkType[networkType.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                return 1;
            }
            if (i8 == 3) {
                return 2;
            }
            if (i8 != 4) {
                if (i8 == 5 && Build.VERSION.SDK_INT >= 26) {
                    return 4;
                }
            } else if (Build.VERSION.SDK_INT >= 24) {
                return 3;
            }
            Logger.get().debug(TAG, "API version too low. Cannot convert network type value " + networkType);
            return 1;
        }
        return 0;
    }

    static void setRequiredNetwork(@NonNull JobInfo.Builder builder, @NonNull NetworkType networkType) {
        if (Build.VERSION.SDK_INT >= 30 && networkType == NetworkType.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            builder.setRequiredNetworkType(convertNetworkType(networkType));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JobInfo convert(WorkSpec workSpec, int i8) {
        boolean z8;
        int i9;
        Constraints constraints = workSpec.constraints;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(EXTRA_WORK_SPEC_ID, workSpec.id);
        persistableBundle.putInt(EXTRA_WORK_SPEC_GENERATION, workSpec.getGeneration());
        persistableBundle.putBoolean(EXTRA_IS_PERIODIC, workSpec.isPeriodic());
        JobInfo.Builder extras = new JobInfo.Builder(i8, this.mWorkServiceComponent).setRequiresCharging(constraints.requiresCharging()).setRequiresDeviceIdle(constraints.requiresDeviceIdle()).setExtras(persistableBundle);
        setRequiredNetwork(extras, constraints.getRequiredNetworkType());
        boolean z9 = false;
        if (!constraints.requiresDeviceIdle()) {
            if (workSpec.backoffPolicy == BackoffPolicy.LINEAR) {
                i9 = 0;
            } else {
                i9 = 1;
            }
            extras.setBackoffCriteria(workSpec.backoffDelayDuration, i9);
        }
        long max = Math.max(workSpec.calculateNextRunTime() - this.mClock.currentTimeMillis(), 0L);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!workSpec.expedited) {
            extras.setImportantWhileForeground(true);
        }
        if (i10 >= 24 && constraints.hasContentUriTriggers()) {
            Iterator<Constraints.ContentUriTrigger> it = constraints.getContentUriTriggers().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(convertContentUriTrigger(it.next()));
            }
            extras.setTriggerContentUpdateDelay(constraints.getContentTriggerUpdateDelayMillis());
            extras.setTriggerContentMaxDelay(constraints.getContentTriggerMaxDelayMillis());
        }
        extras.setPersisted(false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            extras.setRequiresBatteryNotLow(constraints.requiresBatteryNotLow());
            extras.setRequiresStorageNotLow(constraints.requiresStorageNotLow());
        }
        if (workSpec.runAttemptCount > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (max > 0) {
            z9 = true;
        }
        if (i11 >= 31 && workSpec.expedited && !z8 && !z9) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
