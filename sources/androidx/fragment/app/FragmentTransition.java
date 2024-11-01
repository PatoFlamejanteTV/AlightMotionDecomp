package androidx.fragment.app;

import R5.AbstractC1435t;
import android.view.View;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class FragmentTransition {
    public static final FragmentTransition INSTANCE;
    public static final FragmentTransitionImpl PLATFORM_IMPL;
    public static final FragmentTransitionImpl SUPPORT_IMPL;

    static {
        FragmentTransition fragmentTransition = new FragmentTransition();
        INSTANCE = fragmentTransition;
        PLATFORM_IMPL = new FragmentTransitionCompat21();
        SUPPORT_IMPL = fragmentTransition.resolveSupportImpl();
    }

    private FragmentTransition() {
    }

    public static final void callSharedElementStartEnd(Fragment inFragment, Fragment outFragment, boolean z8, ArrayMap<String, View> sharedElements, boolean z9) {
        SharedElementCallback enterTransitionCallback;
        AbstractC3292y.i(inFragment, "inFragment");
        AbstractC3292y.i(outFragment, "outFragment");
        AbstractC3292y.i(sharedElements, "sharedElements");
        if (z8) {
            enterTransitionCallback = outFragment.getEnterTransitionCallback();
        } else {
            enterTransitionCallback = inFragment.getEnterTransitionCallback();
        }
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList(sharedElements.size());
            Iterator<Map.Entry<String, View>> it = sharedElements.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
            ArrayList arrayList2 = new ArrayList(sharedElements.size());
            Iterator<Map.Entry<String, View>> it2 = sharedElements.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getKey());
            }
            if (z9) {
                enterTransitionCallback.onSharedElementStart(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.onSharedElementEnd(arrayList2, arrayList, null);
            }
        }
    }

    public static final String findKeyForValue(ArrayMap<String, String> arrayMap, String value) {
        AbstractC3292y.i(arrayMap, "<this>");
        AbstractC3292y.i(value, "value");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : arrayMap.entrySet()) {
            if (AbstractC3292y.d(entry.getValue(), value)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) AbstractC1435t.o0(arrayList);
    }

    private final FragmentTransitionImpl resolveSupportImpl() {
        try {
            AbstractC3292y.g(FragmentTransitionSupport.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (FragmentTransitionImpl) FragmentTransitionSupport.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void retainValues(ArrayMap<String, String> arrayMap, ArrayMap<String, View> namedViews) {
        AbstractC3292y.i(arrayMap, "<this>");
        AbstractC3292y.i(namedViews, "namedViews");
        int size = arrayMap.size();
        while (true) {
            size--;
            if (-1 < size) {
                if (!namedViews.containsKey(arrayMap.valueAt(size))) {
                    arrayMap.removeAt(size);
                }
            } else {
                return;
            }
        }
    }

    public static final void setViewVisibility(List<? extends View> views, int i8) {
        AbstractC3292y.i(views, "views");
        Iterator<T> it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i8);
        }
    }

    public static final boolean supportsTransition() {
        if (PLATFORM_IMPL == null && SUPPORT_IMPL == null) {
            return false;
        }
        return true;
    }
}
