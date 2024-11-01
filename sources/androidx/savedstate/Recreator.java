package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class Recreator implements LifecycleEventObserver {
    public static final String CLASSES_KEY = "classes_to_restore";
    public static final String COMPONENT_KEY = "androidx.savedstate.Restarter";
    public static final Companion Companion = new Companion(null);
    private final SavedStateRegistryOwner owner;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static final class SavedStateProvider implements SavedStateRegistry.SavedStateProvider {
        private final Set<String> classes;

        public SavedStateProvider(SavedStateRegistry registry) {
            AbstractC3292y.i(registry, "registry");
            this.classes = new LinkedHashSet();
            registry.registerSavedStateProvider(Recreator.COMPONENT_KEY, this);
        }

        public final void add(String className) {
            AbstractC3292y.i(className, "className");
            this.classes.add(className);
        }

        @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
        public Bundle saveState() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(Recreator.CLASSES_KEY, new ArrayList<>(this.classes));
            return bundle;
        }
    }

    public Recreator(SavedStateRegistryOwner owner) {
        AbstractC3292y.i(owner, "owner");
        this.owner = owner;
    }

    private final void reflectiveNew(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.AutoRecreated.class);
            AbstractC3292y.h(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(null);
                    AbstractC3292y.h(newInstance, "{\n                constr…wInstance()\n            }");
                    ((SavedStateRegistry.AutoRecreated) newInstance).onRecreated(this.owner);
                } catch (Exception e8) {
                    throw new RuntimeException("Failed to instantiate " + str, e8);
                }
            } catch (NoSuchMethodException e9) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e9);
            }
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("Class " + str + " wasn't found", e10);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        AbstractC3292y.i(source, "source");
        AbstractC3292y.i(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            source.getLifecycle().removeObserver(this);
            Bundle consumeRestoredStateForKey = this.owner.getSavedStateRegistry().consumeRestoredStateForKey(COMPONENT_KEY);
            if (consumeRestoredStateForKey == null) {
                return;
            }
            ArrayList<String> stringArrayList = consumeRestoredStateForKey.getStringArrayList(CLASSES_KEY);
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    reflectiveNew(it.next());
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
