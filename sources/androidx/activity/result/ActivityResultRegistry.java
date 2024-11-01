package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import g6.AbstractC2923c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {
    private static final int INITIAL_REQUEST_CODE_VALUE = 65536;
    private static final String KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";
    private static final String KEY_COMPONENT_ACTIVITY_PENDING_RESULTS = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";
    private static final String KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";
    private static final String KEY_COMPONENT_ACTIVITY_REGISTERED_RCS = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";
    private static final String LOG_TAG = "ActivityResultRegistry";
    private final Map<Integer, String> mRcToKey = new HashMap();
    final Map<String, Integer> mKeyToRc = new HashMap();
    private final Map<String, LifecycleContainer> mKeyToLifecycleContainers = new HashMap();
    ArrayList<String> mLaunchedKeys = new ArrayList<>();
    final transient Map<String, CallbackAndContract<?>> mKeyToCallback = new HashMap();
    final Map<String, Object> mParsedPendingResults = new HashMap();
    final Bundle mPendingResults = new Bundle();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class CallbackAndContract<O> {
        final ActivityResultCallback<O> mCallback;
        final ActivityResultContract<?, O> mContract;

        CallbackAndContract(ActivityResultCallback<O> activityResultCallback, ActivityResultContract<?, O> activityResultContract) {
            this.mCallback = activityResultCallback;
            this.mContract = activityResultContract;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class LifecycleContainer {
        final Lifecycle mLifecycle;
        private final ArrayList<LifecycleEventObserver> mObservers = new ArrayList<>();

        LifecycleContainer(@NonNull Lifecycle lifecycle) {
            this.mLifecycle = lifecycle;
        }

        void addObserver(@NonNull LifecycleEventObserver lifecycleEventObserver) {
            this.mLifecycle.addObserver(lifecycleEventObserver);
            this.mObservers.add(lifecycleEventObserver);
        }

        void clearObservers() {
            Iterator<LifecycleEventObserver> it = this.mObservers.iterator();
            while (it.hasNext()) {
                this.mLifecycle.removeObserver(it.next());
            }
            this.mObservers.clear();
        }
    }

    private void bindRcKey(int i8, String str) {
        this.mRcToKey.put(Integer.valueOf(i8), str);
        this.mKeyToRc.put(str, Integer.valueOf(i8));
    }

    private <O> void doDispatch(String str, int i8, @Nullable Intent intent, @Nullable CallbackAndContract<O> callbackAndContract) {
        if (callbackAndContract != null && callbackAndContract.mCallback != null && this.mLaunchedKeys.contains(str)) {
            callbackAndContract.mCallback.onActivityResult(callbackAndContract.mContract.parseResult(i8, intent));
            this.mLaunchedKeys.remove(str);
        } else {
            this.mParsedPendingResults.remove(str);
            this.mPendingResults.putParcelable(str, new ActivityResult(i8, intent));
        }
    }

    private int generateRandomNumber() {
        int c8 = AbstractC2923c.f32467a.c(2147418112);
        while (true) {
            int i8 = c8 + 65536;
            if (this.mRcToKey.containsKey(Integer.valueOf(i8))) {
                c8 = AbstractC2923c.f32467a.c(2147418112);
            } else {
                return i8;
            }
        }
    }

    private void registerKey(String str) {
        if (this.mKeyToRc.get(str) != null) {
            return;
        }
        bindRcKey(generateRandomNumber(), str);
    }

    @MainThread
    public final boolean dispatchResult(int i8, int i9, @Nullable Intent intent) {
        String str = this.mRcToKey.get(Integer.valueOf(i8));
        if (str == null) {
            return false;
        }
        doDispatch(str, i9, intent, this.mKeyToCallback.get(str));
        return true;
    }

    @MainThread
    public abstract <I, O> void onLaunch(int i8, @NonNull ActivityResultContract<I, O> activityResultContract, @SuppressLint({"UnknownNullness"}) I i9, @Nullable ActivityOptionsCompat activityOptionsCompat);

    public final void onRestoreInstanceState(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_RCS);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS);
        if (stringArrayList != null && integerArrayList != null) {
            this.mLaunchedKeys = bundle.getStringArrayList(KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS);
            this.mPendingResults.putAll(bundle.getBundle(KEY_COMPONENT_ACTIVITY_PENDING_RESULTS));
            for (int i8 = 0; i8 < stringArrayList.size(); i8++) {
                String str = stringArrayList.get(i8);
                if (this.mKeyToRc.containsKey(str)) {
                    Integer remove = this.mKeyToRc.remove(str);
                    if (!this.mPendingResults.containsKey(str)) {
                        this.mRcToKey.remove(remove);
                    }
                }
                bindRcKey(integerArrayList.get(i8).intValue(), stringArrayList.get(i8));
            }
        }
    }

    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        bundle.putIntegerArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_RCS, new ArrayList<>(this.mKeyToRc.values()));
        bundle.putStringArrayList(KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS, new ArrayList<>(this.mKeyToRc.keySet()));
        bundle.putStringArrayList(KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS, new ArrayList<>(this.mLaunchedKeys));
        bundle.putBundle(KEY_COMPONENT_ACTIVITY_PENDING_RESULTS, (Bundle) this.mPendingResults.clone());
    }

    @NonNull
    public final <I, O> ActivityResultLauncher<I> register(@NonNull final String str, @NonNull LifecycleOwner lifecycleOwner, @NonNull final ActivityResultContract<I, O> activityResultContract, @NonNull final ActivityResultCallback<O> activityResultCallback) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (!lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            registerKey(str);
            LifecycleContainer lifecycleContainer = this.mKeyToLifecycleContainers.get(str);
            if (lifecycleContainer == null) {
                lifecycleContainer = new LifecycleContainer(lifecycle);
            }
            lifecycleContainer.addObserver(new LifecycleEventObserver() { // from class: androidx.activity.result.ActivityResultRegistry.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner2, @NonNull Lifecycle.Event event) {
                    if (Lifecycle.Event.ON_START.equals(event)) {
                        ActivityResultRegistry.this.mKeyToCallback.put(str, new CallbackAndContract<>(activityResultCallback, activityResultContract));
                        if (ActivityResultRegistry.this.mParsedPendingResults.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.mParsedPendingResults.get(str);
                            ActivityResultRegistry.this.mParsedPendingResults.remove(str);
                            activityResultCallback.onActivityResult(obj);
                        }
                        ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.mPendingResults.getParcelable(str);
                        if (activityResult != null) {
                            ActivityResultRegistry.this.mPendingResults.remove(str);
                            activityResultCallback.onActivityResult(activityResultContract.parseResult(activityResult.getResultCode(), activityResult.getData()));
                            return;
                        }
                        return;
                    }
                    if (Lifecycle.Event.ON_STOP.equals(event)) {
                        ActivityResultRegistry.this.mKeyToCallback.remove(str);
                    } else if (Lifecycle.Event.ON_DESTROY.equals(event)) {
                        ActivityResultRegistry.this.unregister(str);
                    }
                }
            });
            this.mKeyToLifecycleContainers.put(str, lifecycleContainer);
            return new ActivityResultLauncher<I>() { // from class: androidx.activity.result.ActivityResultRegistry.2
                @Override // androidx.activity.result.ActivityResultLauncher
                @NonNull
                public ActivityResultContract<I, ?> getContract() {
                    return activityResultContract;
                }

                @Override // androidx.activity.result.ActivityResultLauncher
                public void launch(I i8, @Nullable ActivityOptionsCompat activityOptionsCompat) {
                    Integer num = ActivityResultRegistry.this.mKeyToRc.get(str);
                    if (num != null) {
                        ActivityResultRegistry.this.mLaunchedKeys.add(str);
                        try {
                            ActivityResultRegistry.this.onLaunch(num.intValue(), activityResultContract, i8, activityOptionsCompat);
                            return;
                        } catch (Exception e8) {
                            ActivityResultRegistry.this.mLaunchedKeys.remove(str);
                            throw e8;
                        }
                    }
                    throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + activityResultContract + " and input " + i8 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                }

                @Override // androidx.activity.result.ActivityResultLauncher
                public void unregister() {
                    ActivityResultRegistry.this.unregister(str);
                }
            };
        }
        throw new IllegalStateException("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.");
    }

    @MainThread
    final void unregister(@NonNull String str) {
        Integer remove;
        if (!this.mLaunchedKeys.contains(str) && (remove = this.mKeyToRc.remove(str)) != null) {
            this.mRcToKey.remove(remove);
        }
        this.mKeyToCallback.remove(str);
        if (this.mParsedPendingResults.containsKey(str)) {
            Log.w(LOG_TAG, "Dropping pending result for request " + str + ": " + this.mParsedPendingResults.get(str));
            this.mParsedPendingResults.remove(str);
        }
        if (this.mPendingResults.containsKey(str)) {
            Log.w(LOG_TAG, "Dropping pending result for request " + str + ": " + this.mPendingResults.getParcelable(str));
            this.mPendingResults.remove(str);
        }
        LifecycleContainer lifecycleContainer = this.mKeyToLifecycleContainers.get(str);
        if (lifecycleContainer != null) {
            lifecycleContainer.clearObservers();
            this.mKeyToLifecycleContainers.remove(str);
        }
    }

    @MainThread
    public final <O> boolean dispatchResult(int i8, @SuppressLint({"UnknownNullness"}) O o8) {
        ActivityResultCallback<?> activityResultCallback;
        String str = this.mRcToKey.get(Integer.valueOf(i8));
        if (str == null) {
            return false;
        }
        CallbackAndContract<?> callbackAndContract = this.mKeyToCallback.get(str);
        if (callbackAndContract != null && (activityResultCallback = callbackAndContract.mCallback) != null) {
            if (!this.mLaunchedKeys.remove(str)) {
                return true;
            }
            activityResultCallback.onActivityResult(o8);
            return true;
        }
        this.mPendingResults.remove(str);
        this.mParsedPendingResults.put(str, o8);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final <I, O> ActivityResultLauncher<I> register(@NonNull final String str, @NonNull final ActivityResultContract<I, O> activityResultContract, @NonNull ActivityResultCallback<O> activityResultCallback) {
        registerKey(str);
        this.mKeyToCallback.put(str, new CallbackAndContract<>(activityResultCallback, activityResultContract));
        if (this.mParsedPendingResults.containsKey(str)) {
            Object obj = this.mParsedPendingResults.get(str);
            this.mParsedPendingResults.remove(str);
            activityResultCallback.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.mPendingResults.getParcelable(str);
        if (activityResult != null) {
            this.mPendingResults.remove(str);
            activityResultCallback.onActivityResult(activityResultContract.parseResult(activityResult.getResultCode(), activityResult.getData()));
        }
        return new ActivityResultLauncher<I>() { // from class: androidx.activity.result.ActivityResultRegistry.3
            @Override // androidx.activity.result.ActivityResultLauncher
            @NonNull
            public ActivityResultContract<I, ?> getContract() {
                return activityResultContract;
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void launch(I i8, @Nullable ActivityOptionsCompat activityOptionsCompat) {
                Integer num = ActivityResultRegistry.this.mKeyToRc.get(str);
                if (num != null) {
                    ActivityResultRegistry.this.mLaunchedKeys.add(str);
                    try {
                        ActivityResultRegistry.this.onLaunch(num.intValue(), activityResultContract, i8, activityOptionsCompat);
                        return;
                    } catch (Exception e8) {
                        ActivityResultRegistry.this.mLaunchedKeys.remove(str);
                        throw e8;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + activityResultContract + " and input " + i8 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public void unregister() {
                ActivityResultRegistry.this.unregister(str);
            }
        };
    }
}
