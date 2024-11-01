package androidx.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class TransitionSet extends Transition {
    private static final int FLAG_CHANGE_EPICENTER = 8;
    private static final int FLAG_CHANGE_INTERPOLATOR = 1;
    private static final int FLAG_CHANGE_PATH_MOTION = 4;
    private static final int FLAG_CHANGE_PROPAGATION = 2;
    public static final int ORDERING_SEQUENTIAL = 1;
    public static final int ORDERING_TOGETHER = 0;
    private int mChangeFlags;
    int mCurrentListeners;
    private boolean mPlayTogether;
    boolean mStarted;
    ArrayList<Transition> mTransitions;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class TransitionSetListener extends TransitionListenerAdapter {
        TransitionSet mTransitionSet;

        TransitionSetListener(TransitionSet transitionSet) {
            this.mTransitionSet = transitionSet;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NonNull Transition transition) {
            TransitionSet transitionSet = this.mTransitionSet;
            int i8 = transitionSet.mCurrentListeners - 1;
            transitionSet.mCurrentListeners = i8;
            if (i8 == 0) {
                transitionSet.mStarted = false;
                transitionSet.end();
            }
            transition.removeListener(this);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionStart(@NonNull Transition transition) {
            TransitionSet transitionSet = this.mTransitionSet;
            if (!transitionSet.mStarted) {
                transitionSet.start();
                this.mTransitionSet.mStarted = true;
            }
        }
    }

    public TransitionSet() {
        this.mTransitions = new ArrayList<>();
        this.mPlayTogether = true;
        this.mStarted = false;
        this.mChangeFlags = 0;
    }

    private void addTransitionInternal(@NonNull Transition transition) {
        this.mTransitions.add(transition);
        transition.mParent = this;
    }

    private int indexOfTransition(long j8) {
        for (int i8 = 1; i8 < this.mTransitions.size(); i8++) {
            if (this.mTransitions.get(i8).mSeekOffsetInParent > j8) {
                return i8 - 1;
            }
        }
        return this.mTransitions.size() - 1;
    }

    private void setupStartEndListeners() {
        TransitionSetListener transitionSetListener = new TransitionSetListener(this);
        Iterator<Transition> it = this.mTransitions.iterator();
        while (it.hasNext()) {
            it.next().addListener(transitionSetListener);
        }
        this.mCurrentListeners = this.mTransitions.size();
    }

    @NonNull
    public TransitionSet addTransition(@NonNull Transition transition) {
        addTransitionInternal(transition);
        long j8 = this.mDuration;
        if (j8 >= 0) {
            transition.setDuration(j8);
        }
        if ((this.mChangeFlags & 1) != 0) {
            transition.setInterpolator(getInterpolator());
        }
        if ((this.mChangeFlags & 2) != 0) {
            transition.setPropagation(getPropagation());
        }
        if ((this.mChangeFlags & 4) != 0) {
            transition.setPathMotion(getPathMotion());
        }
        if ((this.mChangeFlags & 8) != 0) {
            transition.setEpicenterCallback(getEpicenterCallback());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        super.cancel();
        int size = this.mTransitions.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.mTransitions.get(i8).cancel();
        }
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        if (isValidTarget(transitionValues.view)) {
            Iterator<Transition> it = this.mTransitions.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.isValidTarget(transitionValues.view)) {
                    next.captureEndValues(transitionValues);
                    transitionValues.mTargetedTransitions.add(next);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.Transition
    public void capturePropagationValues(TransitionValues transitionValues) {
        super.capturePropagationValues(transitionValues);
        int size = this.mTransitions.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.mTransitions.get(i8).capturePropagationValues(transitionValues);
        }
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        if (isValidTarget(transitionValues.view)) {
            Iterator<Transition> it = this.mTransitions.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.isValidTarget(transitionValues.view)) {
                    next.captureStartValues(transitionValues);
                    transitionValues.mTargetedTransitions.add(next);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.Transition
    public void createAnimators(@NonNull ViewGroup viewGroup, @NonNull TransitionValuesMaps transitionValuesMaps, @NonNull TransitionValuesMaps transitionValuesMaps2, @NonNull ArrayList<TransitionValues> arrayList, @NonNull ArrayList<TransitionValues> arrayList2) {
        long startDelay = getStartDelay();
        int size = this.mTransitions.size();
        for (int i8 = 0; i8 < size; i8++) {
            Transition transition = this.mTransitions.get(i8);
            if (startDelay > 0 && (this.mPlayTogether || i8 == 0)) {
                long startDelay2 = transition.getStartDelay();
                if (startDelay2 > 0) {
                    transition.setStartDelay(startDelay2 + startDelay);
                } else {
                    transition.setStartDelay(startDelay);
                }
            }
            transition.createAnimators(viewGroup, transitionValuesMaps, transitionValuesMaps2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    public Transition excludeTarget(@NonNull View view, boolean z8) {
        for (int i8 = 0; i8 < this.mTransitions.size(); i8++) {
            this.mTransitions.get(i8).excludeTarget(view, z8);
        }
        return super.excludeTarget(view, z8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.mTransitions.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.mTransitions.get(i8).forceToEnd(viewGroup);
        }
    }

    public int getOrdering() {
        return !this.mPlayTogether ? 1 : 0;
    }

    @Nullable
    public Transition getTransitionAt(int i8) {
        if (i8 >= 0 && i8 < this.mTransitions.size()) {
            return this.mTransitions.get(i8);
        }
        return null;
    }

    public int getTransitionCount() {
        return this.mTransitions.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.Transition
    public boolean hasAnimators() {
        for (int i8 = 0; i8 < this.mTransitions.size(); i8++) {
            if (this.mTransitions.get(i8).hasAnimators()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        int size = this.mTransitions.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (!this.mTransitions.get(i8).isSeekingSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void pause(@Nullable View view) {
        super.pause(view);
        int size = this.mTransitions.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.mTransitions.get(i8).pause(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.Transition
    @RequiresApi(34)
    public void prepareAnimatorsForSeeking() {
        this.mTotalDuration = 0L;
        TransitionListenerAdapter transitionListenerAdapter = new TransitionListenerAdapter() { // from class: androidx.transition.TransitionSet.2
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionCancel(@NonNull Transition transition) {
                TransitionSet.this.mTransitions.remove(transition);
                if (!TransitionSet.this.hasAnimators()) {
                    TransitionSet.this.notifyListeners(Transition.TransitionNotification.ON_CANCEL, false);
                    TransitionSet transitionSet = TransitionSet.this;
                    transitionSet.mEnded = true;
                    transitionSet.notifyListeners(Transition.TransitionNotification.ON_END, false);
                }
            }
        };
        for (int i8 = 0; i8 < this.mTransitions.size(); i8++) {
            Transition transition = this.mTransitions.get(i8);
            transition.addListener(transitionListenerAdapter);
            transition.prepareAnimatorsForSeeking();
            long totalDurationMillis = transition.getTotalDurationMillis();
            if (this.mPlayTogether) {
                this.mTotalDuration = Math.max(this.mTotalDuration, totalDurationMillis);
            } else {
                long j8 = this.mTotalDuration;
                transition.mSeekOffsetInParent = j8;
                this.mTotalDuration = j8 + totalDurationMillis;
            }
        }
    }

    @NonNull
    public TransitionSet removeTransition(@NonNull Transition transition) {
        this.mTransitions.remove(transition);
        transition.mParent = null;
        return this;
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void resume(@Nullable View view) {
        super.resume(view);
        int size = this.mTransitions.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.mTransitions.get(i8).resume(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void runAnimators() {
        if (this.mTransitions.isEmpty()) {
            start();
            end();
            return;
        }
        setupStartEndListeners();
        if (!this.mPlayTogether) {
            for (int i8 = 1; i8 < this.mTransitions.size(); i8++) {
                Transition transition = this.mTransitions.get(i8 - 1);
                final Transition transition2 = this.mTransitions.get(i8);
                transition.addListener(new TransitionListenerAdapter() { // from class: androidx.transition.TransitionSet.1
                    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                    public void onTransitionEnd(@NonNull Transition transition3) {
                        transition2.runAnimators();
                        transition3.removeListener(this);
                    }
                });
            }
            Transition transition3 = this.mTransitions.get(0);
            if (transition3 != null) {
                transition3.runAnimators();
                return;
            }
            return;
        }
        Iterator<Transition> it = this.mTransitions.iterator();
        while (it.hasNext()) {
            it.next().runAnimators();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.Transition
    public void setCanRemoveViews(boolean z8) {
        super.setCanRemoveViews(z8);
        int size = this.mTransitions.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.mTransitions.get(i8).setCanRemoveViews(z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.Transition
    @RequiresApi(34)
    public void setCurrentPlayTimeMillis(long j8, long j9) {
        boolean z8;
        long totalDurationMillis = getTotalDurationMillis();
        long j10 = 0;
        if (this.mParent != null) {
            if (j8 >= 0 || j9 >= 0) {
                if (j8 > totalDurationMillis && j9 > totalDurationMillis) {
                    return;
                }
            } else {
                return;
            }
        }
        if (j8 < j9) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((j8 >= 0 && j9 < 0) || (j8 <= totalDurationMillis && j9 > totalDurationMillis)) {
            this.mEnded = false;
            notifyListeners(Transition.TransitionNotification.ON_START, z8);
        }
        if (this.mPlayTogether) {
            for (int i8 = 0; i8 < this.mTransitions.size(); i8++) {
                this.mTransitions.get(i8).setCurrentPlayTimeMillis(j8, j9);
            }
        } else {
            int indexOfTransition = indexOfTransition(j9);
            if (j8 >= j9) {
                while (indexOfTransition < this.mTransitions.size()) {
                    Transition transition = this.mTransitions.get(indexOfTransition);
                    long j11 = transition.mSeekOffsetInParent;
                    long j12 = j8 - j11;
                    if (j12 < j10) {
                        break;
                    }
                    transition.setCurrentPlayTimeMillis(j12, j9 - j11);
                    indexOfTransition++;
                    j10 = 0;
                }
            } else {
                while (indexOfTransition >= 0) {
                    Transition transition2 = this.mTransitions.get(indexOfTransition);
                    long j13 = transition2.mSeekOffsetInParent;
                    long j14 = j8 - j13;
                    transition2.setCurrentPlayTimeMillis(j14, j9 - j13);
                    if (j14 >= 0) {
                        break;
                    } else {
                        indexOfTransition--;
                    }
                }
            }
        }
        if (this.mParent != null) {
            if ((j8 > totalDurationMillis && j9 <= totalDurationMillis) || (j8 < 0 && j9 >= 0)) {
                if (j8 > totalDurationMillis) {
                    this.mEnded = true;
                }
                notifyListeners(Transition.TransitionNotification.ON_END, z8);
            }
        }
    }

    @Override // androidx.transition.Transition
    public void setEpicenterCallback(@Nullable Transition.EpicenterCallback epicenterCallback) {
        super.setEpicenterCallback(epicenterCallback);
        this.mChangeFlags |= 8;
        int size = this.mTransitions.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.mTransitions.get(i8).setEpicenterCallback(epicenterCallback);
        }
    }

    @NonNull
    public TransitionSet setOrdering(int i8) {
        if (i8 != 0) {
            if (i8 == 1) {
                this.mPlayTogether = false;
            } else {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i8);
            }
        } else {
            this.mPlayTogether = true;
        }
        return this;
    }

    @Override // androidx.transition.Transition
    public void setPathMotion(@Nullable PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.mChangeFlags |= 4;
        if (this.mTransitions != null) {
            for (int i8 = 0; i8 < this.mTransitions.size(); i8++) {
                this.mTransitions.get(i8).setPathMotion(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    public void setPropagation(@Nullable TransitionPropagation transitionPropagation) {
        super.setPropagation(transitionPropagation);
        this.mChangeFlags |= 2;
        int size = this.mTransitions.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.mTransitions.get(i8).setPropagation(transitionPropagation);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.Transition
    public String toString(String str) {
        String transition = super.toString(str);
        for (int i8 = 0; i8 < this.mTransitions.size(); i8++) {
            StringBuilder sb = new StringBuilder();
            sb.append(transition);
            sb.append("\n");
            sb.append(this.mTransitions.get(i8).toString(str + "  "));
            transition = sb.toString();
        }
        return transition;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet addListener(@NonNull Transition.TransitionListener transitionListener) {
        return (TransitionSet) super.addListener(transitionListener);
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* renamed from: clone */
    public Transition mo5449clone() {
        TransitionSet transitionSet = (TransitionSet) super.mo5449clone();
        transitionSet.mTransitions = new ArrayList<>();
        int size = this.mTransitions.size();
        for (int i8 = 0; i8 < size; i8++) {
            transitionSet.addTransitionInternal(this.mTransitions.get(i8).mo5449clone());
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet removeListener(@NonNull Transition.TransitionListener transitionListener) {
        return (TransitionSet) super.removeListener(transitionListener);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet setDuration(long j8) {
        ArrayList<Transition> arrayList;
        super.setDuration(j8);
        if (this.mDuration >= 0 && (arrayList = this.mTransitions) != null) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                this.mTransitions.get(i8).setDuration(j8);
            }
        }
        return this;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet setInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.mChangeFlags |= 1;
        ArrayList<Transition> arrayList = this.mTransitions;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                this.mTransitions.get(i8).setInterpolator(timeInterpolator);
            }
        }
        return (TransitionSet) super.setInterpolator(timeInterpolator);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet setStartDelay(long j8) {
        return (TransitionSet) super.setStartDelay(j8);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public /* bridge */ /* synthetic */ Transition addTarget(@NonNull Class cls) {
        return addTarget((Class<?>) cls);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public /* bridge */ /* synthetic */ Transition removeTarget(@NonNull Class cls) {
        return removeTarget((Class<?>) cls);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public Transition excludeTarget(@NonNull String str, boolean z8) {
        for (int i8 = 0; i8 < this.mTransitions.size(); i8++) {
            this.mTransitions.get(i8).excludeTarget(str, z8);
        }
        return super.excludeTarget(str, z8);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet addTarget(@NonNull View view) {
        for (int i8 = 0; i8 < this.mTransitions.size(); i8++) {
            this.mTransitions.get(i8).addTarget(view);
        }
        return (TransitionSet) super.addTarget(view);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet removeTarget(@IdRes int i8) {
        for (int i9 = 0; i9 < this.mTransitions.size(); i9++) {
            this.mTransitions.get(i9).removeTarget(i8);
        }
        return (TransitionSet) super.removeTarget(i8);
    }

    public TransitionSet(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTransitions = new ArrayList<>();
        this.mPlayTogether = true;
        this.mStarted = false;
        this.mChangeFlags = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.TRANSITION_SET);
        setOrdering(TypedArrayUtils.getNamedInt(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.transition.Transition
    @NonNull
    public Transition excludeTarget(int i8, boolean z8) {
        for (int i9 = 0; i9 < this.mTransitions.size(); i9++) {
            this.mTransitions.get(i9).excludeTarget(i8, z8);
        }
        return super.excludeTarget(i8, z8);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet addTarget(@IdRes int i8) {
        for (int i9 = 0; i9 < this.mTransitions.size(); i9++) {
            this.mTransitions.get(i9).addTarget(i8);
        }
        return (TransitionSet) super.addTarget(i8);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet removeTarget(@NonNull View view) {
        for (int i8 = 0; i8 < this.mTransitions.size(); i8++) {
            this.mTransitions.get(i8).removeTarget(view);
        }
        return (TransitionSet) super.removeTarget(view);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public Transition excludeTarget(@NonNull Class<?> cls, boolean z8) {
        for (int i8 = 0; i8 < this.mTransitions.size(); i8++) {
            this.mTransitions.get(i8).excludeTarget(cls, z8);
        }
        return super.excludeTarget(cls, z8);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet addTarget(@NonNull String str) {
        for (int i8 = 0; i8 < this.mTransitions.size(); i8++) {
            this.mTransitions.get(i8).addTarget(str);
        }
        return (TransitionSet) super.addTarget(str);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet removeTarget(@NonNull Class<?> cls) {
        for (int i8 = 0; i8 < this.mTransitions.size(); i8++) {
            this.mTransitions.get(i8).removeTarget(cls);
        }
        return (TransitionSet) super.removeTarget(cls);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet addTarget(@NonNull Class<?> cls) {
        for (int i8 = 0; i8 < this.mTransitions.size(); i8++) {
            this.mTransitions.get(i8).addTarget(cls);
        }
        return (TransitionSet) super.addTarget(cls);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public TransitionSet removeTarget(@NonNull String str) {
        for (int i8 = 0; i8 < this.mTransitions.size(); i8++) {
            this.mTransitions.get(i8).removeTarget(str);
        }
        return (TransitionSet) super.removeTarget(str);
    }
}
