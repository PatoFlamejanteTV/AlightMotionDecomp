package androidx.fragment.app;

import Q5.x;
import R5.AbstractC1435t;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.FragmentAnim;
import androidx.fragment.app.SpecialEffectsController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class DefaultSpecialEffectsController extends SpecialEffectsController {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class AnimationInfo extends SpecialEffectsInfo {
        private FragmentAnim.AnimationOrAnimator animation;
        private boolean isAnimLoaded;
        private final boolean isPop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimationInfo(SpecialEffectsController.Operation operation, CancellationSignal signal, boolean z8) {
            super(operation, signal);
            AbstractC3292y.i(operation, "operation");
            AbstractC3292y.i(signal, "signal");
            this.isPop = z8;
        }

        public final FragmentAnim.AnimationOrAnimator getAnimation(Context context) {
            boolean z8;
            AbstractC3292y.i(context, "context");
            if (this.isAnimLoaded) {
                return this.animation;
            }
            Fragment fragment = getOperation().getFragment();
            if (getOperation().getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                z8 = true;
            } else {
                z8 = false;
            }
            FragmentAnim.AnimationOrAnimator loadAnimation = FragmentAnim.loadAnimation(context, fragment, z8, this.isPop);
            this.animation = loadAnimation;
            this.isAnimLoaded = true;
            return loadAnimation;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class SpecialEffectsInfo {
        private final SpecialEffectsController.Operation operation;
        private final CancellationSignal signal;

        public SpecialEffectsInfo(SpecialEffectsController.Operation operation, CancellationSignal signal) {
            AbstractC3292y.i(operation, "operation");
            AbstractC3292y.i(signal, "signal");
            this.operation = operation;
            this.signal = signal;
        }

        public final void completeSpecialEffect() {
            this.operation.completeSpecialEffect(this.signal);
        }

        public final SpecialEffectsController.Operation getOperation() {
            return this.operation;
        }

        public final CancellationSignal getSignal() {
            return this.signal;
        }

        public final boolean isVisibilityUnchanged() {
            SpecialEffectsController.Operation.State state;
            SpecialEffectsController.Operation.State.Companion companion = SpecialEffectsController.Operation.State.Companion;
            View view = this.operation.getFragment().mView;
            AbstractC3292y.h(view, "operation.fragment.mView");
            SpecialEffectsController.Operation.State asOperationState = companion.asOperationState(view);
            SpecialEffectsController.Operation.State finalState = this.operation.getFinalState();
            if (asOperationState != finalState && (asOperationState == (state = SpecialEffectsController.Operation.State.VISIBLE) || finalState == state)) {
                return false;
            }
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController(ViewGroup container) {
        super(container);
        AbstractC3292y.i(container, "container");
    }

    private final void applyContainerChanges(SpecialEffectsController.Operation operation) {
        View view = operation.getFragment().mView;
        SpecialEffectsController.Operation.State finalState = operation.getFinalState();
        AbstractC3292y.h(view, "view");
        finalState.applyState(view);
    }

    private final void captureTransitioningViews(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (ViewGroupCompat.isTransitionGroup(viewGroup)) {
                if (!arrayList.contains(view)) {
                    arrayList.add(view);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View child = viewGroup.getChildAt(i8);
                if (child.getVisibility() == 0) {
                    AbstractC3292y.h(child, "child");
                    captureTransitioningViews(arrayList, child);
                }
            }
            return;
        }
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeOperations$lambda$2(List awaitingContainerChanges, SpecialEffectsController.Operation operation, DefaultSpecialEffectsController this$0) {
        AbstractC3292y.i(awaitingContainerChanges, "$awaitingContainerChanges");
        AbstractC3292y.i(operation, "$operation");
        AbstractC3292y.i(this$0, "this$0");
        if (awaitingContainerChanges.contains(operation)) {
            awaitingContainerChanges.remove(operation);
            this$0.applyContainerChanges(operation);
        }
    }

    private final void findNamedViews(Map<String, View> map, View view) {
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View child = viewGroup.getChildAt(i8);
                if (child.getVisibility() == 0) {
                    AbstractC3292y.h(child, "child");
                    findNamedViews(map, child);
                }
            }
        }
    }

    private final void retainMatchingViews(ArrayMap<String, View> arrayMap, Collection<String> collection) {
        Set<Map.Entry<String, View>> entries = arrayMap.entrySet();
        AbstractC3292y.h(entries, "entries");
        AbstractC1435t.R(entries, new DefaultSpecialEffectsController$retainMatchingViews$1(collection));
    }

    private final void startAnimations(List<AnimationInfo> list, List<SpecialEffectsController.Operation> list2, boolean z8, Map<SpecialEffectsController.Operation, Boolean> map) {
        final boolean z9;
        Context context = getContainer().getContext();
        ArrayList<AnimationInfo> arrayList = new ArrayList();
        boolean z10 = false;
        for (final AnimationInfo animationInfo : list) {
            if (animationInfo.isVisibilityUnchanged()) {
                animationInfo.completeSpecialEffect();
            } else {
                AbstractC3292y.h(context, "context");
                FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
                if (animation == null) {
                    animationInfo.completeSpecialEffect();
                } else {
                    final Animator animator = animation.animator;
                    if (animator == null) {
                        arrayList.add(animationInfo);
                    } else {
                        final SpecialEffectsController.Operation operation = animationInfo.getOperation();
                        Fragment fragment = operation.getFragment();
                        if (AbstractC3292y.d(map.get(operation), Boolean.TRUE)) {
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(FragmentManager.TAG, "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                            }
                            animationInfo.completeSpecialEffect();
                        } else {
                            if (operation.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z9) {
                                list2.remove(operation);
                            }
                            final View view = fragment.mView;
                            getContainer().startViewTransition(view);
                            animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$startAnimations$1
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationEnd(Animator anim) {
                                    AbstractC3292y.i(anim, "anim");
                                    DefaultSpecialEffectsController.this.getContainer().endViewTransition(view);
                                    if (z9) {
                                        SpecialEffectsController.Operation.State finalState = operation.getFinalState();
                                        View viewToAnimate = view;
                                        AbstractC3292y.h(viewToAnimate, "viewToAnimate");
                                        finalState.applyState(viewToAnimate);
                                    }
                                    animationInfo.completeSpecialEffect();
                                    if (FragmentManager.isLoggingEnabled(2)) {
                                        Log.v(FragmentManager.TAG, "Animator from operation " + operation + " has ended.");
                                    }
                                }
                            });
                            animator.setTarget(view);
                            animator.start();
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(FragmentManager.TAG, "Animator from operation " + operation + " has started.");
                            }
                            animationInfo.getSignal().setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.a
                                @Override // androidx.core.os.CancellationSignal.OnCancelListener
                                public final void onCancel() {
                                    DefaultSpecialEffectsController.startAnimations$lambda$3(animator, operation);
                                }
                            });
                            z10 = true;
                        }
                    }
                }
            }
        }
        for (final AnimationInfo animationInfo2 : arrayList) {
            final SpecialEffectsController.Operation operation2 = animationInfo2.getOperation();
            Fragment fragment2 = operation2.getFragment();
            if (z8) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Transitions.");
                }
                animationInfo2.completeSpecialEffect();
            } else if (z10) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Animators.");
                }
                animationInfo2.completeSpecialEffect();
            } else {
                final View view2 = fragment2.mView;
                AbstractC3292y.h(context, "context");
                FragmentAnim.AnimationOrAnimator animation2 = animationInfo2.getAnimation(context);
                if (animation2 != null) {
                    Animation animation3 = animation2.animation;
                    if (animation3 != null) {
                        if (operation2.getFinalState() != SpecialEffectsController.Operation.State.REMOVED) {
                            view2.startAnimation(animation3);
                            animationInfo2.completeSpecialEffect();
                        } else {
                            getContainer().startViewTransition(view2);
                            FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation3, getContainer(), view2);
                            endViewTransitionAnimation.setAnimationListener(new DefaultSpecialEffectsController$startAnimations$3(operation2, this, view2, animationInfo2));
                            view2.startAnimation(endViewTransitionAnimation);
                            if (FragmentManager.isLoggingEnabled(2)) {
                                Log.v(FragmentManager.TAG, "Animation from operation " + operation2 + " has started.");
                            }
                        }
                        animationInfo2.getSignal().setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.b
                            @Override // androidx.core.os.CancellationSignal.OnCancelListener
                            public final void onCancel() {
                                DefaultSpecialEffectsController.startAnimations$lambda$4(view2, this, animationInfo2, operation2);
                            }
                        });
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimations$lambda$3(Animator animator, SpecialEffectsController.Operation operation) {
        AbstractC3292y.i(operation, "$operation");
        animator.end();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animator from operation " + operation + " has been canceled.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimations$lambda$4(View view, DefaultSpecialEffectsController this$0, AnimationInfo animationInfo, SpecialEffectsController.Operation operation) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(animationInfo, "$animationInfo");
        AbstractC3292y.i(operation, "$operation");
        view.clearAnimation();
        this$0.getContainer().endViewTransition(view);
        animationInfo.completeSpecialEffect();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animation from operation " + operation + " has been cancelled.");
        }
    }

    private final Map<SpecialEffectsController.Operation, Boolean> startTransitions(List<TransitionInfo> list, List<SpecialEffectsController.Operation> list2, boolean z8, final SpecialEffectsController.Operation operation, final SpecialEffectsController.Operation operation2) {
        String str;
        String str2;
        Object obj;
        View view;
        String str3;
        Object obj2;
        Object obj3;
        View view2;
        final ArrayList<View> arrayList;
        LinkedHashMap linkedHashMap;
        View view3;
        Rect rect;
        Q5.r a9;
        FragmentTransitionImpl fragmentTransitionImpl;
        Object obj4;
        View view4;
        final Rect rect2;
        View view5;
        DefaultSpecialEffectsController defaultSpecialEffectsController = this;
        final boolean z9 = z8;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj5 : list) {
            if (!((TransitionInfo) obj5).isVisibilityUnchanged()) {
                arrayList2.add(obj5);
            }
        }
        ArrayList<TransitionInfo> arrayList3 = new ArrayList();
        for (Object obj6 : arrayList2) {
            if (((TransitionInfo) obj6).getHandlingImpl() != null) {
                arrayList3.add(obj6);
            }
        }
        final FragmentTransitionImpl fragmentTransitionImpl2 = null;
        for (TransitionInfo transitionInfo : arrayList3) {
            FragmentTransitionImpl handlingImpl = transitionInfo.getHandlingImpl();
            if (fragmentTransitionImpl2 != null && handlingImpl != fragmentTransitionImpl2) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + transitionInfo.getOperation().getFragment() + " returned Transition " + transitionInfo.getTransition() + " which uses a different Transition type than other Fragments.").toString());
            }
            fragmentTransitionImpl2 = handlingImpl;
        }
        if (fragmentTransitionImpl2 == null) {
            for (TransitionInfo transitionInfo2 : list) {
                linkedHashMap2.put(transitionInfo2.getOperation(), Boolean.FALSE);
                transitionInfo2.completeSpecialEffect();
            }
            return linkedHashMap2;
        }
        View view6 = new View(getContainer().getContext());
        Rect rect3 = new Rect();
        ArrayList<View> arrayList4 = new ArrayList<>();
        ArrayList<View> arrayList5 = new ArrayList<>();
        ArrayMap arrayMap = new ArrayMap();
        Iterator<TransitionInfo> it = list.iterator();
        View view7 = null;
        Object obj7 = null;
        boolean z10 = false;
        while (true) {
            boolean hasNext = it.hasNext();
            str = FragmentManager.TAG;
            if (!hasNext) {
                break;
            }
            TransitionInfo next = it.next();
            if (!next.hasSharedElementTransition() || operation == null || operation2 == null) {
                rect = rect3;
                view6 = view6;
                arrayList5 = arrayList5;
                linkedHashMap2 = linkedHashMap2;
                arrayMap = arrayMap;
                view7 = view7;
                arrayList4 = arrayList4;
            } else {
                Object wrapTransitionInSet = fragmentTransitionImpl2.wrapTransitionInSet(fragmentTransitionImpl2.cloneTransition(next.getSharedElementTransition()));
                ArrayList<String> sharedElementSourceNames = operation2.getFragment().getSharedElementSourceNames();
                AbstractC3292y.h(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementSourceNames2 = operation.getFragment().getSharedElementSourceNames();
                View view8 = view7;
                AbstractC3292y.h(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                ArrayList<String> sharedElementTargetNames = operation.getFragment().getSharedElementTargetNames();
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                AbstractC3292y.h(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                int size = sharedElementTargetNames.size();
                View view9 = view6;
                Rect rect4 = rect3;
                int i8 = 0;
                while (i8 < size) {
                    int i9 = size;
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i8));
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i8));
                    }
                    i8++;
                    size = i9;
                }
                ArrayList<String> sharedElementTargetNames2 = operation2.getFragment().getSharedElementTargetNames();
                AbstractC3292y.h(sharedElementTargetNames2, "lastIn.fragment.sharedElementTargetNames");
                if (!z9) {
                    a9 = x.a(operation.getFragment().getExitTransitionCallback(), operation2.getFragment().getEnterTransitionCallback());
                } else {
                    a9 = x.a(operation.getFragment().getEnterTransitionCallback(), operation2.getFragment().getExitTransitionCallback());
                }
                SharedElementCallback sharedElementCallback = (SharedElementCallback) a9.a();
                SharedElementCallback sharedElementCallback2 = (SharedElementCallback) a9.b();
                int size2 = sharedElementSourceNames.size();
                int i10 = 0;
                while (i10 < size2) {
                    arrayMap.put(sharedElementSourceNames.get(i10), sharedElementTargetNames2.get(i10));
                    i10++;
                    size2 = size2;
                    wrapTransitionInSet = wrapTransitionInSet;
                }
                Object obj8 = wrapTransitionInSet;
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, ">>> entering view names <<<");
                    for (Iterator<String> it2 = sharedElementTargetNames2.iterator(); it2.hasNext(); it2 = it2) {
                        Log.v(FragmentManager.TAG, "Name: " + it2.next());
                    }
                    Log.v(FragmentManager.TAG, ">>> exiting view names <<<");
                    for (Iterator<String> it3 = sharedElementSourceNames.iterator(); it3.hasNext(); it3 = it3) {
                        Log.v(FragmentManager.TAG, "Name: " + it3.next());
                    }
                }
                ArrayMap<String, View> arrayMap2 = new ArrayMap<>();
                View view10 = operation.getFragment().mView;
                AbstractC3292y.h(view10, "firstOut.fragment.mView");
                defaultSpecialEffectsController.findNamedViews(arrayMap2, view10);
                arrayMap2.retainAll(sharedElementSourceNames);
                if (sharedElementCallback != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Executing exit callback for operation " + operation);
                    }
                    sharedElementCallback.onMapSharedElements(sharedElementSourceNames, arrayMap2);
                    int size3 = sharedElementSourceNames.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i11 = size3 - 1;
                            String str4 = sharedElementSourceNames.get(size3);
                            View view11 = arrayMap2.get(str4);
                            if (view11 == null) {
                                arrayMap.remove(str4);
                                fragmentTransitionImpl = fragmentTransitionImpl2;
                            } else {
                                fragmentTransitionImpl = fragmentTransitionImpl2;
                                if (!AbstractC3292y.d(str4, ViewCompat.getTransitionName(view11))) {
                                    arrayMap.put(ViewCompat.getTransitionName(view11), (String) arrayMap.remove(str4));
                                }
                            }
                            if (i11 < 0) {
                                break;
                            }
                            size3 = i11;
                            fragmentTransitionImpl2 = fragmentTransitionImpl;
                        }
                    } else {
                        fragmentTransitionImpl = fragmentTransitionImpl2;
                    }
                } else {
                    fragmentTransitionImpl = fragmentTransitionImpl2;
                    arrayMap.retainAll(arrayMap2.keySet());
                }
                final ArrayMap<String, View> arrayMap3 = new ArrayMap<>();
                View view12 = operation2.getFragment().mView;
                AbstractC3292y.h(view12, "lastIn.fragment.mView");
                defaultSpecialEffectsController.findNamedViews(arrayMap3, view12);
                arrayMap3.retainAll(sharedElementTargetNames2);
                arrayMap3.retainAll(arrayMap.values());
                if (sharedElementCallback2 != null) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Log.v(FragmentManager.TAG, "Executing enter callback for operation " + operation2);
                    }
                    sharedElementCallback2.onMapSharedElements(sharedElementTargetNames2, arrayMap3);
                    int size4 = sharedElementTargetNames2.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i12 = size4 - 1;
                            String name = sharedElementTargetNames2.get(size4);
                            View view13 = arrayMap3.get(name);
                            if (view13 == null) {
                                AbstractC3292y.h(name, "name");
                                String findKeyForValue = FragmentTransition.findKeyForValue(arrayMap, name);
                                if (findKeyForValue != null) {
                                    arrayMap.remove(findKeyForValue);
                                }
                            } else if (!AbstractC3292y.d(name, ViewCompat.getTransitionName(view13))) {
                                AbstractC3292y.h(name, "name");
                                String findKeyForValue2 = FragmentTransition.findKeyForValue(arrayMap, name);
                                if (findKeyForValue2 != null) {
                                    arrayMap.put(findKeyForValue2, ViewCompat.getTransitionName(view13));
                                }
                            }
                            if (i12 < 0) {
                                break;
                            }
                            size4 = i12;
                        }
                    }
                } else {
                    FragmentTransition.retainValues(arrayMap, arrayMap3);
                }
                Collection<String> keySet = arrayMap.keySet();
                AbstractC3292y.h(keySet, "sharedElementNameMapping.keys");
                defaultSpecialEffectsController.retainMatchingViews(arrayMap2, keySet);
                Collection<String> values = arrayMap.values();
                AbstractC3292y.h(values, "sharedElementNameMapping.values");
                defaultSpecialEffectsController.retainMatchingViews(arrayMap3, values);
                if (arrayMap.isEmpty()) {
                    arrayList4.clear();
                    arrayList5.clear();
                    view7 = view8;
                    linkedHashMap2 = linkedHashMap3;
                    view6 = view9;
                    rect3 = rect4;
                    fragmentTransitionImpl2 = fragmentTransitionImpl;
                    obj7 = null;
                } else {
                    FragmentTransition.callSharedElementStartEnd(operation2.getFragment(), operation.getFragment(), z9, arrayMap2, true);
                    OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.startTransitions$lambda$9(SpecialEffectsController.Operation.this, operation, z9, arrayMap3);
                        }
                    });
                    arrayList4.addAll(arrayMap2.values());
                    if (!sharedElementSourceNames.isEmpty()) {
                        view4 = arrayMap2.get(sharedElementSourceNames.get(0));
                        fragmentTransitionImpl2 = fragmentTransitionImpl;
                        obj4 = obj8;
                        fragmentTransitionImpl2.setEpicenter(obj4, view4);
                    } else {
                        fragmentTransitionImpl2 = fragmentTransitionImpl;
                        obj4 = obj8;
                        view4 = view8;
                    }
                    arrayList5.addAll(arrayMap3.values());
                    if (!sharedElementTargetNames2.isEmpty()) {
                        final View view14 = arrayMap3.get(sharedElementTargetNames2.get(0));
                        if (view14 != null) {
                            rect2 = rect4;
                            OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.e
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefaultSpecialEffectsController.startTransitions$lambda$10(FragmentTransitionImpl.this, view14, rect2);
                                }
                            });
                            view5 = view9;
                            z10 = true;
                            fragmentTransitionImpl2.setSharedElementTargets(obj4, view5, arrayList4);
                            Object obj9 = obj4;
                            ArrayList<View> arrayList6 = arrayList5;
                            rect = rect2;
                            fragmentTransitionImpl2.scheduleRemoveTargets(obj4, null, null, null, null, obj9, arrayList6);
                            Boolean bool = Boolean.TRUE;
                            linkedHashMap3.put(operation, bool);
                            linkedHashMap3.put(operation2, bool);
                            view7 = view4;
                            arrayList5 = arrayList6;
                            arrayMap = arrayMap;
                            obj7 = obj9;
                            arrayList4 = arrayList4;
                            view6 = view5;
                            linkedHashMap2 = linkedHashMap3;
                        } else {
                            rect2 = rect4;
                        }
                    } else {
                        rect2 = rect4;
                    }
                    view5 = view9;
                    fragmentTransitionImpl2.setSharedElementTargets(obj4, view5, arrayList4);
                    Object obj92 = obj4;
                    ArrayList<View> arrayList62 = arrayList5;
                    rect = rect2;
                    fragmentTransitionImpl2.scheduleRemoveTargets(obj4, null, null, null, null, obj92, arrayList62);
                    Boolean bool2 = Boolean.TRUE;
                    linkedHashMap3.put(operation, bool2);
                    linkedHashMap3.put(operation2, bool2);
                    view7 = view4;
                    arrayList5 = arrayList62;
                    arrayMap = arrayMap;
                    obj7 = obj92;
                    arrayList4 = arrayList4;
                    view6 = view5;
                    linkedHashMap2 = linkedHashMap3;
                }
            }
            rect3 = rect;
            z9 = z8;
        }
        View view15 = view7;
        ArrayMap arrayMap4 = arrayMap;
        ArrayList<View> arrayList7 = arrayList5;
        ArrayList<View> arrayList8 = arrayList4;
        Rect rect5 = rect3;
        LinkedHashMap linkedHashMap4 = linkedHashMap2;
        View view16 = view6;
        ArrayList arrayList9 = new ArrayList();
        Object obj10 = null;
        Object obj11 = null;
        for (TransitionInfo transitionInfo3 : list) {
            if (transitionInfo3.isVisibilityUnchanged()) {
                linkedHashMap4.put(transitionInfo3.getOperation(), Boolean.FALSE);
                transitionInfo3.completeSpecialEffect();
            } else {
                Object cloneTransition = fragmentTransitionImpl2.cloneTransition(transitionInfo3.getTransition());
                SpecialEffectsController.Operation operation3 = transitionInfo3.getOperation();
                boolean z11 = obj7 != null && (operation3 == operation || operation3 == operation2);
                if (cloneTransition != null) {
                    LinkedHashMap linkedHashMap5 = linkedHashMap4;
                    ArrayList<View> arrayList10 = new ArrayList<>();
                    Object obj12 = obj7;
                    View view17 = operation3.getFragment().mView;
                    String str5 = str;
                    AbstractC3292y.h(view17, "operation.fragment.mView");
                    defaultSpecialEffectsController.captureTransitioningViews(arrayList10, view17);
                    if (z11) {
                        if (operation3 == operation) {
                            arrayList10.removeAll(AbstractC1435t.b1(arrayList8));
                        } else {
                            arrayList10.removeAll(AbstractC1435t.b1(arrayList7));
                        }
                    }
                    if (arrayList10.isEmpty()) {
                        fragmentTransitionImpl2.addTarget(cloneTransition, view16);
                        obj2 = obj10;
                        obj3 = obj11;
                        view = view15;
                        linkedHashMap = linkedHashMap5;
                        obj = obj12;
                        str3 = str5;
                        view2 = view16;
                        arrayList = arrayList10;
                    } else {
                        fragmentTransitionImpl2.addTargets(cloneTransition, arrayList10);
                        obj = obj12;
                        view = view15;
                        str3 = str5;
                        obj2 = obj10;
                        obj3 = obj11;
                        view2 = view16;
                        arrayList = arrayList10;
                        linkedHashMap = linkedHashMap5;
                        fragmentTransitionImpl2.scheduleRemoveTargets(cloneTransition, cloneTransition, arrayList10, null, null, null, null);
                        if (operation3.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            operation3 = operation3;
                            list2.remove(operation3);
                            ArrayList<View> arrayList11 = new ArrayList<>(arrayList);
                            arrayList11.remove(operation3.getFragment().mView);
                            cloneTransition = cloneTransition;
                            fragmentTransitionImpl2.scheduleHideFragmentView(cloneTransition, operation3.getFragment().mView, arrayList11);
                            OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.f
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefaultSpecialEffectsController.startTransitions$lambda$11(arrayList);
                                }
                            });
                        } else {
                            operation3 = operation3;
                            cloneTransition = cloneTransition;
                        }
                    }
                    if (operation3.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList9.addAll(arrayList);
                        if (z10) {
                            fragmentTransitionImpl2.setEpicenter(cloneTransition, rect5);
                        }
                        view3 = view;
                    } else {
                        view3 = view;
                        fragmentTransitionImpl2.setEpicenter(cloneTransition, view3);
                    }
                    linkedHashMap.put(operation3, Boolean.TRUE);
                    if (transitionInfo3.isOverlapAllowed()) {
                        obj11 = fragmentTransitionImpl2.mergeTransitionsTogether(obj3, cloneTransition, null);
                        linkedHashMap4 = linkedHashMap;
                        obj7 = obj;
                        str = str3;
                        obj10 = obj2;
                    } else {
                        obj11 = obj3;
                        obj10 = fragmentTransitionImpl2.mergeTransitionsTogether(obj2, cloneTransition, null);
                        linkedHashMap4 = linkedHashMap;
                        obj7 = obj;
                        str = str3;
                    }
                    defaultSpecialEffectsController = this;
                    View view18 = view2;
                    view15 = view3;
                    view16 = view18;
                } else if (!z11) {
                    linkedHashMap4.put(operation3, Boolean.FALSE);
                    transitionInfo3.completeSpecialEffect();
                }
            }
        }
        String str6 = str;
        LinkedHashMap linkedHashMap6 = linkedHashMap4;
        Object obj13 = obj7;
        Object mergeTransitionsInSequence = fragmentTransitionImpl2.mergeTransitionsInSequence(obj11, obj10, obj13);
        if (mergeTransitionsInSequence == null) {
            return linkedHashMap6;
        }
        ArrayList<TransitionInfo> arrayList12 = new ArrayList();
        for (Object obj14 : list) {
            if (!((TransitionInfo) obj14).isVisibilityUnchanged()) {
                arrayList12.add(obj14);
            }
        }
        for (final TransitionInfo transitionInfo4 : arrayList12) {
            Object transition = transitionInfo4.getTransition();
            final SpecialEffectsController.Operation operation4 = transitionInfo4.getOperation();
            boolean z12 = obj13 != null && (operation4 == operation || operation4 == operation2);
            if (transition == null && !z12) {
                str2 = str6;
            } else if (!ViewCompat.isLaidOut(getContainer())) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    str2 = str6;
                    Log.v(str2, "SpecialEffectsController: Container " + getContainer() + " has not been laid out. Completing operation " + operation4);
                } else {
                    str2 = str6;
                }
                transitionInfo4.completeSpecialEffect();
            } else {
                str2 = str6;
                fragmentTransitionImpl2.setListenerForTransitionEnd(transitionInfo4.getOperation().getFragment(), mergeTransitionsInSequence, transitionInfo4.getSignal(), new Runnable() { // from class: androidx.fragment.app.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultSpecialEffectsController.startTransitions$lambda$14$lambda$13(DefaultSpecialEffectsController.TransitionInfo.this, operation4);
                    }
                });
            }
            str6 = str2;
        }
        String str7 = str6;
        if (!ViewCompat.isLaidOut(getContainer())) {
            return linkedHashMap6;
        }
        FragmentTransition.setViewVisibility(arrayList9, 4);
        ArrayList<String> prepareSetNameOverridesReordered = fragmentTransitionImpl2.prepareSetNameOverridesReordered(arrayList7);
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(str7, ">>>>> Beginning transition <<<<<");
            Log.v(str7, ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator<View> it4 = arrayList8.iterator();
            while (it4.hasNext()) {
                View sharedElementFirstOutViews = it4.next();
                AbstractC3292y.h(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                View view19 = sharedElementFirstOutViews;
                Log.v(str7, "View: " + view19 + " Name: " + ViewCompat.getTransitionName(view19));
            }
            Log.v(str7, ">>>>> SharedElementLastInViews <<<<<");
            Iterator<View> it5 = arrayList7.iterator();
            while (it5.hasNext()) {
                View sharedElementLastInViews = it5.next();
                AbstractC3292y.h(sharedElementLastInViews, "sharedElementLastInViews");
                View view20 = sharedElementLastInViews;
                Log.v(str7, "View: " + view20 + " Name: " + ViewCompat.getTransitionName(view20));
            }
        }
        fragmentTransitionImpl2.beginDelayedTransition(getContainer(), mergeTransitionsInSequence);
        fragmentTransitionImpl2.setNameOverridesReordered(getContainer(), arrayList8, arrayList7, prepareSetNameOverridesReordered, arrayMap4);
        FragmentTransition.setViewVisibility(arrayList9, 0);
        fragmentTransitionImpl2.swapSharedElementTargets(obj13, arrayList8, arrayList7);
        return linkedHashMap6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$10(FragmentTransitionImpl impl, View view, Rect lastInEpicenterRect) {
        AbstractC3292y.i(impl, "$impl");
        AbstractC3292y.i(lastInEpicenterRect, "$lastInEpicenterRect");
        impl.getBoundsOnScreen(view, lastInEpicenterRect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$11(ArrayList transitioningViews) {
        AbstractC3292y.i(transitioningViews, "$transitioningViews");
        FragmentTransition.setViewVisibility(transitioningViews, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$14$lambda$13(TransitionInfo transitionInfo, SpecialEffectsController.Operation operation) {
        AbstractC3292y.i(transitionInfo, "$transitionInfo");
        AbstractC3292y.i(operation, "$operation");
        transitionInfo.completeSpecialEffect();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Transition for operation " + operation + " has completed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$9(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, boolean z8, ArrayMap lastInViews) {
        AbstractC3292y.i(lastInViews, "$lastInViews");
        FragmentTransition.callSharedElementStartEnd(operation.getFragment(), operation2.getFragment(), z8, lastInViews, false);
    }

    private final void syncAnimations(List<? extends SpecialEffectsController.Operation> list) {
        Fragment fragment = ((SpecialEffectsController.Operation) AbstractC1435t.y0(list)).getFragment();
        for (SpecialEffectsController.Operation operation : list) {
            operation.getFragment().mAnimationInfo.mEnterAnim = fragment.mAnimationInfo.mEnterAnim;
            operation.getFragment().mAnimationInfo.mExitAnim = fragment.mAnimationInfo.mExitAnim;
            operation.getFragment().mAnimationInfo.mPopEnterAnim = fragment.mAnimationInfo.mPopEnterAnim;
            operation.getFragment().mAnimationInfo.mPopExitAnim = fragment.mAnimationInfo.mPopExitAnim;
        }
    }

    @Override // androidx.fragment.app.SpecialEffectsController
    public void executeOperations(List<? extends SpecialEffectsController.Operation> operations, boolean z8) {
        SpecialEffectsController.Operation operation;
        Object obj;
        AbstractC3292y.i(operations, "operations");
        Iterator<T> it = operations.iterator();
        while (true) {
            operation = null;
            if (it.hasNext()) {
                obj = it.next();
                SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) obj;
                SpecialEffectsController.Operation.State.Companion companion = SpecialEffectsController.Operation.State.Companion;
                View view = operation2.getFragment().mView;
                AbstractC3292y.h(view, "operation.fragment.mView");
                SpecialEffectsController.Operation.State asOperationState = companion.asOperationState(view);
                SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
                if (asOperationState == state && operation2.getFinalState() != state) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        SpecialEffectsController.Operation operation3 = (SpecialEffectsController.Operation) obj;
        ListIterator<? extends SpecialEffectsController.Operation> listIterator = operations.listIterator(operations.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            SpecialEffectsController.Operation previous = listIterator.previous();
            SpecialEffectsController.Operation operation4 = previous;
            SpecialEffectsController.Operation.State.Companion companion2 = SpecialEffectsController.Operation.State.Companion;
            View view2 = operation4.getFragment().mView;
            AbstractC3292y.h(view2, "operation.fragment.mView");
            SpecialEffectsController.Operation.State asOperationState2 = companion2.asOperationState(view2);
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.VISIBLE;
            if (asOperationState2 != state2 && operation4.getFinalState() == state2) {
                operation = previous;
                break;
            }
        }
        SpecialEffectsController.Operation operation5 = operation;
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Executing operations from " + operation3 + " to " + operation5);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final List<SpecialEffectsController.Operation> Z02 = AbstractC1435t.Z0(operations);
        syncAnimations(operations);
        for (final SpecialEffectsController.Operation operation6 : operations) {
            CancellationSignal cancellationSignal = new CancellationSignal();
            operation6.markStartedSpecialEffect(cancellationSignal);
            arrayList.add(new AnimationInfo(operation6, cancellationSignal, z8));
            CancellationSignal cancellationSignal2 = new CancellationSignal();
            operation6.markStartedSpecialEffect(cancellationSignal2);
            boolean z9 = false;
            if (z8) {
                if (operation6 != operation3) {
                    arrayList2.add(new TransitionInfo(operation6, cancellationSignal2, z8, z9));
                    operation6.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.executeOperations$lambda$2(Z02, operation6, this);
                        }
                    });
                }
                z9 = true;
                arrayList2.add(new TransitionInfo(operation6, cancellationSignal2, z8, z9));
                operation6.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultSpecialEffectsController.executeOperations$lambda$2(Z02, operation6, this);
                    }
                });
            } else {
                if (operation6 != operation5) {
                    arrayList2.add(new TransitionInfo(operation6, cancellationSignal2, z8, z9));
                    operation6.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.executeOperations$lambda$2(Z02, operation6, this);
                        }
                    });
                }
                z9 = true;
                arrayList2.add(new TransitionInfo(operation6, cancellationSignal2, z8, z9));
                operation6.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultSpecialEffectsController.executeOperations$lambda$2(Z02, operation6, this);
                    }
                });
            }
        }
        Map<SpecialEffectsController.Operation, Boolean> startTransitions = startTransitions(arrayList2, Z02, z8, operation3, operation5);
        startAnimations(arrayList, Z02, startTransitions.containsValue(Boolean.TRUE), startTransitions);
        Iterator<SpecialEffectsController.Operation> it2 = Z02.iterator();
        while (it2.hasNext()) {
            applyContainerChanges(it2.next());
        }
        Z02.clear();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Completed executing operations from " + operation3 + " to " + operation5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class TransitionInfo extends SpecialEffectsInfo {
        private final boolean isOverlapAllowed;
        private final Object sharedElementTransition;
        private final Object transition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransitionInfo(SpecialEffectsController.Operation operation, CancellationSignal signal, boolean z8, boolean z9) {
            super(operation, signal);
            Object exitTransition;
            boolean z10;
            Object obj;
            AbstractC3292y.i(operation, "operation");
            AbstractC3292y.i(signal, "signal");
            SpecialEffectsController.Operation.State finalState = operation.getFinalState();
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            if (finalState == state) {
                Fragment fragment = operation.getFragment();
                if (z8) {
                    exitTransition = fragment.getReenterTransition();
                } else {
                    exitTransition = fragment.getEnterTransition();
                }
            } else {
                Fragment fragment2 = operation.getFragment();
                if (z8) {
                    exitTransition = fragment2.getReturnTransition();
                } else {
                    exitTransition = fragment2.getExitTransition();
                }
            }
            this.transition = exitTransition;
            if (operation.getFinalState() == state) {
                if (z8) {
                    z10 = operation.getFragment().getAllowReturnTransitionOverlap();
                } else {
                    z10 = operation.getFragment().getAllowEnterTransitionOverlap();
                }
            } else {
                z10 = true;
            }
            this.isOverlapAllowed = z10;
            if (z9) {
                if (z8) {
                    obj = operation.getFragment().getSharedElementReturnTransition();
                } else {
                    obj = operation.getFragment().getSharedElementEnterTransition();
                }
            } else {
                obj = null;
            }
            this.sharedElementTransition = obj;
        }

        public final FragmentTransitionImpl getHandlingImpl() {
            FragmentTransitionImpl handlingImpl = getHandlingImpl(this.transition);
            FragmentTransitionImpl handlingImpl2 = getHandlingImpl(this.sharedElementTransition);
            if (handlingImpl == null || handlingImpl2 == null || handlingImpl == handlingImpl2) {
                return handlingImpl == null ? handlingImpl2 : handlingImpl;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.transition + " which uses a different Transition  type than its shared element transition " + this.sharedElementTransition).toString());
        }

        public final Object getSharedElementTransition() {
            return this.sharedElementTransition;
        }

        public final Object getTransition() {
            return this.transition;
        }

        public final boolean hasSharedElementTransition() {
            if (this.sharedElementTransition != null) {
                return true;
            }
            return false;
        }

        public final boolean isOverlapAllowed() {
            return this.isOverlapAllowed;
        }

        private final FragmentTransitionImpl getHandlingImpl(Object obj) {
            if (obj == null) {
                return null;
            }
            FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.PLATFORM_IMPL;
            if (fragmentTransitionImpl != null && fragmentTransitionImpl.canHandle(obj)) {
                return fragmentTransitionImpl;
            }
            FragmentTransitionImpl fragmentTransitionImpl2 = FragmentTransition.SUPPORT_IMPL;
            if (fragmentTransitionImpl2 != null && fragmentTransitionImpl2.canHandle(obj)) {
                return fragmentTransitionImpl2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }
    }
}
