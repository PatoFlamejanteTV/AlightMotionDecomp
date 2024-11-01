package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class BuildCompat {

    @ChecksSdkIntAtLeast(extension = 1000000)
    public static final int AD_SERVICES_EXTENSION_INT;
    public static final BuildCompat INSTANCE = new BuildCompat();

    @ChecksSdkIntAtLeast(extension = 30)
    public static final int R_EXTENSION_INT;

    @ChecksSdkIntAtLeast(extension = 31)
    public static final int S_EXTENSION_INT;

    @ChecksSdkIntAtLeast(extension = 33)
    public static final int T_EXTENSION_INT;

    @RequiresApi(30)
    /* loaded from: classes3.dex */
    private static final class Api30Impl {
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        @DoNotInline
        public final int getExtensionVersion(int i8) {
            return SdkExtensions.getExtensionVersion(i8);
        }
    }

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface PrereleaseSdkCheck {
    }

    static {
        int i8;
        int i9;
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 0;
        if (i11 >= 30) {
            i8 = Api30Impl.INSTANCE.getExtensionVersion(30);
        } else {
            i8 = 0;
        }
        R_EXTENSION_INT = i8;
        if (i11 >= 30) {
            i9 = Api30Impl.INSTANCE.getExtensionVersion(31);
        } else {
            i9 = 0;
        }
        S_EXTENSION_INT = i9;
        if (i11 >= 30) {
            i10 = Api30Impl.INSTANCE.getExtensionVersion(33);
        } else {
            i10 = 0;
        }
        T_EXTENSION_INT = i10;
        if (i11 >= 30) {
            i12 = Api30Impl.INSTANCE.getExtensionVersion(1000000);
        }
        AD_SERVICES_EXTENSION_INT = i12;
    }

    private BuildCompat() {
    }

    @ChecksSdkIntAtLeast(api = 24)
    public static final boolean isAtLeastN() {
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 25)
    public static final boolean isAtLeastNMR1() {
        if (Build.VERSION.SDK_INT >= 25) {
            return true;
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 26)
    public static final boolean isAtLeastO() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 27)
    public static final boolean isAtLeastOMR1() {
        if (Build.VERSION.SDK_INT >= 27) {
            return true;
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 28)
    public static final boolean isAtLeastP() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public static final boolean isAtLeastPreReleaseCodename(String codename, String buildCodename) {
        AbstractC3292y.i(codename, "codename");
        AbstractC3292y.i(buildCodename, "buildCodename");
        if (AbstractC3292y.d("REL", buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        AbstractC3292y.h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        AbstractC3292y.h(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (upperCase.compareTo(upperCase2) < 0) {
            return false;
        }
        return true;
    }

    @ChecksSdkIntAtLeast(api = 29)
    public static final boolean isAtLeastQ() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 30)
    public static final boolean isAtLeastR() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 31, codename = ExifInterface.LATITUDE_SOUTH)
    public static final boolean isAtLeastS() {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 31) {
            if (i8 >= 30) {
                String CODENAME = Build.VERSION.CODENAME;
                AbstractC3292y.h(CODENAME, "CODENAME");
                if (isAtLeastPreReleaseCodename(ExifInterface.LATITUDE_SOUTH, CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    @ChecksSdkIntAtLeast(api = 32, codename = "Sv2")
    public static final boolean isAtLeastSv2() {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 32) {
            if (i8 >= 31) {
                String CODENAME = Build.VERSION.CODENAME;
                AbstractC3292y.h(CODENAME, "CODENAME");
                if (isAtLeastPreReleaseCodename("Sv2", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    @ChecksSdkIntAtLeast(api = 33, codename = "Tiramisu")
    public static final boolean isAtLeastT() {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 33) {
            if (i8 >= 32) {
                String CODENAME = Build.VERSION.CODENAME;
                AbstractC3292y.h(CODENAME, "CODENAME");
                if (isAtLeastPreReleaseCodename("Tiramisu", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    @ChecksSdkIntAtLeast(api = 34, codename = "UpsideDownCake")
    public static final boolean isAtLeastU() {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 34) {
            if (i8 >= 33) {
                String CODENAME = Build.VERSION.CODENAME;
                AbstractC3292y.h(CODENAME, "CODENAME");
                if (isAtLeastPreReleaseCodename("UpsideDownCake", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    @ChecksSdkIntAtLeast(codename = "VanillaIceCream")
    @PrereleaseSdkCheck
    public static final boolean isAtLeastV() {
        if (Build.VERSION.SDK_INT >= 34) {
            String CODENAME = Build.VERSION.CODENAME;
            AbstractC3292y.h(CODENAME, "CODENAME");
            if (isAtLeastPreReleaseCodename("VanillaIceCream", CODENAME)) {
                return true;
            }
        }
        return false;
    }
}
