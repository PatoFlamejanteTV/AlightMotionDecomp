package androidx.core.view;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;

/* loaded from: classes3.dex */
public final class WindowInsetsControllerCompat {
    public static final int BEHAVIOR_DEFAULT = 1;

    @Deprecated
    public static final int BEHAVIOR_SHOW_BARS_BY_SWIPE = 1;

    @Deprecated
    public static final int BEHAVIOR_SHOW_BARS_BY_TOUCH = 0;
    public static final int BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE = 2;
    private final Impl mImpl;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class Impl {
        Impl() {
        }

        void addOnControllableInsetsChangedListener(OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        }

        void controlWindowInsetsAnimation(int i8, long j8, Interpolator interpolator, CancellationSignal cancellationSignal, WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
        }

        int getSystemBarsBehavior() {
            return 0;
        }

        void hide(int i8) {
        }

        public boolean isAppearanceLightNavigationBars() {
            return false;
        }

        public boolean isAppearanceLightStatusBars() {
            return false;
        }

        void removeOnControllableInsetsChangedListener(@NonNull OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        }

        public void setAppearanceLightNavigationBars(boolean z8) {
        }

        public void setAppearanceLightStatusBars(boolean z8) {
        }

        void setSystemBarsBehavior(int i8) {
        }

        void show(int i8) {
        }
    }

    @RequiresApi(20)
    /* loaded from: classes3.dex */
    private static class Impl20 extends Impl {

        @NonNull
        private final SoftwareKeyboardControllerCompat mSoftwareKeyboardControllerCompat;

        @NonNull
        protected final Window mWindow;

        Impl20(@NonNull Window window, @NonNull SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this.mWindow = window;
            this.mSoftwareKeyboardControllerCompat = softwareKeyboardControllerCompat;
        }

