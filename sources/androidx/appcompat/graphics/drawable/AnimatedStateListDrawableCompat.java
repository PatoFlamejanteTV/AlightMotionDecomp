package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.graphics.drawable.DrawableContainerCompat;
import androidx.appcompat.graphics.drawable.StateListDrawableCompat;
import androidx.appcompat.resources.Compatibility;
import androidx.appcompat.resources.R;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.util.ObjectsCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class AnimatedStateListDrawableCompat extends StateListDrawableCompat implements TintAwareDrawable {
    private static final String ELEMENT_ITEM = "item";
    private static final String ELEMENT_TRANSITION = "transition";
    private static final String ITEM_MISSING_DRAWABLE_ERROR = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";
    private static final String LOGTAG = "AnimatedStateListDrawableCompat";
    private static final String TRANSITION_MISSING_DRAWABLE_ERROR = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";
    private static final String TRANSITION_MISSING_FROM_TO_ID = ": <transition> tag requires 'fromId' & 'toId' attributes";
    private boolean mMutated;
    private AnimatedStateListState mState;
    private Transition mTransition;
    private int mTransitionFromIndex;
    private int mTransitionToIndex;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class AnimatableTransition extends Transition {
        private final Animatable mA;

        AnimatableTransition(Animatable animatable) {
            super();
            this.mA = animatable;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void start() {
            this.mA.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void stop() {
            this.mA.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class AnimatedStateListState extends StateListDrawableCompat.StateListState {
        private static final long REVERSED_BIT = 4294967296L;
        private static final long REVERSIBLE_FLAG_BIT = 8589934592L;
        SparseArrayCompat<Integer> mStateIds;
        LongSparseArray<Long> mTransitions;

        AnimatedStateListState(@Nullable AnimatedStateListState animatedStateListState, @NonNull AnimatedStateListDrawableCompat animatedStateListDrawableCompat, @Nullable Resources resources) {
            super(animatedStateListState, animatedStateListDrawableCompat, resources);
            if (animatedStateListState != null) {
                this.mTransitions = animatedStateListState.mTransitions;
                this.mStateIds = animatedStateListState.mStateIds;
            } else {
                this.mTransitions = new LongSparseArray<>();
                this.mStateIds = new SparseArrayCompat<>();
            }
        }

        private static long generateTransitionKey(int i8, int i9) {
            return i9 | (i8 << 32);
        }

        int addStateSet(@NonNull int[] iArr, @NonNull Drawable drawable, int i8) {
            int addStateSet = super.addStateSet(iArr, drawable);
            this.mStateIds.put(addStateSet, Integer.valueOf(i8));
            return addStateSet;
        }

        int addTransition(int i8, int i9, @NonNull Drawable drawable, boolean z8) {
            long j8;
            int addChild = super.addChild(drawable);
            long generateTransitionKey = generateTransitionKey(i8, i9);
            if (z8) {
                j8 = REVERSIBLE_FLAG_BIT;
            } else {
                j8 = 0;
            }
            long j9 = addChild;
            this.mTransitions.append(generateTransitionKey, Long.valueOf(j9 | j8));
            if (z8) {
                this.mTransitions.append(generateTransitionKey(i9, i8), Long.valueOf(REVERSED_BIT | j9 | j8));
            }
            return addChild;
        }

        int getKeyframeIdAt(int i8) {
            if (i8 < 0) {
                return 0;
            }
            return this.mStateIds.get(i8, 0).intValue();
        }

        int indexOfKeyframe(@NonNull int[] iArr) {
            int indexOfStateSet = super.indexOfStateSet(iArr);
            if (indexOfStateSet >= 0) {
                return indexOfStateSet;
            }
            return super.indexOfStateSet(StateSet.WILD_CARD);
        }

        int indexOfTransition(int i8, int i9) {
            return (int) this.mTransitions.get(generateTransitionKey(i8, i9), -1L).longValue();
        }

        boolean isTransitionReversed(int i8, int i9) {
            if ((this.mTransitions.get(generateTransitionKey(i8, i9), -1L).longValue() & REVERSED_BIT) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState
        void mutate() {
            this.mTransitions = this.mTransitions.m104clone();
            this.mStateIds = this.mStateIds.m105clone();
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new AnimatedStateListDrawableCompat(this, null);
        }

        boolean transitionHasReversibleFlag(int i8, int i9) {
            if ((this.mTransitions.get(generateTransitionKey(i8, i9), -1L).longValue() & REVERSIBLE_FLAG_BIT) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new AnimatedStateListDrawableCompat(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class AnimatedVectorDrawableTransition extends Transition {
        private final AnimatedVectorDrawableCompat mAvd;

        AnimatedVectorDrawableTransition(AnimatedVectorDrawableCompat animatedVectorDrawableCompat) {
            super();
            this.mAvd = animatedVectorDrawableCompat;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void start() {
            this.mAvd.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void stop() {
            this.mAvd.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class AnimationDrawableTransition extends Transition {
        private final ObjectAnimator mAnim;
        private final boolean mHasReversibleFlag;

        AnimationDrawableTransition(AnimationDrawable animationDrawable, boolean z8, boolean z9) {
            super();
            int i8;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            if (z8) {
                i8 = numberOfFrames - 1;
            } else {
                i8 = 0;
            }
            int i9 = z8 ? 0 : numberOfFrames - 1;
            FrameInterpolator frameInterpolator = new FrameInterpolator(animationDrawable, z8);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i8, i9);
            ofInt.setAutoCancel(true);
            ofInt.setDuration(frameInterpolator.getTotalDuration());
            ofInt.setInterpolator(frameInterpolator);
            this.mHasReversibleFlag = z9;
            this.mAnim = ofInt;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public boolean canReverse() {
            return this.mHasReversibleFlag;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void reverse() {
            this.mAnim.reverse();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void start() {
            this.mAnim.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void stop() {
            this.mAnim.cancel();
        }
    }

    /* loaded from: classes.dex */
    private static class FrameInterpolator implements TimeInterpolator {
        private int[] mFrameTimes;
        private int mFrames;
        private int mTotalDuration;

        FrameInterpolator(AnimationDrawable animationDrawable, boolean z8) {
            updateFrames(animationDrawable, z8);
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            float f9;
            int i8 = (int) ((f8 * this.mTotalDuration) + 0.5f);
            int i9 = this.mFrames;
            int[] iArr = this.mFrameTimes;
            int i10 = 0;
            while (i10 < i9) {
                int i11 = iArr[i10];
                if (i8 < i11) {
                    break;
                }
                i8 -= i11;
                i10++;
            }
            if (i10 < i9) {
                f9 = i8 / this.mTotalDuration;
            } else {
                f9 = 0.0f;
            }
            return (i10 / i9) + f9;
        }

        int getTotalDuration() {
            return this.mTotalDuration;
        }

        int updateFrames(AnimationDrawable animationDrawable, boolean z8) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.mFrames = numberOfFrames;
            int[] iArr = this.mFrameTimes;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.mFrameTimes = new int[numberOfFrames];
            }
            int[] iArr2 = this.mFrameTimes;
            int i8 = 0;
            for (int i9 = 0; i9 < numberOfFrames; i9++) {
                int duration = animationDrawable.getDuration(z8 ? (numberOfFrames - i9) - 1 : i9);
                iArr2[i9] = duration;
                i8 += duration;
            }
            this.mTotalDuration = i8;
            return i8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class Transition {
        private Transition() {
        }

        public boolean canReverse() {
            return false;
        }

        public void reverse() {
        }

        public abstract void start();

        public abstract void stop();
    }

    public AnimatedStateListDrawableCompat() {
        this(null, null);
    }

    @Nullable
    public static AnimatedStateListDrawableCompat create(@NonNull Context context, @DrawableRes int i8, @Nullable Resources.Theme theme) {
        int next;
        try {
            Resources resources = context.getResources();
            XmlResourceParser xml = resources.getXml(i8);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return createFromXmlInner(context, resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e8) {
            Log.e(LOGTAG, "parser error", e8);
            return null;
        } catch (XmlPullParserException e9) {
            Log.e(LOGTAG, "parser error", e9);
            return null;
        }
    }

    @NonNull
    public static AnimatedStateListDrawableCompat createFromXmlInner(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            AnimatedStateListDrawableCompat animatedStateListDrawableCompat = new AnimatedStateListDrawableCompat();
            animatedStateListDrawableCompat.inflate(context, resources, xmlPullParser, attributeSet, theme);
            return animatedStateListDrawableCompat;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void inflateChildElements(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth) {
                        if (xmlPullParser.getName().equals(ELEMENT_ITEM)) {
                            parseItem(context, resources, xmlPullParser, attributeSet, theme);
                        } else if (xmlPullParser.getName().equals(ELEMENT_TRANSITION)) {
                            parseTransition(context, resources, xmlPullParser, attributeSet, theme);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private void init() {
        onStateChange(getState());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:            if (r5 != 2) goto L17;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:            if (r7.getName().equals("vector") == false) goto L16;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:            r5 = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.createFromXmlInner(r6, r7, r8, r9);     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:            r5 = androidx.appcompat.resources.Compatibility.Api21Impl.createFromXmlInner(r6, r7, r8, r9);     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r7.getPositionDescription() + androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.ITEM_MISSING_DRAWABLE_ERROR);     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:            if (r5 == null) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:            return r4.mState.addStateSet(r0, r5, r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r7.getPositionDescription() + androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.ITEM_MISSING_DRAWABLE_ERROR);     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:            if (r5 == null) goto L8;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:            r5 = r7.next();     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:            if (r5 != 4) goto L24;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int parseItem(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull android.content.res.Resources r6, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r7, @androidx.annotation.NonNull android.util.AttributeSet r8, @androidx.annotation.Nullable android.content.res.Resources.Theme r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r4 = this;
            int[] r0 = androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableItem
            android.content.res.TypedArray r0 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r6, r9, r8, r0)
            int r1 = androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableItem_android_id
            r2 = 0
            int r1 = r0.getResourceId(r1, r2)
            int r2 = androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableItem_android_drawable
            r3 = -1
            int r2 = r0.getResourceId(r2, r3)
            if (r2 <= 0) goto L1f
            androidx.appcompat.widget.ResourceManagerInternal r3 = androidx.appcompat.widget.ResourceManagerInternal.get()
            android.graphics.drawable.Drawable r5 = r3.getDrawable(r5, r2)
            goto L20
        L1f:
            r5 = 0
        L20:
            r0.recycle()
            int[] r0 = r4.extractStateSet(r8)
            java.lang.String r2 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r5 != 0) goto L65
        L2b:
            int r5 = r7.next()
            r3 = 4
            if (r5 != r3) goto L33
            goto L2b
        L33:
            r3 = 2
            if (r5 != r3) goto L4c
            java.lang.String r5 = r7.getName()
            java.lang.String r3 = "vector"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L47
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r5 = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.createFromXmlInner(r6, r7, r8, r9)
            goto L65
        L47:
            android.graphics.drawable.Drawable r5 = androidx.appcompat.resources.Compatibility.Api21Impl.createFromXmlInner(r6, r7, r8, r9)
            goto L65
        L4c:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L65:
            if (r5 == 0) goto L6e
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r6 = r4.mState
            int r5 = r6.addStateSet(r0, r5, r1)
            return r5
        L6e:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.parseItem(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:            if (r4 != 2) goto L17;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:            if (r10.getName().equals("animated-vector") == false) goto L16;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:            r4 = androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.createFromXmlInner(r8, r9, r10, r11, r12);     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:            r4 = androidx.appcompat.resources.Compatibility.Api21Impl.createFromXmlInner(r9, r10, r11, r12);     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.TRANSITION_MISSING_DRAWABLE_ERROR);     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:            if (r4 == null) goto L26;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:            if (r1 == (-1)) goto L24;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:            if (r3 == (-1)) goto L24;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:            return r7.mState.addTransition(r1, r3, r4, r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.TRANSITION_MISSING_FROM_TO_ID);     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:            throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.TRANSITION_MISSING_DRAWABLE_ERROR);     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:            if (r4 == null) goto L8;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:            r4 = r10.next();     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:            if (r4 != 4) goto L28;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int parseTransition(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.NonNull android.content.res.Resources r9, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r10, @androidx.annotation.NonNull android.util.AttributeSet r11, @androidx.annotation.Nullable android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r7 = this;
            int[] r0 = androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableTransition
            android.content.res.TypedArray r0 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r9, r12, r11, r0)
            int r1 = androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableTransition_android_fromId
            r2 = -1
            int r1 = r0.getResourceId(r1, r2)
            int r3 = androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableTransition_android_toId
            int r3 = r0.getResourceId(r3, r2)
            int r4 = androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableTransition_android_drawable
            int r4 = r0.getResourceId(r4, r2)
            if (r4 <= 0) goto L24
            androidx.appcompat.widget.ResourceManagerInternal r5 = androidx.appcompat.widget.ResourceManagerInternal.get()
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r8, r4)
            goto L25
        L24:
            r4 = 0
        L25:
            int r5 = androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableTransition_android_reversible
            r6 = 0
            boolean r5 = r0.getBoolean(r5, r6)
            r0.recycle()
            java.lang.String r0 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r4 != 0) goto L6d
        L33:
            int r4 = r10.next()
            r6 = 4
            if (r4 != r6) goto L3b
            goto L33
        L3b:
            r6 = 2
            if (r4 != r6) goto L54
            java.lang.String r4 = r10.getName()
            java.lang.String r6 = "animated-vector"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L4f
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r4 = androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.createFromXmlInner(r8, r9, r10, r11, r12)
            goto L6d
        L4f:
            android.graphics.drawable.Drawable r4 = androidx.appcompat.resources.Compatibility.Api21Impl.createFromXmlInner(r9, r10, r11, r12)
            goto L6d
        L54:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L6d:
            if (r4 == 0) goto L95
            if (r1 == r2) goto L7a
            if (r3 == r2) goto L7a
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$AnimatedStateListState r8 = r7.mState
            int r8 = r8.addTransition(r1, r3, r4, r5)
            return r8
        L7a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            java.lang.String r10 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L95:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.parseTransition(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):int");
    }

    private boolean selectTransition(int i8) {
        int currentIndex;
        int indexOfTransition;
        Transition animatableTransition;
        Transition transition = this.mTransition;
        if (transition != null) {
            if (i8 == this.mTransitionToIndex) {
                return true;
            }
            if (i8 == this.mTransitionFromIndex && transition.canReverse()) {
                transition.reverse();
                this.mTransitionToIndex = this.mTransitionFromIndex;
                this.mTransitionFromIndex = i8;
                return true;
            }
            currentIndex = this.mTransitionToIndex;
            transition.stop();
        } else {
            currentIndex = getCurrentIndex();
        }
        this.mTransition = null;
        this.mTransitionFromIndex = -1;
        this.mTransitionToIndex = -1;
        AnimatedStateListState animatedStateListState = this.mState;
        int keyframeIdAt = animatedStateListState.getKeyframeIdAt(currentIndex);
        int keyframeIdAt2 = animatedStateListState.getKeyframeIdAt(i8);
        if (keyframeIdAt2 == 0 || keyframeIdAt == 0 || (indexOfTransition = animatedStateListState.indexOfTransition(keyframeIdAt, keyframeIdAt2)) < 0) {
            return false;
        }
        boolean transitionHasReversibleFlag = animatedStateListState.transitionHasReversibleFlag(keyframeIdAt, keyframeIdAt2);
        selectDrawable(indexOfTransition);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            animatableTransition = new AnimationDrawableTransition((AnimationDrawable) current, animatedStateListState.isTransitionReversed(keyframeIdAt, keyframeIdAt2), transitionHasReversibleFlag);
        } else if (current instanceof AnimatedVectorDrawableCompat) {
            animatableTransition = new AnimatedVectorDrawableTransition((AnimatedVectorDrawableCompat) current);
        } else {
            if (current instanceof Animatable) {
                animatableTransition = new AnimatableTransition((Animatable) current);
            }
            return false;
        }
        animatableTransition.start();
        this.mTransition = animatableTransition;
        this.mTransitionFromIndex = currentIndex;
        this.mTransitionToIndex = i8;
        return true;
    }

    private void updateStateFromTypedArray(TypedArray typedArray) {
        AnimatedStateListState animatedStateListState = this.mState;
        animatedStateListState.mChangingConfigurations |= Compatibility.Api21Impl.getChangingConfigurations(typedArray);
        animatedStateListState.setVariablePadding(typedArray.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_variablePadding, animatedStateListState.mVariablePadding));
        animatedStateListState.setConstantSize(typedArray.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_constantSize, animatedStateListState.mConstantSize));
        animatedStateListState.setEnterFadeDuration(typedArray.getInt(R.styleable.AnimatedStateListDrawableCompat_android_enterFadeDuration, animatedStateListState.mEnterFadeDuration));
        animatedStateListState.setExitFadeDuration(typedArray.getInt(R.styleable.AnimatedStateListDrawableCompat_android_exitFadeDuration, animatedStateListState.mExitFadeDuration));
        setDither(typedArray.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_dither, animatedStateListState.mDither));
    }

    public void addState(@NonNull int[] iArr, @NonNull Drawable drawable, int i8) {
        ObjectsCompat.requireNonNull(drawable);
        this.mState.addStateSet(iArr, drawable, i8);
        onStateChange(getState());
    }

    public <T extends Drawable & Animatable> void addTransition(int i8, int i9, @NonNull T t8, boolean z8) {
        ObjectsCompat.requireNonNull(t8);
        this.mState.addTransition(i8, i9, t8, z8);
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    void clearMutated() {
        super.clearMutated();
        this.mMutated = false;
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    public void inflate(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, R.styleable.AnimatedStateListDrawableCompat);
        setVisible(obtainAttributes.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_visible, true), true);
        updateStateFromTypedArray(obtainAttributes);
        updateDensity(resources);
        obtainAttributes.recycle();
        inflateChildElements(context, resources, xmlPullParser, attributeSet, theme);
        init();
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        Transition transition = this.mTransition;
        if (transition != null) {
            transition.stop();
            this.mTransition = null;
            selectDrawable(this.mTransitionToIndex);
            this.mTransitionToIndex = -1;
            this.mTransitionFromIndex = -1;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.mMutated && super.mutate() == this) {
            this.mState.mutate();
            this.mMutated = true;
        }
        return this;
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    protected boolean onStateChange(@NonNull int[] iArr) {
        boolean z8;
        int indexOfKeyframe = this.mState.indexOfKeyframe(iArr);
        if (indexOfKeyframe != getCurrentIndex() && (selectTransition(indexOfKeyframe) || selectDrawable(indexOfKeyframe))) {
            z8 = true;
        } else {
            z8 = false;
        }
        Drawable current = getCurrent();
        if (current != null) {
            return z8 | current.setState(iArr);
        }
        return z8;
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    void setConstantState(@NonNull DrawableContainerCompat.DrawableContainerState drawableContainerState) {
        super.setConstantState(drawableContainerState);
        if (drawableContainerState instanceof AnimatedStateListState) {
            this.mState = (AnimatedStateListState) drawableContainerState;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z8, boolean z9) {
        boolean visible = super.setVisible(z8, z9);
        Transition transition = this.mTransition;
        if (transition != null && (visible || z9)) {
            if (z8) {
                transition.start();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    AnimatedStateListDrawableCompat(@Nullable AnimatedStateListState animatedStateListState, @Nullable Resources resources) {
        super(null);
        this.mTransitionToIndex = -1;
        this.mTransitionFromIndex = -1;
        setConstantState(new AnimatedStateListState(animatedStateListState, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    public AnimatedStateListState cloneConstantState() {
        return new AnimatedStateListState(this.mState, this, null);
    }
}
