package q5;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: q5.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3776a {
    public final void a(Context context, String str) {
        AbstractC3292y.i(context, "context");
        if (str != null) {
            try {
                File file = new File(new C3794s().f(context), str);
                if (file.exists()) {
                    file.delete();
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public final boolean b(Context context, String str) {
        AbstractC3292y.i(context, "context");
        if (str != null) {
            try {
                File file = new File(new C3794s().g(context), str);
                if (file.exists()) {
                    return file.delete();
                }
                return false;
            } catch (Exception e8) {
                e8.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public final boolean c(long j8, long j9) {
        if (j8 < j9 * 2.25d) {
            return false;
        }
        return true;
    }

    public final long d(Context context, String str) {
        long j8;
        AbstractC3292y.i(context, "context");
        if (str == null) {
            return 0L;
        }
        try {
            File file = new File(new C3794s().f(context), str);
            if (file.exists()) {
                j8 = file.length();
            } else {
                j8 = 0;
            }
            if (j8 == 0) {
                File file2 = new File(new C3794s().g(context), str);
                if (file2.exists()) {
                    return file2.length();
                }
            }
            return j8;
        } catch (Exception e8) {
            e8.printStackTrace();
            return 0L;
        }
    }
}
