package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        super(1);
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
        return Boolean.valueOf(this.this$0.getView().getParent().requestSendAccessibilityEvent(this.this$0.getView(), accessibilityEvent));
    }
}
