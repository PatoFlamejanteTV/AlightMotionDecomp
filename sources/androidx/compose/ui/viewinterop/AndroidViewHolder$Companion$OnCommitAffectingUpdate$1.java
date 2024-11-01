package androidx.compose.ui.viewinterop;

import Q5.I;
import android.os.Handler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 extends AbstractC3293z implements Function1 {
    public static final AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 INSTANCE = new AndroidViewHolder$Companion$OnCommitAffectingUpdate$1();

    AndroidViewHolder$Companion$OnCommitAffectingUpdate$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AndroidViewHolder) obj);
        return I.f8786a;
    }

    public final void invoke(AndroidViewHolder androidViewHolder) {
        final Function0 function0;
        Handler handler = androidViewHolder.getHandler();
        function0 = androidViewHolder.runUpdate;
        handler.post(new Runnable() { // from class: androidx.compose.ui.viewinterop.b
            @Override // java.lang.Runnable
            public final void run() {
                Function0.this.invoke();
            }
        });
    }
}
