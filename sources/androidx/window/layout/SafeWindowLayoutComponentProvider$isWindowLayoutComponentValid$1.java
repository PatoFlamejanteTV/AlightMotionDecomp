package androidx.window.layout;

import android.app.Activity;
import java.lang.reflect.Method;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SafeWindowLayoutComponentProvider$isWindowLayoutComponentValid$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ ClassLoader $classLoader;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeWindowLayoutComponentProvider$isWindowLayoutComponentValid$1(ClassLoader classLoader) {
        super(0);
        this.$classLoader = classLoader;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Class windowLayoutComponentClass;
        boolean isPublic;
        boolean isPublic2;
        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
        windowLayoutComponentClass = safeWindowLayoutComponentProvider.windowLayoutComponentClass(this.$classLoader);
        boolean z8 = false;
        Method addListenerMethod = windowLayoutComponentClass.getMethod("addWindowLayoutInfoListener", Activity.class, Consumer.class);
        Method removeListenerMethod = windowLayoutComponentClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
        AbstractC3292y.h(addListenerMethod, "addListenerMethod");
        isPublic = safeWindowLayoutComponentProvider.isPublic(addListenerMethod);
        if (isPublic) {
            AbstractC3292y.h(removeListenerMethod, "removeListenerMethod");
            isPublic2 = safeWindowLayoutComponentProvider.isPublic(removeListenerMethod);
            if (isPublic2) {
                z8 = true;
            }
        }
        return Boolean.valueOf(z8);
    }
}
