package androidx.activity.result;

import Q5.I;
import androidx.activity.result.contract.ActivityResultContract;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ActivityResultCallerKt {
    public static final <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultCaller activityResultCaller, ActivityResultContract<I, O> activityResultContract, I i8, ActivityResultRegistry activityResultRegistry, final Function1 function1) {
        return new ActivityResultCallerLauncher(activityResultCaller.registerForActivityResult(activityResultContract, activityResultRegistry, new ActivityResultCallback() { // from class: androidx.activity.result.a
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                Function1.this.invoke(obj);
            }
        }), activityResultContract, i8);
    }

    public static final <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultCaller activityResultCaller, ActivityResultContract<I, O> activityResultContract, I i8, final Function1 function1) {
        return new ActivityResultCallerLauncher(activityResultCaller.registerForActivityResult(activityResultContract, new ActivityResultCallback() { // from class: androidx.activity.result.b
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                Function1.this.invoke(obj);
            }
        }), activityResultContract, i8);
    }
}
