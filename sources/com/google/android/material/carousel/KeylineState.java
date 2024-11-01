package com.google.android.material.carousel;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.animation.AnimationUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class KeylineState {
    private final int firstFocalKeylineIndex;
    private final float itemSize;
    private final List<Keyline> keylines;
    private final int lastFocalKeylineIndex;

    /* loaded from: classes3.dex */
    static final class Builder {
        private static final int NO_INDEX = -1;
        private static final float UNKNOWN_LOC = Float.MIN_VALUE;
        private final float availableSpace;
        private final float itemSize;
        private Keyline tmpFirstFocalKeyline;
        private Keyline tmpLastFocalKeyline;
        private final List<Keyline> tmpKeylines = new ArrayList();
        private int firstFocalKeylineIndex = -1;
        private int lastFocalKeylineIndex = -1;
        private float lastKeylineMaskedSize = 0.0f;
        private int latestAnchorKeylineIndex = -1;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder(float f8, float f9) {
            this.itemSize = f8;
            this.availableSpace = f9;
        }

        private static float calculateKeylineLocationForItemPosition(float f8, float f9, int i8, int i9) {
            return (f8 - (i8 * f9)) + (i9 * f9);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @NonNull
        public Builder addAnchorKeyline(float f8, @FloatRange(from = 0.0d, to = 1.0d) float f9, float f10) {
            return addKeyline(f8, f9, f10, false, true);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @NonNull
        public Builder addKeyline(float f8, @FloatRange(from = 0.0d, to = 1.0d) float f9, float f10, boolean z8) {
            return addKeyline(f8, f9, f10, z8, false);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @NonNull
        public Builder addKeylineRange(float f8, @FloatRange(from = 0.0d, to = 1.0d) float f9, float f10, int i8) {
            return addKeylineRange(f8, f9, f10, i8, false);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @NonNull
        public KeylineState build() {
            if (this.tmpFirstFocalKeyline != null) {
                ArrayList arrayList = new ArrayList();
                for (int i8 = 0; i8 < this.tmpKeylines.size(); i8++) {
                    Keyline keyline = this.tmpKeylines.get(i8);
                    arrayList.add(new Keyline(calculateKeylineLocationForItemPosition(this.tmpFirstFocalKeyline.locOffset, this.itemSize, this.firstFocalKeylineIndex, i8), keyline.locOffset, keyline.mask, keyline.maskedItemSize, keyline.isAnchor, keyline.cutoff, keyline.leftOrTopPaddingShift, keyline.rightOrBottomPaddingShift));
                }
                return new KeylineState(this.itemSize, arrayList, this.firstFocalKeylineIndex, this.lastFocalKeylineIndex);
            }
            throw new IllegalStateException("There must be a keyline marked as focal.");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @NonNull
        public Builder addKeyline(float f8, @FloatRange(from = 0.0d, to = 1.0d) float f9, float f10) {
            return addKeyline(f8, f9, f10, false);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @NonNull
        public Builder addKeylineRange(float f8, @FloatRange(from = 0.0d, to = 1.0d) float f9, float f10, int i8, boolean z8) {
            if (i8 > 0 && f10 > 0.0f) {
                for (int i9 = 0; i9 < i8; i9++) {
                    addKeyline((i9 * f10) + f8, f9, f10, z8);
                }
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @NonNull
        public Builder addKeyline(float f8, @FloatRange(from = 0.0d, to = 1.0d) float f9, float f10, boolean z8, boolean z9, float f11, float f12, float f13) {
            if (f10 <= 0.0f) {
                return this;
            }
            if (z9) {
                if (!z8) {
                    int i8 = this.latestAnchorKeylineIndex;
                    if (i8 != -1 && i8 != 0) {
                        throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                    }
                    this.latestAnchorKeylineIndex = this.tmpKeylines.size();
                } else {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
            }
            Keyline keyline = new Keyline(Float.MIN_VALUE, f8, f9, f10, z9, f11, f12, f13);
            if (z8) {
                if (this.tmpFirstFocalKeyline == null) {
                    this.tmpFirstFocalKeyline = keyline;
                    this.firstFocalKeylineIndex = this.tmpKeylines.size();
                }
                if (this.lastFocalKeylineIndex != -1 && this.tmpKeylines.size() - this.lastFocalKeylineIndex > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f10 == this.tmpFirstFocalKeyline.maskedItemSize) {
                    this.tmpLastFocalKeyline = keyline;
                    this.lastFocalKeylineIndex = this.tmpKeylines.size();
                } else {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
            } else {
                if (this.tmpFirstFocalKeyline == null && keyline.maskedItemSize < this.lastKeylineMaskedSize) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.tmpLastFocalKeyline != null && keyline.maskedItemSize > this.lastKeylineMaskedSize) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.lastKeylineMaskedSize = keyline.maskedItemSize;
            this.tmpKeylines.add(keyline);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @NonNull
        public Builder addKeyline(float f8, @FloatRange(from = 0.0d, to = 1.0d) float f9, float f10, boolean z8, boolean z9, float f11) {
            return addKeyline(f8, f9, f10, z8, z9, f11, 0.0f, 0.0f);
        }

        @NonNull
        Builder addKeyline(float f8, @FloatRange(from = 0.0d, to = 1.0d) float f9, float f10, boolean z8, boolean z9) {
            float f11;
            float abs;
            float f12 = f10 / 2.0f;
            float f13 = f8 - f12;
            float f14 = f12 + f8;
            float f15 = this.availableSpace;
            if (f14 > f15) {
                abs = Math.abs(f14 - Math.max(f14 - f10, f15));
            } else if (f13 < 0.0f) {
                abs = Math.abs(f13 - Math.min(f13 + f10, 0.0f));
            } else {
                f11 = 0.0f;
                return addKeyline(f8, f9, f10, z8, z9, f11);
            }
            f11 = abs;
            return addKeyline(f8, f9, f10, z8, z9, f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class Keyline {
        final float cutoff;
        final boolean isAnchor;
        final float leftOrTopPaddingShift;
        final float loc;
        final float locOffset;
        final float mask;
        final float maskedItemSize;
        final float rightOrBottomPaddingShift;

        Keyline(float f8, float f9, float f10, float f11) {
            this(f8, f9, f10, f11, false, 0.0f, 0.0f, 0.0f);
        }

        static Keyline lerp(Keyline keyline, Keyline keyline2, @FloatRange(from = 0.0d, to = 1.0d) float f8) {
            return new Keyline(AnimationUtils.lerp(keyline.loc, keyline2.loc, f8), AnimationUtils.lerp(keyline.locOffset, keyline2.locOffset, f8), AnimationUtils.lerp(keyline.mask, keyline2.mask, f8), AnimationUtils.lerp(keyline.maskedItemSize, keyline2.maskedItemSize, f8));
        }

        Keyline(float f8, float f9, float f10, float f11, boolean z8, float f12, float f13, float f14) {
            this.loc = f8;
            this.locOffset = f9;
            this.mask = f10;
            this.maskedItemSize = f11;
            this.isAnchor = z8;
            this.cutoff = f12;
            this.leftOrTopPaddingShift = f13;
            this.rightOrBottomPaddingShift = f14;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static KeylineState lerp(KeylineState keylineState, KeylineState keylineState2, float f8) {
        if (keylineState.getItemSize() == keylineState2.getItemSize()) {
            List<Keyline> keylines = keylineState.getKeylines();
            List<Keyline> keylines2 = keylineState2.getKeylines();
            if (keylines.size() == keylines2.size()) {
                ArrayList arrayList = new ArrayList();
                for (int i8 = 0; i8 < keylineState.getKeylines().size(); i8++) {
                    arrayList.add(Keyline.lerp(keylines.get(i8), keylines2.get(i8), f8));
                }
                return new KeylineState(keylineState.getItemSize(), arrayList, AnimationUtils.lerp(keylineState.getFirstFocalKeylineIndex(), keylineState2.getFirstFocalKeylineIndex(), f8), AnimationUtils.lerp(keylineState.getLastFocalKeylineIndex(), keylineState2.getLastFocalKeylineIndex(), f8));
            }
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static KeylineState reverse(KeylineState keylineState, float f8) {
        boolean z8;
        Builder builder = new Builder(keylineState.getItemSize(), f8);
        float f9 = (f8 - keylineState.getLastKeyline().locOffset) - (keylineState.getLastKeyline().maskedItemSize / 2.0f);
        for (int size = keylineState.getKeylines().size() - 1; size >= 0; size--) {
            Keyline keyline = keylineState.getKeylines().get(size);
            float f10 = f9 + (keyline.maskedItemSize / 2.0f);
            if (size >= keylineState.getFirstFocalKeylineIndex() && size <= keylineState.getLastFocalKeylineIndex()) {
                z8 = true;
            } else {
                z8 = false;
            }
            builder.addKeyline(f10, keyline.mask, keyline.maskedItemSize, z8, keyline.isAnchor);
            f9 += keyline.maskedItemSize;
        }
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Keyline getFirstFocalKeyline() {
        return this.keylines.get(this.firstFocalKeylineIndex);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getFirstFocalKeylineIndex() {
        return this.firstFocalKeylineIndex;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Keyline getFirstKeyline() {
        return this.keylines.get(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public Keyline getFirstNonAnchorKeyline() {
        for (int i8 = 0; i8 < this.keylines.size(); i8++) {
            Keyline keyline = this.keylines.get(i8);
            if (!keyline.isAnchor) {
                return keyline;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Keyline> getFocalKeylines() {
        return this.keylines.subList(this.firstFocalKeylineIndex, this.lastFocalKeylineIndex + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getItemSize() {
        return this.itemSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Keyline> getKeylines() {
        return this.keylines;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Keyline getLastFocalKeyline() {
        return this.keylines.get(this.lastFocalKeylineIndex);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getLastFocalKeylineIndex() {
        return this.lastFocalKeylineIndex;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Keyline getLastKeyline() {
        return this.keylines.get(r0.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public Keyline getLastNonAnchorKeyline() {
        for (int size = this.keylines.size() - 1; size >= 0; size--) {
            Keyline keyline = this.keylines.get(size);
            if (!keyline.isAnchor) {
                return keyline;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getNumberOfNonAnchorKeylines() {
        Iterator<Keyline> it = this.keylines.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (it.next().isAnchor) {
                i8++;
            }
        }
        return this.keylines.size() - i8;
    }

    private KeylineState(float f8, List<Keyline> list, int i8, int i9) {
        this.itemSize = f8;
        this.keylines = DesugarCollections.unmodifiableList(list);
        this.firstFocalKeylineIndex = i8;
        this.lastFocalKeylineIndex = i9;
    }
}
