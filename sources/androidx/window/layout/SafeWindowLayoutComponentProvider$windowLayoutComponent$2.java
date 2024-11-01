package androidx.window.layout;

import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
final class SafeWindowLayoutComponentProvider$windowLayoutComponent$2 extends AbstractC3293z implements Function0 {
    public static final SafeWindowLayoutComponentProvider$windowLayoutComponent$2 INSTANCE = new SafeWindowLayoutComponentProvider$windowLayoutComponent$2();

    SafeWindowLayoutComponentProvider$windowLayoutComponent$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final WindowLayoutComponent invoke() {
        boolean canUseWindowLayoutComponent;
        ClassLoader classLoader = SafeWindowLayoutComponentProvider.class.getClassLoader();
        if (classLoader != null) {
            canUseWindowLayoutComponent = SafeWindowLayoutComponentProvider.INSTANCE.canUseWindowLayoutComponent(classLoader);
            if (canUseWindowLayoutComponent) {
                try {
                    return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
                } catch (UnsupportedOperationException unused) {
                    return null;
                }
            }
        }
        return null;
    }
}
