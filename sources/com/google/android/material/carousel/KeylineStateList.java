package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.KeylineState;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class KeylineStateList {
    private static final int NO_INDEX = -1;
    private final KeylineState defaultState;
    private final float endShiftRange;
    private final List<KeylineState> endStateSteps;
    private final float[] endStateStepsInterpolationPoints;
    private final float startShiftRange;
    private final List<KeylineState> startStateSteps;
    private final float[] startStateStepsInterpolationPoints;

    private KeylineStateList(@NonNull KeylineState keylineState, List<KeylineState> list, List<KeylineState> list2) {
        this.defaultState = keylineState;
        this.startStateSteps = DesugarCollections.unmodifiableList(list);
        this.endStateSteps = DesugarCollections.unmodifiableList(list2);
        float f8 = list.get(list.size() - 1).getFirstKeyline().loc - keylineState.getFirstKeyline().loc;
        this.startShiftRange = f8;
        float f9 = keylineState.getLastKeyline().loc - list2.get(list2.size() - 1).getLastKeyline().loc;
        this.endShiftRange = f9;
        this.startStateStepsInterpolationPoints = getStateStepInterpolationPoints(f8, list, true);
        this.endStateStepsInterpolationPoints = getStateStepInterpolationPoints(f9, list2, false);
    }

    private KeylineState closestStateStepFromInterpolation(List<KeylineState> list, float f8, float[] fArr) {
        float[] stateStepsRange = getStateStepsRange(list, f8, fArr);
        if (stateStepsRange[0] >= 0.5f) {
            return list.get((int) stateStepsRange[2]);
        }
        return list.get((int) stateStepsRange[1]);
    }

    private static int findFirstIndexAfterLastFocalKeylineWithMask(KeylineState keylineState, float f8) {
        for (int lastFocalKeylineIndex = keylineState.getLastFocalKeylineIndex(); lastFocalKeylineIndex < keylineState.getKeylines().size(); lastFocalKeylineIndex++) {
            if (f8 == keylineState.getKeylines().get(lastFocalKeylineIndex).mask) {
                return lastFocalKeylineIndex;
            }
        }
        return keylineState.getKeylines().size() - 1;
    }

    private static int findFirstNonAnchorKeylineIndex(KeylineState keylineState) {
        for (int i8 = 0; i8 < keylineState.getKeylines().size(); i8++) {
            if (!keylineState.getKeylines().get(i8).isAnchor) {
                return i8;
            }
        }
        return -1;
    }

    private static int findLastIndexBeforeFirstFocalKeylineWithMask(KeylineState keylineState, float f8) {
        for (int firstFocalKeylineIndex = keylineState.getFirstFocalKeylineIndex() - 1; firstFocalKeylineIndex >= 0; firstFocalKeylineIndex--) {
            if (f8 == keylineState.getKeylines().get(firstFocalKeylineIndex).mask) {
                return firstFocalKeylineIndex;
            }
        }
        return 0;
    }

    private static int findLastNonAnchorKeylineIndex(KeylineState keylineState) {
        for (int size = keylineState.getKeylines().size() - 1; size >= 0; size--) {
            if (!keylineState.getKeylines().get(size).isAnchor) {
                return size;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static KeylineStateList from(Carousel carousel, KeylineState keylineState, float f8, float f9, float f10) {
        return new KeylineStateList(keylineState, getStateStepsStart(carousel, keylineState, f8, f9), getStateStepsEnd(carousel, keylineState, f8, f10));
    }

    private static float[] getStateStepInterpolationPoints(float f8, List<KeylineState> list, boolean z8) {
        float f9;
        float f10;
        int size = list.size();
        float[] fArr = new float[size];
        for (int i8 = 1; i8 < size; i8++) {
            int i9 = i8 - 1;
            KeylineState keylineState = list.get(i9);
            KeylineState keylineState2 = list.get(i8);
            if (z8) {
                f9 = keylineState2.getFirstKeyline().loc - keylineState.getFirstKeyline().loc;
            } else {
                f9 = keylineState.getLastKeyline().loc - keylineState2.getLastKeyline().loc;
            }
            float f11 = f9 / f8;
            if (i8 == size - 1) {
                f10 = 1.0f;
            } else {
                f10 = fArr[i9] + f11;
            }
            fArr[i8] = f10;
        }
        return fArr;
    }

    private static List<KeylineState> getStateStepsEnd(Carousel carousel, KeylineState keylineState, float f8, float f9) {
        int containerHeight;
        int i8;
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineState);
        int findLastNonAnchorKeylineIndex = findLastNonAnchorKeylineIndex(keylineState);
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        } else {
            containerHeight = carousel.getContainerHeight();
        }
        float f10 = containerHeight;
        if (!isLastFocalItemVisibleAtRightOfContainer(carousel, keylineState) && findLastNonAnchorKeylineIndex != -1) {
            int lastFocalKeylineIndex = findLastNonAnchorKeylineIndex - keylineState.getLastFocalKeylineIndex();
            float f11 = keylineState.getFirstKeyline().locOffset - (keylineState.getFirstKeyline().maskedItemSize / 2.0f);
            if (lastFocalKeylineIndex <= 0 && keylineState.getLastFocalKeyline().cutoff > 0.0f) {
                arrayList.add(shiftKeylinesAndCreateKeylineState(keylineState, f11 - keylineState.getLastFocalKeyline().cutoff, f10));
                return arrayList;
            }
            float f12 = 0.0f;
            int i9 = 0;
            while (i9 < lastFocalKeylineIndex) {
                KeylineState keylineState2 = (KeylineState) arrayList.get(arrayList.size() - 1);
                int i10 = findLastNonAnchorKeylineIndex - i9;
                float f13 = f12 + keylineState.getKeylines().get(i10).cutoff;
                int i11 = i10 + 1;
                if (i11 < keylineState.getKeylines().size()) {
                    i8 = findLastIndexBeforeFirstFocalKeylineWithMask(keylineState2, keylineState.getKeylines().get(i11).mask) + 1;
                } else {
                    i8 = 0;
                }
                int i12 = i9;
                KeylineState moveKeylineAndCreateKeylineState = moveKeylineAndCreateKeylineState(keylineState2, findLastNonAnchorKeylineIndex, i8, f11 - f13, keylineState.getFirstFocalKeylineIndex() + i9 + 1, keylineState.getLastFocalKeylineIndex() + i9 + 1, f10);
                if (i12 == lastFocalKeylineIndex - 1 && f9 > 0.0f) {
                    moveKeylineAndCreateKeylineState = shiftKeylineStateForPadding(moveKeylineAndCreateKeylineState, f9, f10, false, f8);
                }
                arrayList.add(moveKeylineAndCreateKeylineState);
                i9 = i12 + 1;
                f12 = f13;
            }
            return arrayList;
        }
        if (f9 > 0.0f) {
            arrayList.add(shiftKeylineStateForPadding(keylineState, f9, f10, false, f8));
        }
        return arrayList;
    }

    private static float[] getStateStepsRange(List<KeylineState> list, float f8, float[] fArr) {
        int size = list.size();
        float f9 = fArr[0];
        int i8 = 1;
        while (i8 < size) {
            float f10 = fArr[i8];
            if (f8 <= f10) {
                return new float[]{AnimationUtils.lerp(0.0f, 1.0f, f9, f10, f8), i8 - 1, i8};
            }
            i8++;
            f9 = f10;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static List<KeylineState> getStateStepsStart(Carousel carousel, KeylineState keylineState, float f8, float f9) {
        int containerHeight;
        int i8;
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineState);
        int findFirstNonAnchorKeylineIndex = findFirstNonAnchorKeylineIndex(keylineState);
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        } else {
            containerHeight = carousel.getContainerHeight();
        }
        float f10 = containerHeight;
        int i9 = 1;
        if (!isFirstFocalItemAtLeftOfContainer(keylineState) && findFirstNonAnchorKeylineIndex != -1) {
            int firstFocalKeylineIndex = keylineState.getFirstFocalKeylineIndex() - findFirstNonAnchorKeylineIndex;
            float f11 = keylineState.getFirstKeyline().locOffset - (keylineState.getFirstKeyline().maskedItemSize / 2.0f);
            if (firstFocalKeylineIndex <= 0 && keylineState.getFirstFocalKeyline().cutoff > 0.0f) {
                arrayList.add(shiftKeylinesAndCreateKeylineState(keylineState, f11 + keylineState.getFirstFocalKeyline().cutoff, f10));
                return arrayList;
            }
            float f12 = 0.0f;
            int i10 = 0;
            while (i10 < firstFocalKeylineIndex) {
                KeylineState keylineState2 = (KeylineState) arrayList.get(arrayList.size() - i9);
                int i11 = findFirstNonAnchorKeylineIndex + i10;
                int size = keylineState.getKeylines().size() - i9;
                float f13 = f12 + keylineState.getKeylines().get(i11).cutoff;
                int i12 = i11 - i9;
                if (i12 >= 0) {
                    i8 = findFirstIndexAfterLastFocalKeylineWithMask(keylineState2, keylineState.getKeylines().get(i12).mask) - i9;
                } else {
                    i8 = size;
                }
                int i13 = i10;
                KeylineState moveKeylineAndCreateKeylineState = moveKeylineAndCreateKeylineState(keylineState2, findFirstNonAnchorKeylineIndex, i8, f11 + f13, (keylineState.getFirstFocalKeylineIndex() - i10) - 1, (keylineState.getLastFocalKeylineIndex() - i10) - 1, f10);
                if (i13 == firstFocalKeylineIndex - 1 && f9 > 0.0f) {
                    moveKeylineAndCreateKeylineState = shiftKeylineStateForPadding(moveKeylineAndCreateKeylineState, f9, f10, true, f8);
                }
                arrayList.add(moveKeylineAndCreateKeylineState);
                i10 = i13 + 1;
                f12 = f13;
                i9 = 1;
            }
            return arrayList;
        }
        if (f9 > 0.0f) {
            arrayList.add(shiftKeylineStateForPadding(keylineState, f9, f10, true, f8));
        }
        return arrayList;
    }

    private static boolean isFirstFocalItemAtLeftOfContainer(KeylineState keylineState) {
        if (keylineState.getFirstFocalKeyline().locOffset - (keylineState.getFirstFocalKeyline().maskedItemSize / 2.0f) >= 0.0f && keylineState.getFirstFocalKeyline() == keylineState.getFirstNonAnchorKeyline()) {
            return true;
        }
        return false;
    }

    private static boolean isLastFocalItemVisibleAtRightOfContainer(Carousel carousel, KeylineState keylineState) {
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        if (keylineState.getLastFocalKeyline().locOffset + (keylineState.getLastFocalKeyline().maskedItemSize / 2.0f) <= containerHeight && keylineState.getLastFocalKeyline() == keylineState.getLastNonAnchorKeyline()) {
            return true;
        }
        return false;
    }

    private static KeylineState lerp(List<KeylineState> list, float f8, float[] fArr) {
        float[] stateStepsRange = getStateStepsRange(list, f8, fArr);
        return KeylineState.lerp(list.get((int) stateStepsRange[1]), list.get((int) stateStepsRange[2]), stateStepsRange[0]);
    }

    private static KeylineState moveKeylineAndCreateKeylineState(KeylineState keylineState, int i8, int i9, float f8, int i10, int i11, float f9) {
        boolean z8;
        ArrayList arrayList = new ArrayList(keylineState.getKeylines());
        arrayList.add(i9, (KeylineState.Keyline) arrayList.remove(i8));
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.getItemSize(), f9);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i12);
            float f10 = keyline.maskedItemSize;
            float f11 = f8 + (f10 / 2.0f);
            if (i12 >= i10 && i12 <= i11) {
                z8 = true;
            } else {
                z8 = false;
            }
            builder.addKeyline(f11, keyline.mask, f10, z8, keyline.isAnchor, keyline.cutoff);
            f8 += keyline.maskedItemSize;
        }
        return builder.build();
    }

    private static KeylineState shiftKeylineStateForPadding(KeylineState keylineState, float f8, float f9, boolean z8, float f10) {
        float f11;
        boolean z9;
        float f12;
        float f13;
        ArrayList arrayList = new ArrayList(keylineState.getKeylines());
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.getItemSize(), f9);
        float numberOfNonAnchorKeylines = f8 / keylineState.getNumberOfNonAnchorKeylines();
        if (z8) {
            f11 = f8;
        } else {
            f11 = 0.0f;
        }
        float f14 = f11;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i8);
            if (keyline.isAnchor) {
                builder.addKeyline(keyline.locOffset, keyline.mask, keyline.maskedItemSize, false, true, keyline.cutoff);
            } else {
                if (i8 >= keylineState.getFirstFocalKeylineIndex() && i8 <= keylineState.getLastFocalKeylineIndex()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                float f15 = keyline.maskedItemSize - numberOfNonAnchorKeylines;
                float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(f15, keylineState.getItemSize(), f10);
                float f16 = (f15 / 2.0f) + f14;
                float f17 = f16 - keyline.locOffset;
                float f18 = keyline.cutoff;
                if (z8) {
                    f12 = f17;
                } else {
                    f12 = 0.0f;
                }
                if (z8) {
                    f13 = 0.0f;
                } else {
                    f13 = f17;
                }
                builder.addKeyline(f16, childMaskPercentage, f15, z9, false, f18, f12, f13);
                f14 += f15;
            }
        }
        return builder.build();
    }

    private static KeylineState shiftKeylinesAndCreateKeylineState(KeylineState keylineState, float f8, float f9) {
        return moveKeylineAndCreateKeylineState(keylineState, 0, 0, f8, keylineState.getFirstFocalKeylineIndex(), keylineState.getLastFocalKeylineIndex(), f9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public KeylineState getDefaultState() {
        return this.defaultState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public KeylineState getEndState() {
        return this.endStateSteps.get(r0.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<Integer, KeylineState> getKeylineStateForPositionMap(int i8, int i9, int i10, boolean z8) {
        int i11;
        int i12;
        int i13;
        float itemSize = this.defaultState.getItemSize();
        HashMap hashMap = new HashMap();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int i16 = -1;
            if (i14 >= i8) {
                break;
            }
            if (z8) {
                i13 = (i8 - i14) - 1;
            } else {
                i13 = i14;
            }
            float f8 = i13 * itemSize;
            if (!z8) {
                i16 = 1;
            }
            if (f8 * i16 > i10 - this.endShiftRange || i14 >= i8 - this.endStateSteps.size()) {
                Integer valueOf = Integer.valueOf(i13);
                List<KeylineState> list = this.endStateSteps;
                hashMap.put(valueOf, list.get(MathUtils.clamp(i15, 0, list.size() - 1)));
                i15++;
            }
            i14++;
        }
        int i17 = 0;
        for (int i18 = i8 - 1; i18 >= 0; i18--) {
            if (z8) {
                i11 = (i8 - i18) - 1;
            } else {
                i11 = i18;
            }
            float f9 = i11 * itemSize;
            if (z8) {
                i12 = -1;
            } else {
                i12 = 1;
            }
            if (f9 * i12 < i9 + this.startShiftRange || i18 < this.startStateSteps.size()) {
                Integer valueOf2 = Integer.valueOf(i11);
                List<KeylineState> list2 = this.startStateSteps;
                hashMap.put(valueOf2, list2.get(MathUtils.clamp(i17, 0, list2.size() - 1)));
                i17++;
            }
        }
        return hashMap;
    }

    public KeylineState getShiftedState(float f8, float f9, float f10) {
        return getShiftedState(f8, f9, f10, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public KeylineState getStartState() {
        return this.startStateSteps.get(r0.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public KeylineState getShiftedState(float f8, float f9, float f10, boolean z8) {
        float lerp;
        List<KeylineState> list;
        float[] fArr;
        float f11 = this.startShiftRange + f9;
        float f12 = f10 - this.endShiftRange;
        float f13 = getStartState().getFirstFocalKeyline().leftOrTopPaddingShift;
        float f14 = getEndState().getLastFocalKeyline().rightOrBottomPaddingShift;
        if (this.startShiftRange == f13) {
            f11 += f13;
        }
        if (this.endShiftRange == f14) {
            f12 -= f14;
        }
        if (f8 < f11) {
            lerp = AnimationUtils.lerp(1.0f, 0.0f, f9, f11, f8);
            list = this.startStateSteps;
            fArr = this.startStateStepsInterpolationPoints;
        } else if (f8 > f12) {
            lerp = AnimationUtils.lerp(0.0f, 1.0f, f12, f10, f8);
            list = this.endStateSteps;
            fArr = this.endStateStepsInterpolationPoints;
        } else {
            return this.defaultState;
        }
        if (z8) {
            return closestStateStepFromInterpolation(list, lerp, fArr);
        }
        return lerp(list, lerp, fArr);
    }
}
