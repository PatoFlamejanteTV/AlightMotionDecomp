package androidx.compose.ui.semantics;

import Q5.InterfaceC1412g;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
public final class SemanticsPropertiesKt$ActionPropertyKey$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final SemanticsPropertiesKt$ActionPropertyKey$1 INSTANCE = new SemanticsPropertiesKt$ActionPropertyKey$1();

    public SemanticsPropertiesKt$ActionPropertyKey$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final AccessibilityAction<T> invoke(AccessibilityAction<T> accessibilityAction, AccessibilityAction<T> accessibilityAction2) {
        String label;
        InterfaceC1412g action;
        if (accessibilityAction == 0 || (label = accessibilityAction.getLabel()) == null) {
            label = accessibilityAction2.getLabel();
        }
        if (accessibilityAction == 0 || (action = accessibilityAction.getAction()) == null) {
            action = accessibilityAction2.getAction();
        }
        return new AccessibilityAction<>(label, action);
    }
}
