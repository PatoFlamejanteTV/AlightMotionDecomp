package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.DoNotInline;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC3284p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class StaticLayoutFactoryDefault implements StaticLayoutFactoryImpl {
    public static final Companion Companion = new Companion(null);
    private static boolean isInitialized;
    private static Constructor<StaticLayout> staticLayoutConstructor;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Constructor<StaticLayout> getStaticLayoutConstructor() {
            if (StaticLayoutFactoryDefault.isInitialized) {
                return StaticLayoutFactoryDefault.staticLayoutConstructor;
            }
            StaticLayoutFactoryDefault.isInitialized = true;
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                StaticLayoutFactoryDefault.staticLayoutConstructor = StaticLayout.class.getConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            } catch (NoSuchMethodException unused) {
                StaticLayoutFactoryDefault.staticLayoutConstructor = null;
                Log.e("StaticLayoutFactory", "unable to collect necessary constructor.");
            }
            return StaticLayoutFactoryDefault.staticLayoutConstructor;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    @DoNotInline
    public StaticLayout create(StaticLayoutParams staticLayoutParams) {
        StaticLayout staticLayout;
        Constructor staticLayoutConstructor2 = Companion.getStaticLayoutConstructor();
        if (staticLayoutConstructor2 != null) {
            try {
                staticLayout = (StaticLayout) staticLayoutConstructor2.newInstance(staticLayoutParams.getText(), Integer.valueOf(staticLayoutParams.getStart()), Integer.valueOf(staticLayoutParams.getEnd()), staticLayoutParams.getPaint(), Integer.valueOf(staticLayoutParams.getWidth()), staticLayoutParams.getAlignment(), staticLayoutParams.getTextDir(), Float.valueOf(staticLayoutParams.getLineSpacingMultiplier()), Float.valueOf(staticLayoutParams.getLineSpacingExtra()), Boolean.valueOf(staticLayoutParams.getIncludePadding()), staticLayoutParams.getEllipsize(), Integer.valueOf(staticLayoutParams.getEllipsizedWidth()), Integer.valueOf(staticLayoutParams.getMaxLines()));
            } catch (IllegalAccessException unused) {
                staticLayout = null;
                staticLayoutConstructor = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InstantiationException unused2) {
                staticLayout = null;
                staticLayoutConstructor = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InvocationTargetException unused3) {
                staticLayout = null;
                staticLayoutConstructor = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            }
        } else {
            staticLayout = null;
        }
        StaticLayout staticLayout2 = staticLayout;
        if (staticLayout2 != null) {
            return staticLayout2;
        }
        return new StaticLayout(staticLayoutParams.getText(), staticLayoutParams.getStart(), staticLayoutParams.getEnd(), staticLayoutParams.getPaint(), staticLayoutParams.getWidth(), staticLayoutParams.getAlignment(), staticLayoutParams.getLineSpacingMultiplier(), staticLayoutParams.getLineSpacingExtra(), staticLayoutParams.getIncludePadding(), staticLayoutParams.getEllipsize(), staticLayoutParams.getEllipsizedWidth());
    }

    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    public boolean isFallbackLineSpacingEnabled(StaticLayout staticLayout, boolean z8) {
        return false;
    }
}
