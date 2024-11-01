package androidx.sqlite.db.framework;

import android.content.Context;
import android.os.Build;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class FrameworkSQLiteOpenHelper$lazyDelegate$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ FrameworkSQLiteOpenHelper this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteOpenHelper$lazyDelegate$1(FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper) {
        super(0);
        this.this$0 = frameworkSQLiteOpenHelper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FrameworkSQLiteOpenHelper.OpenHelper invoke() {
        FrameworkSQLiteOpenHelper.OpenHelper openHelper;
        Context context;
        String str;
        SupportSQLiteOpenHelper.Callback callback;
        boolean z8;
        boolean z9;
        String str2;
        boolean z10;
        Context context2;
        String str3;
        Context context3;
        SupportSQLiteOpenHelper.Callback callback2;
        boolean z11;
        if (Build.VERSION.SDK_INT >= 23) {
            str2 = this.this$0.name;
            if (str2 != null) {
                z10 = this.this$0.useNoBackupDirectory;
                if (z10) {
                    context2 = this.this$0.context;
                    File noBackupFilesDir = SupportSQLiteCompat.Api21Impl.getNoBackupFilesDir(context2);
                    str3 = this.this$0.name;
                    File file = new File(noBackupFilesDir, str3);
                    context3 = this.this$0.context;
                    String absolutePath = file.getAbsolutePath();
                    FrameworkSQLiteOpenHelper.DBRefHolder dBRefHolder = new FrameworkSQLiteOpenHelper.DBRefHolder(null);
                    callback2 = this.this$0.callback;
                    z11 = this.this$0.allowDataLossOnRecovery;
                    openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(context3, absolutePath, dBRefHolder, callback2, z11);
                    z9 = this.this$0.writeAheadLoggingEnabled;
                    SupportSQLiteCompat.Api16Impl.setWriteAheadLoggingEnabled(openHelper, z9);
                    return openHelper;
                }
            }
        }
        context = this.this$0.context;
        str = this.this$0.name;
        FrameworkSQLiteOpenHelper.DBRefHolder dBRefHolder2 = new FrameworkSQLiteOpenHelper.DBRefHolder(null);
        callback = this.this$0.callback;
        z8 = this.this$0.allowDataLossOnRecovery;
        openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(context, str, dBRefHolder2, callback, z8);
        z9 = this.this$0.writeAheadLoggingEnabled;
        SupportSQLiteCompat.Api16Impl.setWriteAheadLoggingEnabled(openHelper, z9);
        return openHelper;
    }
}
