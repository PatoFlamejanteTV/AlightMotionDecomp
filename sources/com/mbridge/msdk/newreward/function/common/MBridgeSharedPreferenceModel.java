package com.mbridge.msdk.newreward.function.common;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.b.c;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.tools.FastKV;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public final class MBridgeSharedPreferenceModel {
    private static final String DEFAULT_NAME = "mbridge_new_config";
    private volatile FastKV mFastKV;
    private Object mLock = new Object();
    private String mName;
    private static ConcurrentHashMap<String, String> mStringCache = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, Integer> mIntegerCache = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, Long> mLongCache = new ConcurrentHashMap<>();
    private static Map<String, MBridgeSharedPreferenceModel> mInstanceMap = new HashMap();
    private static String mPath = e.a(c.MBRIDGE_700_CONFIG) + File.separator;
    private static Executor mExecutor = Executors.newSingleThreadExecutor();

    private MBridgeSharedPreferenceModel(String str) {
        this.mName = str;
        mExecutor.execute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.common.MBridgeSharedPreferenceModel.1
            @Override // java.lang.Runnable
            public void run() {
                MBridgeSharedPreferenceModel.this.initFastKV();
            }
        });
    }

    public static MBridgeSharedPreferenceModel getInstance() {
        return getInstance("");
    }

    private int getIntegerValue(String str, int i8) {
        if (this.mFastKV == null) {
            initFastKV();
        }
        try {
            int i9 = this.mFastKV.getInt(str, i8);
            mIntegerCache.put(str, Integer.valueOf(i9));
            return i9;
        } catch (Exception unused) {
            return i8;
        }
    }

    private long getLongValue(String str, long j8) {
        if (this.mFastKV == null) {
            initFastKV();
        }
        try {
            long j9 = this.mFastKV.getLong(str, j8);
            mLongCache.put(str, Long.valueOf(j9));
            return j9;
        } catch (Exception unused) {
            return j8;
        }
    }

    private String getStringValue(String str, String str2) {
        if (this.mFastKV == null) {
            initFastKV();
        }
        String string = this.mFastKV.getString(str, str2);
        if (string != null) {
            mStringCache.put(str, string);
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initFastKV() {
        synchronized (this.mLock) {
            if (this.mFastKV == null) {
                try {
                    this.mFastKV = new FastKV.Builder(mPath, this.mName).build();
                } catch (Exception unused) {
                }
            }
        }
    }

    private void putIntegerValue(String str, int i8) {
        try {
            mIntegerCache.put(str, Integer.valueOf(i8));
        } catch (Exception unused) {
        }
        try {
            this.mFastKV.putInt(str, i8);
        } catch (Exception unused2) {
        }
    }

    private void putLongValue(String str, long j8) {
        try {
            mLongCache.put(str, Long.valueOf(j8));
        } catch (Exception unused) {
        }
        try {
            this.mFastKV.putLong(str, j8);
        } catch (Exception unused2) {
        }
    }

    private void putStringValue(final String str, final String str2) {
        try {
            mStringCache.put(str, str2);
        } catch (Exception unused) {
        }
        mExecutor.execute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.common.MBridgeSharedPreferenceModel.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MBridgeSharedPreferenceModel.this.initFastKV();
                    MBridgeSharedPreferenceModel.this.mFastKV.putString(str, str2);
                } catch (Exception unused2) {
                }
            }
        });
    }

    public final void clear() {
        mStringCache.clear();
        mIntegerCache.clear();
        mLongCache.clear();
        if (this.mFastKV != null) {
            this.mFastKV.clear();
        }
    }

    public final int getInteger(String str, int i8) {
        Integer num;
        if (TextUtils.isEmpty(str)) {
            return i8;
        }
        if (mIntegerCache.containsKey(str) && (num = mIntegerCache.get(str)) != null) {
            return num.intValue();
        }
        return getIntegerValue(str, i8);
    }

    public final long getLong(String str, long j8) {
        Long l8;
        if (TextUtils.isEmpty(str)) {
            return j8;
        }
        if (mLongCache.containsKey(str) && (l8 = mLongCache.get(str)) != null) {
            return l8.longValue();
        }
        return getLongValue(str, j8);
    }

    public final String getString(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (mStringCache.containsKey(str)) {
            return mStringCache.get(str);
        }
        return getStringValue(str, str2);
    }

    public final void init() {
    }

    public final void putInteger(String str, int i8) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (mIntegerCache.containsKey(str)) {
            Integer num = mIntegerCache.get(str);
            if (num == null || num.intValue() != i8) {
                putIntegerValue(str, i8);
                return;
            }
            return;
        }
        putIntegerValue(str, i8);
    }

    public final void putLong(String str, long j8) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (mLongCache.containsKey(str)) {
            Long l8 = mLongCache.get(str);
            if (l8 == null || l8.longValue() != j8) {
                putLongValue(str, j8);
                return;
            }
            return;
        }
        putLongValue(str, j8);
    }

    public final void putString(String str, String str2) {
        if (!TextUtils.isEmpty(str) && str2 != null) {
            if (mStringCache.containsKey(str)) {
                if (!TextUtils.equals(mStringCache.get(str), str2)) {
                    putStringValue(str, str2);
                    return;
                }
                return;
            }
            putStringValue(str, str2);
        }
    }

    public static MBridgeSharedPreferenceModel getInstance(String str) {
        MBridgeSharedPreferenceModel mBridgeSharedPreferenceModel;
        synchronized (mInstanceMap) {
            try {
                if (TextUtils.isEmpty(str)) {
                    str = DEFAULT_NAME;
                }
                mBridgeSharedPreferenceModel = mInstanceMap.get(str);
                if (mBridgeSharedPreferenceModel == null) {
                    mBridgeSharedPreferenceModel = new MBridgeSharedPreferenceModel(str);
                    mInstanceMap.put(str, mBridgeSharedPreferenceModel);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mBridgeSharedPreferenceModel;
    }
}
