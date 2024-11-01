package androidx.leanback.graphics;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.leanback.graphics.BoundsRule;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class CompositeDrawable extends Drawable implements Drawable.Callback {
    boolean mMutated;
    CompositeState mState;

    public CompositeDrawable() {
        this.mMutated = false;
        this.mState = new CompositeState();
    }

    public void addChildDrawable(Drawable drawable) {
        this.mState.mChildren.add(new ChildDrawable(drawable, this));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ArrayList<ChildDrawable> arrayList = this.mState.mChildren;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            arrayList.get(i8).mDrawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable firstNonNullDrawable = getFirstNonNullDrawable();
        if (firstNonNullDrawable != null) {
            return DrawableCompat.getAlpha(firstNonNullDrawable);
        }
        return 255;
    }

    public ChildDrawable getChildAt(int i8) {
        return this.mState.mChildren.get(i8);
    }

    public int getChildCount() {
        return this.mState.mChildren.size();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.mState;
    }

    public Drawable getDrawable(int i8) {
        return this.mState.mChildren.get(i8).mDrawable;
    }

    final Drawable getFirstNonNullDrawable() {
        ArrayList<ChildDrawable> arrayList = this.mState.mChildren;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            Drawable drawable = arrayList.get(i8).mDrawable;
            if (drawable != null) {
                return drawable;
            }
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.mMutated && super.mutate() == this) {
            CompositeState compositeState = new CompositeState(this.mState, this, null);
            this.mState = compositeState;
            ArrayList<ChildDrawable> arrayList = compositeState.mChildren;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                Drawable drawable = arrayList.get(i8).mDrawable;
                if (drawable != null) {
                    drawable.mutate();
                }
            }
            this.mMutated = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        updateBounds(rect);
    }

    public void removeChild(int i8) {
        this.mState.mChildren.remove(i8);
    }

    public void removeDrawable(Drawable drawable) {
        ArrayList<ChildDrawable> arrayList = this.mState.mChildren;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            if (drawable == arrayList.get(i8).mDrawable) {
                arrayList.get(i8).mDrawable.setCallback(null);
                arrayList.remove(i8);
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j8) {
        scheduleSelf(runnable, j8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        ArrayList<ChildDrawable> arrayList = this.mState.mChildren;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            arrayList.get(i9).mDrawable.setAlpha(i8);
        }
    }

    public void setChildDrawableAt(int i8, Drawable drawable) {
        this.mState.mChildren.set(i8, new ChildDrawable(drawable, this));
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        ArrayList<ChildDrawable> arrayList = this.mState.mChildren;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            arrayList.get(i8).mDrawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    void updateBounds(Rect rect) {
        ArrayList<ChildDrawable> arrayList = this.mState.mChildren;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            arrayList.get(i8).updateBounds(rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class CompositeState extends Drawable.ConstantState {
        final ArrayList<ChildDrawable> mChildren;

        CompositeState() {
            this.mChildren = new ArrayList<>();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new CompositeDrawable(this);
        }

        CompositeState(CompositeState compositeState, CompositeDrawable compositeDrawable, Resources resources) {
            int size = compositeState.mChildren.size();
            this.mChildren = new ArrayList<>(size);
            for (int i8 = 0; i8 < size; i8++) {
                this.mChildren.add(new ChildDrawable(compositeState.mChildren.get(i8), compositeDrawable, resources));
            }
        }
    }

    CompositeDrawable(CompositeState compositeState) {
        this.mMutated = false;
        this.mState = compositeState;
    }

    /* loaded from: classes3.dex */
    public static final class ChildDrawable {
        public static final Property<ChildDrawable, Integer> BOTTOM_ABSOLUTE;
        public static final Property<ChildDrawable, Float> BOTTOM_FRACTION;
        public static final Property<ChildDrawable, Integer> LEFT_ABSOLUTE;
        public static final Property<ChildDrawable, Float> LEFT_FRACTION;
        public static final Property<ChildDrawable, Integer> RIGHT_ABSOLUTE;
        public static final Property<ChildDrawable, Float> RIGHT_FRACTION;
        public static final Property<ChildDrawable, Integer> TOP_ABSOLUTE;
        public static final Property<ChildDrawable, Float> TOP_FRACTION;
        private final Rect adjustedBounds;
        private final BoundsRule mBoundsRule;
        final Drawable mDrawable;
        final CompositeDrawable mParent;

        static {
            Class<Integer> cls = Integer.class;
            TOP_ABSOLUTE = new Property<ChildDrawable, Integer>(cls, "absoluteTop") { // from class: androidx.leanback.graphics.CompositeDrawable.ChildDrawable.1
                @Override // android.util.Property
                public Integer get(ChildDrawable childDrawable) {
                    if (childDrawable.getBoundsRule().top == null) {
                        return Integer.valueOf(childDrawable.mParent.getBounds().top);
                    }
                    return Integer.valueOf(childDrawable.getBoundsRule().top.getAbsoluteValue());
                }

                @Override // android.util.Property
                public void set(ChildDrawable childDrawable, Integer num) {
                    if (childDrawable.getBoundsRule().top == null) {
                        childDrawable.getBoundsRule().top = BoundsRule.ValueRule.absoluteValue(num.intValue());
                    } else {
                        childDrawable.getBoundsRule().top.setAbsoluteValue(num.intValue());
                    }
                    childDrawable.recomputeBounds();
                }
            };
            BOTTOM_ABSOLUTE = new Property<ChildDrawable, Integer>(cls, "absoluteBottom") { // from class: androidx.leanback.graphics.CompositeDrawable.ChildDrawable.2
                @Override // android.util.Property
                public Integer get(ChildDrawable childDrawable) {
                    if (childDrawable.getBoundsRule().bottom == null) {
                        return Integer.valueOf(childDrawable.mParent.getBounds().bottom);
                    }
                    return Integer.valueOf(childDrawable.getBoundsRule().bottom.getAbsoluteValue());
                }

                @Override // android.util.Property
                public void set(ChildDrawable childDrawable, Integer num) {
                    if (childDrawable.getBoundsRule().bottom == null) {
                        childDrawable.getBoundsRule().bottom = BoundsRule.ValueRule.absoluteValue(num.intValue());
                    } else {
                        childDrawable.getBoundsRule().bottom.setAbsoluteValue(num.intValue());
                    }
                    childDrawable.recomputeBounds();
                }
            };
            LEFT_ABSOLUTE = new Property<ChildDrawable, Integer>(cls, "absoluteLeft") { // from class: androidx.leanback.graphics.CompositeDrawable.ChildDrawable.3
                @Override // android.util.Property
                public Integer get(ChildDrawable childDrawable) {
                    if (childDrawable.getBoundsRule().left == null) {
                        return Integer.valueOf(childDrawable.mParent.getBounds().left);
                    }
                    return Integer.valueOf(childDrawable.getBoundsRule().left.getAbsoluteValue());
                }

                @Override // android.util.Property
                public void set(ChildDrawable childDrawable, Integer num) {
                    if (childDrawable.getBoundsRule().left == null) {
                        childDrawable.getBoundsRule().left = BoundsRule.ValueRule.absoluteValue(num.intValue());
                    } else {
                        childDrawable.getBoundsRule().left.setAbsoluteValue(num.intValue());
                    }
                    childDrawable.recomputeBounds();
                }
            };
            RIGHT_ABSOLUTE = new Property<ChildDrawable, Integer>(cls, "absoluteRight") { // from class: androidx.leanback.graphics.CompositeDrawable.ChildDrawable.4
                @Override // android.util.Property
                public Integer get(ChildDrawable childDrawable) {
                    if (childDrawable.getBoundsRule().right == null) {
                        return Integer.valueOf(childDrawable.mParent.getBounds().right);
                    }
                    return Integer.valueOf(childDrawable.getBoundsRule().right.getAbsoluteValue());
                }

                @Override // android.util.Property
                public void set(ChildDrawable childDrawable, Integer num) {
                    if (childDrawable.getBoundsRule().right == null) {
                        childDrawable.getBoundsRule().right = BoundsRule.ValueRule.absoluteValue(num.intValue());
                    } else {
                        childDrawable.getBoundsRule().right.setAbsoluteValue(num.intValue());
                    }
                    childDrawable.recomputeBounds();
                }
            };
            Class<Float> cls2 = Float.class;
            TOP_FRACTION = new Property<ChildDrawable, Float>(cls2, "fractionTop") { // from class: androidx.leanback.graphics.CompositeDrawable.ChildDrawable.5
                @Override // android.util.Property
                public Float get(ChildDrawable childDrawable) {
                    if (childDrawable.getBoundsRule().top == null) {
                        return Float.valueOf(0.0f);
                    }
                    return Float.valueOf(childDrawable.getBoundsRule().top.getFraction());
                }

                @Override // android.util.Property
                public void set(ChildDrawable childDrawable, Float f8) {
                    if (childDrawable.getBoundsRule().top == null) {
                        childDrawable.getBoundsRule().top = BoundsRule.ValueRule.inheritFromParent(f8.floatValue());
                    } else {
                        childDrawable.getBoundsRule().top.setFraction(f8.floatValue());
                    }
                    childDrawable.recomputeBounds();
                }
            };
            BOTTOM_FRACTION = new Property<ChildDrawable, Float>(cls2, "fractionBottom") { // from class: androidx.leanback.graphics.CompositeDrawable.ChildDrawable.6
                @Override // android.util.Property
                public Float get(ChildDrawable childDrawable) {
                    if (childDrawable.getBoundsRule().bottom == null) {
                        return Float.valueOf(1.0f);
                    }
                    return Float.valueOf(childDrawable.getBoundsRule().bottom.getFraction());
                }

                @Override // android.util.Property
                public void set(ChildDrawable childDrawable, Float f8) {
                    if (childDrawable.getBoundsRule().bottom == null) {
                        childDrawable.getBoundsRule().bottom = BoundsRule.ValueRule.inheritFromParent(f8.floatValue());
                    } else {
                        childDrawable.getBoundsRule().bottom.setFraction(f8.floatValue());
                    }
                    childDrawable.recomputeBounds();
                }
            };
            LEFT_FRACTION = new Property<ChildDrawable, Float>(cls2, "fractionLeft") { // from class: androidx.leanback.graphics.CompositeDrawable.ChildDrawable.7
                @Override // android.util.Property
                public Float get(ChildDrawable childDrawable) {
                    if (childDrawable.getBoundsRule().left == null) {
                        return Float.valueOf(0.0f);
                    }
                    return Float.valueOf(childDrawable.getBoundsRule().left.getFraction());
                }

                @Override // android.util.Property
                public void set(ChildDrawable childDrawable, Float f8) {
                    if (childDrawable.getBoundsRule().left == null) {
                        childDrawable.getBoundsRule().left = BoundsRule.ValueRule.inheritFromParent(f8.floatValue());
                    } else {
                        childDrawable.getBoundsRule().left.setFraction(f8.floatValue());
                    }
                    childDrawable.recomputeBounds();
                }
            };
            RIGHT_FRACTION = new Property<ChildDrawable, Float>(cls2, "fractionRight") { // from class: androidx.leanback.graphics.CompositeDrawable.ChildDrawable.8
                @Override // android.util.Property
                public Float get(ChildDrawable childDrawable) {
                    if (childDrawable.getBoundsRule().right == null) {
                        return Float.valueOf(1.0f);
                    }
                    return Float.valueOf(childDrawable.getBoundsRule().right.getFraction());
                }

                @Override // android.util.Property
                public void set(ChildDrawable childDrawable, Float f8) {
                    if (childDrawable.getBoundsRule().right == null) {
                        childDrawable.getBoundsRule().right = BoundsRule.ValueRule.inheritFromParent(f8.floatValue());
                    } else {
                        childDrawable.getBoundsRule().right.setFraction(f8.floatValue());
                    }
                    childDrawable.recomputeBounds();
                }
            };
        }

        public ChildDrawable(Drawable drawable, CompositeDrawable compositeDrawable) {
            this.adjustedBounds = new Rect();
            this.mDrawable = drawable;
            this.mParent = compositeDrawable;
            this.mBoundsRule = new BoundsRule();
            drawable.setCallback(compositeDrawable);
        }

        public BoundsRule getBoundsRule() {
            return this.mBoundsRule;
        }

        public Drawable getDrawable() {
            return this.mDrawable;
        }

        public void recomputeBounds() {
            updateBounds(this.mParent.getBounds());
        }

        void updateBounds(Rect rect) {
            this.mBoundsRule.calculateBounds(rect, this.adjustedBounds);
            this.mDrawable.setBounds(this.adjustedBounds);
        }

        ChildDrawable(ChildDrawable childDrawable, CompositeDrawable compositeDrawable, Resources resources) {
            Drawable drawable;
            this.adjustedBounds = new Rect();
            Drawable drawable2 = childDrawable.mDrawable;
            if (drawable2 != null) {
                Drawable.ConstantState constantState = drawable2.getConstantState();
                if (resources != null) {
                    drawable = constantState.newDrawable(resources);
                } else {
                    drawable = constantState.newDrawable();
                }
                drawable.setCallback(compositeDrawable);
                DrawableCompat.setLayoutDirection(drawable, DrawableCompat.getLayoutDirection(drawable2));
                drawable.setBounds(drawable2.getBounds());
                drawable.setLevel(drawable2.getLevel());
            } else {
                drawable = null;
            }
            BoundsRule boundsRule = childDrawable.mBoundsRule;
            if (boundsRule != null) {
                this.mBoundsRule = new BoundsRule(boundsRule);
            } else {
                this.mBoundsRule = new BoundsRule();
            }
            this.mDrawable = drawable;
            this.mParent = compositeDrawable;
        }
    }
}
