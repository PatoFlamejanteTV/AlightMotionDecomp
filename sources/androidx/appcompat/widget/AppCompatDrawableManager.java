package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.graphics.ColorUtils;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class AppCompatDrawableManager {
    private static final boolean DEBUG = false;
    private static final PorterDuff.Mode DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    private static AppCompatDrawableManager INSTANCE = null;
    private static final String TAG = "AppCompatDrawableManag";
    private ResourceManagerInternal mResourceManager;

    public static synchronized AppCompatDrawableManager get() {
        AppCompatDrawableManager appCompatDrawableManager;
        synchronized (AppCompatDrawableManager.class) {
            try {
                if (INSTANCE == null) {
                    preload();
                }
                appCompatDrawableManager = INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return appCompatDrawableManager;
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i8, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (AppCompatDrawableManager.class) {
            porterDuffColorFilter = ResourceManagerInternal.getPorterDuffColorFilter(i8, mode);
        }
        return porterDuffColorFilter;
    }

    public static synchronized void preload() {
        synchronized (AppCompatDrawableManager.class) {
            if (INSTANCE == null) {
                AppCompatDrawableManager appCompatDrawableManager = new AppCompatDrawableManager();
                INSTANCE = appCompatDrawableManager;
                appCompatDrawableManager.mResourceManager = ResourceManagerInternal.get();
                INSTANCE.mResourceManager.setHooks(new ResourceManagerInternal.ResourceManagerHooks() { // from class: androidx.appcompat.widget.AppCompatDrawableManager.1
                    private final int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                    private final int[] TINT_COLOR_CONTROL_NORMAL = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                    private final int[] COLORFILTER_COLOR_CONTROL_ACTIVATED = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                    private final int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                    private final int[] TINT_COLOR_CONTROL_STATE_LIST = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                    private final int[] TINT_CHECKABLE_BUTTON_LIST = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

                    private boolean arrayContains(int[] iArr, int i8) {
                        for (int i9 : iArr) {
                            if (i9 == i8) {
                                return true;
                            }
                        }
                        return false;
                    }

                    private ColorStateList createBorderlessButtonColorStateList(@NonNull Context context) {
                        return createButtonColorStateList(context, 0);
                    }

                    private ColorStateList createButtonColorStateList(@NonNull Context context, @ColorInt int i8) {
                        int themeAttrColor = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlHighlight);
                        return new ColorStateList(new int[][]{ThemeUtils.DISABLED_STATE_SET, ThemeUtils.PRESSED_STATE_SET, ThemeUtils.FOCUSED_STATE_SET, ThemeUtils.EMPTY_STATE_SET}, new int[]{ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorButtonNormal), ColorUtils.compositeColors(themeAttrColor, i8), ColorUtils.compositeColors(themeAttrColor, i8), i8});
                    }

                    private ColorStateList createColoredButtonColorStateList(@NonNull Context context) {
                        return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, R.attr.colorAccent));
                    }

                    private ColorStateList createDefaultButtonColorStateList(@NonNull Context context) {
                        return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, R.attr.colorButtonNormal));
                    }

                    private ColorStateList createSwitchThumbColorStateList(Context context) {
                        int[][] iArr = new int[3];
                        int[] iArr2 = new int[3];
                        int i8 = R.attr.colorSwitchThumbNormal;
                        ColorStateList themeAttrColorStateList = ThemeUtils.getThemeAttrColorStateList(context, i8);
                        if (themeAttrColorStateList != null && themeAttrColorStateList.isStateful()) {
                            int[] iArr3 = ThemeUtils.DISABLED_STATE_SET;
                            iArr[0] = iArr3;
                            iArr2[0] = themeAttrColorStateList.getColorForState(iArr3, 0);
                            iArr[1] = ThemeUtils.CHECKED_STATE_SET;
                            iArr2[1] = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated);
                            iArr[2] = ThemeUtils.EMPTY_STATE_SET;
                            iArr2[2] = themeAttrColorStateList.getDefaultColor();
                        } else {
                            iArr[0] = ThemeUtils.DISABLED_STATE_SET;
                            iArr2[0] = ThemeUtils.getDisabledThemeAttrColor(context, i8);
                            iArr[1] = ThemeUtils.CHECKED_STATE_SET;
                            iArr2[1] = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated);
                            iArr[2] = ThemeUtils.EMPTY_STATE_SET;
                            iArr2[2] = ThemeUtils.getThemeAttrColor(context, i8);
                        }
                        return new ColorStateList(iArr, iArr2);
                    }

                    private LayerDrawable getRatingBarLayerDrawable(@NonNull ResourceManagerInternal resourceManagerInternal, @NonNull Context context, @DimenRes int i8) {
                        BitmapDrawable bitmapDrawable;
                        BitmapDrawable bitmapDrawable2;
                        BitmapDrawable bitmapDrawable3;
                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i8);
                        Drawable drawable = resourceManagerInternal.getDrawable(context, R.drawable.abc_star_black_48dp);
                        Drawable drawable2 = resourceManagerInternal.getDrawable(context, R.drawable.abc_star_half_black_48dp);
                        if ((drawable instanceof BitmapDrawable) && drawable.getIntrinsicWidth() == dimensionPixelSize && drawable.getIntrinsicHeight() == dimensionPixelSize) {
                            bitmapDrawable = (BitmapDrawable) drawable;
                            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
                        } else {
                            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                            drawable.draw(canvas);
                            bitmapDrawable = new BitmapDrawable(createBitmap);
                            bitmapDrawable2 = new BitmapDrawable(createBitmap);
                        }
                        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
                        if ((drawable2 instanceof BitmapDrawable) && drawable2.getIntrinsicWidth() == dimensionPixelSize && drawable2.getIntrinsicHeight() == dimensionPixelSize) {
                            bitmapDrawable3 = (BitmapDrawable) drawable2;
                        } else {
                            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                            Canvas canvas2 = new Canvas(createBitmap2);
                            drawable2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                            drawable2.draw(canvas2);
                            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
                        }
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
                        layerDrawable.setId(0, android.R.id.background);
                        layerDrawable.setId(1, android.R.id.secondaryProgress);
                        layerDrawable.setId(2, android.R.id.progress);
                        return layerDrawable;
                    }

                    private void setPorterDuffColorFilter(Drawable drawable, int i8, PorterDuff.Mode mode) {
                        Drawable mutate = drawable.mutate();
                        if (mode == null) {
                            mode = AppCompatDrawableManager.DEFAULT_MODE;
                        }
                        mutate.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(i8, mode));
                    }

                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    public Drawable createDrawableFor(@NonNull ResourceManagerInternal resourceManagerInternal, @NonNull Context context, int i8) {
                        if (i8 == R.drawable.abc_cab_background_top_material) {
                            return new LayerDrawable(new Drawable[]{resourceManagerInternal.getDrawable(context, R.drawable.abc_cab_background_internal_bg), resourceManagerInternal.getDrawable(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
                        }
                        if (i8 == R.drawable.abc_ratingbar_material) {
                            return getRatingBarLayerDrawable(resourceManagerInternal, context, R.dimen.abc_star_big);
                        }
                        if (i8 == R.drawable.abc_ratingbar_indicator_material) {
                            return getRatingBarLayerDrawable(resourceManagerInternal, context, R.dimen.abc_star_medium);
                        }
                        if (i8 == R.drawable.abc_ratingbar_small_material) {
                            return getRatingBarLayerDrawable(resourceManagerInternal, context, R.dimen.abc_star_small);
                        }
                        return null;
                    }

                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    public ColorStateList getTintListForDrawableRes(@NonNull Context context, int i8) {
                        if (i8 == R.drawable.abc_edit_text_material) {
                            return AppCompatResources.getColorStateList(context, R.color.abc_tint_edittext);
                        }
                        if (i8 == R.drawable.abc_switch_track_mtrl_alpha) {
                            return AppCompatResources.getColorStateList(context, R.color.abc_tint_switch_track);
                        }
                        if (i8 == R.drawable.abc_switch_thumb_material) {
                            return createSwitchThumbColorStateList(context);
                        }
                        if (i8 == R.drawable.abc_btn_default_mtrl_shape) {
                            return createDefaultButtonColorStateList(context);
                        }
                        if (i8 == R.drawable.abc_btn_borderless_material) {
                            return createBorderlessButtonColorStateList(context);
                        }
                        if (i8 == R.drawable.abc_btn_colored_material) {
                            return createColoredButtonColorStateList(context);
                        }
                        if (i8 != R.drawable.abc_spinner_mtrl_am_alpha && i8 != R.drawable.abc_spinner_textfield_background_material) {
                            if (arrayContains(this.TINT_COLOR_CONTROL_NORMAL, i8)) {
                                return ThemeUtils.getThemeAttrColorStateList(context, R.attr.colorControlNormal);
                            }
                            if (arrayContains(this.TINT_COLOR_CONTROL_STATE_LIST, i8)) {
                                return AppCompatResources.getColorStateList(context, R.color.abc_tint_default);
                            }
                            if (arrayContains(this.TINT_CHECKABLE_BUTTON_LIST, i8)) {
                                return AppCompatResources.getColorStateList(context, R.color.abc_tint_btn_checkable);
                            }
                            if (i8 == R.drawable.abc_seekbar_thumb_material) {
                                return AppCompatResources.getColorStateList(context, R.color.abc_tint_seek_thumb);
                            }
                            return null;
                        }
                        return AppCompatResources.getColorStateList(context, R.color.abc_tint_spinner);
                    }

                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    public PorterDuff.Mode getTintModeForDrawableRes(int i8) {
                        if (i8 == R.drawable.abc_switch_thumb_material) {
                            return PorterDuff.Mode.MULTIPLY;
                        }
                        return null;
                    }

                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    public boolean tintDrawable(@NonNull Context context, int i8, @NonNull Drawable drawable) {
                        if (i8 == R.drawable.abc_seekbar_track_material) {
                            LayerDrawable layerDrawable = (LayerDrawable) drawable;
                            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                            int i9 = R.attr.colorControlNormal;
                            setPorterDuffColorFilter(findDrawableByLayerId, ThemeUtils.getThemeAttrColor(context, i9), AppCompatDrawableManager.DEFAULT_MODE);
                            setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), ThemeUtils.getThemeAttrColor(context, i9), AppCompatDrawableManager.DEFAULT_MODE);
                            setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(android.R.id.progress), ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated), AppCompatDrawableManager.DEFAULT_MODE);
                            return true;
                        }
                        if (i8 != R.drawable.abc_ratingbar_material && i8 != R.drawable.abc_ratingbar_indicator_material && i8 != R.drawable.abc_ratingbar_small_material) {
                            return false;
                        }
                        LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                        setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(android.R.id.background), ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorControlNormal), AppCompatDrawableManager.DEFAULT_MODE);
                        Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress);
                        int i10 = R.attr.colorControlActivated;
                        setPorterDuffColorFilter(findDrawableByLayerId2, ThemeUtils.getThemeAttrColor(context, i10), AppCompatDrawableManager.DEFAULT_MODE);
                        setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(android.R.id.progress), ThemeUtils.getThemeAttrColor(context, i10), AppCompatDrawableManager.DEFAULT_MODE);
                        return true;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:12:0x0067 A[RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0052  */
                    @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public boolean tintDrawableUsingColorFilter(@androidx.annotation.NonNull android.content.Context r7, int r8, @androidx.annotation.NonNull android.graphics.drawable.Drawable r9) {
                        /*
                            r6 = this;
                            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.AppCompatDrawableManager.access$000()
                            int[] r1 = r6.COLORFILTER_TINT_COLOR_CONTROL_NORMAL
                            boolean r1 = r6.arrayContains(r1, r8)
                            r2 = 1
                            r3 = 0
                            r4 = -1
                            if (r1 == 0) goto L15
                            int r8 = androidx.appcompat.R.attr.colorControlNormal
                        L11:
                            r1 = r0
                        L12:
                            r0 = -1
                            r5 = 1
                            goto L50
                        L15:
                            int[] r1 = r6.COLORFILTER_COLOR_CONTROL_ACTIVATED
                            boolean r1 = r6.arrayContains(r1, r8)
                            if (r1 == 0) goto L20
                            int r8 = androidx.appcompat.R.attr.colorControlActivated
                            goto L11
                        L20:
                            int[] r1 = r6.COLORFILTER_COLOR_BACKGROUND_MULTIPLY
                            boolean r1 = r6.arrayContains(r1, r8)
                            r5 = 16842801(0x1010031, float:2.3693695E-38)
                            if (r1 == 0) goto L32
                            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                        L2d:
                            r1 = r0
                            r8 = 16842801(0x1010031, float:2.3693695E-38)
                            goto L12
                        L32:
                            int r1 = androidx.appcompat.R.drawable.abc_list_divider_mtrl_alpha
                            if (r8 != r1) goto L47
                            r8 = 1109603123(0x42233333, float:40.8)
                            int r8 = java.lang.Math.round(r8)
                            r1 = 16842800(0x1010030, float:2.3693693E-38)
                            r1 = r0
                            r5 = 1
                            r0 = r8
                            r8 = 16842800(0x1010030, float:2.3693693E-38)
                            goto L50
                        L47:
                            int r1 = androidx.appcompat.R.drawable.abc_dialog_material_background
                            if (r8 != r1) goto L4c
                            goto L2d
                        L4c:
                            r1 = r0
                            r8 = 0
                            r0 = -1
                            r5 = 0
                        L50:
                            if (r5 == 0) goto L67
                            android.graphics.drawable.Drawable r9 = r9.mutate()
                            int r7 = androidx.appcompat.widget.ThemeUtils.getThemeAttrColor(r7, r8)
                            android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.AppCompatDrawableManager.getPorterDuffColorFilter(r7, r1)
                            r9.setColorFilter(r7)
                            if (r0 == r4) goto L66
                            r9.setAlpha(r0)
                        L66:
                            return r2
                        L67:
                            return r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatDrawableManager.AnonymousClass1.tintDrawableUsingColorFilter(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void tintDrawable(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        ResourceManagerInternal.tintDrawable(drawable, tintInfo, iArr);
    }

    public synchronized Drawable getDrawable(@NonNull Context context, @DrawableRes int i8) {
        return this.mResourceManager.getDrawable(context, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized ColorStateList getTintList(@NonNull Context context, @DrawableRes int i8) {
        return this.mResourceManager.getTintList(context, i8);
    }

    public synchronized void onConfigurationChanged(@NonNull Context context) {
        this.mResourceManager.onConfigurationChanged(context);
    }

    synchronized Drawable onDrawableLoadedFromResources(@NonNull Context context, @NonNull VectorEnabledTintResources vectorEnabledTintResources, @DrawableRes int i8) {
        return this.mResourceManager.onDrawableLoadedFromResources(context, vectorEnabledTintResources, i8);
    }

    boolean tintDrawableUsingColorFilter(@NonNull Context context, @DrawableRes int i8, @NonNull Drawable drawable) {
        return this.mResourceManager.tintDrawableUsingColorFilter(context, i8, drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable getDrawable(@NonNull Context context, @DrawableRes int i8, boolean z8) {
        return this.mResourceManager.getDrawable(context, i8, z8);
    }
}
