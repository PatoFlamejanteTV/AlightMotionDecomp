package androidx.browser.customtabs;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.annotation.AnimRes;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.browser.customtabs.CustomTabColorSchemeParams;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.content.ContextCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class CustomTabsIntent {
    public static final int ACTIVITY_HEIGHT_ADJUSTABLE = 1;
    public static final int ACTIVITY_HEIGHT_DEFAULT = 0;
    public static final int ACTIVITY_HEIGHT_FIXED = 2;
    private static final int ACTIVITY_HEIGHT_MAX = 2;
    public static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_DEFAULT = 0;
    public static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_DIVIDER = 3;
    private static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_MAX = 3;
    public static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_NONE = 1;
    public static final int ACTIVITY_SIDE_SHEET_DECORATION_TYPE_SHADOW = 2;
    public static final int ACTIVITY_SIDE_SHEET_POSITION_DEFAULT = 0;
    public static final int ACTIVITY_SIDE_SHEET_POSITION_END = 2;
    private static final int ACTIVITY_SIDE_SHEET_POSITION_MAX = 2;
    public static final int ACTIVITY_SIDE_SHEET_POSITION_START = 1;
    public static final int ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION_DEFAULT = 0;
    private static final int ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION_MAX = 2;
    public static final int ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION_NONE = 1;
    public static final int ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION_TOP = 2;
    public static final int CLOSE_BUTTON_POSITION_DEFAULT = 0;
    public static final int CLOSE_BUTTON_POSITION_END = 2;
    private static final int CLOSE_BUTTON_POSITION_MAX = 2;
    public static final int CLOSE_BUTTON_POSITION_START = 1;
    public static final int COLOR_SCHEME_DARK = 2;
    public static final int COLOR_SCHEME_LIGHT = 1;
    private static final int COLOR_SCHEME_MAX = 2;
    public static final int COLOR_SCHEME_SYSTEM = 0;
    public static final String EXTRA_ACTION_BUTTON_BUNDLE = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE";
    public static final String EXTRA_ACTIVITY_HEIGHT_RESIZE_BEHAVIOR = "androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR";
    public static final String EXTRA_ACTIVITY_SIDE_SHEET_BREAKPOINT_DP = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_BREAKPOINT_DP";
    public static final String EXTRA_ACTIVITY_SIDE_SHEET_DECORATION_TYPE = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_DECORATION_TYPE";
    public static final String EXTRA_ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION";
    public static final String EXTRA_ACTIVITY_SIDE_SHEET_POSITION = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_POSITION";
    public static final String EXTRA_ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION";
    public static final String EXTRA_CLOSE_BUTTON_ICON = "android.support.customtabs.extra.CLOSE_BUTTON_ICON";
    public static final String EXTRA_CLOSE_BUTTON_POSITION = "androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION";
    public static final String EXTRA_COLOR_SCHEME = "androidx.browser.customtabs.extra.COLOR_SCHEME";
    public static final String EXTRA_COLOR_SCHEME_PARAMS = "androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS";

    @Deprecated
    public static final String EXTRA_DEFAULT_SHARE_MENU_ITEM = "android.support.customtabs.extra.SHARE_MENU_ITEM";
    public static final String EXTRA_DISABLE_BACKGROUND_INTERACTION = "androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION";
    public static final String EXTRA_DISABLE_BOOKMARKS_BUTTON = "org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON";
    public static final String EXTRA_DISABLE_DOWNLOAD_BUTTON = "org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON";
    public static final String EXTRA_ENABLE_INSTANT_APPS = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS";
    public static final String EXTRA_ENABLE_URLBAR_HIDING = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING";
    public static final String EXTRA_EXIT_ANIMATION_BUNDLE = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE";
    public static final String EXTRA_INITIAL_ACTIVITY_HEIGHT_PX = "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX";
    public static final String EXTRA_INITIAL_ACTIVITY_WIDTH_PX = "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_WIDTH_PX";
    public static final String EXTRA_MENU_ITEMS = "android.support.customtabs.extra.MENU_ITEMS";
    public static final String EXTRA_NAVIGATION_BAR_COLOR = "androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR";
    public static final String EXTRA_NAVIGATION_BAR_DIVIDER_COLOR = "androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR";
    public static final String EXTRA_REMOTEVIEWS = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS";
    public static final String EXTRA_REMOTEVIEWS_CLICKED_ID = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID";
    public static final String EXTRA_REMOTEVIEWS_PENDINGINTENT = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT";
    public static final String EXTRA_REMOTEVIEWS_VIEW_IDS = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS";
    public static final String EXTRA_SECONDARY_TOOLBAR_COLOR = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR";
    public static final String EXTRA_SECONDARY_TOOLBAR_SWIPE_UP_GESTURE = "androidx.browser.customtabs.extra.SECONDARY_TOOLBAR_SWIPE_UP_GESTURE";
    public static final String EXTRA_SEND_TO_EXTERNAL_DEFAULT_HANDLER = "android.support.customtabs.extra.SEND_TO_EXTERNAL_HANDLER";
    public static final String EXTRA_SESSION = "android.support.customtabs.extra.SESSION";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String EXTRA_SESSION_ID = "android.support.customtabs.extra.SESSION_ID";
    public static final String EXTRA_SHARE_STATE = "androidx.browser.customtabs.extra.SHARE_STATE";
    public static final String EXTRA_TINT_ACTION_BUTTON = "android.support.customtabs.extra.TINT_ACTION_BUTTON";
    public static final String EXTRA_TITLE_VISIBILITY_STATE = "android.support.customtabs.extra.TITLE_VISIBILITY";
    public static final String EXTRA_TOOLBAR_COLOR = "android.support.customtabs.extra.TOOLBAR_COLOR";
    public static final String EXTRA_TOOLBAR_CORNER_RADIUS_DP = "androidx.browser.customtabs.extra.TOOLBAR_CORNER_RADIUS_DP";
    public static final String EXTRA_TOOLBAR_ITEMS = "android.support.customtabs.extra.TOOLBAR_ITEMS";
    public static final String EXTRA_TRANSLATE_LANGUAGE_TAG = "androidx.browser.customtabs.extra.TRANSLATE_LANGUAGE_TAG";
    private static final String EXTRA_USER_OPT_OUT_FROM_CUSTOM_TABS = "android.support.customtabs.extra.user_opt_out";
    private static final String HTTP_ACCEPT_LANGUAGE = "Accept-Language";
    public static final String KEY_DESCRIPTION = "android.support.customtabs.customaction.DESCRIPTION";
    public static final String KEY_ICON = "android.support.customtabs.customaction.ICON";
    public static final String KEY_ID = "android.support.customtabs.customaction.ID";
    public static final String KEY_MENU_ITEM_TITLE = "android.support.customtabs.customaction.MENU_ITEM_TITLE";
    public static final String KEY_PENDING_INTENT = "android.support.customtabs.customaction.PENDING_INTENT";
    private static final int MAX_TOOLBAR_CORNER_RADIUS_DP = 16;
    private static final int MAX_TOOLBAR_ITEMS = 5;
    public static final int NO_TITLE = 0;
    public static final int SHARE_STATE_DEFAULT = 0;
    private static final int SHARE_STATE_MAX = 2;
    public static final int SHARE_STATE_OFF = 2;
    public static final int SHARE_STATE_ON = 1;
    public static final int SHOW_PAGE_TITLE = 1;
    public static final int TOOLBAR_ACTION_BUTTON_ID = 0;

    @NonNull
    public final Intent intent;

    @Nullable
    public final Bundle startAnimationBundle;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface ActivityHeightResizeBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface ActivitySideSheetDecorationType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface ActivitySideSheetPosition {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface ActivitySideSheetRoundedCornersPosition {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 21)
    /* loaded from: classes.dex */
    public static class Api21Impl {
        private Api21Impl() {
        }

        @Nullable
        @DoNotInline
        static Locale getLocaleForLanguageTag(Intent intent) {
            String stringExtra = intent.getStringExtra(CustomTabsIntent.EXTRA_TRANSLATE_LANGUAGE_TAG);
            if (stringExtra != null) {
                return Locale.forLanguageTag(stringExtra);
            }
            return null;
        }

        @DoNotInline
        static void setLanguageTag(Intent intent, Locale locale) {
            intent.putExtra(CustomTabsIntent.EXTRA_TRANSLATE_LANGUAGE_TAG, locale.toLanguageTag());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 23)
    /* loaded from: classes.dex */
    public static class Api23Impl {
        private Api23Impl() {
        }

        @DoNotInline
        static ActivityOptions makeBasicActivityOptions() {
            return ActivityOptions.makeBasic();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 24)
    /* loaded from: classes.dex */
    public static class Api24Impl {
        private Api24Impl() {
        }

        @Nullable
        @DoNotInline
        static String getDefaultLocale() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 34)
    /* loaded from: classes.dex */
    public static class Api34Impl {
        private Api34Impl() {
        }

        @DoNotInline
        static void setShareIdentityEnabled(ActivityOptions activityOptions, boolean z8) {
            activityOptions.setShareIdentityEnabled(z8);
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder {

        @Nullable
        private ArrayList<Bundle> mActionButtons;

        @Nullable
        private ActivityOptions mActivityOptions;

        @Nullable
        private SparseArray<Bundle> mColorSchemeParamBundles;

        @Nullable
        private Bundle mDefaultColorSchemeBundle;

        @Nullable
        private ArrayList<Bundle> mMenuItems;
        private boolean mShareIdentity;
        private final Intent mIntent = new Intent("android.intent.action.VIEW");
        private final CustomTabColorSchemeParams.Builder mDefaultColorSchemeBuilder = new CustomTabColorSchemeParams.Builder();
        private int mShareState = 0;
        private boolean mInstantAppsEnabled = true;

        public Builder() {
        }

        @RequiresApi(api = 24)
        private void setCurrentLocaleAsDefaultAcceptLanguage() {
            Bundle bundle;
            String defaultLocale = Api24Impl.getDefaultLocale();
            if (!TextUtils.isEmpty(defaultLocale)) {
                if (this.mIntent.hasExtra("com.android.browser.headers")) {
                    bundle = this.mIntent.getBundleExtra("com.android.browser.headers");
                } else {
                    bundle = new Bundle();
                }
                if (!bundle.containsKey(CustomTabsIntent.HTTP_ACCEPT_LANGUAGE)) {
                    bundle.putString(CustomTabsIntent.HTTP_ACCEPT_LANGUAGE, defaultLocale);
                    this.mIntent.putExtra("com.android.browser.headers", bundle);
                }
            }
        }

        @RequiresApi(api = 24)
        private void setLanguageTag(@NonNull Locale locale) {
            Api21Impl.setLanguageTag(this.mIntent, locale);
        }

        private void setSessionParameters(@Nullable IBinder iBinder, @Nullable PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder(CustomTabsIntent.EXTRA_SESSION, iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable(CustomTabsIntent.EXTRA_SESSION_ID, pendingIntent);
            }
            this.mIntent.putExtras(bundle);
        }

        @NonNull
        @Deprecated
        public Builder addDefaultShareMenuItem() {
            setShareState(1);
            return this;
        }

        @NonNull
        public Builder addMenuItem(@NonNull String str, @NonNull PendingIntent pendingIntent) {
            if (this.mMenuItems == null) {
                this.mMenuItems = new ArrayList<>();
            }
            Bundle bundle = new Bundle();
            bundle.putString(CustomTabsIntent.KEY_MENU_ITEM_TITLE, str);
            bundle.putParcelable(CustomTabsIntent.KEY_PENDING_INTENT, pendingIntent);
            this.mMenuItems.add(bundle);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder addToolbarItem(int i8, @NonNull Bitmap bitmap, @NonNull String str, @NonNull PendingIntent pendingIntent) throws IllegalStateException {
            if (this.mActionButtons == null) {
                this.mActionButtons = new ArrayList<>();
            }
            if (this.mActionButtons.size() < 5) {
                Bundle bundle = new Bundle();
                bundle.putInt(CustomTabsIntent.KEY_ID, i8);
                bundle.putParcelable(CustomTabsIntent.KEY_ICON, bitmap);
                bundle.putString(CustomTabsIntent.KEY_DESCRIPTION, str);
                bundle.putParcelable(CustomTabsIntent.KEY_PENDING_INTENT, pendingIntent);
                this.mActionButtons.add(bundle);
                return this;
            }
            throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
        }

        @NonNull
        public CustomTabsIntent build() {
            Bundle bundle = null;
            if (!this.mIntent.hasExtra(CustomTabsIntent.EXTRA_SESSION)) {
                setSessionParameters(null, null);
            }
            ArrayList<Bundle> arrayList = this.mMenuItems;
            if (arrayList != null) {
                this.mIntent.putParcelableArrayListExtra(CustomTabsIntent.EXTRA_MENU_ITEMS, arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.mActionButtons;
            if (arrayList2 != null) {
                this.mIntent.putParcelableArrayListExtra(CustomTabsIntent.EXTRA_TOOLBAR_ITEMS, arrayList2);
            }
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_ENABLE_INSTANT_APPS, this.mInstantAppsEnabled);
            this.mIntent.putExtras(this.mDefaultColorSchemeBuilder.build().toBundle());
            Bundle bundle2 = this.mDefaultColorSchemeBundle;
            if (bundle2 != null) {
                this.mIntent.putExtras(bundle2);
            }
            if (this.mColorSchemeParamBundles != null) {
                Bundle bundle3 = new Bundle();
                bundle3.putSparseParcelableArray(CustomTabsIntent.EXTRA_COLOR_SCHEME_PARAMS, this.mColorSchemeParamBundles);
                this.mIntent.putExtras(bundle3);
            }
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_SHARE_STATE, this.mShareState);
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 24) {
                setCurrentLocaleAsDefaultAcceptLanguage();
            }
            if (i8 >= 34) {
                setShareIdentityEnabled();
            }
            ActivityOptions activityOptions = this.mActivityOptions;
            if (activityOptions != null) {
                bundle = activityOptions.toBundle();
            }
            return new CustomTabsIntent(this.mIntent, bundle);
        }

        @NonNull
        @Deprecated
        public Builder enableUrlBarHiding() {
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_ENABLE_URLBAR_HIDING, true);
            return this;
        }

        @NonNull
        public Builder setActionButton(@NonNull Bitmap bitmap, @NonNull String str, @NonNull PendingIntent pendingIntent, boolean z8) {
            Bundle bundle = new Bundle();
            bundle.putInt(CustomTabsIntent.KEY_ID, 0);
            bundle.putParcelable(CustomTabsIntent.KEY_ICON, bitmap);
            bundle.putString(CustomTabsIntent.KEY_DESCRIPTION, str);
            bundle.putParcelable(CustomTabsIntent.KEY_PENDING_INTENT, pendingIntent);
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_ACTION_BUTTON_BUNDLE, bundle);
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_TINT_ACTION_BUTTON, z8);
            return this;
        }

        @NonNull
        public Builder setActivitySideSheetBreakpointDp(@Dimension(unit = 0) int i8) {
            if (i8 > 0) {
                this.mIntent.putExtra(CustomTabsIntent.EXTRA_ACTIVITY_SIDE_SHEET_BREAKPOINT_DP, i8);
                return this;
            }
            throw new IllegalArgumentException("Invalid value for the initialWidthPx argument");
        }

        @NonNull
        public Builder setActivitySideSheetDecorationType(int i8) {
            if (i8 >= 0 && i8 <= 3) {
                this.mIntent.putExtra(CustomTabsIntent.EXTRA_ACTIVITY_SIDE_SHEET_DECORATION_TYPE, i8);
                return this;
            }
            throw new IllegalArgumentException("Invalid value for the decorationType argument");
        }

        @NonNull
        public Builder setActivitySideSheetMaximizationEnabled(boolean z8) {
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION, z8);
            return this;
        }

        @NonNull
        public Builder setActivitySideSheetPosition(int i8) {
            if (i8 >= 0 && i8 <= 2) {
                this.mIntent.putExtra(CustomTabsIntent.EXTRA_ACTIVITY_SIDE_SHEET_POSITION, i8);
                return this;
            }
            throw new IllegalArgumentException("Invalid value for the sideSheetPosition argument");
        }

        @NonNull
        public Builder setActivitySideSheetRoundedCornersPosition(int i8) {
            if (i8 >= 0 && i8 <= 2) {
                this.mIntent.putExtra(CustomTabsIntent.EXTRA_ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION, i8);
                return this;
            }
            throw new IllegalArgumentException("Invalid value for the roundedCornersPosition./ argument");
        }

        @NonNull
        public Builder setBackgroundInteractionEnabled(boolean z8) {
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_DISABLE_BACKGROUND_INTERACTION, !z8);
            return this;
        }

        @NonNull
        public Builder setBookmarksButtonEnabled(boolean z8) {
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_DISABLE_BOOKMARKS_BUTTON, !z8);
            return this;
        }

        @NonNull
        public Builder setCloseButtonIcon(@NonNull Bitmap bitmap) {
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_CLOSE_BUTTON_ICON, bitmap);
            return this;
        }

        @NonNull
        public Builder setCloseButtonPosition(int i8) {
            if (i8 >= 0 && i8 <= 2) {
                this.mIntent.putExtra(CustomTabsIntent.EXTRA_CLOSE_BUTTON_POSITION, i8);
                return this;
            }
            throw new IllegalArgumentException("Invalid value for the position argument");
        }

        @NonNull
        public Builder setColorScheme(int i8) {
            if (i8 >= 0 && i8 <= 2) {
                this.mIntent.putExtra(CustomTabsIntent.EXTRA_COLOR_SCHEME, i8);
                return this;
            }
            throw new IllegalArgumentException("Invalid value for the colorScheme argument");
        }

        @NonNull
        public Builder setColorSchemeParams(int i8, @NonNull CustomTabColorSchemeParams customTabColorSchemeParams) {
            if (i8 >= 0 && i8 <= 2 && i8 != 0) {
                if (this.mColorSchemeParamBundles == null) {
                    this.mColorSchemeParamBundles = new SparseArray<>();
                }
                this.mColorSchemeParamBundles.put(i8, customTabColorSchemeParams.toBundle());
                return this;
            }
            throw new IllegalArgumentException("Invalid colorScheme: " + i8);
        }

        @NonNull
        public Builder setDefaultColorSchemeParams(@NonNull CustomTabColorSchemeParams customTabColorSchemeParams) {
            this.mDefaultColorSchemeBundle = customTabColorSchemeParams.toBundle();
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setDefaultShareMenuItemEnabled(boolean z8) {
            if (z8) {
                setShareState(1);
            } else {
                setShareState(2);
            }
            return this;
        }

        @NonNull
        public Builder setDownloadButtonEnabled(boolean z8) {
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_DISABLE_DOWNLOAD_BUTTON, !z8);
            return this;
        }

        @NonNull
        public Builder setExitAnimations(@NonNull Context context, @AnimRes int i8, @AnimRes int i9) {
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_EXIT_ANIMATION_BUNDLE, ActivityOptionsCompat.makeCustomAnimation(context, i8, i9).toBundle());
            return this;
        }

        @NonNull
        public Builder setInitialActivityHeightPx(@Dimension(unit = 1) int i8, int i9) {
            if (i8 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            if (i9 >= 0 && i9 <= 2) {
                this.mIntent.putExtra(CustomTabsIntent.EXTRA_INITIAL_ACTIVITY_HEIGHT_PX, i8);
                this.mIntent.putExtra(CustomTabsIntent.EXTRA_ACTIVITY_HEIGHT_RESIZE_BEHAVIOR, i9);
                return this;
            }
            throw new IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
        }

        @NonNull
        public Builder setInitialActivityWidthPx(@Dimension(unit = 1) int i8) {
            if (i8 > 0) {
                this.mIntent.putExtra(CustomTabsIntent.EXTRA_INITIAL_ACTIVITY_WIDTH_PX, i8);
                return this;
            }
            throw new IllegalArgumentException("Invalid value for the initialWidthPx argument");
        }

        @NonNull
        public Builder setInstantAppsEnabled(boolean z8) {
            this.mInstantAppsEnabled = z8;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setNavigationBarColor(@ColorInt int i8) {
            this.mDefaultColorSchemeBuilder.setNavigationBarColor(i8);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setNavigationBarDividerColor(@ColorInt int i8) {
            this.mDefaultColorSchemeBuilder.setNavigationBarDividerColor(i8);
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder setPendingSession(@NonNull CustomTabsSession.PendingSession pendingSession) {
            setSessionParameters(null, pendingSession.getId());
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setSecondaryToolbarColor(@ColorInt int i8) {
            this.mDefaultColorSchemeBuilder.setSecondaryToolbarColor(i8);
            return this;
        }

        @NonNull
        public Builder setSecondaryToolbarSwipeUpGesture(@Nullable PendingIntent pendingIntent) {
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_SECONDARY_TOOLBAR_SWIPE_UP_GESTURE, pendingIntent);
            return this;
        }

        @NonNull
        public Builder setSecondaryToolbarViews(@NonNull RemoteViews remoteViews, @Nullable int[] iArr, @Nullable PendingIntent pendingIntent) {
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_REMOTEVIEWS, remoteViews);
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_REMOTEVIEWS_VIEW_IDS, iArr);
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_REMOTEVIEWS_PENDINGINTENT, pendingIntent);
            return this;
        }

        @NonNull
        public Builder setSendToExternalDefaultHandlerEnabled(boolean z8) {
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_SEND_TO_EXTERNAL_DEFAULT_HANDLER, z8);
            return this;
        }

        @NonNull
        public Builder setSession(@NonNull CustomTabsSession customTabsSession) {
            this.mIntent.setPackage(customTabsSession.getComponentName().getPackageName());
            setSessionParameters(customTabsSession.getBinder(), customTabsSession.getId());
            return this;
        }

        @NonNull
        public Builder setShareIdentityEnabled(boolean z8) {
            this.mShareIdentity = z8;
            return this;
        }

        @NonNull
        public Builder setShareState(int i8) {
            if (i8 >= 0 && i8 <= 2) {
                this.mShareState = i8;
                if (i8 == 1) {
                    this.mIntent.putExtra(CustomTabsIntent.EXTRA_DEFAULT_SHARE_MENU_ITEM, true);
                } else if (i8 == 2) {
                    this.mIntent.putExtra(CustomTabsIntent.EXTRA_DEFAULT_SHARE_MENU_ITEM, false);
                } else {
                    this.mIntent.removeExtra(CustomTabsIntent.EXTRA_DEFAULT_SHARE_MENU_ITEM);
                }
                return this;
            }
            throw new IllegalArgumentException("Invalid value for the shareState argument");
        }

        @NonNull
        public Builder setShowTitle(boolean z8) {
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_TITLE_VISIBILITY_STATE, z8 ? 1 : 0);
            return this;
        }

        @NonNull
        public Builder setStartAnimations(@NonNull Context context, @AnimRes int i8, @AnimRes int i9) {
            this.mActivityOptions = ActivityOptions.makeCustomAnimation(context, i8, i9);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setToolbarColor(@ColorInt int i8) {
            this.mDefaultColorSchemeBuilder.setToolbarColor(i8);
            return this;
        }

        @NonNull
        public Builder setToolbarCornerRadiusDp(@Dimension(unit = 0) int i8) {
            if (i8 >= 0 && i8 <= 16) {
                this.mIntent.putExtra(CustomTabsIntent.EXTRA_TOOLBAR_CORNER_RADIUS_DP, i8);
                return this;
            }
            throw new IllegalArgumentException("Invalid value for the cornerRadiusDp argument");
        }

        @NonNull
        public Builder setTranslateLocale(@NonNull Locale locale) {
            if (Build.VERSION.SDK_INT >= 24) {
                setLanguageTag(locale);
            }
            return this;
        }

        @NonNull
        public Builder setUrlBarHidingEnabled(boolean z8) {
            this.mIntent.putExtra(CustomTabsIntent.EXTRA_ENABLE_URLBAR_HIDING, z8);
            return this;
        }

        @RequiresApi(api = 34)
        private void setShareIdentityEnabled() {
            if (this.mActivityOptions == null) {
                this.mActivityOptions = Api23Impl.makeBasicActivityOptions();
            }
            Api34Impl.setShareIdentityEnabled(this.mActivityOptions, this.mShareIdentity);
        }

        @NonNull
        public Builder setInitialActivityHeightPx(@Dimension(unit = 1) int i8) {
            return setInitialActivityHeightPx(i8, 0);
        }

        public Builder(@Nullable CustomTabsSession customTabsSession) {
            if (customTabsSession != null) {
                setSession(customTabsSession);
            }
        }

        @NonNull
        public Builder setActionButton(@NonNull Bitmap bitmap, @NonNull String str, @NonNull PendingIntent pendingIntent) {
            return setActionButton(bitmap, str, pendingIntent, false);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface CloseButtonPosition {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface ColorScheme {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface ShareState {
    }

    CustomTabsIntent(@NonNull Intent intent, @Nullable Bundle bundle) {
        this.intent = intent;
        this.startAnimationBundle = bundle;
    }

    public static int getActivityResizeBehavior(@NonNull Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_HEIGHT_RESIZE_BEHAVIOR, 0);
    }

    @Dimension(unit = 0)
    public static int getActivitySideSheetBreakpointDp(@NonNull Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_SIDE_SHEET_BREAKPOINT_DP, 0);
    }

    public static int getActivitySideSheetDecorationType(@NonNull Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_SIDE_SHEET_DECORATION_TYPE, 0);
    }

    public static int getActivitySideSheetPosition(@NonNull Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_SIDE_SHEET_POSITION, 0);
    }

    public static int getActivitySideSheetRoundedCornersPosition(@NonNull Intent intent) {
        return intent.getIntExtra(EXTRA_ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION, 0);
    }

    public static int getCloseButtonPosition(@NonNull Intent intent) {
        return intent.getIntExtra(EXTRA_CLOSE_BUTTON_POSITION, 0);
    }

    @NonNull
    public static CustomTabColorSchemeParams getColorSchemeParams(@NonNull Intent intent, int i8) {
        Bundle bundle;
        if (i8 >= 0 && i8 <= 2 && i8 != 0) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return CustomTabColorSchemeParams.fromBundle(null);
            }
            CustomTabColorSchemeParams fromBundle = CustomTabColorSchemeParams.fromBundle(extras);
            SparseArray sparseParcelableArray = extras.getSparseParcelableArray(EXTRA_COLOR_SCHEME_PARAMS);
            if (sparseParcelableArray != null && (bundle = (Bundle) sparseParcelableArray.get(i8)) != null) {
                return CustomTabColorSchemeParams.fromBundle(bundle).withDefaults(fromBundle);
            }
            return fromBundle;
        }
        throw new IllegalArgumentException("Invalid colorScheme: " + i8);
    }

    @Dimension(unit = 1)
    public static int getInitialActivityHeightPx(@NonNull Intent intent) {
        return intent.getIntExtra(EXTRA_INITIAL_ACTIVITY_HEIGHT_PX, 0);
    }

    @Dimension(unit = 1)
    public static int getInitialActivityWidthPx(@NonNull Intent intent) {
        return intent.getIntExtra(EXTRA_INITIAL_ACTIVITY_WIDTH_PX, 0);
    }

    @Nullable
    @RequiresApi(api = 24)
    private static Locale getLocaleForLanguageTag(Intent intent) {
        return Api21Impl.getLocaleForLanguageTag(intent);
    }

    public static int getMaxToolbarItems() {
        return 5;
    }

    @Nullable
    public static PendingIntent getSecondaryToolbarSwipeUpGesture(@NonNull Intent intent) {
        return (PendingIntent) intent.getParcelableExtra(EXTRA_SECONDARY_TOOLBAR_SWIPE_UP_GESTURE);
    }

    @Dimension(unit = 0)
    public static int getToolbarCornerRadiusDp(@NonNull Intent intent) {
        return intent.getIntExtra(EXTRA_TOOLBAR_CORNER_RADIUS_DP, 16);
    }

    @Nullable
    public static Locale getTranslateLocale(@NonNull Intent intent) {
        if (Build.VERSION.SDK_INT >= 24) {
            return getLocaleForLanguageTag(intent);
        }
        return null;
    }

    public static boolean isActivitySideSheetMaximizationEnabled(@NonNull Intent intent) {
        return intent.getBooleanExtra(EXTRA_ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION, false);
    }

    public static boolean isBackgroundInteractionEnabled(@NonNull Intent intent) {
        return !intent.getBooleanExtra(EXTRA_DISABLE_BACKGROUND_INTERACTION, false);
    }

    public static boolean isBookmarksButtonEnabled(@NonNull Intent intent) {
        return !intent.getBooleanExtra(EXTRA_DISABLE_BOOKMARKS_BUTTON, false);
    }

    public static boolean isDownloadButtonEnabled(@NonNull Intent intent) {
        return !intent.getBooleanExtra(EXTRA_DISABLE_DOWNLOAD_BUTTON, false);
    }

    public static boolean isSendToExternalDefaultHandlerEnabled(@NonNull Intent intent) {
        return intent.getBooleanExtra(EXTRA_SEND_TO_EXTERNAL_DEFAULT_HANDLER, false);
    }

    @NonNull
    public static Intent setAlwaysUseBrowserUI(@Nullable Intent intent) {
        if (intent == null) {
            intent = new Intent("android.intent.action.VIEW");
        }
        intent.addFlags(268435456);
        intent.putExtra(EXTRA_USER_OPT_OUT_FROM_CUSTOM_TABS, true);
        return intent;
    }

    public static boolean shouldAlwaysUseBrowserUI(@NonNull Intent intent) {
        if (!intent.getBooleanExtra(EXTRA_USER_OPT_OUT_FROM_CUSTOM_TABS, false) || (intent.getFlags() & 268435456) == 0) {
            return false;
        }
        return true;
    }

    public void launchUrl(@NonNull Context context, @NonNull Uri uri) {
        this.intent.setData(uri);
        ContextCompat.startActivity(context, this.intent, this.startAnimationBundle);
    }
}
