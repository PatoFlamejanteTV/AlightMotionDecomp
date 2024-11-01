package androidx.privacysandbox.ads.adservices.internal;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes3.dex */
public final class AdServicesInfo {
    public static final AdServicesInfo INSTANCE = new AdServicesInfo();

    @RequiresApi(30)
    /* loaded from: classes3.dex */
    private static final class Extensions30Impl {
        public static final Extensions30Impl INSTANCE = new Extensions30Impl();

        private Extensions30Impl() {
        }

        @DoNotInline
        public final int getAdServicesVersion() {
            int extensionVersion;
            extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            return extensionVersion;
        }
    }

    private AdServicesInfo() {
    }

    public final int version() {
        if (Build.VERSION.SDK_INT >= 30) {
            return Extensions30Impl.INSTANCE.getAdServicesVersion();
        }
        return 0;
    }
}
