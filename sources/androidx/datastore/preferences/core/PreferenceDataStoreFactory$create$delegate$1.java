package androidx.datastore.preferences.core;

import U6.Q;
import a6.AbstractC1678c;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class PreferenceDataStoreFactory$create$delegate$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Function0 $produceFile;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceDataStoreFactory$create$delegate$1(Function0 function0) {
        super(0);
        this.$produceFile = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Q invoke() {
        File file = (File) this.$produceFile.invoke();
        if (AbstractC3292y.d(AbstractC1678c.a(file), PreferencesSerializer.fileExtension)) {
            Q.a aVar = Q.f10156b;
            File absoluteFile = file.getAbsoluteFile();
            AbstractC3292y.h(absoluteFile, "file.absoluteFile");
            return Q.a.d(aVar, absoluteFile, false, 1, null);
        }
        throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
    }
}
