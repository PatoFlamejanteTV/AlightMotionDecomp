package S4;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Y;

/* loaded from: classes5.dex */
public final class g {
    public final boolean a(File f8) {
        File[] listFiles;
        AbstractC3292y.i(f8, "f");
        if (f8.isDirectory() && (listFiles = f8.listFiles()) != null) {
            for (File childFile : listFiles) {
                AbstractC3292y.h(childFile, "childFile");
                a(childFile);
            }
        }
        return f8.delete();
    }

    public final String b(long j8) {
        if (j8 < 1000) {
            return String.valueOf(j8);
        }
        if (j8 < 1000000) {
            StringBuilder sb = new StringBuilder();
            Y y8 = Y.f34578a;
            String format = String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(j8 / 1000)}, 1));
            AbstractC3292y.h(format, "format(locale, format, *args)");
            sb.append(format);
            sb.append('K');
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        Y y9 = Y.f34578a;
        String format2 = String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(j8 / 1000000)}, 1));
        AbstractC3292y.h(format2, "format(locale, format, *args)");
        sb2.append(format2);
        sb2.append('M');
        return sb2.toString();
    }

    public final String c(long j8) {
        double d8 = j8 / 1024.0d;
        if (d8 < 1024.0d) {
            StringBuilder sb = new StringBuilder();
            Y y8 = Y.f34578a;
            String format = String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d8)}, 1));
            AbstractC3292y.h(format, "format(locale, format, *args)");
            sb.append(format);
            sb.append(" KB");
            return sb.toString();
        }
        double d9 = 1024;
        double d10 = d8 / d9;
        if (d10 < 1024.0d) {
            StringBuilder sb2 = new StringBuilder();
            Y y9 = Y.f34578a;
            String format2 = String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d10)}, 1));
            AbstractC3292y.h(format2, "format(locale, format, *args)");
            sb2.append(format2);
            sb2.append(" MB");
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        Y y10 = Y.f34578a;
        String format3 = String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d10 / d9)}, 1));
        AbstractC3292y.h(format3, "format(locale, format, *args)");
        sb3.append(format3);
        sb3.append(" GB");
        return sb3.toString();
    }
}
