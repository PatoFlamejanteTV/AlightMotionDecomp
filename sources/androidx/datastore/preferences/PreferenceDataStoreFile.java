package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import java.io.File;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class PreferenceDataStoreFile {
    public static final File preferencesDataStoreFile(Context context, String name) {
        AbstractC3292y.i(context, "<this>");
        AbstractC3292y.i(name, "name");
        return DataStoreFile.dataStoreFile(context, name + ".preferences_pb");
    }
}
