package androidx.lifecycle;

import Q5.x;
import R5.Q;
import R5.a0;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateRegistry;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q6.AbstractC3815N;
import q6.AbstractC3823h;
import q6.InterfaceC3813L;
import q6.w;

/* loaded from: classes3.dex */
public final class SavedStateHandle {
    private static final String KEYS = "keys";
    private static final String VALUES = "values";
    private final Map<String, w> flows;
    private final Map<String, SavingStateLiveData<?>> liveDatas;
    private final Map<String, Object> regular;
    private final SavedStateRegistry.SavedStateProvider savedStateProvider;
    private final Map<String, SavedStateRegistry.SavedStateProvider> savedStateProviders;
    public static final Companion Companion = new Companion(null);
    private static final Class<? extends Object>[] ACCEPTABLE_CLASSES = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new SavedStateHandle();
                }
                HashMap hashMap = new HashMap();
                for (String key : bundle2.keySet()) {
                    AbstractC3292y.h(key, "key");
                    hashMap.put(key, bundle2.get(key));
                }
                return new SavedStateHandle(hashMap);
            }
            ClassLoader classLoader = SavedStateHandle.class.getClassLoader();
            AbstractC3292y.f(classLoader);
            bundle.setClassLoader(classLoader);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(SavedStateHandle.KEYS);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(SavedStateHandle.VALUES);
            if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i8 = 0; i8 < size; i8++) {
                    Object obj = parcelableArrayList.get(i8);
                    AbstractC3292y.g(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, parcelableArrayList2.get(i8));
                }
                return new SavedStateHandle(linkedHashMap);
            }
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final boolean validateValue(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : SavedStateHandle.ACCEPTABLE_CLASSES) {
                AbstractC3292y.f(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public SavedStateHandle(Map<String, ? extends Object> initialState) {
        AbstractC3292y.i(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.regular = linkedHashMap;
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.m
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                Bundle savedStateProvider$lambda$0;
                savedStateProvider$lambda$0 = SavedStateHandle.savedStateProvider$lambda$0(SavedStateHandle.this);
                return savedStateProvider$lambda$0;
            }
        };
        linkedHashMap.putAll(initialState);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
        return Companion.createHandle(bundle, bundle2);
    }

    private final <T> MutableLiveData<T> getLiveDataInternal(String str, boolean z8, T t8) {
        SavingStateLiveData<?> savingStateLiveData;
        SavingStateLiveData<?> savingStateLiveData2;
        SavingStateLiveData<?> savingStateLiveData3 = this.liveDatas.get(str);
        if (savingStateLiveData3 instanceof MutableLiveData) {
            savingStateLiveData = savingStateLiveData3;
        } else {
            savingStateLiveData = null;
        }
        if (savingStateLiveData != null) {
            return savingStateLiveData;
        }
        if (this.regular.containsKey(str)) {
            savingStateLiveData2 = new SavingStateLiveData<>(this, str, this.regular.get(str));
        } else if (z8) {
            this.regular.put(str, t8);
            savingStateLiveData2 = new SavingStateLiveData<>(this, str, t8);
        } else {
            savingStateLiveData2 = new SavingStateLiveData<>(this, str);
        }
        this.liveDatas.put(str, savingStateLiveData2);
        return savingStateLiveData2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle savedStateProvider$lambda$0(SavedStateHandle this$0) {
        AbstractC3292y.i(this$0, "this$0");
        for (Map.Entry entry : Q.w(this$0.savedStateProviders).entrySet()) {
            this$0.set((String) entry.getKey(), ((SavedStateRegistry.SavedStateProvider) entry.getValue()).saveState());
        }
        Set<String> keySet = this$0.regular.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(this$0.regular.get(str));
        }
        return BundleKt.bundleOf(x.a(KEYS, arrayList), x.a(VALUES, arrayList2));
    }

    @MainThread
    public final void clearSavedStateProvider(String key) {
        AbstractC3292y.i(key, "key");
        this.savedStateProviders.remove(key);
    }

    @MainThread
    public final boolean contains(String key) {
        AbstractC3292y.i(key, "key");
        return this.regular.containsKey(key);
    }

    @MainThread
    public final <T> T get(String key) {
        AbstractC3292y.i(key, "key");
        try {
            return (T) this.regular.get(key);
        } catch (ClassCastException unused) {
            remove(key);
            return null;
        }
    }

    @MainThread
    public final <T> MutableLiveData<T> getLiveData(String key) {
        AbstractC3292y.i(key, "key");
        MutableLiveData<T> liveDataInternal = getLiveDataInternal(key, false, null);
        AbstractC3292y.g(liveDataInternal, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return liveDataInternal;
    }

    @MainThread
    public final <T> InterfaceC3813L getStateFlow(String key, T t8) {
        AbstractC3292y.i(key, "key");
        Map<String, w> map = this.flows;
        w wVar = map.get(key);
        if (wVar == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, t8);
            }
            wVar = AbstractC3815N.a(this.regular.get(key));
            this.flows.put(key, wVar);
            map.put(key, wVar);
        }
        InterfaceC3813L b9 = AbstractC3823h.b(wVar);
        AbstractC3292y.g(b9, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return b9;
    }

    @MainThread
    public final Set<String> keys() {
        return a0.m(a0.m(this.regular.keySet(), this.savedStateProviders.keySet()), this.liveDatas.keySet());
    }

    @MainThread
    public final <T> T remove(String key) {
        AbstractC3292y.i(key, "key");
        T t8 = (T) this.regular.remove(key);
        SavingStateLiveData<?> remove = this.liveDatas.remove(key);
        if (remove != null) {
            remove.detach();
        }
        this.flows.remove(key);
        return t8;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final SavedStateRegistry.SavedStateProvider savedStateProvider() {
        return this.savedStateProvider;
    }

    @MainThread
    public final <T> void set(String key, T t8) {
        SavingStateLiveData<?> savingStateLiveData;
        AbstractC3292y.i(key, "key");
        if (Companion.validateValue(t8)) {
            SavingStateLiveData<?> savingStateLiveData2 = this.liveDatas.get(key);
            if (savingStateLiveData2 instanceof MutableLiveData) {
                savingStateLiveData = savingStateLiveData2;
            } else {
                savingStateLiveData = null;
            }
            if (savingStateLiveData != null) {
                savingStateLiveData.setValue(t8);
            } else {
                this.regular.put(key, t8);
            }
            w wVar = this.flows.get(key);
            if (wVar != null) {
                wVar.setValue(t8);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't put value with type ");
        AbstractC3292y.f(t8);
        sb.append(t8.getClass());
        sb.append(" into saved state");
        throw new IllegalArgumentException(sb.toString());
    }

    @MainThread
    public final void setSavedStateProvider(String key, SavedStateRegistry.SavedStateProvider provider) {
        AbstractC3292y.i(key, "key");
        AbstractC3292y.i(provider, "provider");
        this.savedStateProviders.put(key, provider);
    }

    @MainThread
    public final <T> MutableLiveData<T> getLiveData(String key, T t8) {
        AbstractC3292y.i(key, "key");
        return getLiveDataInternal(key, true, t8);
    }

    /* loaded from: classes3.dex */
    public static final class SavingStateLiveData<T> extends MutableLiveData<T> {
        private SavedStateHandle handle;
        private String key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavingStateLiveData(SavedStateHandle savedStateHandle, String key, T t8) {
            super(t8);
            AbstractC3292y.i(key, "key");
            this.key = key;
            this.handle = savedStateHandle;
        }

        public final void detach() {
            this.handle = null;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(T t8) {
            SavedStateHandle savedStateHandle = this.handle;
            if (savedStateHandle != null) {
                savedStateHandle.regular.put(this.key, t8);
                w wVar = (w) savedStateHandle.flows.get(this.key);
                if (wVar != null) {
                    wVar.setValue(t8);
                }
            }
            super.setValue(t8);
        }

        public SavingStateLiveData(SavedStateHandle savedStateHandle, String key) {
            AbstractC3292y.i(key, "key");
            this.key = key;
            this.handle = savedStateHandle;
        }
    }

    public SavedStateHandle() {
        this.regular = new LinkedHashMap();
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.m
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                Bundle savedStateProvider$lambda$0;
                savedStateProvider$lambda$0 = SavedStateHandle.savedStateProvider$lambda$0(SavedStateHandle.this);
                return savedStateProvider$lambda$0;
            }
        };
    }
}
