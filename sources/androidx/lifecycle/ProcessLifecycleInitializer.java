package androidx.lifecycle;

import R5.AbstractC1435t;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.startup.AppInitializer;
import androidx.startup.Initializer;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class ProcessLifecycleInitializer implements Initializer<LifecycleOwner> {
    @Override // androidx.startup.Initializer
    public List<Class<? extends Initializer<?>>> dependencies() {
        return AbstractC1435t.m();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    public LifecycleOwner create(Context context) {
        AbstractC3292y.i(context, "context");
        AppInitializer appInitializer = AppInitializer.getInstance(context);
        AbstractC3292y.h(appInitializer, "getInstance(context)");
        if (appInitializer.isEagerlyInitialized(ProcessLifecycleInitializer.class)) {
            LifecycleDispatcher.init(context);
            ProcessLifecycleOwner.Companion companion = ProcessLifecycleOwner.Companion;
            companion.init$lifecycle_process_release(context);
            return companion.get();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }
}
