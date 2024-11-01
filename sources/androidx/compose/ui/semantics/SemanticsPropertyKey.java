package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import c6.InterfaceC2072n;
import j6.i;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3293z;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SemanticsPropertyKey<T> {
    public static final int $stable = 8;
    private boolean isImportantForAccessibility;
    private final InterfaceC2072n mergePolicy;
    private final String name;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.ui.semantics.SemanticsPropertyKey$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2072n {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // c6.InterfaceC2072n
        public final T invoke(T t8, T t9) {
            return t8 == null ? t9 : t8;
        }
    }

    public SemanticsPropertyKey(String str, InterfaceC2072n interfaceC2072n) {
        this.name = str;
        this.mergePolicy = interfaceC2072n;
    }

    public final InterfaceC2072n getMergePolicy$ui_release() {
        return this.mergePolicy;
    }

    public final String getName() {
        return this.name;
    }

    public final T getValue(SemanticsPropertyReceiver semanticsPropertyReceiver, i iVar) {
        Object throwSemanticsGetNotSupported;
        throwSemanticsGetNotSupported = SemanticsPropertiesKt.throwSemanticsGetNotSupported();
        return (T) throwSemanticsGetNotSupported;
    }

    public final boolean isImportantForAccessibility$ui_release() {
        return this.isImportantForAccessibility;
    }

    public final T merge(T t8, T t9) {
        return (T) this.mergePolicy.invoke(t8, t9);
    }

    public final void setValue(SemanticsPropertyReceiver semanticsPropertyReceiver, i iVar, T t8) {
        semanticsPropertyReceiver.set(this, t8);
    }

    public String toString() {
        return "AccessibilityKey: " + this.name;
    }

    public /* synthetic */ SemanticsPropertyKey(String str, InterfaceC2072n interfaceC2072n, int i8, AbstractC3284p abstractC3284p) {
        this(str, (i8 & 2) != 0 ? AnonymousClass1.INSTANCE : interfaceC2072n);
    }

    public SemanticsPropertyKey(String str, boolean z8) {
        this(str, null, 2, 0 == true ? 1 : 0);
        this.isImportantForAccessibility = z8;
    }

    public SemanticsPropertyKey(String str, boolean z8, InterfaceC2072n interfaceC2072n) {
        this(str, interfaceC2072n);
        this.isImportantForAccessibility = z8;
    }
}