        private void hideForType(int i8) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 8) {
                        this.mSoftwareKeyboardControllerCompat.hide();
                        return;
                    }
                    return;
                }
                setSystemUiFlag(2);
                return;
            }
            setSystemUiFlag(4);
        }

        private void showForType(int i8) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 8) {
                        this.mSoftwareKeyboardControllerCompat.show();
                        return;
                    }
                    return;
                }
                unsetSystemUiFlag(2);
                return;
            }
            unsetSystemUiFlag(4);
            unsetWindowFlag(1024);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void addOnControllableInsetsChangedListener(OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void controlWindowInsetsAnimation(int i8, long j8, Interpolator interpolator, CancellationSignal cancellationSignal, WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        int getSystemBarsBehavior() {
            return 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void hide(int i8) {
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i8 & i9) != 0) {
                    hideForType(i9);
                }
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void removeOnControllableInsetsChangedListener(@NonNull OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void setSystemBarsBehavior(int i8) {
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        unsetSystemUiFlag(2048);
                        setSystemUiFlag(4096);
                        return;
                    }
                    return;
                }
                unsetSystemUiFlag(4096);
                setSystemUiFlag(2048);
                return;
            }
            unsetSystemUiFlag(6144);
        }

        protected void setSystemUiFlag(int i8) {
            View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility(i8 | decorView.getSystemUiVisibility());
        }

        protected void setWindowFlag(int i8) {
            this.mWindow.addFlags(i8);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void show(int i8) {
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i8 & i9) != 0) {
                    showForType(i9);
                }
            }
        }

        protected void unsetSystemUiFlag(int i8) {
            View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility((~i8) & decorView.getSystemUiVisibility());
        }

        protected void unsetWindowFlag(int i8) {
            this.mWindow.clearFlags(i8);
        }
    }

    @RequiresApi(23)
    /* loaded from: classes3.dex */
    private static class Impl23 extends Impl20 {
        Impl23(@NonNull Window window, @NonNull SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(window, softwareKeyboardControllerCompat);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightStatusBars() {
            if ((this.mWindow.getDecorView().getSystemUiVisibility() & 8192) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightStatusBars(boolean z8) {
            if (z8) {
                unsetWindowFlag(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                setWindowFlag(Integer.MIN_VALUE);
                setSystemUiFlag(8192);
                return;
            }
            unsetSystemUiFlag(8192);
        }
    }

    @RequiresApi(26)
    /* loaded from: classes3.dex */
    private static class Impl26 extends Impl23 {
        Impl26(@NonNull Window window, @NonNull SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(window, softwareKeyboardControllerCompat);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightNavigationBars() {
            if ((this.mWindow.getDecorView().getSystemUiVisibility() & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightNavigationBars(boolean z8) {
            if (z8) {
                unsetWindowFlag(134217728);
                setWindowFlag(Integer.MIN_VALUE);
                setSystemUiFlag(16);
                return;
            }
            unsetSystemUiFlag(16);
        }
    }

    /* loaded from: classes3.dex */
    public interface OnControllableInsetsChangedListener {
        void onControllableInsetsChanged(@NonNull WindowInsetsControllerCompat windowInsetsControllerCompat, int i8);
    }

    @RequiresApi(30)
    @Deprecated
    private WindowInsetsControllerCompat(@NonNull WindowInsetsController windowInsetsController) {
        this.mImpl = new Impl30(windowInsetsController, this, new SoftwareKeyboardControllerCompat(windowInsetsController));
    }

    @NonNull
    @RequiresApi(30)
    @Deprecated
    public static WindowInsetsControllerCompat toWindowInsetsControllerCompat(@NonNull WindowInsetsController windowInsetsController) {
        return new WindowInsetsControllerCompat(windowInsetsController);
    }

    public void addOnControllableInsetsChangedListener(@NonNull OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        this.mImpl.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
    }

    public void controlWindowInsetsAnimation(int i8, long j8, @Nullable Interpolator interpolator, @Nullable CancellationSignal cancellationSignal, @NonNull WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
        this.mImpl.controlWindowInsetsAnimation(i8, j8, interpolator, cancellationSignal, windowInsetsAnimationControlListenerCompat);
    }

    @SuppressLint({"WrongConstant"})
    public int getSystemBarsBehavior() {
        return this.mImpl.getSystemBarsBehavior();
    }

    public void hide(int i8) {
        this.mImpl.hide(i8);
    }

    public boolean isAppearanceLightNavigationBars() {
        return this.mImpl.isAppearanceLightNavigationBars();
    }

    public boolean isAppearanceLightStatusBars() {
        return this.mImpl.isAppearanceLightStatusBars();
    }

    public void removeOnControllableInsetsChangedListener(@NonNull OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        this.mImpl.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
    }

    public void setAppearanceLightNavigationBars(boolean z8) {
        this.mImpl.setAppearanceLightNavigationBars(z8);
    }

    public void setAppearanceLightStatusBars(boolean z8) {
        this.mImpl.setAppearanceLightStatusBars(z8);
    }

    public void setSystemBarsBehavior(int i8) {
        this.mImpl.setSystemBarsBehavior(i8);
    }

    public void show(int i8) {
        this.mImpl.show(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(30)
    /* loaded from: classes3.dex */
    public static class Impl30 extends Impl {
        final WindowInsetsControllerCompat mCompatController;
        final WindowInsetsController mInsetsController;
        private final SimpleArrayMap<OnControllableInsetsChangedListener, WindowInsetsController.OnControllableInsetsChangedListener> mListeners;
        final SoftwareKeyboardControllerCompat mSoftwareKeyboardControllerCompat;
        protected Window mWindow;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        Impl30(@androidx.annotation.NonNull android.view.Window r2, @androidx.annotation.NonNull androidx.core.view.WindowInsetsControllerCompat r3, @androidx.annotation.NonNull androidx.core.view.SoftwareKeyboardControllerCompat r4) {
            /*
                r1 = this;
                android.view.WindowInsetsController r0 = androidx.core.view.K0.a(r2)
                r1.<init>(r0, r3, r4)
                r1.mWindow = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.WindowInsetsControllerCompat.Impl30.<init>(android.view.Window, androidx.core.view.WindowInsetsControllerCompat, androidx.core.view.SoftwareKeyboardControllerCompat):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$addOnControllableInsetsChangedListener$0(OnControllableInsetsChangedListener onControllableInsetsChangedListener, WindowInsetsController windowInsetsController, int i8) {
            if (this.mInsetsController == windowInsetsController) {
                onControllableInsetsChangedListener.onControllableInsetsChanged(this.mCompatController, i8);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void addOnControllableInsetsChangedListener(@NonNull final OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
            if (this.mListeners.containsKey(onControllableInsetsChangedListener)) {
                return;
            }
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener2 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.O0
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i8) {
                    WindowInsetsControllerCompat.Impl30.this.lambda$addOnControllableInsetsChangedListener$0(onControllableInsetsChangedListener, windowInsetsController, i8);
                }
            };
            this.mListeners.put(onControllableInsetsChangedListener, onControllableInsetsChangedListener2);
            this.mInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener2);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void controlWindowInsetsAnimation(int i8, long j8, @Nullable Interpolator interpolator, @Nullable CancellationSignal cancellationSignal, @NonNull final WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
            this.mInsetsController.controlWindowInsetsAnimation(i8, j8, interpolator, cancellationSignal, new WindowInsetsAnimationControlListener() { // from class: androidx.core.view.WindowInsetsControllerCompat.Impl30.1
                private WindowInsetsAnimationControllerCompat mCompatAnimController = null;

                @Override // android.view.WindowInsetsAnimationControlListener
                public void onCancelled(@Nullable WindowInsetsAnimationController windowInsetsAnimationController) {
                    WindowInsetsAnimationControllerCompat windowInsetsAnimationControllerCompat;
                    WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat2 = windowInsetsAnimationControlListenerCompat;
                    if (windowInsetsAnimationController == null) {
                        windowInsetsAnimationControllerCompat = null;
                    } else {
                        windowInsetsAnimationControllerCompat = this.mCompatAnimController;
                    }
                    windowInsetsAnimationControlListenerCompat2.onCancelled(windowInsetsAnimationControllerCompat);
                }

                @Override // android.view.WindowInsetsAnimationControlListener
                public void onFinished(@NonNull WindowInsetsAnimationController windowInsetsAnimationController) {
                    windowInsetsAnimationControlListenerCompat.onFinished(this.mCompatAnimController);
                }

                @Override // android.view.WindowInsetsAnimationControlListener
                public void onReady(@NonNull WindowInsetsAnimationController windowInsetsAnimationController, int i9) {
                    WindowInsetsAnimationControllerCompat windowInsetsAnimationControllerCompat = new WindowInsetsAnimationControllerCompat(windowInsetsAnimationController);
                    this.mCompatAnimController = windowInsetsAnimationControllerCompat;
                    windowInsetsAnimationControlListenerCompat.onReady(windowInsetsAnimationControllerCompat, i9);
                }
            });
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        @SuppressLint({"WrongConstant"})
        int getSystemBarsBehavior() {
            int systemBarsBehavior;
            systemBarsBehavior = this.mInsetsController.getSystemBarsBehavior();
            return systemBarsBehavior;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void hide(int i8) {
            if ((i8 & 8) != 0) {
                this.mSoftwareKeyboardControllerCompat.hide();
            }
            this.mInsetsController.hide(i8 & (-9));
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightNavigationBars() {
            int systemBarsAppearance;
            this.mInsetsController.setSystemBarsAppearance(0, 0);
            systemBarsAppearance = this.mInsetsController.getSystemBarsAppearance();
            if ((systemBarsAppearance & 16) == 0) {
                return false;
            }
            return true;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightStatusBars() {
            int systemBarsAppearance;
            this.mInsetsController.setSystemBarsAppearance(0, 0);
            systemBarsAppearance = this.mInsetsController.getSystemBarsAppearance();
            if ((systemBarsAppearance & 8) == 0) {
                return false;
            }
            return true;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void removeOnControllableInsetsChangedListener(@NonNull OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
            WindowInsetsController.OnControllableInsetsChangedListener a9 = M0.a(this.mListeners.remove(onControllableInsetsChangedListener));
            if (a9 != null) {
                this.mInsetsController.removeOnControllableInsetsChangedListener(a9);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightNavigationBars(boolean z8) {
            if (z8) {
                if (this.mWindow != null) {
                    setSystemUiFlag(16);
                }
                this.mInsetsController.setSystemBarsAppearance(16, 16);
            } else {
                if (this.mWindow != null) {
                    unsetSystemUiFlag(16);
                }
                this.mInsetsController.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightStatusBars(boolean z8) {
            if (z8) {
                if (this.mWindow != null) {
                    setSystemUiFlag(8192);
                }
                this.mInsetsController.setSystemBarsAppearance(8, 8);
            } else {
                if (this.mWindow != null) {
                    unsetSystemUiFlag(8192);
                }
                this.mInsetsController.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void setSystemBarsBehavior(int i8) {
            this.mInsetsController.setSystemBarsBehavior(i8);
        }

        protected void setSystemUiFlag(int i8) {
            View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility(i8 | decorView.getSystemUiVisibility());
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void show(int i8) {
            if ((i8 & 8) != 0) {
                this.mSoftwareKeyboardControllerCompat.show();
            }
            this.mInsetsController.show(i8 & (-9));
        }

        protected void unsetSystemUiFlag(int i8) {
            View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility((~i8) & decorView.getSystemUiVisibility());
        }

        Impl30(@NonNull WindowInsetsController windowInsetsController, @NonNull WindowInsetsControllerCompat windowInsetsControllerCompat, @NonNull SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this.mListeners = new SimpleArrayMap<>();
            this.mInsetsController = windowInsetsController;
            this.mCompatController = windowInsetsControllerCompat;
            this.mSoftwareKeyboardControllerCompat = softwareKeyboardControllerCompat;
        }
    }

    public WindowInsetsControllerCompat(@NonNull Window window, @NonNull View view) {
        SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat = new SoftwareKeyboardControllerCompat(view);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 30) {
            this.mImpl = new Impl30(window, this, softwareKeyboardControllerCompat);
            return;
        }
        if (i8 >= 26) {
            this.mImpl = new Impl26(window, softwareKeyboardControllerCompat);
        } else if (i8 >= 23) {
            this.mImpl = new Impl23(window, softwareKeyboardControllerCompat);
        } else {
            this.mImpl = new Impl20(window, softwareKeyboardControllerCompat);
        }
    }
}
