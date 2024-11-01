package androidx.work;

import R5.AbstractC1435t;
import R5.a0;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Ignore;
import androidx.work.impl.utils.DurationApi26Impl;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import j$.time.Duration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class Constraints {
    public static final Companion Companion = new Companion(null);
    public static final Constraints NONE = new Constraints(null, false, false, false, 15, null);

    @ColumnInfo(name = "trigger_max_content_delay")
    private final long contentTriggerMaxDelayMillis;

    @ColumnInfo(name = "trigger_content_update_delay")
    private final long contentTriggerUpdateDelayMillis;

    @ColumnInfo(name = "content_uri_triggers")
    private final Set<ContentUriTrigger> contentUriTriggers;

    @ColumnInfo(name = "required_network_type")
    private final NetworkType requiredNetworkType;

    @ColumnInfo(name = "requires_battery_not_low")
    private final boolean requiresBatteryNotLow;

    @ColumnInfo(name = "requires_charging")
    private final boolean requiresCharging;

    @ColumnInfo(name = "requires_device_idle")
    private final boolean requiresDeviceIdle;

    @ColumnInfo(name = "requires_storage_not_low")
    private final boolean requiresStorageNotLow;

    /* loaded from: classes3.dex */
    public static final class Builder {
        private Set<ContentUriTrigger> contentUriTriggers;
        private NetworkType requiredNetworkType;
        private boolean requiresBatteryNotLow;
        private boolean requiresCharging;
        private boolean requiresDeviceIdle;
        private boolean requiresStorageNotLow;
        private long triggerContentMaxDelay;
        private long triggerContentUpdateDelay;

        public Builder() {
            this.requiredNetworkType = NetworkType.NOT_REQUIRED;
            this.triggerContentUpdateDelay = -1L;
            this.triggerContentMaxDelay = -1L;
            this.contentUriTriggers = new LinkedHashSet();
        }

        @RequiresApi(24)
        public final Builder addContentUriTrigger(Uri uri, boolean z8) {
            AbstractC3292y.i(uri, "uri");
            this.contentUriTriggers.add(new ContentUriTrigger(uri, z8));
            return this;
        }

        public final Constraints build() {
            Set f8;
            long j8;
            long j9;
            boolean z8;
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 24) {
                f8 = AbstractC1435t.b1(this.contentUriTriggers);
                j8 = this.triggerContentUpdateDelay;
                j9 = this.triggerContentMaxDelay;
            } else {
                f8 = a0.f();
                j8 = -1;
                j9 = -1;
            }
            boolean z9 = this.requiresCharging;
            if (i8 >= 23 && this.requiresDeviceIdle) {
                z8 = true;
            } else {
                z8 = false;
            }
            return new Constraints(this.requiredNetworkType, z9, z8, this.requiresBatteryNotLow, this.requiresStorageNotLow, j8, j9, f8);
        }

        public final Builder setRequiredNetworkType(NetworkType networkType) {
            AbstractC3292y.i(networkType, "networkType");
            this.requiredNetworkType = networkType;
            return this;
        }

        public final Builder setRequiresBatteryNotLow(boolean z8) {
            this.requiresBatteryNotLow = z8;
            return this;
        }

        public final Builder setRequiresCharging(boolean z8) {
            this.requiresCharging = z8;
            return this;
        }

        @RequiresApi(23)
        public final Builder setRequiresDeviceIdle(boolean z8) {
            this.requiresDeviceIdle = z8;
            return this;
        }

        public final Builder setRequiresStorageNotLow(boolean z8) {
            this.requiresStorageNotLow = z8;
            return this;
        }

        @RequiresApi(24)
        public final Builder setTriggerContentMaxDelay(long j8, TimeUnit timeUnit) {
            AbstractC3292y.i(timeUnit, "timeUnit");
            this.triggerContentMaxDelay = timeUnit.toMillis(j8);
            return this;
        }

        @RequiresApi(24)
        public final Builder setTriggerContentUpdateDelay(long j8, TimeUnit timeUnit) {
            AbstractC3292y.i(timeUnit, "timeUnit");
            this.triggerContentUpdateDelay = timeUnit.toMillis(j8);
            return this;
        }

        @RequiresApi(26)
        public final Builder setTriggerContentMaxDelay(Duration duration) {
            AbstractC3292y.i(duration, "duration");
            this.triggerContentMaxDelay = DurationApi26Impl.toMillisCompat(duration);
            return this;
        }

        @RequiresApi(26)
        public final Builder setTriggerContentUpdateDelay(Duration duration) {
            AbstractC3292y.i(duration, "duration");
            this.triggerContentUpdateDelay = DurationApi26Impl.toMillisCompat(duration);
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder(Constraints constraints) {
            AbstractC3292y.i(constraints, "constraints");
            this.requiredNetworkType = NetworkType.NOT_REQUIRED;
            this.triggerContentUpdateDelay = -1L;
            this.triggerContentMaxDelay = -1L;
            this.contentUriTriggers = new LinkedHashSet();
            this.requiresCharging = constraints.requiresCharging();
            int i8 = Build.VERSION.SDK_INT;
            this.requiresDeviceIdle = i8 >= 23 && constraints.requiresDeviceIdle();
            this.requiredNetworkType = constraints.getRequiredNetworkType();
            this.requiresBatteryNotLow = constraints.requiresBatteryNotLow();
            this.requiresStorageNotLow = constraints.requiresStorageNotLow();
            if (i8 >= 24) {
                this.triggerContentUpdateDelay = constraints.getContentTriggerUpdateDelayMillis();
                this.triggerContentMaxDelay = constraints.getContentTriggerMaxDelayMillis();
                this.contentUriTriggers = AbstractC1435t.a1(constraints.getContentUriTriggers());
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static final class ContentUriTrigger {
        private final boolean isTriggeredForDescendants;
        private final Uri uri;

        public ContentUriTrigger(Uri uri, boolean z8) {
            AbstractC3292y.i(uri, "uri");
            this.uri = uri;
            this.isTriggeredForDescendants = z8;
        }

        public boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!AbstractC3292y.d(ContentUriTrigger.class, cls)) {
                return false;
            }
            AbstractC3292y.g(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            ContentUriTrigger contentUriTrigger = (ContentUriTrigger) obj;
            if (AbstractC3292y.d(this.uri, contentUriTrigger.uri) && this.isTriggeredForDescendants == contentUriTrigger.isTriggeredForDescendants) {
                return true;
            }
            return false;
        }

        public final Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            return (this.uri.hashCode() * 31) + androidx.compose.foundation.a.a(this.isTriggeredForDescendants);
        }

        public final boolean isTriggeredForDescendants() {
            return this.isTriggeredForDescendants;
        }
    }

    public /* synthetic */ Constraints(NetworkType networkType, boolean z8, boolean z9, boolean z10, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? NetworkType.NOT_REQUIRED : networkType, (i8 & 2) != 0 ? false : z8, (i8 & 4) != 0 ? false : z9, (i8 & 8) != 0 ? false : z10);
    }

    @SuppressLint({"NewApi"})
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC3292y.d(Constraints.class, obj.getClass())) {
            return false;
        }
        Constraints constraints = (Constraints) obj;
        if (this.requiresCharging != constraints.requiresCharging || this.requiresDeviceIdle != constraints.requiresDeviceIdle || this.requiresBatteryNotLow != constraints.requiresBatteryNotLow || this.requiresStorageNotLow != constraints.requiresStorageNotLow || this.contentTriggerUpdateDelayMillis != constraints.contentTriggerUpdateDelayMillis || this.contentTriggerMaxDelayMillis != constraints.contentTriggerMaxDelayMillis || this.requiredNetworkType != constraints.requiredNetworkType) {
            return false;
        }
        return AbstractC3292y.d(this.contentUriTriggers, constraints.contentUriTriggers);
    }

    @RequiresApi(24)
    public final long getContentTriggerMaxDelayMillis() {
        return this.contentTriggerMaxDelayMillis;
    }

    @RequiresApi(24)
    public final long getContentTriggerUpdateDelayMillis() {
        return this.contentTriggerUpdateDelayMillis;
    }

    @RequiresApi(24)
    public final Set<ContentUriTrigger> getContentUriTriggers() {
        return this.contentUriTriggers;
    }

    public final NetworkType getRequiredNetworkType() {
        return this.requiredNetworkType;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean hasContentUriTriggers() {
        if (Build.VERSION.SDK_INT < 24 || (!this.contentUriTriggers.isEmpty())) {
            return true;
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    public int hashCode() {
        int hashCode = ((((((((this.requiredNetworkType.hashCode() * 31) + (this.requiresCharging ? 1 : 0)) * 31) + (this.requiresDeviceIdle ? 1 : 0)) * 31) + (this.requiresBatteryNotLow ? 1 : 0)) * 31) + (this.requiresStorageNotLow ? 1 : 0)) * 31;
        long j8 = this.contentTriggerUpdateDelayMillis;
        int i8 = (hashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.contentTriggerMaxDelayMillis;
        return ((i8 + ((int) (j9 ^ (j9 >>> 32)))) * 31) + this.contentUriTriggers.hashCode();
    }

    public final boolean requiresBatteryNotLow() {
        return this.requiresBatteryNotLow;
    }

    public final boolean requiresCharging() {
        return this.requiresCharging;
    }

    @RequiresApi(23)
    public final boolean requiresDeviceIdle() {
        return this.requiresDeviceIdle;
    }

    public final boolean requiresStorageNotLow() {
        return this.requiresStorageNotLow;
    }

    @SuppressLint({"NewApi"})
    public String toString() {
        return "Constraints{requiredNetworkType=" + this.requiredNetworkType + ", requiresCharging=" + this.requiresCharging + ", requiresDeviceIdle=" + this.requiresDeviceIdle + ", requiresBatteryNotLow=" + this.requiresBatteryNotLow + ", requiresStorageNotLow=" + this.requiresStorageNotLow + ", contentTriggerUpdateDelayMillis=" + this.contentTriggerUpdateDelayMillis + ", contentTriggerMaxDelayMillis=" + this.contentTriggerMaxDelayMillis + ", contentUriTriggers=" + this.contentUriTriggers + ", }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"NewApi"})
    @Ignore
    public Constraints(NetworkType requiredNetworkType, boolean z8, boolean z9, boolean z10) {
        this(requiredNetworkType, z8, false, z9, z10);
        AbstractC3292y.i(requiredNetworkType, "requiredNetworkType");
    }

    public /* synthetic */ Constraints(NetworkType networkType, boolean z8, boolean z9, boolean z10, boolean z11, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? NetworkType.NOT_REQUIRED : networkType, (i8 & 2) != 0 ? false : z8, (i8 & 4) != 0 ? false : z9, (i8 & 8) != 0 ? false : z10, (i8 & 16) == 0 ? z11 : false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RequiresApi(23)
    @SuppressLint({"NewApi"})
    @Ignore
    public Constraints(NetworkType requiredNetworkType, boolean z8, boolean z9, boolean z10, boolean z11) {
        this(requiredNetworkType, z8, z9, z10, z11, -1L, 0L, null, PsExtractor.AUDIO_STREAM, null);
        AbstractC3292y.i(requiredNetworkType, "requiredNetworkType");
    }

    public /* synthetic */ Constraints(NetworkType networkType, boolean z8, boolean z9, boolean z10, boolean z11, long j8, long j9, Set set, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? NetworkType.NOT_REQUIRED : networkType, (i8 & 2) != 0 ? false : z8, (i8 & 4) != 0 ? false : z9, (i8 & 8) != 0 ? false : z10, (i8 & 16) == 0 ? z11 : false, (i8 & 32) != 0 ? -1L : j8, (i8 & 64) == 0 ? j9 : -1L, (i8 & 128) != 0 ? a0.f() : set);
    }

    @RequiresApi(24)
    public Constraints(NetworkType requiredNetworkType, boolean z8, boolean z9, boolean z10, boolean z11, long j8, long j9, Set<ContentUriTrigger> contentUriTriggers) {
        AbstractC3292y.i(requiredNetworkType, "requiredNetworkType");
        AbstractC3292y.i(contentUriTriggers, "contentUriTriggers");
        this.requiredNetworkType = requiredNetworkType;
        this.requiresCharging = z8;
        this.requiresDeviceIdle = z9;
        this.requiresBatteryNotLow = z10;
        this.requiresStorageNotLow = z11;
        this.contentTriggerUpdateDelayMillis = j8;
        this.contentTriggerMaxDelayMillis = j9;
        this.contentUriTriggers = contentUriTriggers;
    }

    @SuppressLint({"NewApi"})
    public Constraints(Constraints other) {
        AbstractC3292y.i(other, "other");
        this.requiresCharging = other.requiresCharging;
        this.requiresDeviceIdle = other.requiresDeviceIdle;
        this.requiredNetworkType = other.requiredNetworkType;
        this.requiresBatteryNotLow = other.requiresBatteryNotLow;
        this.requiresStorageNotLow = other.requiresStorageNotLow;
        this.contentUriTriggers = other.contentUriTriggers;
        this.contentTriggerUpdateDelayMillis = other.contentTriggerUpdateDelayMillis;
        this.contentTriggerMaxDelayMillis = other.contentTriggerMaxDelayMillis;
    }
}
