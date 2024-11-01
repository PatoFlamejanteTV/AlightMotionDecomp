package androidx.core.content.pm;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.content.pm.ShortcutInfoCompatSaver;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.util.Preconditions;
import j$.util.Objects;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ShortcutManagerCompat {

    @VisibleForTesting
    static final String ACTION_INSTALL_SHORTCUT = "com.android.launcher.action.INSTALL_SHORTCUT";
    private static final int DEFAULT_MAX_ICON_DIMENSION_DP = 96;
    private static final int DEFAULT_MAX_ICON_DIMENSION_LOWRAM_DP = 48;
    public static final String EXTRA_SHORTCUT_ID = "android.intent.extra.shortcut.ID";
    public static final int FLAG_MATCH_CACHED = 8;
    public static final int FLAG_MATCH_DYNAMIC = 2;
    public static final int FLAG_MATCH_MANIFEST = 1;
    public static final int FLAG_MATCH_PINNED = 4;

    @VisibleForTesting
    static final String INSTALL_SHORTCUT_PERMISSION = "com.android.launcher.permission.INSTALL_SHORTCUT";
    private static final String SHORTCUT_LISTENER_INTENT_FILTER_ACTION = "androidx.core.content.pm.SHORTCUT_LISTENER";
    private static final String SHORTCUT_LISTENER_META_DATA_KEY = "androidx.core.content.pm.shortcut_listener_impl";
    private static volatile List<ShortcutInfoChangeListener> sShortcutInfoChangeListeners;
    private static volatile ShortcutInfoCompatSaver<?> sShortcutInfoCompatSaver;

    @RequiresApi(25)
    /* loaded from: classes.dex */
    private static class Api25Impl {
        private Api25Impl() {
        }

        static String getShortcutInfoWithLowestRank(@NonNull List<ShortcutInfo> list) {
            int i8 = -1;
            String str = null;
            for (ShortcutInfo shortcutInfo : list) {
                if (shortcutInfo.getRank() > i8) {
                    str = shortcutInfo.getId();
                    i8 = shortcutInfo.getRank();
                }
            }
            return str;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface ShortcutMatchFlags {
    }

    private ShortcutManagerCompat() {
    }

    public static boolean addDynamicShortcuts(@NonNull Context context, @NonNull List<ShortcutInfoCompat> list) {
        Object systemService;
        boolean addDynamicShortcuts;
        List<ShortcutInfoCompat> removeShortcutsExcludedFromSurface = removeShortcutsExcludedFromSurface(list, 1);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 <= 29) {
            convertUriIconsToBitmapIcons(context, removeShortcutsExcludedFromSurface);
        }
        if (i8 >= 25) {
            ArrayList arrayList = new ArrayList();
            Iterator<ShortcutInfoCompat> it = removeShortcutsExcludedFromSurface.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toShortcutInfo());
            }
            systemService = context.getSystemService((Class<Object>) O.a());
            addDynamicShortcuts = a0.a(systemService).addDynamicShortcuts(arrayList);
            if (!addDynamicShortcuts) {
                return false;
            }
        }
        getShortcutInfoSaverInstance(context).addShortcuts(removeShortcutsExcludedFromSurface);
        Iterator<ShortcutInfoChangeListener> it2 = getShortcutInfoListeners(context).iterator();
        while (it2.hasNext()) {
            it2.next().onShortcutAdded(list);
        }
        return true;
    }

    @VisibleForTesting
    static boolean convertUriIconToBitmapIcon(@NonNull Context context, @NonNull ShortcutInfoCompat shortcutInfoCompat) {
        Bitmap decodeStream;
        IconCompat createWithBitmap;
        IconCompat iconCompat = shortcutInfoCompat.mIcon;
        if (iconCompat == null) {
            return false;
        }
        int i8 = iconCompat.mType;
        if (i8 != 6 && i8 != 4) {
            return true;
        }
        InputStream uriInputStream = iconCompat.getUriInputStream(context);
        if (uriInputStream == null || (decodeStream = BitmapFactory.decodeStream(uriInputStream)) == null) {
            return false;
        }
        if (i8 == 6) {
            createWithBitmap = IconCompat.createWithAdaptiveBitmap(decodeStream);
        } else {
            createWithBitmap = IconCompat.createWithBitmap(decodeStream);
        }
        shortcutInfoCompat.mIcon = createWithBitmap;
        return true;
    }

    @VisibleForTesting
    static void convertUriIconsToBitmapIcons(@NonNull Context context, @NonNull List<ShortcutInfoCompat> list) {
        for (ShortcutInfoCompat shortcutInfoCompat : new ArrayList(list)) {
            if (!convertUriIconToBitmapIcon(context, shortcutInfoCompat)) {
                list.remove(shortcutInfoCompat);
            }
        }
    }

    @NonNull
    public static Intent createShortcutResultIntent(@NonNull Context context, @NonNull ShortcutInfoCompat shortcutInfoCompat) {
        Intent intent;
        Object systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            systemService = context.getSystemService((Class<Object>) O.a());
            intent = a0.a(systemService).createShortcutResultIntent(shortcutInfoCompat.toShortcutInfo());
        } else {
            intent = null;
        }
        if (intent == null) {
            intent = new Intent();
        }
        return shortcutInfoCompat.addToIntent(intent);
    }

    public static void disableShortcuts(@NonNull Context context, @NonNull List<String> list, @Nullable CharSequence charSequence) {
        Object systemService;
        if (Build.VERSION.SDK_INT >= 25) {
            systemService = context.getSystemService((Class<Object>) O.a());
            a0.a(systemService).disableShortcuts(list, charSequence);
        }
        getShortcutInfoSaverInstance(context).removeShortcuts(list);
        Iterator<ShortcutInfoChangeListener> it = getShortcutInfoListeners(context).iterator();
        while (it.hasNext()) {
            it.next().onShortcutRemoved(list);
        }
    }

    public static void enableShortcuts(@NonNull Context context, @NonNull List<ShortcutInfoCompat> list) {
        Object systemService;
        List<ShortcutInfoCompat> removeShortcutsExcludedFromSurface = removeShortcutsExcludedFromSurface(list, 1);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<ShortcutInfoCompat> it = removeShortcutsExcludedFromSurface.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().mId);
            }
            systemService = context.getSystemService((Class<Object>) O.a());
            a0.a(systemService).enableShortcuts(arrayList);
        }
        getShortcutInfoSaverInstance(context).addShortcuts(removeShortcutsExcludedFromSurface);
        Iterator<ShortcutInfoChangeListener> it2 = getShortcutInfoListeners(context).iterator();
        while (it2.hasNext()) {
            it2.next().onShortcutAdded(list);
        }
    }

    @NonNull
    public static List<ShortcutInfoCompat> getDynamicShortcuts(@NonNull Context context) {
        Object systemService;
        List dynamicShortcuts;
        if (Build.VERSION.SDK_INT >= 25) {
            systemService = context.getSystemService((Class<Object>) O.a());
            dynamicShortcuts = a0.a(systemService).getDynamicShortcuts();
            ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
            Iterator it = dynamicShortcuts.iterator();
            while (it.hasNext()) {
                arrayList.add(new ShortcutInfoCompat.Builder(context, AbstractC1834f.a(it.next())).build());
            }
            return arrayList;
        }
        try {
            return getShortcutInfoSaverInstance(context).getShortcuts();
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    private static int getIconDimensionInternal(@NonNull Context context, boolean z8) {
        boolean z9;
        int i8;
        float f8;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null && !activityManager.isLowRamDevice()) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            i8 = 48;
        } else {
            i8 = 96;
        }
        int max = Math.max(1, i8);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z8) {
            f8 = displayMetrics.xdpi;
        } else {
            f8 = displayMetrics.ydpi;
        }
        return (int) (max * (f8 / 160.0f));
    }

    public static int getIconMaxHeight(@NonNull Context context) {
        Object systemService;
        int iconMaxHeight;
        Preconditions.checkNotNull(context);
        if (Build.VERSION.SDK_INT >= 25) {
            systemService = context.getSystemService((Class<Object>) O.a());
            iconMaxHeight = a0.a(systemService).getIconMaxHeight();
            return iconMaxHeight;
        }
        return getIconDimensionInternal(context, false);
    }

    public static int getIconMaxWidth(@NonNull Context context) {
        Object systemService;
        int iconMaxWidth;
        Preconditions.checkNotNull(context);
        if (Build.VERSION.SDK_INT >= 25) {
            systemService = context.getSystemService((Class<Object>) O.a());
            iconMaxWidth = a0.a(systemService).getIconMaxWidth();
            return iconMaxWidth;
        }
        return getIconDimensionInternal(context, true);
    }

    public static int getMaxShortcutCountPerActivity(@NonNull Context context) {
        Object systemService;
        int maxShortcutCountPerActivity;
        Preconditions.checkNotNull(context);
        if (Build.VERSION.SDK_INT >= 25) {
            systemService = context.getSystemService((Class<Object>) O.a());
            maxShortcutCountPerActivity = a0.a(systemService).getMaxShortcutCountPerActivity();
            return maxShortcutCountPerActivity;
        }
        return 5;
    }

    @VisibleForTesting
    static List<ShortcutInfoChangeListener> getShortcutInfoChangeListeners() {
        return sShortcutInfoChangeListeners;
    }

    private static String getShortcutInfoCompatWithLowestRank(@NonNull List<ShortcutInfoCompat> list) {
        int i8 = -1;
        String str = null;
        for (ShortcutInfoCompat shortcutInfoCompat : list) {
            if (shortcutInfoCompat.getRank() > i8) {
                str = shortcutInfoCompat.getId();
                i8 = shortcutInfoCompat.getRank();
            }
        }
        return str;
    }

    private static List<ShortcutInfoChangeListener> getShortcutInfoListeners(Context context) {
        Bundle bundle;
        String string;
        if (sShortcutInfoChangeListeners == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent(SHORTCUT_LISTENER_INTENT_FILTER_ACTION);
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString(SHORTCUT_LISTENER_META_DATA_KEY)) != null) {
                    try {
                        arrayList.add((ShortcutInfoChangeListener) Class.forName(string, false, ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (sShortcutInfoChangeListeners == null) {
                sShortcutInfoChangeListeners = arrayList;
            }
        }
        return sShortcutInfoChangeListeners;
    }

    private static ShortcutInfoCompatSaver<?> getShortcutInfoSaverInstance(Context context) {
        if (sShortcutInfoCompatSaver == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    sShortcutInfoCompatSaver = (ShortcutInfoCompatSaver) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
                } catch (Exception unused) {
                }
            }
            if (sShortcutInfoCompatSaver == null) {
                sShortcutInfoCompatSaver = new ShortcutInfoCompatSaver.NoopImpl();
            }
        }
        return sShortcutInfoCompatSaver;
    }

    @NonNull
    public static List<ShortcutInfoCompat> getShortcuts(@NonNull Context context, int i8) {
        Object systemService;
        List pinnedShortcuts;
        List dynamicShortcuts;
        List manifestShortcuts;
        Object systemService2;
        List shortcuts;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 30) {
            systemService2 = context.getSystemService((Class<Object>) O.a());
            shortcuts = a0.a(systemService2).getShortcuts(i8);
            return ShortcutInfoCompat.fromShortcuts(context, shortcuts);
        }
        if (i9 >= 25) {
            systemService = context.getSystemService((Class<Object>) O.a());
            ShortcutManager a9 = a0.a(systemService);
            ArrayList arrayList = new ArrayList();
            if ((i8 & 1) != 0) {
                manifestShortcuts = a9.getManifestShortcuts();
                arrayList.addAll(manifestShortcuts);
            }
            if ((i8 & 2) != 0) {
                dynamicShortcuts = a9.getDynamicShortcuts();
                arrayList.addAll(dynamicShortcuts);
            }
            if ((i8 & 4) != 0) {
                pinnedShortcuts = a9.getPinnedShortcuts();
                arrayList.addAll(pinnedShortcuts);
            }
            return ShortcutInfoCompat.fromShortcuts(context, arrayList);
        }
        if ((i8 & 2) != 0) {
            try {
                return getShortcutInfoSaverInstance(context).getShortcuts();
            } catch (Exception unused) {
            }
        }
        return Collections.emptyList();
    }

    public static boolean isRateLimitingActive(@NonNull Context context) {
        Object systemService;
        boolean isRateLimitingActive;
        Preconditions.checkNotNull(context);
        if (Build.VERSION.SDK_INT >= 25) {
            systemService = context.getSystemService((Class<Object>) O.a());
            isRateLimitingActive = a0.a(systemService).isRateLimitingActive();
            return isRateLimitingActive;
        }
        if (getShortcuts(context, 3).size() == getMaxShortcutCountPerActivity(context)) {
            return true;
        }
        return false;
    }

    public static boolean isRequestPinShortcutSupported(@NonNull Context context) {
        Object systemService;
        boolean isRequestPinShortcutSupported;
        if (Build.VERSION.SDK_INT >= 26) {
            systemService = context.getSystemService((Class<Object>) O.a());
            isRequestPinShortcutSupported = a0.a(systemService).isRequestPinShortcutSupported();
            return isRequestPinShortcutSupported;
        }
        if (ContextCompat.checkSelfPermission(context, INSTALL_SHORTCUT_PERMISSION) != 0) {
            return false;
        }
        Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(new Intent(ACTION_INSTALL_SHORTCUT), 0).iterator();
        while (it.hasNext()) {
            String str = it.next().activityInfo.permission;
            if (TextUtils.isEmpty(str) || INSTALL_SHORTCUT_PERMISSION.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean pushDynamicShortcut(@NonNull Context context, @NonNull ShortcutInfoCompat shortcutInfoCompat) {
        Object systemService;
        boolean isRateLimitingActive;
        List dynamicShortcuts;
        Object systemService2;
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(shortcutInfoCompat);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 <= 32 && shortcutInfoCompat.isExcludedFromSurfaces(1)) {
            Iterator<ShortcutInfoChangeListener> it = getShortcutInfoListeners(context).iterator();
            while (it.hasNext()) {
                it.next().onShortcutAdded(Collections.singletonList(shortcutInfoCompat));
            }
            return true;
        }
        int maxShortcutCountPerActivity = getMaxShortcutCountPerActivity(context);
        if (maxShortcutCountPerActivity == 0) {
            return false;
        }
        if (i8 <= 29) {
            convertUriIconToBitmapIcon(context, shortcutInfoCompat);
        }
        if (i8 >= 30) {
            systemService2 = context.getSystemService((Class<Object>) O.a());
            a0.a(systemService2).pushDynamicShortcut(shortcutInfoCompat.toShortcutInfo());
        } else if (i8 >= 25) {
            systemService = context.getSystemService((Class<Object>) O.a());
            ShortcutManager a9 = a0.a(systemService);
            isRateLimitingActive = a9.isRateLimitingActive();
            if (isRateLimitingActive) {
                return false;
            }
            dynamicShortcuts = a9.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= maxShortcutCountPerActivity) {
                a9.removeDynamicShortcuts(Arrays.asList(Api25Impl.getShortcutInfoWithLowestRank(dynamicShortcuts)));
            }
            a9.addDynamicShortcuts(Arrays.asList(shortcutInfoCompat.toShortcutInfo()));
        }
        ShortcutInfoCompatSaver<?> shortcutInfoSaverInstance = getShortcutInfoSaverInstance(context);
        try {
            List<ShortcutInfoCompat> shortcuts = shortcutInfoSaverInstance.getShortcuts();
            if (shortcuts.size() >= maxShortcutCountPerActivity) {
                shortcutInfoSaverInstance.removeShortcuts(Arrays.asList(getShortcutInfoCompatWithLowestRank(shortcuts)));
            }
            shortcutInfoSaverInstance.addShortcuts(Arrays.asList(shortcutInfoCompat));
            Iterator<ShortcutInfoChangeListener> it2 = getShortcutInfoListeners(context).iterator();
            while (it2.hasNext()) {
                it2.next().onShortcutAdded(Collections.singletonList(shortcutInfoCompat));
            }
            reportShortcutUsed(context, shortcutInfoCompat.getId());
            return true;
        } catch (Exception unused) {
            Iterator<ShortcutInfoChangeListener> it3 = getShortcutInfoListeners(context).iterator();
            while (it3.hasNext()) {
                it3.next().onShortcutAdded(Collections.singletonList(shortcutInfoCompat));
            }
            reportShortcutUsed(context, shortcutInfoCompat.getId());
            return false;
        } catch (Throwable th) {
            Iterator<ShortcutInfoChangeListener> it4 = getShortcutInfoListeners(context).iterator();
            while (it4.hasNext()) {
                it4.next().onShortcutAdded(Collections.singletonList(shortcutInfoCompat));
            }
            reportShortcutUsed(context, shortcutInfoCompat.getId());
            throw th;
        }
    }

    public static void removeAllDynamicShortcuts(@NonNull Context context) {
        Object systemService;
        if (Build.VERSION.SDK_INT >= 25) {
            systemService = context.getSystemService((Class<Object>) O.a());
            a0.a(systemService).removeAllDynamicShortcuts();
        }
        getShortcutInfoSaverInstance(context).removeAllShortcuts();
        Iterator<ShortcutInfoChangeListener> it = getShortcutInfoListeners(context).iterator();
        while (it.hasNext()) {
            it.next().onAllShortcutsRemoved();
        }
    }

    public static void removeDynamicShortcuts(@NonNull Context context, @NonNull List<String> list) {
        Object systemService;
        if (Build.VERSION.SDK_INT >= 25) {
            systemService = context.getSystemService((Class<Object>) O.a());
            a0.a(systemService).removeDynamicShortcuts(list);
        }
        getShortcutInfoSaverInstance(context).removeShortcuts(list);
        Iterator<ShortcutInfoChangeListener> it = getShortcutInfoListeners(context).iterator();
        while (it.hasNext()) {
            it.next().onShortcutRemoved(list);
        }
    }

    public static void removeLongLivedShortcuts(@NonNull Context context, @NonNull List<String> list) {
        Object systemService;
        if (Build.VERSION.SDK_INT >= 30) {
            systemService = context.getSystemService((Class<Object>) O.a());
            a0.a(systemService).removeLongLivedShortcuts(list);
            getShortcutInfoSaverInstance(context).removeShortcuts(list);
            Iterator<ShortcutInfoChangeListener> it = getShortcutInfoListeners(context).iterator();
            while (it.hasNext()) {
                it.next().onShortcutRemoved(list);
            }
            return;
        }
        removeDynamicShortcuts(context, list);
    }

    @NonNull
    private static List<ShortcutInfoCompat> removeShortcutsExcludedFromSurface(@NonNull List<ShortcutInfoCompat> list, int i8) {
        Objects.requireNonNull(list);
        if (Build.VERSION.SDK_INT > 32) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        for (ShortcutInfoCompat shortcutInfoCompat : list) {
            if (shortcutInfoCompat.isExcludedFromSurfaces(i8)) {
                arrayList.remove(shortcutInfoCompat);
            }
        }
        return arrayList;
    }

    public static void reportShortcutUsed(@NonNull Context context, @NonNull String str) {
        Object systemService;
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(str);
        if (Build.VERSION.SDK_INT >= 25) {
            systemService = context.getSystemService((Class<Object>) O.a());
            a0.a(systemService).reportShortcutUsed(str);
        }
        Iterator<ShortcutInfoChangeListener> it = getShortcutInfoListeners(context).iterator();
        while (it.hasNext()) {
            it.next().onShortcutUsageReported(Collections.singletonList(str));
        }
    }

    public static boolean requestPinShortcut(@NonNull Context context, @NonNull ShortcutInfoCompat shortcutInfoCompat, @Nullable final IntentSender intentSender) {
        Object systemService;
        boolean requestPinShortcut;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 <= 32 && shortcutInfoCompat.isExcludedFromSurfaces(1)) {
            return false;
        }
        if (i8 >= 26) {
            systemService = context.getSystemService((Class<Object>) O.a());
            requestPinShortcut = a0.a(systemService).requestPinShortcut(shortcutInfoCompat.toShortcutInfo(), intentSender);
            return requestPinShortcut;
        }
        if (!isRequestPinShortcutSupported(context)) {
            return false;
        }
        Intent addToIntent = shortcutInfoCompat.addToIntent(new Intent(ACTION_INSTALL_SHORTCUT));
        if (intentSender == null) {
            context.sendBroadcast(addToIntent);
            return true;
        }
        context.sendOrderedBroadcast(addToIntent, null, new BroadcastReceiver() { // from class: androidx.core.content.pm.ShortcutManagerCompat.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                try {
                    intentSender.sendIntent(context2, 0, null, null, null);
                } catch (IntentSender.SendIntentException unused) {
                }
            }
        }, null, -1, null, null);
        return true;
    }

    public static boolean setDynamicShortcuts(@NonNull Context context, @NonNull List<ShortcutInfoCompat> list) {
        Object systemService;
        boolean dynamicShortcuts;
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(list);
        List<ShortcutInfoCompat> removeShortcutsExcludedFromSurface = removeShortcutsExcludedFromSurface(list, 1);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(removeShortcutsExcludedFromSurface.size());
            Iterator<ShortcutInfoCompat> it = removeShortcutsExcludedFromSurface.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toShortcutInfo());
            }
            systemService = context.getSystemService((Class<Object>) O.a());
            dynamicShortcuts = a0.a(systemService).setDynamicShortcuts(arrayList);
            if (!dynamicShortcuts) {
                return false;
            }
        }
        getShortcutInfoSaverInstance(context).removeAllShortcuts();
        getShortcutInfoSaverInstance(context).addShortcuts(removeShortcutsExcludedFromSurface);
        for (ShortcutInfoChangeListener shortcutInfoChangeListener : getShortcutInfoListeners(context)) {
            shortcutInfoChangeListener.onAllShortcutsRemoved();
            shortcutInfoChangeListener.onShortcutAdded(list);
        }
        return true;
    }

    @VisibleForTesting
    static void setShortcutInfoChangeListeners(List<ShortcutInfoChangeListener> list) {
        sShortcutInfoChangeListeners = list;
    }

    @VisibleForTesting
    static void setShortcutInfoCompatSaver(ShortcutInfoCompatSaver<Void> shortcutInfoCompatSaver) {
        sShortcutInfoCompatSaver = shortcutInfoCompatSaver;
    }

    public static boolean updateShortcuts(@NonNull Context context, @NonNull List<ShortcutInfoCompat> list) {
        Object systemService;
        boolean updateShortcuts;
        List<ShortcutInfoCompat> removeShortcutsExcludedFromSurface = removeShortcutsExcludedFromSurface(list, 1);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 <= 29) {
            convertUriIconsToBitmapIcons(context, removeShortcutsExcludedFromSurface);
        }
        if (i8 >= 25) {
            ArrayList arrayList = new ArrayList();
            Iterator<ShortcutInfoCompat> it = removeShortcutsExcludedFromSurface.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toShortcutInfo());
            }
            systemService = context.getSystemService((Class<Object>) O.a());
            updateShortcuts = a0.a(systemService).updateShortcuts(arrayList);
            if (!updateShortcuts) {
                return false;
            }
        }
        getShortcutInfoSaverInstance(context).addShortcuts(removeShortcutsExcludedFromSurface);
        Iterator<ShortcutInfoChangeListener> it2 = getShortcutInfoListeners(context).iterator();
        while (it2.hasNext()) {
            it2.next().onShortcutUpdated(list);
        }
        return true;
    }
}
