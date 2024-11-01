package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.Insets;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import j$.util.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class WindowInsetsCompat {

    @NonNull
    public static final WindowInsetsCompat CONSUMED;
    private static final String TAG = "WindowInsetsCompat";
    private final Impl mImpl;

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(21)
    @SuppressLint({"SoonBlockedPrivateApi"})
    /* loaded from: classes3.dex */
    public static class Api21ReflectionHolder {
        private static Field sContentInsets;
        private static boolean sReflectionSucceeded;
        private static Field sStableInsets;
        private static Field sViewAttachInfoField;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                sViewAttachInfoField = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                sStableInsets = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                sContentInsets = declaredField3;
                declaredField3.setAccessible(true);
                sReflectionSucceeded = true;
            } catch (ReflectiveOperationException e8) {
                Log.w(WindowInsetsCompat.TAG, "Failed to get visible insets from AttachInfo " + e8.getMessage(), e8);
            }
        }

        private Api21ReflectionHolder() {
        }

        @Nullable
        public static WindowInsetsCompat getRootWindowInsets(@NonNull View view) {
            if (sReflectionSucceeded && view.isAttachedToWindow()) {
                try {
                    Object obj = sViewAttachInfoField.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) sStableInsets.get(obj);
                        Rect rect2 = (Rect) sContentInsets.get(obj);
                        if (rect != null && rect2 != null) {
                            WindowInsetsCompat build = new Builder().setStableInsets(Insets.of(rect)).setSystemWindowInsets(Insets.of(rect2)).build();
                            build.setRootWindowInsets(build);
                            build.copyRootViewBounds(view.getRootView());
                            return build;
                        }
                    }
                } catch (IllegalAccessException e8) {
                    Log.w(WindowInsetsCompat.TAG, "Failed to get insets from AttachInfo. " + e8.getMessage(), e8);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class BuilderImpl {
        private final WindowInsetsCompat mInsets;
        Insets[] mInsetsTypeMask;

        BuilderImpl() {
            this(new WindowInsetsCompat((WindowInsetsCompat) null));
        }

        protected final void applyInsetTypes() {
            Insets[] insetsArr = this.mInsetsTypeMask;
            if (insetsArr != null) {
                Insets insets = insetsArr[Type.indexOf(1)];
                Insets insets2 = this.mInsetsTypeMask[Type.indexOf(2)];
                if (insets2 == null) {
                    insets2 = this.mInsets.getInsets(2);
                }
                if (insets == null) {
                    insets = this.mInsets.getInsets(1);
                }
                setSystemWindowInsets(Insets.max(insets, insets2));
                Insets insets3 = this.mInsetsTypeMask[Type.indexOf(16)];
                if (insets3 != null) {
                    setSystemGestureInsets(insets3);
                }
                Insets insets4 = this.mInsetsTypeMask[Type.indexOf(32)];
                if (insets4 != null) {
                    setMandatorySystemGestureInsets(insets4);
                }
                Insets insets5 = this.mInsetsTypeMask[Type.indexOf(64)];
                if (insets5 != null) {
                    setTappableElementInsets(insets5);
                }
            }
        }

        @NonNull
        WindowInsetsCompat build() {
            applyInsetTypes();
            return this.mInsets;
        }

        void setDisplayCutout(@Nullable DisplayCutoutCompat displayCutoutCompat) {
        }

        void setInsets(int i8, @NonNull Insets insets) {
            if (this.mInsetsTypeMask == null) {
                this.mInsetsTypeMask = new Insets[9];
            }
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i8 & i9) != 0) {
                    this.mInsetsTypeMask[Type.indexOf(i9)] = insets;
                }
            }
        }

        void setInsetsIgnoringVisibility(int i8, @NonNull Insets insets) {
            if (i8 != 8) {
            } else {
                throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
            }
        }

        void setMandatorySystemGestureInsets(@NonNull Insets insets) {
        }

        void setStableInsets(@NonNull Insets insets) {
        }

        void setSystemGestureInsets(@NonNull Insets insets) {
        }

        void setSystemWindowInsets(@NonNull Insets insets) {
        }

        void setTappableElementInsets(@NonNull Insets insets) {
        }

        void setVisible(int i8, boolean z8) {
        }

        BuilderImpl(@NonNull WindowInsetsCompat windowInsetsCompat) {
            this.mInsets = windowInsetsCompat;
        }
    }

    @RequiresApi(30)
    /* loaded from: classes3.dex */
    private static class BuilderImpl30 extends BuilderImpl29 {
        BuilderImpl30() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setInsets(int i8, @NonNull Insets insets) {
            this.mPlatBuilder.setInsets(TypeImpl30.toPlatformType(i8), insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setInsetsIgnoringVisibility(int i8, @NonNull Insets insets) {
            this.mPlatBuilder.setInsetsIgnoringVisibility(TypeImpl30.toPlatformType(i8), insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setVisible(int i8, boolean z8) {
            this.mPlatBuilder.setVisible(TypeImpl30.toPlatformType(i8), z8);
        }

        BuilderImpl30(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class Impl {

        @NonNull
        static final WindowInsetsCompat CONSUMED = new Builder().build().consumeDisplayCutout().consumeStableInsets().consumeSystemWindowInsets();
        final WindowInsetsCompat mHost;

        Impl(@NonNull WindowInsetsCompat windowInsetsCompat) {
            this.mHost = windowInsetsCompat;
        }

        @NonNull
        WindowInsetsCompat consumeDisplayCutout() {
            return this.mHost;
        }

        @NonNull
        WindowInsetsCompat consumeStableInsets() {
            return this.mHost;
        }

        @NonNull
        WindowInsetsCompat consumeSystemWindowInsets() {
            return this.mHost;
        }

        void copyRootViewBounds(@NonNull View view) {
        }

        void copyWindowDataInto(@NonNull WindowInsetsCompat windowInsetsCompat) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impl)) {
                return false;
            }
            Impl impl = (Impl) obj;
            if (isRound() == impl.isRound() && isConsumed() == impl.isConsumed() && ObjectsCompat.equals(getSystemWindowInsets(), impl.getSystemWindowInsets()) && ObjectsCompat.equals(getStableInsets(), impl.getStableInsets()) && ObjectsCompat.equals(getDisplayCutout(), impl.getDisplayCutout())) {
                return true;
            }
            return false;
        }

        @Nullable
        DisplayCutoutCompat getDisplayCutout() {
            return null;
        }

        @NonNull
        Insets getInsets(int i8) {
            return Insets.NONE;
        }

        @NonNull
        Insets getInsetsIgnoringVisibility(int i8) {
            if ((i8 & 8) == 0) {
                return Insets.NONE;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        @NonNull
        Insets getMandatorySystemGestureInsets() {
            return getSystemWindowInsets();
        }

        @NonNull
        Insets getStableInsets() {
            return Insets.NONE;
        }

        @NonNull
        Insets getSystemGestureInsets() {
            return getSystemWindowInsets();
        }

        @NonNull
        Insets getSystemWindowInsets() {
            return Insets.NONE;
        }

        @NonNull
        Insets getTappableElementInsets() {
            return getSystemWindowInsets();
        }

        public int hashCode() {
            return ObjectsCompat.hash(Boolean.valueOf(isRound()), Boolean.valueOf(isConsumed()), getSystemWindowInsets(), getStableInsets(), getDisplayCutout());
        }

        @NonNull
        WindowInsetsCompat inset(int i8, int i9, int i10, int i11) {
            return CONSUMED;
        }

        boolean isConsumed() {
            return false;
        }

        boolean isRound() {
            return false;
        }

        boolean isVisible(int i8) {
            return true;
        }

        public void setOverriddenInsets(Insets[] insetsArr) {
        }

        void setRootViewData(@NonNull Insets insets) {
        }

        void setRootWindowInsets(@Nullable WindowInsetsCompat windowInsetsCompat) {
        }

        public void setStableInsets(Insets insets) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(20)
    /* loaded from: classes3.dex */
    public static class Impl20 extends Impl {
        private static Class<?> sAttachInfoClass = null;
        private static Field sAttachInfoField = null;
        private static Method sGetViewRootImplMethod = null;
        private static Field sVisibleInsetsField = null;
        private static boolean sVisibleRectReflectionFetched = false;
        private Insets[] mOverriddenInsets;

        @NonNull
        final WindowInsets mPlatformInsets;
        Insets mRootViewVisibleInsets;
        private WindowInsetsCompat mRootWindowInsets;
        private Insets mSystemWindowInsets;

        Impl20(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.mSystemWindowInsets = null;
            this.mPlatformInsets = windowInsets;
        }

        private Insets getRootStableInsets() {
            WindowInsetsCompat windowInsetsCompat = this.mRootWindowInsets;
            if (windowInsetsCompat != null) {
                return windowInsetsCompat.getStableInsets();
            }
            return Insets.NONE;
        }

        @Nullable
        private Insets getVisibleInsets(@NonNull View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!sVisibleRectReflectionFetched) {
                    loadReflectionField();
                }
                Method method = sGetViewRootImplMethod;
                if (method != null && sAttachInfoClass != null && sVisibleInsetsField != null) {
                    try {
                        Object invoke = method.invoke(view, null);
                        if (invoke == null) {
                            Log.w(WindowInsetsCompat.TAG, "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) sVisibleInsetsField.get(sAttachInfoField.get(invoke));
                        if (rect == null) {
                            return null;
                        }
                        return Insets.of(rect);
                    } catch (ReflectiveOperationException e8) {
                        Log.e(WindowInsetsCompat.TAG, "Failed to get visible insets. (Reflection error). " + e8.getMessage(), e8);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void loadReflectionField() {
            try {
                sGetViewRootImplMethod = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                sAttachInfoClass = cls;
                sVisibleInsetsField = cls.getDeclaredField("mVisibleInsets");
                sAttachInfoField = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                sVisibleInsetsField.setAccessible(true);
                sAttachInfoField.setAccessible(true);
            } catch (ReflectiveOperationException e8) {
                Log.e(WindowInsetsCompat.TAG, "Failed to get visible insets. (Reflection error). " + e8.getMessage(), e8);
            }
            sVisibleRectReflectionFetched = true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void copyRootViewBounds(@NonNull View view) {
            Insets visibleInsets = getVisibleInsets(view);
            if (visibleInsets == null) {
                visibleInsets = Insets.NONE;
            }
            setRootViewData(visibleInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void copyWindowDataInto(@NonNull WindowInsetsCompat windowInsetsCompat) {
            windowInsetsCompat.setRootWindowInsets(this.mRootWindowInsets);
            windowInsetsCompat.setRootViewData(this.mRootViewVisibleInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.mRootViewVisibleInsets, ((Impl20) obj).mRootViewVisibleInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        public Insets getInsets(int i8) {
            return getInsets(i8, false);
        }

        @NonNull
        protected Insets getInsetsForType(int i8, boolean z8) {
            int i9;
            DisplayCutoutCompat displayCutout;
            if (i8 != 1) {
                Insets insets = null;
                if (i8 != 2) {
                    if (i8 != 8) {
                        if (i8 != 16) {
                            if (i8 != 32) {
                                if (i8 != 64) {
                                    if (i8 != 128) {
                                        return Insets.NONE;
                                    }
                                    WindowInsetsCompat windowInsetsCompat = this.mRootWindowInsets;
                                    if (windowInsetsCompat != null) {
                                        displayCutout = windowInsetsCompat.getDisplayCutout();
                                    } else {
                                        displayCutout = getDisplayCutout();
                                    }
                                    if (displayCutout != null) {
                                        return Insets.of(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                                    }
                                    return Insets.NONE;
                                }
                                return getTappableElementInsets();
                            }
                            return getMandatorySystemGestureInsets();
                        }
                        return getSystemGestureInsets();
                    }
                    Insets[] insetsArr = this.mOverriddenInsets;
                    if (insetsArr != null) {
                        insets = insetsArr[Type.indexOf(8)];
                    }
                    if (insets != null) {
                        return insets;
                    }
                    Insets systemWindowInsets = getSystemWindowInsets();
                    Insets rootStableInsets = getRootStableInsets();
                    int i10 = systemWindowInsets.bottom;
                    if (i10 > rootStableInsets.bottom) {
                        return Insets.of(0, 0, 0, i10);
                    }
                    Insets insets2 = this.mRootViewVisibleInsets;
                    if (insets2 != null && !insets2.equals(Insets.NONE) && (i9 = this.mRootViewVisibleInsets.bottom) > rootStableInsets.bottom) {
                        return Insets.of(0, 0, 0, i9);
                    }
                    return Insets.NONE;
                }
                if (z8) {
                    Insets rootStableInsets2 = getRootStableInsets();
                    Insets stableInsets = getStableInsets();
                    return Insets.of(Math.max(rootStableInsets2.left, stableInsets.left), 0, Math.max(rootStableInsets2.right, stableInsets.right), Math.max(rootStableInsets2.bottom, stableInsets.bottom));
                }
                Insets systemWindowInsets2 = getSystemWindowInsets();
                WindowInsetsCompat windowInsetsCompat2 = this.mRootWindowInsets;
                if (windowInsetsCompat2 != null) {
                    insets = windowInsetsCompat2.getStableInsets();
                }
                int i11 = systemWindowInsets2.bottom;
                if (insets != null) {
                    i11 = Math.min(i11, insets.bottom);
                }
                return Insets.of(systemWindowInsets2.left, 0, systemWindowInsets2.right, i11);
            }
            if (z8) {
                return Insets.of(0, Math.max(getRootStableInsets().top, getSystemWindowInsets().top), 0, 0);
            }
            return Insets.of(0, getSystemWindowInsets().top, 0, 0);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        public Insets getInsetsIgnoringVisibility(int i8) {
            return getInsets(i8, true);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        final Insets getSystemWindowInsets() {
            if (this.mSystemWindowInsets == null) {
                this.mSystemWindowInsets = Insets.of(this.mPlatformInsets.getSystemWindowInsetLeft(), this.mPlatformInsets.getSystemWindowInsetTop(), this.mPlatformInsets.getSystemWindowInsetRight(), this.mPlatformInsets.getSystemWindowInsetBottom());
            }
            return this.mSystemWindowInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        WindowInsetsCompat inset(int i8, int i9, int i10, int i11) {
            Builder builder = new Builder(WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets));
            builder.setSystemWindowInsets(WindowInsetsCompat.insetInsets(getSystemWindowInsets(), i8, i9, i10, i11));
            builder.setStableInsets(WindowInsetsCompat.insetInsets(getStableInsets(), i8, i9, i10, i11));
            return builder.build();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isRound() {
            return this.mPlatformInsets.isRound();
        }

        protected boolean isTypeVisible(int i8) {
            if (i8 != 1 && i8 != 2) {
                if (i8 == 4) {
                    return false;
                }
                if (i8 != 8 && i8 != 128) {
                    return true;
                }
            }
            return !getInsetsForType(i8, false).equals(Insets.NONE);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @SuppressLint({"WrongConstant"})
        boolean isVisible(int i8) {
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i8 & i9) != 0 && !isTypeVisible(i9)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setOverriddenInsets(Insets[] insetsArr) {
            this.mOverriddenInsets = insetsArr;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setRootViewData(@NonNull Insets insets) {
            this.mRootViewVisibleInsets = insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setRootWindowInsets(@Nullable WindowInsetsCompat windowInsetsCompat) {
            this.mRootWindowInsets = windowInsetsCompat;
        }

        @NonNull
        @SuppressLint({"WrongConstant"})
        private Insets getInsets(int i8, boolean z8) {
            Insets insets = Insets.NONE;
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i8 & i9) != 0) {
                    insets = Insets.max(insets, getInsetsForType(i9, z8));
                }
            }
            return insets;
        }

        Impl20(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Impl20 impl20) {
            this(windowInsetsCompat, new WindowInsets(impl20.mPlatformInsets));
        }
    }

    @RequiresApi(28)
    /* loaded from: classes3.dex */
    private static class Impl28 extends Impl21 {
        Impl28(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        WindowInsetsCompat consumeDisplayCutout() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.mPlatformInsets.consumeDisplayCutout();
            return WindowInsetsCompat.toWindowInsetsCompat(consumeDisplayCutout);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impl28)) {
                return false;
            }
            Impl28 impl28 = (Impl28) obj;
            if (Objects.equals(this.mPlatformInsets, impl28.mPlatformInsets) && Objects.equals(this.mRootViewVisibleInsets, impl28.mRootViewVisibleInsets)) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @Nullable
        DisplayCutoutCompat getDisplayCutout() {
            DisplayCutout displayCutout;
            displayCutout = this.mPlatformInsets.getDisplayCutout();
            return DisplayCutoutCompat.wrap(displayCutout);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public int hashCode() {
            return this.mPlatformInsets.hashCode();
        }

        Impl28(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Impl28 impl28) {
            super(windowInsetsCompat, impl28);
        }
    }

    @RequiresApi(30)
    /* loaded from: classes3.dex */
    private static class Impl30 extends Impl29 {

        @NonNull
        static final WindowInsetsCompat CONSUMED;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            CONSUMED = WindowInsetsCompat.toWindowInsetsCompat(windowInsets);
        }

        Impl30(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        final void copyRootViewBounds(@NonNull View view) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        public Insets getInsets(int i8) {
            android.graphics.Insets insets;
            insets = this.mPlatformInsets.getInsets(TypeImpl30.toPlatformType(i8));
            return Insets.toCompatInsets(insets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        public Insets getInsetsIgnoringVisibility(int i8) {
            android.graphics.Insets insetsIgnoringVisibility;
            insetsIgnoringVisibility = this.mPlatformInsets.getInsetsIgnoringVisibility(TypeImpl30.toPlatformType(i8));
            return Insets.toCompatInsets(insetsIgnoringVisibility);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean isVisible(int i8) {
            boolean isVisible;
            isVisible = this.mPlatformInsets.isVisible(TypeImpl30.toPlatformType(i8));
            return isVisible;
        }

        Impl30(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Impl30 impl30) {
            super(windowInsetsCompat, impl30);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Type {
        static final int CAPTION_BAR = 4;
        static final int DISPLAY_CUTOUT = 128;
        static final int FIRST = 1;
        static final int IME = 8;
        static final int LAST = 256;
        static final int MANDATORY_SYSTEM_GESTURES = 32;
        static final int NAVIGATION_BARS = 2;
        static final int SIZE = 9;
        static final int STATUS_BARS = 1;
        static final int SYSTEM_GESTURES = 16;
        static final int TAPPABLE_ELEMENT = 64;
        static final int WINDOW_DECOR = 256;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* loaded from: classes3.dex */
        public @interface InsetsType {
        }

        private Type() {
        }

        @SuppressLint({"WrongConstant"})
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        static int all() {
            return -1;
        }

        public static int captionBar() {
            return 4;
        }

        public static int displayCutout() {
            return 128;
        }

        public static int ime() {
            return 8;
        }

        static int indexOf(int i8) {
            if (i8 != 1) {
                if (i8 == 2) {
                    return 1;
                }
                if (i8 == 4) {
                    return 2;
                }
                if (i8 != 8) {
                    if (i8 == 16) {
                        return 4;
                    }
                    if (i8 != 32) {
                        if (i8 != 64) {
                            if (i8 != 128) {
                                if (i8 == 256) {
                                    return 8;
                                }
                                throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i8);
                            }
                            return 7;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 3;
            }
            return 0;
        }

        public static int mandatorySystemGestures() {
            return 32;
        }

        public static int navigationBars() {
            return 2;
        }

        public static int statusBars() {
            return 1;
        }

        public static int systemBars() {
            return 7;
        }

        public static int systemGestures() {
            return 16;
        }

        public static int tappableElement() {
            return 64;
        }
    }

    @RequiresApi(30)
    /* loaded from: classes3.dex */
    private static final class TypeImpl30 {
        private TypeImpl30() {
        }

        static int toPlatformType(int i8) {
            int statusBars;
            int i9 = 0;
            for (int i10 = 1; i10 <= 256; i10 <<= 1) {
                if ((i8 & i10) != 0) {
                    if (i10 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i10 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i10 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i10 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i10 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i10 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i10 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i10 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i9 |= statusBars;
                }
            }
            return i9;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            CONSUMED = Impl30.CONSUMED;
        } else {
            CONSUMED = Impl.CONSUMED;
        }
    }

    @RequiresApi(20)
    private WindowInsetsCompat(@NonNull WindowInsets windowInsets) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 30) {
            this.mImpl = new Impl30(this, windowInsets);
            return;
        }
        if (i8 >= 29) {
            this.mImpl = new Impl29(this, windowInsets);
        } else if (i8 >= 28) {
            this.mImpl = new Impl28(this, windowInsets);
        } else {
            this.mImpl = new Impl21(this, windowInsets);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Insets insetInsets(@NonNull Insets insets, int i8, int i9, int i10, int i11) {
        int max = Math.max(0, insets.left - i8);
        int max2 = Math.max(0, insets.top - i9);
        int max3 = Math.max(0, insets.right - i10);
        int max4 = Math.max(0, insets.bottom - i11);
        if (max == i8 && max2 == i9 && max3 == i10 && max4 == i11) {
            return insets;
        }
        return Insets.of(max, max2, max3, max4);
    }

    @NonNull
    @RequiresApi(20)
    public static WindowInsetsCompat toWindowInsetsCompat(@NonNull WindowInsets windowInsets) {
        return toWindowInsetsCompat(windowInsets, null);
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat consumeDisplayCutout() {
        return this.mImpl.consumeDisplayCutout();
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat consumeStableInsets() {
        return this.mImpl.consumeStableInsets();
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat consumeSystemWindowInsets() {
        return this.mImpl.consumeSystemWindowInsets();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void copyRootViewBounds(@NonNull View view) {
        this.mImpl.copyRootViewBounds(view);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WindowInsetsCompat)) {
            return false;
        }
        return ObjectsCompat.equals(this.mImpl, ((WindowInsetsCompat) obj).mImpl);
    }

    @Nullable
    public DisplayCutoutCompat getDisplayCutout() {
        return this.mImpl.getDisplayCutout();
    }

    @NonNull
    public Insets getInsets(int i8) {
        return this.mImpl.getInsets(i8);
    }

    @NonNull
    public Insets getInsetsIgnoringVisibility(int i8) {
        return this.mImpl.getInsetsIgnoringVisibility(i8);
    }

    @NonNull
    @Deprecated
    public Insets getMandatorySystemGestureInsets() {
        return this.mImpl.getMandatorySystemGestureInsets();
    }

    @Deprecated
    public int getStableInsetBottom() {
        return this.mImpl.getStableInsets().bottom;
    }

    @Deprecated
    public int getStableInsetLeft() {
        return this.mImpl.getStableInsets().left;
    }

    @Deprecated
    public int getStableInsetRight() {
        return this.mImpl.getStableInsets().right;
    }

    @Deprecated
    public int getStableInsetTop() {
        return this.mImpl.getStableInsets().top;
    }

    @NonNull
    @Deprecated
    public Insets getStableInsets() {
        return this.mImpl.getStableInsets();
    }

    @NonNull
    @Deprecated
    public Insets getSystemGestureInsets() {
        return this.mImpl.getSystemGestureInsets();
    }

    @Deprecated
    public int getSystemWindowInsetBottom() {
        return this.mImpl.getSystemWindowInsets().bottom;
    }

    @Deprecated
    public int getSystemWindowInsetLeft() {
        return this.mImpl.getSystemWindowInsets().left;
    }

    @Deprecated
    public int getSystemWindowInsetRight() {
        return this.mImpl.getSystemWindowInsets().right;
    }

    @Deprecated
    public int getSystemWindowInsetTop() {
        return this.mImpl.getSystemWindowInsets().top;
    }

    @NonNull
    @Deprecated
    public Insets getSystemWindowInsets() {
        return this.mImpl.getSystemWindowInsets();
    }

    @NonNull
    @Deprecated
    public Insets getTappableElementInsets() {
        return this.mImpl.getTappableElementInsets();
    }

    public boolean hasInsets() {
        Insets insets = getInsets(Type.all());
        Insets insets2 = Insets.NONE;
        if (insets.equals(insets2) && getInsetsIgnoringVisibility(Type.all() ^ Type.ime()).equals(insets2) && getDisplayCutout() == null) {
            return false;
        }
        return true;
    }

    @Deprecated
    public boolean hasStableInsets() {
        return !this.mImpl.getStableInsets().equals(Insets.NONE);
    }

    @Deprecated
    public boolean hasSystemWindowInsets() {
        return !this.mImpl.getSystemWindowInsets().equals(Insets.NONE);
    }

    public int hashCode() {
        Impl impl = this.mImpl;
        if (impl == null) {
            return 0;
        }
        return impl.hashCode();
    }

    @NonNull
    public WindowInsetsCompat inset(@NonNull Insets insets) {
        return inset(insets.left, insets.top, insets.right, insets.bottom);
    }

    public boolean isConsumed() {
        return this.mImpl.isConsumed();
    }

    public boolean isRound() {
        return this.mImpl.isRound();
    }

    public boolean isVisible(int i8) {
        return this.mImpl.isVisible(i8);
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat replaceSystemWindowInsets(int i8, int i9, int i10, int i11) {
        return new Builder(this).setSystemWindowInsets(Insets.of(i8, i9, i10, i11)).build();
    }

    void setOverriddenInsets(Insets[] insetsArr) {
        this.mImpl.setOverriddenInsets(insetsArr);
    }

    void setRootViewData(@NonNull Insets insets) {
        this.mImpl.setRootViewData(insets);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setRootWindowInsets(@Nullable WindowInsetsCompat windowInsetsCompat) {
        this.mImpl.setRootWindowInsets(windowInsetsCompat);
    }

    void setStableInsets(@Nullable Insets insets) {
        this.mImpl.setStableInsets(insets);
    }

    @Nullable
    @RequiresApi(20)
    public WindowInsets toWindowInsets() {
        Impl impl = this.mImpl;
        if (impl instanceof Impl20) {
            return ((Impl20) impl).mPlatformInsets;
        }
        return null;
    }

    @RequiresApi(api = 20)
    /* loaded from: classes3.dex */
    private static class BuilderImpl20 extends BuilderImpl {
        private static Constructor<WindowInsets> sConstructor = null;
        private static boolean sConstructorFetched = false;
        private static Field sConsumedField = null;
        private static boolean sConsumedFieldFetched = false;
        private WindowInsets mPlatformInsets;
        private Insets mStableInsets;

        BuilderImpl20() {
            this.mPlatformInsets = createWindowInsetsInstance();
        }

        @Nullable
        private static WindowInsets createWindowInsetsInstance() {
            if (!sConsumedFieldFetched) {
                try {
                    sConsumedField = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e8) {
                    Log.i(WindowInsetsCompat.TAG, "Could not retrieve WindowInsets.CONSUMED field", e8);
                }
                sConsumedFieldFetched = true;
            }
            Field field = sConsumedField;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e9) {
                    Log.i(WindowInsetsCompat.TAG, "Could not get value from WindowInsets.CONSUMED field", e9);
                }
            }
            if (!sConstructorFetched) {
                try {
                    sConstructor = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e10) {
                    Log.i(WindowInsetsCompat.TAG, "Could not retrieve WindowInsets(Rect) constructor", e10);
                }
                sConstructorFetched = true;
            }
            Constructor<WindowInsets> constructor = sConstructor;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e11) {
                    Log.i(WindowInsetsCompat.TAG, "Could not invoke WindowInsets(Rect) constructor", e11);
                }
            }
            return null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        @NonNull
        WindowInsetsCompat build() {
            applyInsetTypes();
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets);
            windowInsetsCompat.setOverriddenInsets(this.mInsetsTypeMask);
            windowInsetsCompat.setStableInsets(this.mStableInsets);
            return windowInsetsCompat;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setStableInsets(@Nullable Insets insets) {
            this.mStableInsets = insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setSystemWindowInsets(@NonNull Insets insets) {
            WindowInsets windowInsets = this.mPlatformInsets;
            if (windowInsets != null) {
                this.mPlatformInsets = windowInsets.replaceSystemWindowInsets(insets.left, insets.top, insets.right, insets.bottom);
            }
        }

        BuilderImpl20(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.mPlatformInsets = windowInsetsCompat.toWindowInsets();
        }
    }

    @RequiresApi(api = 29)
    /* loaded from: classes3.dex */
    private static class BuilderImpl29 extends BuilderImpl {
        final WindowInsets.Builder mPlatBuilder;

        BuilderImpl29() {
            this.mPlatBuilder = AbstractC1920n0.a();
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        @NonNull
        WindowInsetsCompat build() {
            WindowInsets build;
            applyInsetTypes();
            build = this.mPlatBuilder.build();
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(build);
            windowInsetsCompat.setOverriddenInsets(this.mInsetsTypeMask);
            return windowInsetsCompat;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setDisplayCutout(@Nullable DisplayCutoutCompat displayCutoutCompat) {
            DisplayCutout displayCutout;
            WindowInsets.Builder builder = this.mPlatBuilder;
            if (displayCutoutCompat != null) {
                displayCutout = displayCutoutCompat.unwrap();
            } else {
                displayCutout = null;
            }
            builder.setDisplayCutout(displayCutout);
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setMandatorySystemGestureInsets(@NonNull Insets insets) {
            this.mPlatBuilder.setMandatorySystemGestureInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setStableInsets(@NonNull Insets insets) {
            this.mPlatBuilder.setStableInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setSystemGestureInsets(@NonNull Insets insets) {
            this.mPlatBuilder.setSystemGestureInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setSystemWindowInsets(@NonNull Insets insets) {
            this.mPlatBuilder.setSystemWindowInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setTappableElementInsets(@NonNull Insets insets) {
            this.mPlatBuilder.setTappableElementInsets(insets.toPlatformInsets());
        }

        BuilderImpl29(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            WindowInsets.Builder a9;
            WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
            if (windowInsets != null) {
                a9 = AbstractC1918m0.a(windowInsets);
            } else {
                a9 = AbstractC1920n0.a();
            }
            this.mPlatBuilder = a9;
        }
    }

    @RequiresApi(21)
    /* loaded from: classes3.dex */
    private static class Impl21 extends Impl20 {
        private Insets mStableInsets;

        Impl21(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.mStableInsets = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        WindowInsetsCompat consumeStableInsets() {
            return WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.consumeStableInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        WindowInsetsCompat consumeSystemWindowInsets() {
            return WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        final Insets getStableInsets() {
            if (this.mStableInsets == null) {
                this.mStableInsets = Insets.of(this.mPlatformInsets.getStableInsetLeft(), this.mPlatformInsets.getStableInsetTop(), this.mPlatformInsets.getStableInsetRight(), this.mPlatformInsets.getStableInsetBottom());
            }
            return this.mStableInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isConsumed() {
            return this.mPlatformInsets.isConsumed();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setStableInsets(@Nullable Insets insets) {
            this.mStableInsets = insets;
        }

        Impl21(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Impl21 impl21) {
            super(windowInsetsCompat, impl21);
            this.mStableInsets = null;
            this.mStableInsets = impl21.mStableInsets;
        }
    }

    @NonNull
    @RequiresApi(20)
    public static WindowInsetsCompat toWindowInsetsCompat(@NonNull WindowInsets windowInsets, @Nullable View view) {
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat((WindowInsets) Preconditions.checkNotNull(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            windowInsetsCompat.setRootWindowInsets(ViewCompat.getRootWindowInsets(view));
            windowInsetsCompat.copyRootViewBounds(view.getRootView());
        }
        return windowInsetsCompat;
    }

    @NonNull
    public WindowInsetsCompat inset(@IntRange(from = 0) int i8, @IntRange(from = 0) int i9, @IntRange(from = 0) int i10, @IntRange(from = 0) int i11) {
        return this.mImpl.inset(i8, i9, i10, i11);
    }

    @RequiresApi(29)
    /* loaded from: classes3.dex */
    private static class Impl29 extends Impl28 {
        private Insets mMandatorySystemGestureInsets;
        private Insets mSystemGestureInsets;
        private Insets mTappableElementInsets;

        Impl29(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.mSystemGestureInsets = null;
            this.mMandatorySystemGestureInsets = null;
            this.mTappableElementInsets = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        Insets getMandatorySystemGestureInsets() {
            android.graphics.Insets mandatorySystemGestureInsets;
            if (this.mMandatorySystemGestureInsets == null) {
                mandatorySystemGestureInsets = this.mPlatformInsets.getMandatorySystemGestureInsets();
                this.mMandatorySystemGestureInsets = Insets.toCompatInsets(mandatorySystemGestureInsets);
            }
            return this.mMandatorySystemGestureInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        Insets getSystemGestureInsets() {
            android.graphics.Insets systemGestureInsets;
            if (this.mSystemGestureInsets == null) {
                systemGestureInsets = this.mPlatformInsets.getSystemGestureInsets();
                this.mSystemGestureInsets = Insets.toCompatInsets(systemGestureInsets);
            }
            return this.mSystemGestureInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        Insets getTappableElementInsets() {
            android.graphics.Insets tappableElementInsets;
            if (this.mTappableElementInsets == null) {
                tappableElementInsets = this.mPlatformInsets.getTappableElementInsets();
                this.mTappableElementInsets = Insets.toCompatInsets(tappableElementInsets);
            }
            return this.mTappableElementInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        WindowInsetsCompat inset(int i8, int i9, int i10, int i11) {
            WindowInsets inset;
            inset = this.mPlatformInsets.inset(i8, i9, i10, i11);
            return WindowInsetsCompat.toWindowInsetsCompat(inset);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl21, androidx.core.view.WindowInsetsCompat.Impl
        public void setStableInsets(@Nullable Insets insets) {
        }

        Impl29(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Impl29 impl29) {
            super(windowInsetsCompat, impl29);
            this.mSystemGestureInsets = null;
            this.mMandatorySystemGestureInsets = null;
            this.mTappableElementInsets = null;
        }
    }

    @NonNull
    @Deprecated
    public WindowInsetsCompat replaceSystemWindowInsets(@NonNull Rect rect) {
        return new Builder(this).setSystemWindowInsets(Insets.of(rect)).build();
    }

    /* loaded from: classes3.dex */
    public static final class Builder {
        private final BuilderImpl mImpl;

        public Builder() {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 30) {
                this.mImpl = new BuilderImpl30();
            } else if (i8 >= 29) {
                this.mImpl = new BuilderImpl29();
            } else {
                this.mImpl = new BuilderImpl20();
            }
        }

        @NonNull
        public WindowInsetsCompat build() {
            return this.mImpl.build();
        }

        @NonNull
        public Builder setDisplayCutout(@Nullable DisplayCutoutCompat displayCutoutCompat) {
            this.mImpl.setDisplayCutout(displayCutoutCompat);
            return this;
        }

        @NonNull
        public Builder setInsets(int i8, @NonNull Insets insets) {
            this.mImpl.setInsets(i8, insets);
            return this;
        }

        @NonNull
        public Builder setInsetsIgnoringVisibility(int i8, @NonNull Insets insets) {
            this.mImpl.setInsetsIgnoringVisibility(i8, insets);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setMandatorySystemGestureInsets(@NonNull Insets insets) {
            this.mImpl.setMandatorySystemGestureInsets(insets);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setStableInsets(@NonNull Insets insets) {
            this.mImpl.setStableInsets(insets);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setSystemGestureInsets(@NonNull Insets insets) {
            this.mImpl.setSystemGestureInsets(insets);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setSystemWindowInsets(@NonNull Insets insets) {
            this.mImpl.setSystemWindowInsets(insets);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setTappableElementInsets(@NonNull Insets insets) {
            this.mImpl.setTappableElementInsets(insets);
            return this;
        }

        @NonNull
        public Builder setVisible(int i8, boolean z8) {
            this.mImpl.setVisible(i8, z8);
            return this;
        }

        public Builder(@NonNull WindowInsetsCompat windowInsetsCompat) {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 30) {
                this.mImpl = new BuilderImpl30(windowInsetsCompat);
            } else if (i8 >= 29) {
                this.mImpl = new BuilderImpl29(windowInsetsCompat);
            } else {
                this.mImpl = new BuilderImpl20(windowInsetsCompat);
            }
        }
    }

    public WindowInsetsCompat(@Nullable WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat != null) {
            Impl impl = windowInsetsCompat.mImpl;
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 30 && (impl instanceof Impl30)) {
                this.mImpl = new Impl30(this, (Impl30) impl);
            } else if (i8 >= 29 && (impl instanceof Impl29)) {
                this.mImpl = new Impl29(this, (Impl29) impl);
            } else if (i8 >= 28 && (impl instanceof Impl28)) {
                this.mImpl = new Impl28(this, (Impl28) impl);
            } else if (impl instanceof Impl21) {
                this.mImpl = new Impl21(this, (Impl21) impl);
            } else if (impl instanceof Impl20) {
                this.mImpl = new Impl20(this, (Impl20) impl);
            } else {
                this.mImpl = new Impl(this);
            }
            impl.copyWindowDataInto(this);
            return;
        }
        this.mImpl = new Impl(this);
    }
}
