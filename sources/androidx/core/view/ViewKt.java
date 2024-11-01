package androidx.core.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Px;
import androidx.exifinterface.media.ExifInterface;
import k6.AbstractC3258j;
import k6.InterfaceC3255g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class ViewKt {
    public static final void doOnAttach(final View view, final Function1 function1) {
        if (view.isAttachedToWindow()) {
            function1.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.core.view.ViewKt$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    function1.invoke(view2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                }
            });
        }
    }

    public static final void doOnDetach(final View view, final Function1 function1) {
        if (!view.isAttachedToWindow()) {
            function1.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.core.view.ViewKt$doOnDetach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    function1.invoke(view2);
                }
            });
        }
    }

    public static final void doOnLayout(View view, final Function1 function1) {
        if (view.isLaidOut() && !view.isLayoutRequested()) {
            function1.invoke(view);
        } else {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.core.view.ViewKt$doOnLayout$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                    view2.removeOnLayoutChangeListener(this);
                    Function1.this.invoke(view2);
                }
            });
        }
    }

    public static final void doOnNextLayout(View view, final Function1 function1) {
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.core.view.ViewKt$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view2, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                view2.removeOnLayoutChangeListener(this);
                Function1.this.invoke(view2);
            }
        });
    }

    public static final OneShotPreDrawListener doOnPreDraw(final View view, final Function1 function1) {
        return OneShotPreDrawListener.add(view, new Runnable() { // from class: androidx.core.view.ViewKt$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                Function1.this.invoke(view);
            }
        });
    }

    public static final Bitmap drawToBitmap(View view, Bitmap.Config config) {
        if (view.isLaidOut()) {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(-view.getScrollX(), -view.getScrollY());
            view.draw(canvas);
            return createBitmap;
        }
        throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
    }

    public static /* synthetic */ Bitmap drawToBitmap$default(View view, Bitmap.Config config, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return drawToBitmap(view, config);
    }

    public static final InterfaceC3255g getAllViews(View view) {
        return AbstractC3258j.b(new ViewKt$allViews$1(view, null));
    }

    public static final InterfaceC3255g getAncestors(View view) {
        return AbstractC3258j.h(view.getParent(), ViewKt$ancestors$1.INSTANCE);
    }

    public static final int getMarginBottom(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int getMarginEnd(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        }
        return 0;
    }

    public static final int getMarginLeft(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int getMarginRight(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int getMarginStart(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        }
        return 0;
    }

    public static final int getMarginTop(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final boolean isGone(View view) {
        if (view.getVisibility() == 8) {
            return true;
        }
        return false;
    }

    public static final boolean isInvisible(View view) {
        if (view.getVisibility() == 4) {
            return true;
        }
        return false;
    }

    public static final boolean isVisible(View view) {
        if (view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public static final Runnable postDelayed(View view, long j8, final Function0 function0) {
        Runnable runnable = new Runnable() { // from class: androidx.core.view.ViewKt$postDelayed$runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                Function0.this.invoke();
            }
        };
        view.postDelayed(runnable, j8);
        return runnable;
    }

    public static final Runnable postOnAnimationDelayed(View view, long j8, final Function0 function0) {
        Runnable runnable = new Runnable() { // from class: androidx.core.view.K
            @Override // java.lang.Runnable
            public final void run() {
                Function0.this.invoke();
            }
        };
        view.postOnAnimationDelayed(runnable, j8);
        return runnable;
    }

    public static final void setGone(View view, boolean z8) {
        int i8;
        if (z8) {
            i8 = 8;
        } else {
            i8 = 0;
        }
        view.setVisibility(i8);
    }

    public static final void setInvisible(View view, boolean z8) {
        int i8;
        if (z8) {
            i8 = 4;
        } else {
            i8 = 0;
        }
        view.setVisibility(i8);
    }

    public static final void setPadding(View view, @Px int i8) {
        view.setPadding(i8, i8, i8, i8);
    }

    public static final void setVisible(View view, boolean z8) {
        int i8;
        if (z8) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        view.setVisibility(i8);
    }

    public static final void updateLayoutParams(View view, Function1 function1) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            function1.invoke(layoutParams);
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void updateLayoutParamsTyped(View view, Function1 function1) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        AbstractC3292y.n(1, ExifInterface.GPS_DIRECTION_TRUE);
        function1.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static final void updatePadding(View view, @Px int i8, @Px int i9, @Px int i10, @Px int i11) {
        view.setPadding(i8, i9, i10, i11);
    }

    public static /* synthetic */ void updatePadding$default(View view, int i8, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i8 = view.getPaddingLeft();
        }
        if ((i12 & 2) != 0) {
            i9 = view.getPaddingTop();
        }
        if ((i12 & 4) != 0) {
            i10 = view.getPaddingRight();
        }
        if ((i12 & 8) != 0) {
            i11 = view.getPaddingBottom();
        }
        view.setPadding(i8, i9, i10, i11);
    }

    public static final void updatePaddingRelative(View view, @Px int i8, @Px int i9, @Px int i10, @Px int i11) {
        view.setPaddingRelative(i8, i9, i10, i11);
    }

    public static /* synthetic */ void updatePaddingRelative$default(View view, int i8, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i8 = view.getPaddingStart();
        }
        if ((i12 & 2) != 0) {
            i9 = view.getPaddingTop();
        }
        if ((i12 & 4) != 0) {
            i10 = view.getPaddingEnd();
        }
        if ((i12 & 8) != 0) {
            i11 = view.getPaddingBottom();
        }
        view.setPaddingRelative(i8, i9, i10, i11);
    }
}
