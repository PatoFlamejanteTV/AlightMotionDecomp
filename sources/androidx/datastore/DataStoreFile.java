package androidx.datastore;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class DataStoreFile {
    public static final File dataStoreFile(Context context, String fileName) {
        AbstractC3292y.i(context, "<this>");
        AbstractC3292y.i(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/" + fileName);
    }
}
