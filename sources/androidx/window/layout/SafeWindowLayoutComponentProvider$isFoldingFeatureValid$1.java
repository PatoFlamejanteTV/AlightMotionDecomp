package androidx.window.layout;

import android.graphics.Rect;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.U;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ ClassLoader $classLoader;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1(ClassLoader classLoader) {
        super(0);
        this.$classLoader = classLoader;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Class foldingFeatureClass;
        boolean doesReturn;
        boolean z8;
        boolean isPublic;
        boolean doesReturn2;
        boolean isPublic2;
        boolean doesReturn3;
        boolean isPublic3;
        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
        foldingFeatureClass = safeWindowLayoutComponentProvider.foldingFeatureClass(this.$classLoader);
        Method getBoundsMethod = foldingFeatureClass.getMethod("getBounds", null);
        Method getTypeMethod = foldingFeatureClass.getMethod("getType", null);
        Method getStateMethod = foldingFeatureClass.getMethod("getState", null);
        AbstractC3292y.h(getBoundsMethod, "getBoundsMethod");
        doesReturn = safeWindowLayoutComponentProvider.doesReturn(getBoundsMethod, U.b(Rect.class));
        if (doesReturn) {
            isPublic = safeWindowLayoutComponentProvider.isPublic(getBoundsMethod);
            if (isPublic) {
                AbstractC3292y.h(getTypeMethod, "getTypeMethod");
                Class cls = Integer.TYPE;
                doesReturn2 = safeWindowLayoutComponentProvider.doesReturn(getTypeMethod, U.b(cls));
                if (doesReturn2) {
                    isPublic2 = safeWindowLayoutComponentProvider.isPublic(getTypeMethod);
                    if (isPublic2) {
                        AbstractC3292y.h(getStateMethod, "getStateMethod");
                        doesReturn3 = safeWindowLayoutComponentProvider.doesReturn(getStateMethod, U.b(cls));
                        if (doesReturn3) {
                            isPublic3 = safeWindowLayoutComponentProvider.isPublic(getStateMethod);
                            if (isPublic3) {
                                z8 = true;
                                return Boolean.valueOf(z8);
                            }
                        }
                    }
                }
            }
        }
        z8 = false;
        return Boolean.valueOf(z8);
    }
}
