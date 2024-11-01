package androidx.appcompat.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.CallSuper;
import androidx.annotation.DoNotInline;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.view.SupportActionModeWrapper;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.DecorContentParent;
import androidx.appcompat.widget.FitWindowsViewGroup;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.appcompat.widget.ViewUtils;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.NavUtils;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.LocaleListCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.LayoutInflaterCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import j$.util.Objects;
import java.lang.Thread;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: Access modifiers changed from: package-private */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class AppCompatDelegateImpl extends AppCompatDelegate implements MenuBuilder.Callback, LayoutInflater.Factory2 {
    static final String EXCEPTION_HANDLER_MESSAGE_SUFFIX = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
    private static boolean sInstalledExceptionHandler;
    ActionBar mActionBar;
    private ActionMenuPresenterCallback mActionMenuPresenterCallback;
    ActionMode mActionMode;
    PopupWindow mActionModePopup;
    ActionBarContextView mActionModeView;
    private int mActivityHandlesConfigFlags;
    private boolean mActivityHandlesConfigFlagsChecked;
    final AppCompatCallback mAppCompatCallback;
    private AppCompatViewInflater mAppCompatViewInflater;
    private AppCompatWindowCallback mAppCompatWindowCallback;
    private AutoNightModeManager mAutoBatteryNightModeManager;
    private AutoNightModeManager mAutoTimeNightModeManager;
    private OnBackInvokedCallback mBackCallback;
    private boolean mBaseContextAttached;
    private boolean mClosingActionMenu;
    final Context mContext;
    private boolean mCreated;
    private DecorContentParent mDecorContentParent;
    boolean mDestroyed;
    private OnBackInvokedDispatcher mDispatcher;
    private Configuration mEffectiveConfiguration;
    private boolean mEnableDefaultActionBarUp;
    ViewPropertyAnimatorCompat mFadeAnim;
    private boolean mFeatureIndeterminateProgress;
    private boolean mFeatureProgress;
    private boolean mHandleNativeActionModes;
    boolean mHasActionBar;
    final Object mHost;
    int mInvalidatePanelMenuFeatures;
    boolean mInvalidatePanelMenuPosted;
    private final Runnable mInvalidatePanelMenuRunnable;
    boolean mIsFloating;
    private LayoutIncludeDetector mLayoutIncludeDetector;
    private int mLocalNightMode;
    private boolean mLongPressBackDown;
    MenuInflater mMenuInflater;
    boolean mOverlayActionBar;
    boolean mOverlayActionMode;
    private PanelMenuPresenterCallback mPanelMenuPresenterCallback;
    private PanelFeatureState[] mPanels;
    private PanelFeatureState mPreparedPanel;
    Runnable mShowActionModePopup;
    private View mStatusGuard;
    ViewGroup mSubDecor;
    private boolean mSubDecorInstalled;
    private Rect mTempRect1;
    private Rect mTempRect2;
    private int mThemeResId;
    private CharSequence mTitle;
    private TextView mTitleView;
    Window mWindow;
    boolean mWindowNoTitle;
    private static final SimpleArrayMap<String, Integer> sLocalNightModes = new SimpleArrayMap<>();
    private static final boolean IS_PRE_LOLLIPOP = false;
    private static final int[] sWindowBackgroundStyleable = {R.attr.windowBackground};
    private static final boolean sCanReturnDifferentContext = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$1, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements Thread.UncaughtExceptionHandler {
        final /* synthetic */ Thread.UncaughtExceptionHandler val$defHandler;

        AnonymousClass1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.val$defHandler = uncaughtExceptionHandler;
        }

        private boolean shouldWrapException(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            if (!message.contains("drawable") && !message.contains("Drawable")) {
                return false;
            }
            return true;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th) {
            if (shouldWrapException(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + AppCompatDelegateImpl.EXCEPTION_HANDLER_MESSAGE_SUFFIX);
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.val$defHandler.uncaughtException(thread, notFoundException);
                return;
            }
            this.val$defHandler.uncaughtException(thread, th);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$4, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass4 implements FitWindowsViewGroup.OnFitSystemWindowsListener {
        AnonymousClass4() {
        }

        @Override // androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener
        public void onFitSystemWindows(Rect rect) {
            rect.top = AppCompatDelegateImpl.this.updateStatusGuard(null, rect);
        }
    }

    /* loaded from: classes.dex */
    private class ActionBarDrawableToggleImpl implements ActionBarDrawerToggle.Delegate {
        ActionBarDrawableToggleImpl() {
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public Context getActionBarThemedContext() {
            return AppCompatDelegateImpl.this.getActionBarThemedContext();
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public Drawable getThemeUpIndicator() {
            TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getActionBarThemedContext(), (AttributeSet) null, new int[]{androidx.appcompat.R.attr.homeAsUpIndicator});
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public boolean isNavigationVisible() {
            ActionBar supportActionBar = AppCompatDelegateImpl.this.getSupportActionBar();
            if (supportActionBar != null && (supportActionBar.getDisplayOptions() & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarDescription(int i8) {
            ActionBar supportActionBar = AppCompatDelegateImpl.this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.setHomeActionContentDescription(i8);
            }
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarUpIndicator(Drawable drawable, int i8) {
            ActionBar supportActionBar = AppCompatDelegateImpl.this.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.setHomeAsUpIndicator(drawable);
                supportActionBar.setHomeActionContentDescription(i8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface ActionBarMenuCallback {
        @Nullable
        View onCreatePanelView(int i8);

        boolean onPreparePanel(int i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        ActionMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(@NonNull MenuBuilder menuBuilder, boolean z8) {
            AppCompatDelegateImpl.this.checkCloseActionMenu(menuBuilder);
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(@NonNull MenuBuilder menuBuilder) {
            Window.Callback windowCallback = AppCompatDelegateImpl.this.getWindowCallback();
            if (windowCallback != null) {
                windowCallback.onMenuOpened(108, menuBuilder);
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class ActionModeCallbackWrapperV9 implements ActionMode.Callback {
        private ActionMode.Callback mWrapped;

        public ActionModeCallbackWrapperV9(ActionMode.Callback callback) {
            this.mWrapped = callback;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.mWrapped.onActionItemClicked(actionMode, menuItem);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.mWrapped.onCreateActionMode(actionMode, menu);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.mWrapped.onDestroyActionMode(actionMode);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.mActionModePopup != null) {
                appCompatDelegateImpl.mWindow.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.mShowActionModePopup);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.mActionModeView != null) {
                appCompatDelegateImpl2.endOnGoingFadeAnimation();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.mFadeAnim = ViewCompat.animate(appCompatDelegateImpl3.mActionModeView).alpha(0.0f);
                AppCompatDelegateImpl.this.mFadeAnim.setListener(new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.ActionModeCallbackWrapperV9.1
                    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                    public void onAnimationEnd(View view) {
                        AppCompatDelegateImpl.this.mActionModeView.setVisibility(8);
                        AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
                        PopupWindow popupWindow = appCompatDelegateImpl4.mActionModePopup;
                        if (popupWindow != null) {
                            popupWindow.dismiss();
                        } else if (appCompatDelegateImpl4.mActionModeView.getParent() instanceof View) {
                            ViewCompat.requestApplyInsets((View) AppCompatDelegateImpl.this.mActionModeView.getParent());
                        }
                        AppCompatDelegateImpl.this.mActionModeView.killMode();
                        AppCompatDelegateImpl.this.mFadeAnim.setListener(null);
                        AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
                        appCompatDelegateImpl5.mFadeAnim = null;
                        ViewCompat.requestApplyInsets(appCompatDelegateImpl5.mSubDecor);
                    }
                });
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            AppCompatCallback appCompatCallback = appCompatDelegateImpl4.mAppCompatCallback;
            if (appCompatCallback != null) {
                appCompatCallback.onSupportActionModeFinished(appCompatDelegateImpl4.mActionMode);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.mActionMode = null;
            ViewCompat.requestApplyInsets(appCompatDelegateImpl5.mSubDecor);
            AppCompatDelegateImpl.this.updateBackInvokedCallbackState();
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            ViewCompat.requestApplyInsets(AppCompatDelegateImpl.this.mSubDecor);
            return this.mWrapped.onPrepareActionMode(actionMode, menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(21)
    /* loaded from: classes.dex */
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static boolean isPowerSaveMode(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        @DoNotInline
        static String toLanguageTag(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(24)
    /* loaded from: classes.dex */
    public static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        static void generateConfigDelta_locale(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            LocaleList locales;
            LocaleList locales2;
            boolean equals;
            locales = configuration.getLocales();
            locales2 = configuration2.getLocales();
            equals = locales.equals(locales2);
            if (!equals) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }

        @DoNotInline
        static LocaleListCompat getLocales(Configuration configuration) {
            LocaleList locales;
            String languageTags;
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            return LocaleListCompat.forLanguageTags(languageTags);
        }

        @DoNotInline
        public static void setDefaultLocales(LocaleListCompat localeListCompat) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(localeListCompat.toLanguageTags());
            LocaleList.setDefault(forLanguageTags);
        }

        @DoNotInline
        static void setLocales(Configuration configuration, LocaleListCompat localeListCompat) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(localeListCompat.toLanguageTags());
            configuration.setLocales(forLanguageTags);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(26)
    /* loaded from: classes.dex */
    public static class Api26Impl {
        private Api26Impl() {
        }

        static void generateConfigDelta_colorMode(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            i8 = configuration.colorMode;
            int i16 = i8 & 3;
            i9 = configuration2.colorMode;
            if (i16 != (i9 & 3)) {
                i14 = configuration3.colorMode;
                i15 = configuration2.colorMode;
                configuration3.colorMode = i14 | (i15 & 3);
            }
            i10 = configuration.colorMode;
            int i17 = i10 & 12;
            i11 = configuration2.colorMode;
            if (i17 != (i11 & 12)) {
                i12 = configuration3.colorMode;
                i13 = configuration2.colorMode;
                configuration3.colorMode = i12 | (i13 & 12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(33)
    /* loaded from: classes.dex */
    public static class Api33Impl {
        private Api33Impl() {
        }

        @DoNotInline
        static OnBackInvokedDispatcher getOnBackInvokedDispatcher(Activity activity) {
            OnBackInvokedDispatcher onBackInvokedDispatcher;
            onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher;
        }

        @DoNotInline
        static OnBackInvokedCallback registerOnBackPressedCallback(Object obj, final AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.q
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    AppCompatDelegateImpl.this.onBackPressed();
                }
            };
            m.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        @DoNotInline
        static void unregisterOnBackInvokedCallback(Object obj, Object obj2) {
            m.a(obj).unregisterOnBackInvokedCallback(l.a(obj2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class AutoBatteryNightModeManager extends AutoNightModeManager {
        private final PowerManager mPowerManager;

        AutoBatteryNightModeManager(@NonNull Context context) {
            super();
            this.mPowerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        IntentFilter createIntentFilterForBroadcastReceiver() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public int getApplyableNightMode() {
            if (Api21Impl.isPowerSaveMode(this.mPowerManager)) {
                return 2;
            }
            return 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public void onChange() {
            AppCompatDelegateImpl.this.applyDayNight();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    /* loaded from: classes.dex */
    public abstract class AutoNightModeManager {
        private BroadcastReceiver mReceiver;

        AutoNightModeManager() {
        }

        void cleanup() {
            BroadcastReceiver broadcastReceiver = this.mReceiver;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.mContext.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.mReceiver = null;
            }
        }

        @Nullable
        abstract IntentFilter createIntentFilterForBroadcastReceiver();

        abstract int getApplyableNightMode();

        boolean isListening() {
            if (this.mReceiver != null) {
                return true;
            }
            return false;
        }

        abstract void onChange();

        void setup() {
            cleanup();
            IntentFilter createIntentFilterForBroadcastReceiver = createIntentFilterForBroadcastReceiver();
            if (createIntentFilterForBroadcastReceiver != null && createIntentFilterForBroadcastReceiver.countActions() != 0) {
                if (this.mReceiver == null) {
                    this.mReceiver = new BroadcastReceiver() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager.1
                        @Override // android.content.BroadcastReceiver
                        public void onReceive(Context context, Intent intent) {
                            AutoNightModeManager.this.onChange();
                        }
                    };
                }
                AppCompatDelegateImpl.this.mContext.registerReceiver(this.mReceiver, createIntentFilterForBroadcastReceiver);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class AutoTimeNightModeManager extends AutoNightModeManager {
        private final TwilightManager mTwilightManager;

        AutoTimeNightModeManager(@NonNull TwilightManager twilightManager) {
            super();
            this.mTwilightManager = twilightManager;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        IntentFilter createIntentFilterForBroadcastReceiver() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public int getApplyableNightMode() {
            if (this.mTwilightManager.isNight()) {
                return 2;
            }
            return 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public void onChange() {
            AppCompatDelegateImpl.this.applyDayNight();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class ListMenuDecorView extends ContentFrameLayout {
        public ListMenuDecorView(Context context) {
            super(context);
        }

        private boolean isOutOfBounds(int i8, int i9) {
            if (i8 >= -5 && i9 >= -5 && i8 <= getWidth() + 5 && i9 <= getHeight() + 5) {
                return false;
            }
            return true;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!AppCompatDelegateImpl.this.dispatchKeyEvent(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && isOutOfBounds((int) motionEvent.getX(), (int) motionEvent.getY())) {
                AppCompatDelegateImpl.this.closePanel(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i8) {
            setBackgroundDrawable(AppCompatResources.getDrawable(getContext(), i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static final class PanelFeatureState {
        int background;
        View createdPanelView;
        ViewGroup decorView;
        int featureId;
        Bundle frozenActionViewState;
        Bundle frozenMenuState;
        int gravity;
        boolean isHandled;
        boolean isOpen;
        boolean isPrepared;
        ListMenuPresenter listMenuPresenter;
        Context listPresenterContext;
        MenuBuilder menu;
        public boolean qwertyMode;
        boolean refreshDecorView = false;
        boolean refreshMenuContent;
        View shownPanelView;
        boolean wasLastOpen;
        int windowAnimations;

        /* renamed from: x, reason: collision with root package name */
        int f14347x;

        /* renamed from: y, reason: collision with root package name */
        int f14348y;

        /* JADX INFO: Access modifiers changed from: private */
        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState.1
                @Override // android.os.Parcelable.Creator
                public SavedState[] newArray(int i8) {
                    return new SavedState[i8];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.ClassLoaderCreator
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.readFromParcel(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.readFromParcel(parcel, null);
                }
            };
            int featureId;
            boolean isOpen;
            Bundle menuState;

            SavedState() {
            }

            static SavedState readFromParcel(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.featureId = parcel.readInt();
                boolean z8 = true;
                if (parcel.readInt() != 1) {
                    z8 = false;
                }
                savedState.isOpen = z8;
                if (z8) {
                    savedState.menuState = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i8) {
                parcel.writeInt(this.featureId);
                parcel.writeInt(this.isOpen ? 1 : 0);
                if (this.isOpen) {
                    parcel.writeBundle(this.menuState);
                }
            }
        }

        PanelFeatureState(int i8) {
            this.featureId = i8;
        }

        void applyFrozenState() {
            Bundle bundle;
            MenuBuilder menuBuilder = this.menu;
            if (menuBuilder != null && (bundle = this.frozenMenuState) != null) {
                menuBuilder.restorePresenterStates(bundle);
                this.frozenMenuState = null;
            }
        }

        public void clearMenuPresenters() {
            MenuBuilder menuBuilder = this.menu;
            if (menuBuilder != null) {
                menuBuilder.removeMenuPresenter(this.listMenuPresenter);
            }
            this.listMenuPresenter = null;
        }

        MenuView getListMenuView(MenuPresenter.Callback callback) {
            if (this.menu == null) {
                return null;
            }
            if (this.listMenuPresenter == null) {
                ListMenuPresenter listMenuPresenter = new ListMenuPresenter(this.listPresenterContext, androidx.appcompat.R.layout.abc_list_menu_item_layout);
                this.listMenuPresenter = listMenuPresenter;
                listMenuPresenter.setCallback(callback);
                this.menu.addMenuPresenter(this.listMenuPresenter);
            }
            return this.listMenuPresenter.getMenuView(this.decorView);
        }

        public boolean hasPanelItems() {
            if (this.shownPanelView == null) {
                return false;
            }
            if (this.createdPanelView == null && this.listMenuPresenter.getAdapter().getCount() <= 0) {
                return false;
            }
            return true;
        }

        void onRestoreInstanceState(Parcelable parcelable) {
            SavedState savedState = (SavedState) parcelable;
            this.featureId = savedState.featureId;
            this.wasLastOpen = savedState.isOpen;
            this.frozenMenuState = savedState.menuState;
            this.shownPanelView = null;
            this.decorView = null;
        }

        Parcelable onSaveInstanceState() {
            SavedState savedState = new SavedState();
            savedState.featureId = this.featureId;
            savedState.isOpen = this.isOpen;
            if (this.menu != null) {
                Bundle bundle = new Bundle();
                savedState.menuState = bundle;
                this.menu.savePresenterStates(bundle);
            }
            return savedState;
        }

        void setMenu(MenuBuilder menuBuilder) {
            ListMenuPresenter listMenuPresenter;
            MenuBuilder menuBuilder2 = this.menu;
            if (menuBuilder == menuBuilder2) {
                return;
            }
            if (menuBuilder2 != null) {
                menuBuilder2.removeMenuPresenter(this.listMenuPresenter);
            }
            this.menu = menuBuilder;
            if (menuBuilder != null && (listMenuPresenter = this.listMenuPresenter) != null) {
                menuBuilder.addMenuPresenter(listMenuPresenter);
            }
        }

        void setStyle(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(androidx.appcompat.R.attr.actionBarPopupTheme, typedValue, true);
            int i8 = typedValue.resourceId;
            if (i8 != 0) {
                newTheme.applyStyle(i8, true);
            }
            newTheme.resolveAttribute(androidx.appcompat.R.attr.panelMenuListTheme, typedValue, true);
            int i9 = typedValue.resourceId;
            if (i9 != 0) {
                newTheme.applyStyle(i9, true);
            } else {
                newTheme.applyStyle(androidx.appcompat.R.style.Theme_AppCompat_CompactMenu, true);
            }
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
            contextThemeWrapper.getTheme().setTo(newTheme);
            this.listPresenterContext = contextThemeWrapper;
            TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(androidx.appcompat.R.styleable.AppCompatTheme);
            this.background = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatTheme_panelBackground, 0);
            this.windowAnimations = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class PanelMenuPresenterCallback implements MenuPresenter.Callback {
        PanelMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(@NonNull MenuBuilder menuBuilder, boolean z8) {
            boolean z9;
            MenuBuilder rootMenu = menuBuilder.getRootMenu();
            if (rootMenu != menuBuilder) {
                z9 = true;
            } else {
                z9 = false;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z9) {
                menuBuilder = rootMenu;
            }
            PanelFeatureState findMenuPanel = appCompatDelegateImpl.findMenuPanel(menuBuilder);
            if (findMenuPanel != null) {
                if (z9) {
                    AppCompatDelegateImpl.this.callOnPanelClosed(findMenuPanel.featureId, findMenuPanel, rootMenu);
                    AppCompatDelegateImpl.this.closePanel(findMenuPanel, true);
                } else {
                    AppCompatDelegateImpl.this.closePanel(findMenuPanel, z8);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(@NonNull MenuBuilder menuBuilder) {
            Window.Callback windowCallback;
            if (menuBuilder == menuBuilder.getRootMenu()) {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                if (appCompatDelegateImpl.mHasActionBar && (windowCallback = appCompatDelegateImpl.getWindowCallback()) != null && !AppCompatDelegateImpl.this.mDestroyed) {
                    windowCallback.onMenuOpened(108, menuBuilder);
                    return true;
                }
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatDelegateImpl(Activity activity, AppCompatCallback appCompatCallback) {
        this(activity, null, appCompatCallback, activity);
    }

    private boolean applyApplicationSpecificConfig(boolean z8) {
        return applyApplicationSpecificConfig(z8, true);
    }

    private void applyFixedSizeWindow() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.mSubDecor.findViewById(R.id.content);
        View decorView = this.mWindow.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.mContext.obtainStyledAttributes(androidx.appcompat.R.styleable.AppCompatTheme);
        obtainStyledAttributes.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        int i8 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMajor;
        if (obtainStyledAttributes.hasValue(i8)) {
            obtainStyledAttributes.getValue(i8, contentFrameLayout.getFixedWidthMajor());
        }
        int i9 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMinor;
        if (obtainStyledAttributes.hasValue(i9)) {
            obtainStyledAttributes.getValue(i9, contentFrameLayout.getFixedWidthMinor());
        }
        int i10 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor;
        if (obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedHeightMajor());
        }
        int i11 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMinor;
        if (obtainStyledAttributes.hasValue(i11)) {
            obtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void attachToWindow(@NonNull Window window) {
        if (this.mWindow == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof AppCompatWindowCallback)) {
                AppCompatWindowCallback appCompatWindowCallback = new AppCompatWindowCallback(callback);
                this.mAppCompatWindowCallback = appCompatWindowCallback;
                window.setCallback(appCompatWindowCallback);
                TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.mContext, (AttributeSet) null, sWindowBackgroundStyleable);
                Drawable drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(0);
                if (drawableIfKnown != null) {
                    window.setBackgroundDrawable(drawableIfKnown);
                }
                obtainStyledAttributes.recycle();
                this.mWindow = window;
                if (Build.VERSION.SDK_INT >= 33 && this.mDispatcher == null) {
                    setOnBackInvokedDispatcher(null);
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private int calculateNightMode() {
        int i8 = this.mLocalNightMode;
        if (i8 == -100) {
            return AppCompatDelegate.getDefaultNightMode();
        }
        return i8;
    }

    private void cleanupAutoManagers() {
        AutoNightModeManager autoNightModeManager = this.mAutoTimeNightModeManager;
        if (autoNightModeManager != null) {
            autoNightModeManager.cleanup();
        }
        AutoNightModeManager autoNightModeManager2 = this.mAutoBatteryNightModeManager;
        if (autoNightModeManager2 != null) {
            autoNightModeManager2.cleanup();
        }
    }

    @NonNull
    private Configuration createOverrideAppConfiguration(@NonNull Context context, int i8, @Nullable LocaleListCompat localeListCompat, @Nullable Configuration configuration, boolean z8) {
        int i9;
        if (i8 != 1) {
            if (i8 != 2) {
                if (z8) {
                    i9 = 0;
                } else {
                    i9 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i9 = 32;
            }
        } else {
            i9 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i9 | (configuration2.uiMode & (-49));
        if (localeListCompat != null) {
            setConfigurationLocales(configuration2, localeListCompat);
        }
        return configuration2;
    }

    private ViewGroup createSubDecor() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.mContext.obtainStyledAttributes(androidx.appcompat.R.styleable.AppCompatTheme);
        int i8 = androidx.appcompat.R.styleable.AppCompatTheme_windowActionBar;
        if (obtainStyledAttributes.hasValue(i8)) {
            if (obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_windowNoTitle, false)) {
                requestWindowFeature(1);
            } else if (obtainStyledAttributes.getBoolean(i8, false)) {
                requestWindowFeature(108);
            }
            if (obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
                requestWindowFeature(109);
            }
            if (obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
                requestWindowFeature(10);
            }
            this.mIsFloating = obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            ensureWindow();
            this.mWindow.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.mContext);
            if (!this.mWindowNoTitle) {
                if (this.mIsFloating) {
                    viewGroup = (ViewGroup) from.inflate(androidx.appcompat.R.layout.abc_dialog_title_material, (ViewGroup) null);
                    this.mOverlayActionBar = false;
                    this.mHasActionBar = false;
                } else if (this.mHasActionBar) {
                    TypedValue typedValue = new TypedValue();
                    this.mContext.getTheme().resolveAttribute(androidx.appcompat.R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new ContextThemeWrapper(this.mContext, typedValue.resourceId);
                    } else {
                        context = this.mContext;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(androidx.appcompat.R.layout.abc_screen_toolbar, (ViewGroup) null);
                    DecorContentParent decorContentParent = (DecorContentParent) viewGroup.findViewById(androidx.appcompat.R.id.decor_content_parent);
                    this.mDecorContentParent = decorContentParent;
                    decorContentParent.setWindowCallback(getWindowCallback());
                    if (this.mOverlayActionBar) {
                        this.mDecorContentParent.initFeature(109);
                    }
                    if (this.mFeatureProgress) {
                        this.mDecorContentParent.initFeature(2);
                    }
                    if (this.mFeatureIndeterminateProgress) {
                        this.mDecorContentParent.initFeature(5);
                    }
                } else {
                    viewGroup = null;
                }
            } else {
                viewGroup = this.mOverlayActionMode ? (ViewGroup) from.inflate(androidx.appcompat.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(androidx.appcompat.R.layout.abc_screen_simple, (ViewGroup) null);
            }
            if (viewGroup != null) {
                ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new OnApplyWindowInsetsListener() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.3
                    @Override // androidx.core.view.OnApplyWindowInsetsListener
                    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
                        int updateStatusGuard = AppCompatDelegateImpl.this.updateStatusGuard(windowInsetsCompat, null);
                        if (systemWindowInsetTop != updateStatusGuard) {
                            windowInsetsCompat = windowInsetsCompat.replaceSystemWindowInsets(windowInsetsCompat.getSystemWindowInsetLeft(), updateStatusGuard, windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                        }
                        return ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
                    }
                });
                if (this.mDecorContentParent == null) {
                    this.mTitleView = (TextView) viewGroup.findViewById(androidx.appcompat.R.id.title);
                }
                ViewUtils.makeOptionalFitsSystemWindows(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(androidx.appcompat.R.id.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.mWindow.findViewById(R.id.content);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(R.id.content);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.mWindow.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new ContentFrameLayout.OnAttachListener() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.5
                    @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
                    public void onAttachedFromWindow() {
                    }

                    @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
                    public void onDetachedFromWindow() {
                        AppCompatDelegateImpl.this.dismissPopups();
                    }
                });
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.mHasActionBar + ", windowActionBarOverlay: " + this.mOverlayActionBar + ", android:windowIsFloating: " + this.mIsFloating + ", windowActionModeOverlay: " + this.mOverlayActionMode + ", windowNoTitle: " + this.mWindowNoTitle + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void ensureSubDecor() {
        if (!this.mSubDecorInstalled) {
            this.mSubDecor = createSubDecor();
            CharSequence title = getTitle();
            if (!TextUtils.isEmpty(title)) {
                DecorContentParent decorContentParent = this.mDecorContentParent;
                if (decorContentParent != null) {
                    decorContentParent.setWindowTitle(title);
                } else if (peekSupportActionBar() != null) {
                    peekSupportActionBar().setWindowTitle(title);
                } else {
                    TextView textView = this.mTitleView;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
            applyFixedSizeWindow();
            onSubDecorInstalled(this.mSubDecor);
            this.mSubDecorInstalled = true;
            PanelFeatureState panelState = getPanelState(0, false);
            if (!this.mDestroyed) {
                if (panelState == null || panelState.menu == null) {
                    invalidatePanelMenu(108);
                }
            }
        }
    }

    private void ensureWindow() {
        if (this.mWindow == null) {
            Object obj = this.mHost;
            if (obj instanceof Activity) {
                attachToWindow(((Activity) obj).getWindow());
            }
        }
        if (this.mWindow != null) {
        } else {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @NonNull
    private static Configuration generateConfigDelta(@NonNull Configuration configuration, @Nullable Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f8 = configuration.fontScale;
            float f9 = configuration2.fontScale;
            if (f8 != f9) {
                configuration3.fontScale = f9;
            }
            int i8 = configuration.mcc;
            int i9 = configuration2.mcc;
            if (i8 != i9) {
                configuration3.mcc = i9;
            }
            int i10 = configuration.mnc;
            int i11 = configuration2.mnc;
            if (i10 != i11) {
                configuration3.mnc = i11;
            }
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 24) {
                Api24Impl.generateConfigDelta_locale(configuration, configuration2, configuration3);
            } else if (!ObjectsCompat.equals(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i13 = configuration.touchscreen;
            int i14 = configuration2.touchscreen;
            if (i13 != i14) {
                configuration3.touchscreen = i14;
            }
            int i15 = configuration.keyboard;
            int i16 = configuration2.keyboard;
            if (i15 != i16) {
                configuration3.keyboard = i16;
            }
            int i17 = configuration.keyboardHidden;
            int i18 = configuration2.keyboardHidden;
            if (i17 != i18) {
                configuration3.keyboardHidden = i18;
            }
            int i19 = configuration.navigation;
            int i20 = configuration2.navigation;
            if (i19 != i20) {
                configuration3.navigation = i20;
            }
            int i21 = configuration.navigationHidden;
            int i22 = configuration2.navigationHidden;
            if (i21 != i22) {
                configuration3.navigationHidden = i22;
            }
            int i23 = configuration.orientation;
            int i24 = configuration2.orientation;
            if (i23 != i24) {
                configuration3.orientation = i24;
            }
            int i25 = configuration.screenLayout & 15;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 15)) {
                configuration3.screenLayout |= i26 & 15;
            }
            int i27 = configuration.screenLayout & PsExtractor.AUDIO_STREAM;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & PsExtractor.AUDIO_STREAM)) {
                configuration3.screenLayout |= i28 & PsExtractor.AUDIO_STREAM;
            }
            int i29 = configuration.screenLayout & 48;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 48)) {
                configuration3.screenLayout |= i30 & 48;
            }
            int i31 = configuration.screenLayout & com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS)) {
                configuration3.screenLayout |= i32 & com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS;
            }
            if (i12 >= 26) {
                Api26Impl.generateConfigDelta_colorMode(configuration, configuration2, configuration3);
            }
            int i33 = configuration.uiMode & 15;
            int i34 = configuration2.uiMode;
            if (i33 != (i34 & 15)) {
                configuration3.uiMode |= i34 & 15;
            }
            int i35 = configuration.uiMode & 48;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 48)) {
                configuration3.uiMode |= i36 & 48;
            }
            int i37 = configuration.screenWidthDp;
            int i38 = configuration2.screenWidthDp;
            if (i37 != i38) {
                configuration3.screenWidthDp = i38;
            }
            int i39 = configuration.screenHeightDp;
            int i40 = configuration2.screenHeightDp;
            if (i39 != i40) {
                configuration3.screenHeightDp = i40;
            }
            int i41 = configuration.smallestScreenWidthDp;
            int i42 = configuration2.smallestScreenWidthDp;
            if (i41 != i42) {
                configuration3.smallestScreenWidthDp = i42;
            }
            int i43 = configuration.densityDpi;
            int i44 = configuration2.densityDpi;
            if (i43 != i44) {
                configuration3.densityDpi = i44;
            }
        }
        return configuration3;
    }

    private int getActivityHandlesConfigChangesFlags(Context context) {
        int i8;
        if (!this.mActivityHandlesConfigFlagsChecked && (this.mHost instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 29) {
                    i8 = 269221888;
                } else if (i9 >= 24) {
                    i8 = 786432;
                } else {
                    i8 = 0;
                }
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.mHost.getClass()), i8);
                if (activityInfo != null) {
                    this.mActivityHandlesConfigFlags = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e8) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e8);
                this.mActivityHandlesConfigFlags = 0;
            }
        }
        this.mActivityHandlesConfigFlagsChecked = true;
        return this.mActivityHandlesConfigFlags;
    }

    private AutoNightModeManager getAutoBatteryNightModeManager(@NonNull Context context) {
        if (this.mAutoBatteryNightModeManager == null) {
            this.mAutoBatteryNightModeManager = new AutoBatteryNightModeManager(context);
        }
        return this.mAutoBatteryNightModeManager;
    }

    private void initWindowDecorActionBar() {
        ensureSubDecor();
        if (this.mHasActionBar && this.mActionBar == null) {
            Object obj = this.mHost;
            if (obj instanceof Activity) {
                this.mActionBar = new WindowDecorActionBar((Activity) this.mHost, this.mOverlayActionBar);
            } else if (obj instanceof Dialog) {
                this.mActionBar = new WindowDecorActionBar((Dialog) this.mHost);
            }
            ActionBar actionBar = this.mActionBar;
            if (actionBar != null) {
                actionBar.setDefaultDisplayHomeAsUpEnabled(this.mEnableDefaultActionBarUp);
            }
        }
    }

    private boolean initializePanelContent(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.createdPanelView;
        if (view != null) {
            panelFeatureState.shownPanelView = view;
            return true;
        }
        if (panelFeatureState.menu == null) {
            return false;
        }
        if (this.mPanelMenuPresenterCallback == null) {
            this.mPanelMenuPresenterCallback = new PanelMenuPresenterCallback();
        }
        View view2 = (View) panelFeatureState.getListMenuView(this.mPanelMenuPresenterCallback);
        panelFeatureState.shownPanelView = view2;
        if (view2 != null) {
            return true;
        }
        return false;
    }

    private boolean initializePanelDecor(PanelFeatureState panelFeatureState) {
        panelFeatureState.setStyle(getActionBarThemedContext());
        panelFeatureState.decorView = new ListMenuDecorView(panelFeatureState.listPresenterContext);
        panelFeatureState.gravity = 81;
        return true;
    }

    private boolean initializePanelMenu(PanelFeatureState panelFeatureState) {
        Resources.Theme theme;
        Context context = this.mContext;
        int i8 = panelFeatureState.featureId;
        if ((i8 == 0 || i8 == 108) && this.mDecorContentParent != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(androidx.appcompat.R.attr.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(androidx.appcompat.R.attr.actionBarWidgetTheme, typedValue, true);
            } else {
                theme2.resolveAttribute(androidx.appcompat.R.attr.actionBarWidgetTheme, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
                contextThemeWrapper.getTheme().setTo(theme);
                context = contextThemeWrapper;
            }
        }
        MenuBuilder menuBuilder = new MenuBuilder(context);
        menuBuilder.setCallback(this);
        panelFeatureState.setMenu(menuBuilder);
        return true;
    }

    private void invalidatePanelMenu(int i8) {
        this.mInvalidatePanelMenuFeatures = (1 << i8) | this.mInvalidatePanelMenuFeatures;
        if (!this.mInvalidatePanelMenuPosted) {
            ViewCompat.postOnAnimation(this.mWindow.getDecorView(), this.mInvalidatePanelMenuRunnable);
            this.mInvalidatePanelMenuPosted = true;
        }
    }

    private boolean onKeyDownPanel(int i8, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            PanelFeatureState panelState = getPanelState(i8, true);
            if (!panelState.isOpen) {
                return preparePanel(panelState, keyEvent);
            }
            return false;
        }
        return false;
    }

    private boolean onKeyUpPanel(int i8, KeyEvent keyEvent) {
        boolean z8;
        DecorContentParent decorContentParent;
        if (this.mActionMode != null) {
            return false;
        }
        boolean z9 = true;
        PanelFeatureState panelState = getPanelState(i8, true);
        if (i8 == 0 && (decorContentParent = this.mDecorContentParent) != null && decorContentParent.canShowOverflowMenu() && !ViewConfiguration.get(this.mContext).hasPermanentMenuKey()) {
            if (!this.mDecorContentParent.isOverflowMenuShowing()) {
                if (!this.mDestroyed && preparePanel(panelState, keyEvent)) {
                    z9 = this.mDecorContentParent.showOverflowMenu();
                }
                z9 = false;
            } else {
                z9 = this.mDecorContentParent.hideOverflowMenu();
            }
        } else {
            boolean z10 = panelState.isOpen;
            if (!z10 && !panelState.isHandled) {
                if (panelState.isPrepared) {
                    if (panelState.refreshMenuContent) {
                        panelState.isPrepared = false;
                        z8 = preparePanel(panelState, keyEvent);
                    } else {
                        z8 = true;
                    }
                    if (z8) {
                        openPanel(panelState, keyEvent);
                    }
                }
                z9 = false;
            } else {
                closePanel(panelState, true);
                z9 = z10;
            }
        }
        if (z9) {
            AudioManager audioManager = (AudioManager) this.mContext.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z9;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void openPanel(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.openPanel(androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, android.view.KeyEvent):void");
    }

    private boolean performPanelShortcut(PanelFeatureState panelFeatureState, int i8, KeyEvent keyEvent, int i9) {
        MenuBuilder menuBuilder;
        boolean z8 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.isPrepared || preparePanel(panelFeatureState, keyEvent)) && (menuBuilder = panelFeatureState.menu) != null) {
            z8 = menuBuilder.performShortcut(i8, keyEvent, i9);
        }
        if (z8 && (i9 & 1) == 0 && this.mDecorContentParent == null) {
            closePanel(panelFeatureState, true);
        }
        return z8;
    }

    private boolean preparePanel(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        boolean z8;
        DecorContentParent decorContentParent;
        int i8;
        boolean z9;
        DecorContentParent decorContentParent2;
        DecorContentParent decorContentParent3;
        if (this.mDestroyed) {
            return false;
        }
        if (panelFeatureState.isPrepared) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.mPreparedPanel;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            closePanel(panelFeatureState2, false);
        }
        Window.Callback windowCallback = getWindowCallback();
        if (windowCallback != null) {
            panelFeatureState.createdPanelView = windowCallback.onCreatePanelView(panelFeatureState.featureId);
        }
        int i9 = panelFeatureState.featureId;
        if (i9 != 0 && i9 != 108) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (z8 && (decorContentParent3 = this.mDecorContentParent) != null) {
            decorContentParent3.setMenuPrepared();
        }
        if (panelFeatureState.createdPanelView == null && (!z8 || !(peekSupportActionBar() instanceof ToolbarActionBar))) {
            MenuBuilder menuBuilder = panelFeatureState.menu;
            if (menuBuilder == null || panelFeatureState.refreshMenuContent) {
                if (menuBuilder == null && (!initializePanelMenu(panelFeatureState) || panelFeatureState.menu == null)) {
                    return false;
                }
                if (z8 && this.mDecorContentParent != null) {
                    if (this.mActionMenuPresenterCallback == null) {
                        this.mActionMenuPresenterCallback = new ActionMenuPresenterCallback();
                    }
                    this.mDecorContentParent.setMenu(panelFeatureState.menu, this.mActionMenuPresenterCallback);
                }
                panelFeatureState.menu.stopDispatchingItemsChanged();
                if (!windowCallback.onCreatePanelMenu(panelFeatureState.featureId, panelFeatureState.menu)) {
                    panelFeatureState.setMenu(null);
                    if (z8 && (decorContentParent = this.mDecorContentParent) != null) {
                        decorContentParent.setMenu(null, this.mActionMenuPresenterCallback);
                    }
                    return false;
                }
                panelFeatureState.refreshMenuContent = false;
            }
            panelFeatureState.menu.stopDispatchingItemsChanged();
            Bundle bundle = panelFeatureState.frozenActionViewState;
            if (bundle != null) {
                panelFeatureState.menu.restoreActionViewStates(bundle);
                panelFeatureState.frozenActionViewState = null;
            }
            if (!windowCallback.onPreparePanel(0, panelFeatureState.createdPanelView, panelFeatureState.menu)) {
                if (z8 && (decorContentParent2 = this.mDecorContentParent) != null) {
                    decorContentParent2.setMenu(null, this.mActionMenuPresenterCallback);
                }
                panelFeatureState.menu.startDispatchingItemsChanged();
                return false;
            }
            if (keyEvent != null) {
                i8 = keyEvent.getDeviceId();
            } else {
                i8 = -1;
            }
            if (KeyCharacterMap.load(i8).getKeyboardType() != 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            panelFeatureState.qwertyMode = z9;
            panelFeatureState.menu.setQwertyMode(z9);
            panelFeatureState.menu.startDispatchingItemsChanged();
        }
        panelFeatureState.isPrepared = true;
        panelFeatureState.isHandled = false;
        this.mPreparedPanel = panelFeatureState;
        return true;
    }

    private void reopenMenu(boolean z8) {
        DecorContentParent decorContentParent = this.mDecorContentParent;
        if (decorContentParent != null && decorContentParent.canShowOverflowMenu() && (!ViewConfiguration.get(this.mContext).hasPermanentMenuKey() || this.mDecorContentParent.isOverflowMenuShowPending())) {
            Window.Callback windowCallback = getWindowCallback();
            if (this.mDecorContentParent.isOverflowMenuShowing() && z8) {
                this.mDecorContentParent.hideOverflowMenu();
                if (!this.mDestroyed) {
                    windowCallback.onPanelClosed(108, getPanelState(0, true).menu);
                    return;
                }
                return;
            }
            if (windowCallback != null && !this.mDestroyed) {
                if (this.mInvalidatePanelMenuPosted && (this.mInvalidatePanelMenuFeatures & 1) != 0) {
                    this.mWindow.getDecorView().removeCallbacks(this.mInvalidatePanelMenuRunnable);
                    this.mInvalidatePanelMenuRunnable.run();
                }
                PanelFeatureState panelState = getPanelState(0, true);
                MenuBuilder menuBuilder = panelState.menu;
                if (menuBuilder != null && !panelState.refreshMenuContent && windowCallback.onPreparePanel(0, panelState.createdPanelView, menuBuilder)) {
                    windowCallback.onMenuOpened(108, panelState.menu);
                    this.mDecorContentParent.showOverflowMenu();
                    return;
                }
                return;
            }
            return;
        }
        PanelFeatureState panelState2 = getPanelState(0, true);
        panelState2.refreshDecorView = true;
        closePanel(panelState2, false);
        openPanel(panelState2, null);
    }

    private int sanitizeWindowFeatureId(int i8) {
        if (i8 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i8 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
        return i8;
    }

    private boolean shouldInheritContext(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.mWindow.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private void throwFeatureRequestIfSubDecorInstalled() {
        if (!this.mSubDecorInstalled) {
        } else {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Nullable
    private AppCompatActivity tryUnwrapContext() {
        for (Context context = this.mContext; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof AppCompatActivity) {
                return (AppCompatActivity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void updateActivityConfiguration(Configuration configuration) {
        Activity activity = (Activity) this.mHost;
        if (activity instanceof LifecycleOwner) {
            if (((LifecycleOwner) activity).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else if (this.mCreated && !this.mDestroyed) {
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean updateAppConfiguration(int r10, @androidx.annotation.Nullable androidx.core.os.LocaleListCompat r11, boolean r12) {
        /*
            r9 = this;
            android.content.Context r1 = r9.mContext
            r4 = 0
            r5 = 0
            r0 = r9
            r2 = r10
            r3 = r11
            android.content.res.Configuration r0 = r0.createOverrideAppConfiguration(r1, r2, r3, r4, r5)
            android.content.Context r1 = r9.mContext
            int r1 = r9.getActivityHandlesConfigChangesFlags(r1)
            android.content.res.Configuration r2 = r9.mEffectiveConfiguration
            if (r2 != 0) goto L1f
            android.content.Context r2 = r9.mContext
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L1f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            androidx.core.os.LocaleListCompat r2 = r9.getConfigurationLocales(r2)
            r5 = 0
            if (r11 != 0) goto L30
            r6 = r5
            goto L34
        L30:
            androidx.core.os.LocaleListCompat r6 = r9.getConfigurationLocales(r0)
        L34:
            r7 = 0
            if (r3 == r4) goto L3a
            r3 = 512(0x200, float:7.17E-43)
            goto L3b
        L3a:
            r3 = 0
        L3b:
            if (r6 == 0) goto L45
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L45
            r3 = r3 | 8196(0x2004, float:1.1485E-41)
        L45:
            int r2 = ~r1
            r2 = r2 & r3
            r8 = 1
            if (r2 == 0) goto L8c
            if (r12 == 0) goto L8c
            boolean r12 = r9.mBaseContextAttached
            if (r12 == 0) goto L8c
            boolean r12 = androidx.appcompat.app.AppCompatDelegateImpl.sCanReturnDifferentContext
            if (r12 != 0) goto L58
            boolean r12 = r9.mCreated
            if (r12 == 0) goto L8c
        L58:
            java.lang.Object r12 = r9.mHost
            boolean r2 = r12 instanceof android.app.Activity
            if (r2 == 0) goto L8c
            android.app.Activity r12 = (android.app.Activity) r12
            boolean r12 = r12.isChild()
            if (r12 != 0) goto L8c
            int r12 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r12 < r2) goto L83
            r12 = r3 & 8192(0x2000, float:1.148E-41)
            if (r12 == 0) goto L83
            java.lang.Object r12 = r9.mHost
            android.app.Activity r12 = (android.app.Activity) r12
            android.view.Window r12 = r12.getWindow()
            android.view.View r12 = r12.getDecorView()
            int r0 = r0.getLayoutDirection()
            r12.setLayoutDirection(r0)
        L83:
            java.lang.Object r12 = r9.mHost
            android.app.Activity r12 = (android.app.Activity) r12
            androidx.core.app.ActivityCompat.recreate(r12)
            r12 = 1
            goto L8d
        L8c:
            r12 = 0
        L8d:
            if (r12 != 0) goto L9a
            if (r3 == 0) goto L9a
            r12 = r3 & r1
            if (r12 != r3) goto L96
            r7 = 1
        L96:
            r9.updateResourcesConfiguration(r4, r6, r7, r5)
            goto L9b
        L9a:
            r8 = r12
        L9b:
            if (r8 == 0) goto Lb7
            java.lang.Object r12 = r9.mHost
            boolean r0 = r12 instanceof androidx.appcompat.app.AppCompatActivity
            if (r0 == 0) goto Lb7
            r0 = r3 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto Lac
            androidx.appcompat.app.AppCompatActivity r12 = (androidx.appcompat.app.AppCompatActivity) r12
            r12.onNightModeChanged(r10)
        Lac:
            r10 = r3 & 4
            if (r10 == 0) goto Lb7
            java.lang.Object r10 = r9.mHost
            androidx.appcompat.app.AppCompatActivity r10 = (androidx.appcompat.app.AppCompatActivity) r10
            r10.onLocalesChanged(r11)
        Lb7:
            if (r6 == 0) goto Lca
            android.content.Context r10 = r9.mContext
            android.content.res.Resources r10 = r10.getResources()
            android.content.res.Configuration r10 = r10.getConfiguration()
            androidx.core.os.LocaleListCompat r10 = r9.getConfigurationLocales(r10)
            r9.setDefaultLocalesForLocaleList(r10)
        Lca:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.updateAppConfiguration(int, androidx.core.os.LocaleListCompat, boolean):boolean");
    }

    private void updateResourcesConfiguration(int i8, @Nullable LocaleListCompat localeListCompat, boolean z8, @Nullable Configuration configuration) {
        Resources resources = this.mContext.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i8 | (resources.getConfiguration().uiMode & (-49));
        if (localeListCompat != null) {
            setConfigurationLocales(configuration2, localeListCompat);
        }
        resources.updateConfiguration(configuration2, null);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 26) {
            ResourcesFlusher.flush(resources);
        }
        int i10 = this.mThemeResId;
        if (i10 != 0) {
            this.mContext.setTheme(i10);
            if (i9 >= 23) {
                this.mContext.getTheme().applyStyle(this.mThemeResId, true);
            }
        }
        if (z8 && (this.mHost instanceof Activity)) {
            updateActivityConfiguration(configuration2);
        }
    }

    private void updateStatusGuardColor(View view) {
        int color;
        if ((ViewCompat.getWindowSystemUiVisibility(view) & 8192) != 0) {
            color = ContextCompat.getColor(this.mContext, androidx.appcompat.R.color.abc_decor_view_status_guard_light);
        } else {
            color = ContextCompat.getColor(this.mContext, androidx.appcompat.R.color.abc_decor_view_status_guard);
        }
        view.setBackgroundColor(color);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        ensureSubDecor();
        ((ViewGroup) this.mSubDecor.findViewById(R.id.content)).addView(view, layoutParams);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    boolean applyAppLocales() {
        if (AppCompatDelegate.isAutoStorageOptedIn(this.mContext) && AppCompatDelegate.getRequestedAppLocales() != null && !AppCompatDelegate.getRequestedAppLocales().equals(AppCompatDelegate.getStoredAppLocales())) {
            asyncExecuteSyncRequestedAndStoredLocales(this.mContext);
        }
        return applyApplicationSpecificConfig(true);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean applyDayNight() {
        return applyApplicationSpecificConfig(true);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    @NonNull
    @CallSuper
    public Context attachBaseContext2(@NonNull Context context) {
        Configuration configuration;
        this.mBaseContextAttached = true;
        int mapNightMode = mapNightMode(context, calculateNightMode());
        if (AppCompatDelegate.isAutoStorageOptedIn(context)) {
            AppCompatDelegate.syncRequestedAndStoredLocales(context);
        }
        LocaleListCompat calculateApplicationLocales = calculateApplicationLocales(context);
        if (context instanceof android.view.ContextThemeWrapper) {
            try {
                ((android.view.ContextThemeWrapper) context).applyOverrideConfiguration(createOverrideAppConfiguration(context, mapNightMode, calculateApplicationLocales, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(createOverrideAppConfiguration(context, mapNightMode, calculateApplicationLocales, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!sCanReturnDifferentContext) {
            return super.attachBaseContext2(context);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = generateConfigDelta(configuration3, configuration4);
        } else {
            configuration = null;
        }
        Configuration createOverrideAppConfiguration = createOverrideAppConfiguration(context, mapNightMode, calculateApplicationLocales, configuration, true);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, androidx.appcompat.R.style.Theme_AppCompat_Empty);
        contextThemeWrapper.applyOverrideConfiguration(createOverrideAppConfiguration);
        try {
            if (context.getTheme() != null) {
                ResourcesCompat.ThemeCompat.rebase(contextThemeWrapper.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.attachBaseContext2(contextThemeWrapper);
    }

    @Nullable
    LocaleListCompat calculateApplicationLocales(@NonNull Context context) {
        LocaleListCompat requestedAppLocales;
        LocaleListCompat forLanguageTags;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 33 || (requestedAppLocales = AppCompatDelegate.getRequestedAppLocales()) == null) {
            return null;
        }
        LocaleListCompat configurationLocales = getConfigurationLocales(context.getApplicationContext().getResources().getConfiguration());
        if (i8 >= 24) {
            forLanguageTags = LocaleOverlayHelper.combineLocalesIfOverlayExists(requestedAppLocales, configurationLocales);
        } else if (requestedAppLocales.isEmpty()) {
            forLanguageTags = LocaleListCompat.getEmptyLocaleList();
        } else {
            forLanguageTags = LocaleListCompat.forLanguageTags(Api21Impl.toLanguageTag(requestedAppLocales.get(0)));
        }
        if (!forLanguageTags.isEmpty()) {
            return forLanguageTags;
        }
        return configurationLocales;
    }

    void callOnPanelClosed(int i8, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i8 >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.mPanels;
                if (i8 < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i8];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.menu;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.isOpen) && !this.mDestroyed) {
            this.mAppCompatWindowCallback.bypassOnPanelClosed(this.mWindow.getCallback(), i8, menu);
        }
    }

    void checkCloseActionMenu(@NonNull MenuBuilder menuBuilder) {
        if (this.mClosingActionMenu) {
            return;
        }
        this.mClosingActionMenu = true;
        this.mDecorContentParent.dismissPopups();
        Window.Callback windowCallback = getWindowCallback();
        if (windowCallback != null && !this.mDestroyed) {
            windowCallback.onPanelClosed(108, menuBuilder);
        }
        this.mClosingActionMenu = false;
    }

    void closePanel(int i8) {
        closePanel(getPanelState(i8, true), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.app.AppCompatDelegate
    public View createView(View view, String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        boolean z8;
        if (this.mAppCompatViewInflater == null) {
            TypedArray obtainStyledAttributes = this.mContext.obtainStyledAttributes(androidx.appcompat.R.styleable.AppCompatTheme);
            String string = obtainStyledAttributes.getString(androidx.appcompat.R.styleable.AppCompatTheme_viewInflaterClass);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.mAppCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.mAppCompatViewInflater = (AppCompatViewInflater) this.mContext.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.mAppCompatViewInflater = new AppCompatViewInflater();
                }
            }
        }
        boolean z9 = IS_PRE_LOLLIPOP;
        boolean z10 = false;
        if (z9) {
            if (this.mLayoutIncludeDetector == null) {
                this.mLayoutIncludeDetector = new LayoutIncludeDetector();
            }
            if (this.mLayoutIncludeDetector.detect(attributeSet)) {
                z8 = true;
            } else {
                if (attributeSet instanceof XmlPullParser) {
                    if (((XmlPullParser) attributeSet).getDepth() > 1) {
                        z10 = true;
                    }
                } else {
                    z10 = shouldInheritContext((ViewParent) view);
                }
                z8 = z10;
            }
        } else {
            z8 = false;
        }
        return this.mAppCompatViewInflater.createView(view, str, context, attributeSet, z8, z9, true, VectorEnabledTintResources.shouldBeUsed());
    }

    void dismissPopups() {
        MenuBuilder menuBuilder;
        DecorContentParent decorContentParent = this.mDecorContentParent;
        if (decorContentParent != null) {
            decorContentParent.dismissPopups();
        }
        if (this.mActionModePopup != null) {
            this.mWindow.getDecorView().removeCallbacks(this.mShowActionModePopup);
            if (this.mActionModePopup.isShowing()) {
                try {
                    this.mActionModePopup.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.mActionModePopup = null;
        }
        endOnGoingFadeAnimation();
        PanelFeatureState panelState = getPanelState(0, false);
        if (panelState != null && (menuBuilder = panelState.menu) != null) {
            menuBuilder.close();
        }
    }

    boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.mHost;
        if (((obj instanceof KeyEventDispatcher.Component) || (obj instanceof AppCompatDialog)) && (decorView = this.mWindow.getDecorView()) != null && KeyEventDispatcher.dispatchBeforeHierarchy(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.mAppCompatWindowCallback.bypassDispatchKeyEvent(this.mWindow.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            return onKeyDown(keyCode, keyEvent);
        }
        return onKeyUp(keyCode, keyEvent);
    }

    void doInvalidatePanelMenu(int i8) {
        PanelFeatureState panelState;
        PanelFeatureState panelState2 = getPanelState(i8, true);
        if (panelState2.menu != null) {
            Bundle bundle = new Bundle();
            panelState2.menu.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                panelState2.frozenActionViewState = bundle;
            }
            panelState2.menu.stopDispatchingItemsChanged();
            panelState2.menu.clear();
        }
        panelState2.refreshMenuContent = true;
        panelState2.refreshDecorView = true;
        if ((i8 == 108 || i8 == 0) && this.mDecorContentParent != null && (panelState = getPanelState(0, false)) != null) {
            panelState.isPrepared = false;
            preparePanel(panelState, null);
        }
    }

    void endOnGoingFadeAnimation() {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.mFadeAnim;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.cancel();
        }
    }

    PanelFeatureState findMenuPanel(Menu menu) {
        int i8;
        PanelFeatureState[] panelFeatureStateArr = this.mPanels;
        if (panelFeatureStateArr != null) {
            i8 = panelFeatureStateArr.length;
        } else {
            i8 = 0;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i9];
            if (panelFeatureState != null && panelFeatureState.menu == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    @Nullable
    public <T extends View> T findViewById(@IdRes int i8) {
        ensureSubDecor();
        return (T) this.mWindow.findViewById(i8);
    }

    final Context getActionBarThemedContext() {
        Context context;
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            context = supportActionBar.getThemedContext();
        } else {
            context = null;
        }
        if (context == null) {
            return this.mContext;
        }
        return context;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    final AutoNightModeManager getAutoTimeNightModeManager() {
        return getAutoTimeNightModeManager(this.mContext);
    }

    LocaleListCompat getConfigurationLocales(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Api24Impl.getLocales(configuration);
        }
        return LocaleListCompat.forLanguageTags(Api21Impl.toLanguageTag(configuration.locale));
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public Context getContextForDelegate() {
        return this.mContext;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
        return new ActionBarDrawableToggleImpl();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public int getLocalNightMode() {
        return this.mLocalNightMode;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public MenuInflater getMenuInflater() {
        Context context;
        if (this.mMenuInflater == null) {
            initWindowDecorActionBar();
            ActionBar actionBar = this.mActionBar;
            if (actionBar != null) {
                context = actionBar.getThemedContext();
            } else {
                context = this.mContext;
            }
            this.mMenuInflater = new SupportMenuInflater(context);
        }
        return this.mMenuInflater;
    }

    protected PanelFeatureState getPanelState(int i8, boolean z8) {
        PanelFeatureState[] panelFeatureStateArr = this.mPanels;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i8) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i8 + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.mPanels = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i8];
        if (panelFeatureState == null) {
            PanelFeatureState panelFeatureState2 = new PanelFeatureState(i8);
            panelFeatureStateArr[i8] = panelFeatureState2;
            return panelFeatureState2;
        }
        return panelFeatureState;
    }

    ViewGroup getSubDecor() {
        return this.mSubDecor;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public ActionBar getSupportActionBar() {
        initWindowDecorActionBar();
        return this.mActionBar;
    }

    final CharSequence getTitle() {
        Object obj = this.mHost;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.mTitle;
    }

    final Window.Callback getWindowCallback() {
        return this.mWindow.getCallback();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean hasWindowFeature(int i8) {
        boolean z8;
        int sanitizeWindowFeatureId = sanitizeWindowFeatureId(i8);
        if (sanitizeWindowFeatureId != 1) {
            if (sanitizeWindowFeatureId != 2) {
                if (sanitizeWindowFeatureId != 5) {
                    if (sanitizeWindowFeatureId != 10) {
                        if (sanitizeWindowFeatureId != 108) {
                            if (sanitizeWindowFeatureId != 109) {
                                z8 = false;
                            } else {
                                z8 = this.mOverlayActionBar;
                            }
                        } else {
                            z8 = this.mHasActionBar;
                        }
                    } else {
                        z8 = this.mOverlayActionMode;
                    }
                } else {
                    z8 = this.mFeatureIndeterminateProgress;
                }
            } else {
                z8 = this.mFeatureProgress;
            }
        } else {
            z8 = this.mWindowNoTitle;
        }
        if (z8 || this.mWindow.hasFeature(i8)) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void installViewFactory() {
        LayoutInflater from = LayoutInflater.from(this.mContext);
        if (from.getFactory() == null) {
            LayoutInflaterCompat.setFactory2(from, this);
        } else if (!(from.getFactory2() instanceof AppCompatDelegateImpl)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void invalidateOptionsMenu() {
        if (peekSupportActionBar() != null && !getSupportActionBar().invalidateOptionsMenu()) {
            invalidatePanelMenu(0);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean isHandleNativeActionModesEnabled() {
        return this.mHandleNativeActionModes;
    }

    int mapNightMode(@NonNull Context context, int i8) {
        if (i8 == -100) {
            return -1;
        }
        if (i8 != -1) {
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2) {
                    if (i8 == 3) {
                        return getAutoBatteryNightModeManager(context).getApplyableNightMode();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else {
                if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return getAutoTimeNightModeManager(context).getApplyableNightMode();
            }
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean onBackPressed() {
        boolean z8 = this.mLongPressBackDown;
        this.mLongPressBackDown = false;
        PanelFeatureState panelState = getPanelState(0, false);
        if (panelState != null && panelState.isOpen) {
            if (!z8) {
                closePanel(panelState, true);
            }
            return true;
        }
        ActionMode actionMode = this.mActionMode;
        if (actionMode != null) {
            actionMode.finish();
            return true;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar == null || !supportActionBar.collapseActionView()) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onConfigurationChanged(Configuration configuration) {
        ActionBar supportActionBar;
        if (this.mHasActionBar && this.mSubDecorInstalled && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.onConfigurationChanged(configuration);
        }
        AppCompatDrawableManager.get().onConfigurationChanged(this.mContext);
        this.mEffectiveConfiguration = new Configuration(this.mContext.getResources().getConfiguration());
        applyApplicationSpecificConfig(false, false);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onCreate(Bundle bundle) {
        String str;
        this.mBaseContextAttached = true;
        applyApplicationSpecificConfig(false);
        ensureWindow();
        Object obj = this.mHost;
        if (obj instanceof Activity) {
            try {
                str = NavUtils.getParentActivityName((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                ActionBar peekSupportActionBar = peekSupportActionBar();
                if (peekSupportActionBar == null) {
                    this.mEnableDefaultActionBarUp = true;
                } else {
                    peekSupportActionBar.setDefaultDisplayHomeAsUpEnabled(true);
                }
            }
            AppCompatDelegate.addActiveDelegate(this);
        }
        this.mEffectiveConfiguration = new Configuration(this.mContext.getResources().getConfiguration());
        this.mCreated = true;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return createView(view, str, context, attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDestroy() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mHost
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.AppCompatDelegate.removeActivityDelegate(r3)
        L9:
            boolean r0 = r3.mInvalidatePanelMenuPosted
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.mWindow
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.mInvalidatePanelMenuRunnable
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.mDestroyed = r0
            int r0 = r3.mLocalNightMode
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.mHost
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.sLocalNightModes
            java.lang.Object r1 = r3.mHost
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.mLocalNightMode
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.sLocalNightModes
            java.lang.Object r1 = r3.mHost
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.ActionBar r0 = r3.mActionBar
            if (r0 == 0) goto L5b
            r0.onDestroy()
        L5b:
            r3.cleanupAutoManagers()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.onDestroy():void");
    }

    boolean onKeyDown(int i8, KeyEvent keyEvent) {
        boolean z8 = true;
        if (i8 != 4) {
            if (i8 == 82) {
                onKeyDownPanel(0, keyEvent);
                return true;
            }
        } else {
            if ((keyEvent.getFlags() & 128) == 0) {
                z8 = false;
            }
            this.mLongPressBackDown = z8;
        }
        return false;
    }

    boolean onKeyShortcut(int i8, KeyEvent keyEvent) {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null && supportActionBar.onKeyShortcut(i8, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.mPreparedPanel;
        if (panelFeatureState != null && performPanelShortcut(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            PanelFeatureState panelFeatureState2 = this.mPreparedPanel;
            if (panelFeatureState2 != null) {
                panelFeatureState2.isHandled = true;
            }
            return true;
        }
        if (this.mPreparedPanel == null) {
            PanelFeatureState panelState = getPanelState(0, true);
            preparePanel(panelState, keyEvent);
            boolean performPanelShortcut = performPanelShortcut(panelState, keyEvent.getKeyCode(), keyEvent, 1);
            panelState.isPrepared = false;
            if (performPanelShortcut) {
                return true;
            }
        }
        return false;
    }

    boolean onKeyUp(int i8, KeyEvent keyEvent) {
        if (i8 != 4) {
            if (i8 == 82) {
                onKeyUpPanel(0, keyEvent);
                return true;
            }
        } else if (onBackPressed()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public boolean onMenuItemSelected(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
        PanelFeatureState findMenuPanel;
        Window.Callback windowCallback = getWindowCallback();
        if (windowCallback != null && !this.mDestroyed && (findMenuPanel = findMenuPanel(menuBuilder.getRootMenu())) != null) {
            return windowCallback.onMenuItemSelected(findMenuPanel.featureId, menuItem);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public void onMenuModeChange(@NonNull MenuBuilder menuBuilder) {
        reopenMenu(true);
    }

    void onMenuOpened(int i8) {
        ActionBar supportActionBar;
        if (i8 == 108 && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.dispatchMenuVisibilityChanged(true);
        }
    }

    void onPanelClosed(int i8) {
        if (i8 == 108) {
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.dispatchMenuVisibilityChanged(false);
                return;
            }
            return;
        }
        if (i8 == 0) {
            PanelFeatureState panelState = getPanelState(i8, true);
            if (panelState.isOpen) {
                closePanel(panelState, false);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onPostCreate(Bundle bundle) {
        ensureSubDecor();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onPostResume() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setShowHideAnimationEnabled(true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onSaveInstanceState(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onStart() {
        applyApplicationSpecificConfig(true, false);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onStop() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setShowHideAnimationEnabled(false);
        }
    }

    void onSubDecorInstalled(ViewGroup viewGroup) {
    }

    final ActionBar peekSupportActionBar() {
        return this.mActionBar;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean requestWindowFeature(int i8) {
        int sanitizeWindowFeatureId = sanitizeWindowFeatureId(i8);
        if (this.mWindowNoTitle && sanitizeWindowFeatureId == 108) {
            return false;
        }
        if (this.mHasActionBar && sanitizeWindowFeatureId == 1) {
            this.mHasActionBar = false;
        }
        if (sanitizeWindowFeatureId != 1) {
            if (sanitizeWindowFeatureId != 2) {
                if (sanitizeWindowFeatureId != 5) {
                    if (sanitizeWindowFeatureId != 10) {
                        if (sanitizeWindowFeatureId != 108) {
                            if (sanitizeWindowFeatureId != 109) {
                                return this.mWindow.requestFeature(sanitizeWindowFeatureId);
                            }
                            throwFeatureRequestIfSubDecorInstalled();
                            this.mOverlayActionBar = true;
                            return true;
                        }
                        throwFeatureRequestIfSubDecorInstalled();
                        this.mHasActionBar = true;
                        return true;
                    }
                    throwFeatureRequestIfSubDecorInstalled();
                    this.mOverlayActionMode = true;
                    return true;
                }
                throwFeatureRequestIfSubDecorInstalled();
                this.mFeatureIndeterminateProgress = true;
                return true;
            }
            throwFeatureRequestIfSubDecorInstalled();
            this.mFeatureProgress = true;
            return true;
        }
        throwFeatureRequestIfSubDecorInstalled();
        this.mWindowNoTitle = true;
        return true;
    }

    void setConfigurationLocales(Configuration configuration, @NonNull LocaleListCompat localeListCompat) {
        if (Build.VERSION.SDK_INT >= 24) {
            Api24Impl.setLocales(configuration, localeListCompat);
        } else {
            configuration.setLocale(localeListCompat.get(0));
            configuration.setLayoutDirection(localeListCompat.get(0));
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(View view) {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mSubDecor.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }

    void setDefaultLocalesForLocaleList(LocaleListCompat localeListCompat) {
        if (Build.VERSION.SDK_INT >= 24) {
            Api24Impl.setDefaultLocales(localeListCompat);
        } else {
            Locale.setDefault(localeListCompat.get(0));
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setHandleNativeActionModesEnabled(boolean z8) {
        this.mHandleNativeActionModes = z8;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setLocalNightMode(int i8) {
        if (this.mLocalNightMode != i8) {
            this.mLocalNightMode = i8;
            if (this.mBaseContextAttached) {
                applyDayNight();
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    @RequiresApi(33)
    public void setOnBackInvokedDispatcher(@Nullable OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.setOnBackInvokedDispatcher(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.mDispatcher;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.mBackCallback) != null) {
            Api33Impl.unregisterOnBackInvokedCallback(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.mBackCallback = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.mHost;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                this.mDispatcher = Api33Impl.getOnBackInvokedDispatcher((Activity) this.mHost);
                updateBackInvokedCallbackState();
            }
        }
        this.mDispatcher = onBackInvokedDispatcher;
        updateBackInvokedCallbackState();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setSupportActionBar(Toolbar toolbar) {
        if (!(this.mHost instanceof Activity)) {
            return;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (!(supportActionBar instanceof WindowDecorActionBar)) {
            this.mMenuInflater = null;
            if (supportActionBar != null) {
                supportActionBar.onDestroy();
            }
            this.mActionBar = null;
            if (toolbar != null) {
                ToolbarActionBar toolbarActionBar = new ToolbarActionBar(toolbar, getTitle(), this.mAppCompatWindowCallback);
                this.mActionBar = toolbarActionBar;
                this.mAppCompatWindowCallback.setActionBarCallback(toolbarActionBar.mMenuCallback);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.mAppCompatWindowCallback.setActionBarCallback(null);
            }
            invalidateOptionsMenu();
            return;
        }
        throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setTheme(@StyleRes int i8) {
        this.mThemeResId = i8;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        DecorContentParent decorContentParent = this.mDecorContentParent;
        if (decorContentParent != null) {
            decorContentParent.setWindowTitle(charSequence);
            return;
        }
        if (peekSupportActionBar() != null) {
            peekSupportActionBar().setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.mTitleView;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    final boolean shouldAnimateActionModeView() {
        ViewGroup viewGroup;
        if (this.mSubDecorInstalled && (viewGroup = this.mSubDecor) != null && viewGroup.isLaidOut()) {
            return true;
        }
        return false;
    }

    boolean shouldRegisterBackInvokedCallback() {
        if (this.mDispatcher == null) {
            return false;
        }
        PanelFeatureState panelState = getPanelState(0, false);
        if ((panelState == null || !panelState.isOpen) && this.mActionMode == null) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public ActionMode startSupportActionMode(@NonNull ActionMode.Callback callback) {
        AppCompatCallback appCompatCallback;
        if (callback != null) {
            ActionMode actionMode = this.mActionMode;
            if (actionMode != null) {
                actionMode.finish();
            }
            ActionModeCallbackWrapperV9 actionModeCallbackWrapperV9 = new ActionModeCallbackWrapperV9(callback);
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                ActionMode startActionMode = supportActionBar.startActionMode(actionModeCallbackWrapperV9);
                this.mActionMode = startActionMode;
                if (startActionMode != null && (appCompatCallback = this.mAppCompatCallback) != null) {
                    appCompatCallback.onSupportActionModeStarted(startActionMode);
                }
            }
            if (this.mActionMode == null) {
                this.mActionMode = startSupportActionModeFromWindow(actionModeCallbackWrapperV9);
            }
            updateBackInvokedCallbackState();
            return this.mActionMode;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.appcompat.view.ActionMode startSupportActionModeFromWindow(@androidx.annotation.NonNull androidx.appcompat.view.ActionMode.Callback r8) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.startSupportActionModeFromWindow(androidx.appcompat.view.ActionMode$Callback):androidx.appcompat.view.ActionMode");
    }

    void updateBackInvokedCallbackState() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean shouldRegisterBackInvokedCallback = shouldRegisterBackInvokedCallback();
            if (shouldRegisterBackInvokedCallback && this.mBackCallback == null) {
                this.mBackCallback = Api33Impl.registerOnBackPressedCallback(this.mDispatcher, this);
            } else if (!shouldRegisterBackInvokedCallback && (onBackInvokedCallback = this.mBackCallback) != null) {
                Api33Impl.unregisterOnBackInvokedCallback(this.mDispatcher, onBackInvokedCallback);
                this.mBackCallback = null;
            }
        }
    }

    final int updateStatusGuard(@Nullable WindowInsetsCompat windowInsetsCompat, @Nullable Rect rect) {
        int i8;
        boolean z8;
        int systemWindowInsetLeft;
        int systemWindowInsetRight;
        boolean z9;
        int i9 = 0;
        if (windowInsetsCompat != null) {
            i8 = windowInsetsCompat.getSystemWindowInsetTop();
        } else if (rect != null) {
            i8 = rect.top;
        } else {
            i8 = 0;
        }
        ActionBarContextView actionBarContextView = this.mActionModeView;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mActionModeView.getLayoutParams();
            boolean z10 = true;
            if (this.mActionModeView.isShown()) {
                if (this.mTempRect1 == null) {
                    this.mTempRect1 = new Rect();
                    this.mTempRect2 = new Rect();
                }
                Rect rect2 = this.mTempRect1;
                Rect rect3 = this.mTempRect2;
                if (windowInsetsCompat == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                }
                ViewUtils.computeFitSystemWindows(this.mSubDecor, rect2, rect3);
                int i10 = rect2.top;
                int i11 = rect2.left;
                int i12 = rect2.right;
                WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(this.mSubDecor);
                if (rootWindowInsets == null) {
                    systemWindowInsetLeft = 0;
                } else {
                    systemWindowInsetLeft = rootWindowInsets.getSystemWindowInsetLeft();
                }
                if (rootWindowInsets == null) {
                    systemWindowInsetRight = 0;
                } else {
                    systemWindowInsetRight = rootWindowInsets.getSystemWindowInsetRight();
                }
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z9 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z9 = true;
                }
                if (i10 > 0 && this.mStatusGuard == null) {
                    View view = new View(this.mContext);
                    this.mStatusGuard = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = systemWindowInsetLeft;
                    layoutParams.rightMargin = systemWindowInsetRight;
                    this.mSubDecor.addView(this.mStatusGuard, -1, layoutParams);
                } else {
                    View view2 = this.mStatusGuard;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != systemWindowInsetLeft || marginLayoutParams2.rightMargin != systemWindowInsetRight) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = systemWindowInsetLeft;
                            marginLayoutParams2.rightMargin = systemWindowInsetRight;
                            this.mStatusGuard.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.mStatusGuard;
                if (view3 == null) {
                    z10 = false;
                }
                if (z10 && view3.getVisibility() != 0) {
                    updateStatusGuardColor(this.mStatusGuard);
                }
                if (!this.mOverlayActionMode && z10) {
                    i8 = 0;
                }
                z8 = z10;
                z10 = z9;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z8 = false;
            } else {
                z8 = false;
                z10 = false;
            }
            if (z10) {
                this.mActionModeView.setLayoutParams(marginLayoutParams);
            }
        } else {
            z8 = false;
        }
        View view4 = this.mStatusGuard;
        if (view4 != null) {
            if (!z8) {
                i9 = 8;
            }
            view4.setVisibility(i9);
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatDelegateImpl(Dialog dialog, AppCompatCallback appCompatCallback) {
        this(dialog.getContext(), dialog.getWindow(), appCompatCallback, dialog);
    }

    private boolean applyApplicationSpecificConfig(boolean z8, boolean z9) {
        if (this.mDestroyed) {
            return false;
        }
        int calculateNightMode = calculateNightMode();
        int mapNightMode = mapNightMode(this.mContext, calculateNightMode);
        LocaleListCompat calculateApplicationLocales = Build.VERSION.SDK_INT < 33 ? calculateApplicationLocales(this.mContext) : null;
        if (!z9 && calculateApplicationLocales != null) {
            calculateApplicationLocales = getConfigurationLocales(this.mContext.getResources().getConfiguration());
        }
        boolean updateAppConfiguration = updateAppConfiguration(mapNightMode, calculateApplicationLocales, z8);
        if (calculateNightMode == 0) {
            getAutoTimeNightModeManager(this.mContext).setup();
        } else {
            AutoNightModeManager autoNightModeManager = this.mAutoTimeNightModeManager;
            if (autoNightModeManager != null) {
                autoNightModeManager.cleanup();
            }
        }
        if (calculateNightMode == 3) {
            getAutoBatteryNightModeManager(this.mContext).setup();
        } else {
            AutoNightModeManager autoNightModeManager2 = this.mAutoBatteryNightModeManager;
            if (autoNightModeManager2 != null) {
                autoNightModeManager2.cleanup();
            }
        }
        return updateAppConfiguration;
    }

    private AutoNightModeManager getAutoTimeNightModeManager(@NonNull Context context) {
        if (this.mAutoTimeNightModeManager == null) {
            this.mAutoTimeNightModeManager = new AutoTimeNightModeManager(TwilightManager.getInstance(context));
        }
        return this.mAutoTimeNightModeManager;
    }

    void closePanel(PanelFeatureState panelFeatureState, boolean z8) {
        ViewGroup viewGroup;
        DecorContentParent decorContentParent;
        if (z8 && panelFeatureState.featureId == 0 && (decorContentParent = this.mDecorContentParent) != null && decorContentParent.isOverflowMenuShowing()) {
            checkCloseActionMenu(panelFeatureState.menu);
            return;
        }
        WindowManager windowManager = (WindowManager) this.mContext.getSystemService("window");
        if (windowManager != null && panelFeatureState.isOpen && (viewGroup = panelFeatureState.decorView) != null) {
            windowManager.removeView(viewGroup);
            if (z8) {
                callOnPanelClosed(panelFeatureState.featureId, panelFeatureState, null);
            }
        }
        panelFeatureState.isPrepared = false;
        panelFeatureState.isHandled = false;
        panelFeatureState.isOpen = false;
        panelFeatureState.shownPanelView = null;
        panelFeatureState.refreshDecorView = true;
        if (this.mPreparedPanel == panelFeatureState) {
            this.mPreparedPanel = null;
        }
        if (panelFeatureState.featureId == 0) {
            updateBackInvokedCallbackState();
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatDelegateImpl(Context context, Window window, AppCompatCallback appCompatCallback) {
        this(context, window, appCompatCallback, context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class AppCompatWindowCallback extends WindowCallbackWrapper {
        private ActionBarMenuCallback mActionBarCallback;
        private boolean mDispatchKeyEventBypassEnabled;
        private boolean mOnContentChangedBypassEnabled;
        private boolean mOnPanelClosedBypassEnabled;

        AppCompatWindowCallback(Window.Callback callback) {
            super(callback);
        }

        public boolean bypassDispatchKeyEvent(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.mDispatchKeyEventBypassEnabled = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.mDispatchKeyEventBypassEnabled = false;
            }
        }

        public void bypassOnContentChanged(Window.Callback callback) {
            try {
                this.mOnContentChangedBypassEnabled = true;
                callback.onContentChanged();
            } finally {
                this.mOnContentChangedBypassEnabled = false;
            }
        }

        public void bypassOnPanelClosed(Window.Callback callback, int i8, Menu menu) {
            try {
                this.mOnPanelClosedBypassEnabled = true;
                callback.onPanelClosed(i8, menu);
            } finally {
                this.mOnPanelClosedBypassEnabled = false;
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.mDispatchKeyEventBypassEnabled) {
                return getWrapped().dispatchKeyEvent(keyEvent);
            }
            if (!AppCompatDelegateImpl.this.dispatchKeyEvent(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (!super.dispatchKeyShortcutEvent(keyEvent) && !AppCompatDelegateImpl.this.onKeyShortcut(keyEvent.getKeyCode(), keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onContentChanged() {
            if (this.mOnContentChangedBypassEnabled) {
                getWrapped().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i8, Menu menu) {
            if (i8 == 0 && !(menu instanceof MenuBuilder)) {
                return false;
            }
            return super.onCreatePanelMenu(i8, menu);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public View onCreatePanelView(int i8) {
            View onCreatePanelView;
            ActionBarMenuCallback actionBarMenuCallback = this.mActionBarCallback;
            if (actionBarMenuCallback != null && (onCreatePanelView = actionBarMenuCallback.onCreatePanelView(i8)) != null) {
                return onCreatePanelView;
            }
            return super.onCreatePanelView(i8);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onMenuOpened(int i8, Menu menu) {
            super.onMenuOpened(i8, menu);
            AppCompatDelegateImpl.this.onMenuOpened(i8);
            return true;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onPanelClosed(int i8, Menu menu) {
            if (this.mOnPanelClosedBypassEnabled) {
                getWrapped().onPanelClosed(i8, menu);
            } else {
                super.onPanelClosed(i8, menu);
                AppCompatDelegateImpl.this.onPanelClosed(i8);
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onPreparePanel(int i8, View view, Menu menu) {
            MenuBuilder menuBuilder;
            if (menu instanceof MenuBuilder) {
                menuBuilder = (MenuBuilder) menu;
            } else {
                menuBuilder = null;
            }
            if (i8 == 0 && menuBuilder == null) {
                return false;
            }
            boolean z8 = true;
            if (menuBuilder != null) {
                menuBuilder.setOverrideVisibleItems(true);
            }
            ActionBarMenuCallback actionBarMenuCallback = this.mActionBarCallback;
            if (actionBarMenuCallback == null || !actionBarMenuCallback.onPreparePanel(i8)) {
                z8 = false;
            }
            if (!z8) {
                z8 = super.onPreparePanel(i8, view, menu);
            }
            if (menuBuilder != null) {
                menuBuilder.setOverrideVisibleItems(false);
            }
            return z8;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        @RequiresApi(24)
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i8) {
            MenuBuilder menuBuilder;
            PanelFeatureState panelState = AppCompatDelegateImpl.this.getPanelState(0, true);
            if (panelState != null && (menuBuilder = panelState.menu) != null) {
                super.onProvideKeyboardShortcuts(list, menuBuilder, i8);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i8);
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (AppCompatDelegateImpl.this.isHandleNativeActionModesEnabled()) {
                return startAsSupportActionMode(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        void setActionBarCallback(@Nullable ActionBarMenuCallback actionBarMenuCallback) {
            this.mActionBarCallback = actionBarMenuCallback;
        }

        final android.view.ActionMode startAsSupportActionMode(ActionMode.Callback callback) {
            SupportActionModeWrapper.CallbackWrapper callbackWrapper = new SupportActionModeWrapper.CallbackWrapper(AppCompatDelegateImpl.this.mContext, callback);
            androidx.appcompat.view.ActionMode startSupportActionMode = AppCompatDelegateImpl.this.startSupportActionMode(callbackWrapper);
            if (startSupportActionMode != null) {
                return callbackWrapper.getActionModeWrapper(startSupportActionMode);
            }
            return null;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        @RequiresApi(23)
        public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i8) {
            if (AppCompatDelegateImpl.this.isHandleNativeActionModesEnabled() && i8 == 0) {
                return startAsSupportActionMode(callback);
            }
            return super.onWindowStartingActionMode(callback, i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatDelegateImpl(Context context, Activity activity, AppCompatCallback appCompatCallback) {
        this(context, null, appCompatCallback, activity);
    }

    private AppCompatDelegateImpl(Context context, Window window, AppCompatCallback appCompatCallback, Object obj) {
        SimpleArrayMap<String, Integer> simpleArrayMap;
        Integer num;
        AppCompatActivity tryUnwrapContext;
        this.mFadeAnim = null;
        this.mHandleNativeActionModes = true;
        this.mLocalNightMode = -100;
        this.mInvalidatePanelMenuRunnable = new Runnable() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.2
            @Override // java.lang.Runnable
            public void run() {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                if ((appCompatDelegateImpl.mInvalidatePanelMenuFeatures & 1) != 0) {
                    appCompatDelegateImpl.doInvalidatePanelMenu(0);
                }
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                if ((appCompatDelegateImpl2.mInvalidatePanelMenuFeatures & 4096) != 0) {
                    appCompatDelegateImpl2.doInvalidatePanelMenu(108);
                }
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.mInvalidatePanelMenuPosted = false;
                appCompatDelegateImpl3.mInvalidatePanelMenuFeatures = 0;
            }
        };
        this.mContext = context;
        this.mAppCompatCallback = appCompatCallback;
        this.mHost = obj;
        if (this.mLocalNightMode == -100 && (obj instanceof Dialog) && (tryUnwrapContext = tryUnwrapContext()) != null) {
            this.mLocalNightMode = tryUnwrapContext.getDelegate().getLocalNightMode();
        }
        if (this.mLocalNightMode == -100 && (num = (simpleArrayMap = sLocalNightModes).get(obj.getClass().getName())) != null) {
            this.mLocalNightMode = num.intValue();
            simpleArrayMap.remove(obj.getClass().getName());
        }
        if (window != null) {
            attachToWindow(window);
        }
        AppCompatDrawableManager.preload();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(int i8) {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mSubDecor.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.mContext).inflate(i8, viewGroup);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mSubDecor.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }
}
