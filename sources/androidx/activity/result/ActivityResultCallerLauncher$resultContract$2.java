package androidx.activity.result;

import Q5.I;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ActivityResultCallerLauncher$resultContract$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ ActivityResultCallerLauncher<I, O> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityResultCallerLauncher$resultContract$2(ActivityResultCallerLauncher<I, O> activityResultCallerLauncher) {
        super(0);
        this.this$0 = activityResultCallerLauncher;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.activity.result.ActivityResultCallerLauncher$resultContract$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1 invoke() {
        final ActivityResultCallerLauncher<I, O> activityResultCallerLauncher = this.this$0;
        return new ActivityResultContract<I, O>() { // from class: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2.1
            @Override // androidx.activity.result.contract.ActivityResultContract
            public O parseResult(int i8, Intent intent) {
                return (O) activityResultCallerLauncher.getCallerContract().parseResult(i8, intent);
            }

            @Override // androidx.activity.result.contract.ActivityResultContract
            public Intent createIntent(Context context, I i8) {
                return activityResultCallerLauncher.getCallerContract().createIntent(context, activityResultCallerLauncher.getCallerInput());
            }
        };
    }
}
