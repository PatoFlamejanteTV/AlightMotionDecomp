package androidx.work.impl;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.io.File;
import kotlin.jvm.internal.AbstractC3292y;

@RequiresApi(21)
/* loaded from: classes3.dex */
public final class Api21Impl {
    public static final Api21Impl INSTANCE = new Api21Impl();

    private Api21Impl() {
    }

    @DoNotInline
    public final File getNoBackupFilesDir(Context context) {
        AbstractC3292y.i(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        AbstractC3292y.h(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
