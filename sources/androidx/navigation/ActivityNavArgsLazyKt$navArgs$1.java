package androidx.navigation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
public final class ActivityNavArgsLazyKt$navArgs$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Activity $this_navArgs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityNavArgsLazyKt$navArgs$1(Activity activity) {
        super(0);
        this.$this_navArgs = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Bundle invoke() {
        Bundle bundle;
        Intent intent = this.$this_navArgs.getIntent();
        if (intent != null) {
            Activity activity = this.$this_navArgs;
            bundle = intent.getExtras();
            if (bundle == null) {
                throw new IllegalStateException("Activity " + activity + " has null extras in " + intent);
            }
        } else {
            bundle = null;
        }
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException("Activity " + this.$this_navArgs + " has a null Intent");
    }
}
