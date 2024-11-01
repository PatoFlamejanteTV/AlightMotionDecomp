package androidx.compose.ui.viewinterop;

import Q5.I;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidViewHolder$runUpdate$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$runUpdate$1(AndroidViewHolder androidViewHolder) {
        super(0);
        this.this$0 = androidViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m5401invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5401invoke() {
        boolean z8;
        OwnerSnapshotObserver snapshotObserver;
        Function1 function1;
        z8 = this.this$0.hasUpdateBlock;
        if (z8 && this.this$0.isAttachedToWindow()) {
            snapshotObserver = this.this$0.getSnapshotObserver();
            AndroidViewHolder androidViewHolder = this.this$0;
            function1 = AndroidViewHolder.OnCommitAffectingUpdate;
            snapshotObserver.observeReads$ui_release(androidViewHolder, function1, this.this$0.getUpdate());
        }
    }
}
