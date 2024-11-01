package androidx.work;

import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.OneTimeWorkRequest;
import b6.AbstractC1989a;
import j6.InterfaceC3214c;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class OneTimeWorkRequestKt {
    public static final /* synthetic */ <W extends ListenableWorker> OneTimeWorkRequest.Builder OneTimeWorkRequestBuilder() {
        AbstractC3292y.n(4, ExifInterface.LONGITUDE_WEST);
        return new OneTimeWorkRequest.Builder(ListenableWorker.class);
    }

    public static final OneTimeWorkRequest.Builder setInputMerger(OneTimeWorkRequest.Builder builder, @NonNull InterfaceC3214c inputMerger) {
        AbstractC3292y.i(builder, "<this>");
        AbstractC3292y.i(inputMerger, "inputMerger");
        return builder.setInputMerger(AbstractC1989a.a(inputMerger));
    }
}
